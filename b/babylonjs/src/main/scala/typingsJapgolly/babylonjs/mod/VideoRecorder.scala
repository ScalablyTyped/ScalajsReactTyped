package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.anon.PartialVideoRecorderOptio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "VideoRecorder")
@js.native
open class VideoRecorder protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.VideoRecorder {
  /**
    * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
    * @param engine Defines the BabylonJS Engine you wish to record.
    * @param options Defines options that can be used to customize the capture.
    */
  def this(engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine) = this()
  def this(engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine, options: PartialVideoRecorderOptio) = this()
}
/* static members */
object VideoRecorder {
  
  @JSImport("babylonjs", "VideoRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns whether or not the VideoRecorder is available in your browser.
    * @param engine Defines the Babylon Engine.
    * @returns true if supported otherwise false.
    */
  inline def IsSupported(engine: typingsJapgolly.babylonjs.enginesEngineMod.Engine): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSupported")(engine.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("babylonjs", "VideoRecorder._DefaultOptions")
  @js.native
  val _DefaultOptions: Any = js.native
}
