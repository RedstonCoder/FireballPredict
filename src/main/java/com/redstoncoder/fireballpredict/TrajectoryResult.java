package com.redstoncoder.fireballpredict;

import net.minecraft.util.Vec3;

import java.util.List;

public class TrajectoryResult {
    public final List<Vec3> points;
    public final float impactTimeSeconds;
    public final boolean hasCollision;
    public final Vec3 collisionNormal;

    public TrajectoryResult(List<Vec3> points, float impactTimeSeconds, boolean hasCollision, Vec3 collisionNormal) {
        this.points = points;
        this.impactTimeSeconds = impactTimeSeconds;
        this.hasCollision = hasCollision;
        this.collisionNormal = collisionNormal;
    }
}
