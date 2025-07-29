package dev.sycraxe.unreachablenether.mixins;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BaseFireBlock.class)
public abstract class BaseFireBlockMixin {
    @Inject(method = "isPortal", at = @At("HEAD"), cancellable = true)
    private static void unreachablenether_isPortal(
            Level level, BlockPos pos, Direction direction, CallbackInfoReturnable<Boolean> cir
    ) {
        cir.setReturnValue(false);
    }
}