package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PushMaterial")
@js.native
open class PushMaterial protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PushMaterial {
  def this(name: String) = this()
  def this(name: String, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  def this(name: String, scene: Unit, storeEffectOnSubMeshes: Boolean) = this()
  def this(name: String, scene: typingsJapgolly.babylonjs.BABYLON.Scene, storeEffectOnSubMeshes: Boolean) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typingsJapgolly.babylonjs.BABYLON.Animation]] = js.native
}
