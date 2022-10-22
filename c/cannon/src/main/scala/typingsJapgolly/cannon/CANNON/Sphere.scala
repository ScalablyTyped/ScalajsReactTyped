package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sphere
  extends StObject
     with Shape {
  
  var radius: Double
}
object Sphere {
  
  inline def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    collisionResponse: Boolean,
    id: Double,
    radius: Double,
    `type`: Double,
    updateBoundingSphereRadius: CallbackTo[Double],
    volume: CallbackTo[Double]
  ): Sphere = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), collisionResponse = collisionResponse.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], updateBoundingSphereRadius = updateBoundingSphereRadius.toJsFn, volume = volume.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sphere]
  }
  
  extension [Self <: Sphere](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
