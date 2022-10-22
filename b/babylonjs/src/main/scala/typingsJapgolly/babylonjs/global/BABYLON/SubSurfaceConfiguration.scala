package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SubSurfaceConfiguration")
@js.native
open class SubSurfaceConfiguration protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.SubSurfaceConfiguration {
  /**
    * Builds a subsurface configuration object
    * @param scene The scene
    */
  def this(scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  
  /**
    * Is the effect enabled
    */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * Name of the effect
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Textures required in the MRT
    */
  /* CompleteClass */
  var texturesRequired: js.Array[Double] = js.native
}
/* static members */
object SubSurfaceConfiguration {
  
  @JSGlobal("BABYLON.SubSurfaceConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: typingsJapgolly.babylonjs.BABYLON.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
