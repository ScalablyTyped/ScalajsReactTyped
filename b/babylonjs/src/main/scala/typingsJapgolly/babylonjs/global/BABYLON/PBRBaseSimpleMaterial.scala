package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("BABYLON.PBRBaseSimpleMaterial")
@js.native
open class PBRBaseSimpleMaterial protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PBRBaseSimpleMaterial {
  /**
    * Instantiates a new PBRMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String) = this()
  def this(name: String, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typingsJapgolly.babylonjs.BABYLON.Animation]] = js.native
}
