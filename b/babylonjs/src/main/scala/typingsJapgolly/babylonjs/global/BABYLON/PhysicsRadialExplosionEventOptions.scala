package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.PhysicsAffectedImpostorWithData
import typingsJapgolly.babylonjs.anon.DiameterSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PhysicsRadialExplosionEventOptions")
@js.native
open class PhysicsRadialExplosionEventOptions ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PhysicsRadialExplosionEventOptions {
  
  /**
    * Sphere options for the radial explosion.
    */
  /* CompleteClass */
  override def affectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
  
  /**
    * The strength of the force in correspondence to the distance of the affected object
    */
  /* CompleteClass */
  var falloff: typingsJapgolly.babylonjs.BABYLON.PhysicsRadialImpulseFalloff = js.native
  
  /**
    * The radius of the sphere for the radial explosion.
    */
  /* CompleteClass */
  var radius: Double = js.native
  
  /**
    * Sphere options for the radial explosion.
    */
  /* CompleteClass */
  var sphere: DiameterSegments = js.native
  
  /**
    * The strength of the explosion.
    */
  /* CompleteClass */
  var strength: Double = js.native
}
