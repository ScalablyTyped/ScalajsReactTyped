package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shape extends StObject {
  
  var boundingSphereRadius: Double
  
  def calculateLocalInertia(mass: Double, target: Vec3): Vec3
  
  var collisionResponse: Boolean
  
  var id: Double
  
  var `type`: Double
  
  def updateBoundingSphereRadius(): Double
  
  def volume(): Double
}
object Shape {
  
  inline def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    collisionResponse: Boolean,
    id: Double,
    `type`: Double,
    updateBoundingSphereRadius: CallbackTo[Double],
    volume: CallbackTo[Double]
  ): Shape = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), collisionResponse = collisionResponse.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updateBoundingSphereRadius = updateBoundingSphereRadius.toJsFn, volume = volume.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  
  extension [Self <: Shape](x: Self) {
    
    inline def setBoundingSphereRadius(value: Double): Self = StObject.set(x, "boundingSphereRadius", value.asInstanceOf[js.Any])
    
    inline def setCalculateLocalInertia(value: (Double, Vec3) => Vec3): Self = StObject.set(x, "calculateLocalInertia", js.Any.fromFunction2(value))
    
    inline def setCollisionResponse(value: Boolean): Self = StObject.set(x, "collisionResponse", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateBoundingSphereRadius(value: CallbackTo[Double]): Self = StObject.set(x, "updateBoundingSphereRadius", value.toJsFn)
    
    inline def setVolume(value: CallbackTo[Double]): Self = StObject.set(x, "volume", value.toJsFn)
  }
}
