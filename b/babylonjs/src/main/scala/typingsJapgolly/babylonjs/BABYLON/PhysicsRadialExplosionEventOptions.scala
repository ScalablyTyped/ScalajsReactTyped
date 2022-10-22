package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.anon.DiameterSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsRadialExplosionEventOptions extends StObject {
  
  /**
    * Sphere options for the radial explosion.
    */
  def affectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit
  
  /**
    * The strength of the force in correspondence to the distance of the affected object
    */
  var falloff: PhysicsRadialImpulseFalloff
  
  /**
    * The radius of the sphere for the radial explosion.
    */
  var radius: Double
  
  /**
    * Sphere options for the radial explosion.
    */
  var sphere: DiameterSegments
  
  /**
    * The strength of the explosion.
    */
  var strength: Double
}
object PhysicsRadialExplosionEventOptions {
  
  inline def apply(
    affectedImpostorsCallback: js.Array[PhysicsAffectedImpostorWithData] => Callback,
    falloff: PhysicsRadialImpulseFalloff,
    radius: Double,
    sphere: DiameterSegments,
    strength: Double
  ): PhysicsRadialExplosionEventOptions = {
    val __obj = js.Dynamic.literal(affectedImpostorsCallback = js.Any.fromFunction1((t0: js.Array[PhysicsAffectedImpostorWithData]) => affectedImpostorsCallback(t0).runNow()), falloff = falloff.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsRadialExplosionEventOptions]
  }
  
  extension [Self <: PhysicsRadialExplosionEventOptions](x: Self) {
    
    inline def setAffectedImpostorsCallback(value: js.Array[PhysicsAffectedImpostorWithData] => Callback): Self = StObject.set(x, "affectedImpostorsCallback", js.Any.fromFunction1((t0: js.Array[PhysicsAffectedImpostorWithData]) => value(t0).runNow()))
    
    inline def setFalloff(value: PhysicsRadialImpulseFalloff): Self = StObject.set(x, "falloff", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setSphere(value: DiameterSegments): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
  }
}
