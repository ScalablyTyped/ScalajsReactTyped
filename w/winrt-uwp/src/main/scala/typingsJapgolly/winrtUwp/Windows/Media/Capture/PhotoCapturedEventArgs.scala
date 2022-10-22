package typingsJapgolly.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the photo sequence PhotoCaptured event. */
trait PhotoCapturedEventArgs extends StObject {
  
  /** Gets a value that indicates time offset in the photo sequence. */
  var captureTimeOffset: Double
  
  /** Gets the captured image associated with the event. */
  var frame: CapturedFrame
  
  /** Gets a thumbnail version of the captured image associated with the event. */
  var thumbnail: CapturedFrame
}
object PhotoCapturedEventArgs {
  
  inline def apply(captureTimeOffset: Double, frame: CapturedFrame, thumbnail: CapturedFrame): PhotoCapturedEventArgs = {
    val __obj = js.Dynamic.literal(captureTimeOffset = captureTimeOffset.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoCapturedEventArgs]
  }
  
  extension [Self <: PhotoCapturedEventArgs](x: Self) {
    
    inline def setCaptureTimeOffset(value: Double): Self = StObject.set(x, "captureTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: CapturedFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: CapturedFrame): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
