package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.anon.PartialVideoRecorderOptio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VideoRecorder")
@js.native
open class VideoRecorder protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.VideoRecorder {
  /**
    * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
    * @param engine Defines the BabylonJS Engine you wish to record.
    * @param options Defines options that can be used to customize the capture.
    */
  def this(engine: typingsJapgolly.babylonjs.BABYLON.Engine) = this()
  def this(engine: typingsJapgolly.babylonjs.BABYLON.Engine, options: PartialVideoRecorderOptio) = this()
}
/* static members */
object VideoRecorder {
  
  @JSGlobal("BABYLON.VideoRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns whether or not the VideoRecorder is available in your browser.
    * @param engine Defines the Babylon Engine.
    * @returns true if supported otherwise false.
    */
  inline def IsSupported(engine: typingsJapgolly.babylonjs.BABYLON.Engine): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSupported")(engine.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSGlobal("BABYLON.VideoRecorder._DefaultOptions")
  @js.native
  val _DefaultOptions: Any = js.native
}
