package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRManagedOutputCanvasOptions")
@js.native
open class WebXRManagedOutputCanvasOptions ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRManagedOutputCanvasOptions
/* static members */
object WebXRManagedOutputCanvasOptions {
  
  @JSGlobal("BABYLON.WebXRManagedOutputCanvasOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the default values of the configuration object
    * @param engine defines the engine to use (can be null)
    * @returns default values of this configuration object
    */
  inline def GetDefaults(): typingsJapgolly.babylonjs.BABYLON.WebXRManagedOutputCanvasOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaults")().asInstanceOf[typingsJapgolly.babylonjs.BABYLON.WebXRManagedOutputCanvasOptions]
  inline def GetDefaults(engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine): typingsJapgolly.babylonjs.BABYLON.WebXRManagedOutputCanvasOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaults")(engine.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.WebXRManagedOutputCanvasOptions]
}
