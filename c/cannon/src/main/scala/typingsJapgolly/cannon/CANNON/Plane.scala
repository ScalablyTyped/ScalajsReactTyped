package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plane
  extends StObject
     with Shape {
  
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Double, max: Double): Unit
  
  def computeWorldNormal(quat: Quaternion): Unit
  
  var worldNormal: Vec3
  
  var worldNormalNeedsUpdate: Boolean
}
object Plane {
  
  inline def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    calculateWorldAABB: (Vec3, Quaternion, Double, Double) => Callback,
    collisionResponse: Boolean,
    computeWorldNormal: Quaternion => Callback,
    id: Double,
    `type`: Double,
    updateBoundingSphereRadius: CallbackTo[Double],
    volume: CallbackTo[Double],
    worldNormal: Vec3,
    worldNormalNeedsUpdate: Boolean
  ): Plane = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), calculateWorldAABB = js.Any.fromFunction4((t0: Vec3, t1: Quaternion, t2: Double, t3: Double) => (calculateWorldAABB(t0, t1, t2, t3)).runNow()), collisionResponse = collisionResponse.asInstanceOf[js.Any], computeWorldNormal = js.Any.fromFunction1((t0: Quaternion) => computeWorldNormal(t0).runNow()), id = id.asInstanceOf[js.Any], updateBoundingSphereRadius = updateBoundingSphereRadius.toJsFn, volume = volume.toJsFn, worldNormal = worldNormal.asInstanceOf[js.Any], worldNormalNeedsUpdate = worldNormalNeedsUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plane]
  }
  
  extension [Self <: Plane](x: Self) {
    
    inline def setCalculateWorldAABB(value: (Vec3, Quaternion, Double, Double) => Callback): Self = StObject.set(x, "calculateWorldAABB", js.Any.fromFunction4((t0: Vec3, t1: Quaternion, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setComputeWorldNormal(value: Quaternion => Callback): Self = StObject.set(x, "computeWorldNormal", js.Any.fromFunction1((t0: Quaternion) => value(t0).runNow()))
    
    inline def setWorldNormal(value: Vec3): Self = StObject.set(x, "worldNormal", value.asInstanceOf[js.Any])
    
    inline def setWorldNormalNeedsUpdate(value: Boolean): Self = StObject.set(x, "worldNormalNeedsUpdate", value.asInstanceOf[js.Any])
  }
}
