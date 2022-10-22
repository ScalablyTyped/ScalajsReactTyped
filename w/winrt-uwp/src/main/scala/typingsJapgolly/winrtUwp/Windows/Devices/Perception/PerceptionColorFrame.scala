package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Media.VideoFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a Windows.Media.VideoFrame with the color frame data. */
trait PerceptionColorFrame extends StObject {
  
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit
  
  /** Gets a Windows.Media.VideoFrame with the color frame data. */
  var videoFrame: VideoFrame
}
object PerceptionColorFrame {
  
  inline def apply(close: Callback, videoFrame: VideoFrame): PerceptionColorFrame = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, videoFrame = videoFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionColorFrame]
  }
  
  extension [Self <: PerceptionColorFrame](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setVideoFrame(value: VideoFrame): Self = StObject.set(x, "videoFrame", value.asInstanceOf[js.Any])
  }
}
