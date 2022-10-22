package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRExperienceHelper")
@js.native
/**
  * Creates a WebXRExperienceHelper
  * @param _scene The scene the helper should be created in
  */
/* private */ open class WebXRExperienceHelper ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRExperienceHelper {
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRExperienceHelper {
  
  @JSGlobal("BABYLON.WebXRExperienceHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates the experience helper
    * @param scene the scene to attach the experience helper to
    * @returns a promise for the experience helper
    */
  inline def CreateAsync(scene: typingsJapgolly.babylonjs.BABYLON.Scene): js.Promise[typingsJapgolly.babylonjs.BABYLON.WebXRExperienceHelper] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.BABYLON.WebXRExperienceHelper]]
}
