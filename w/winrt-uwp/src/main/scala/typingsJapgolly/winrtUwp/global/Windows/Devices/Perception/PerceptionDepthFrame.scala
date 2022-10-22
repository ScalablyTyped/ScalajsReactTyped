package typingsJapgolly.winrtUwp.global.Windows.Devices.Perception

import typingsJapgolly.winrtUwp.Windows.Media.VideoFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a Windows.Media.VideoFrame with the depth frame data. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Perception.PerceptionDepthFrame")
@js.native
open class PerceptionDepthFrame ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame {
  
  /** Releases system resources that are exposed by a Windows Runtime object. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /** Gets a Windows.Media.VideoFrame with the depth frame data. */
  /* CompleteClass */
  var videoFrame: VideoFrame = js.native
}
