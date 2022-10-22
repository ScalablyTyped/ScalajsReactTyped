package typingsJapgolly.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a description of media that is supported by a video profile. */
trait MediaCaptureVideoProfileMediaDescription extends StObject {
  
  /** Gets the frame rate of the media description. */
  var frameRate: Double
  
  /** Gets the height of the media description. */
  var height: Double
  
  /** Gets a value indicating if the media description includes HDR video support. */
  var isHdrVideoSupported: Boolean
  
  /** Gets a value indicating if the media description includes variable photo sequence support. */
  var isVariablePhotoSequenceSupported: Boolean
  
  /** Gets the height of the media description. */
  var width: Double
}
object MediaCaptureVideoProfileMediaDescription {
  
  inline def apply(
    frameRate: Double,
    height: Double,
    isHdrVideoSupported: Boolean,
    isVariablePhotoSequenceSupported: Boolean,
    width: Double
  ): MediaCaptureVideoProfileMediaDescription = {
    val __obj = js.Dynamic.literal(frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isHdrVideoSupported = isHdrVideoSupported.asInstanceOf[js.Any], isVariablePhotoSequenceSupported = isVariablePhotoSequenceSupported.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureVideoProfileMediaDescription]
  }
  
  extension [Self <: MediaCaptureVideoProfileMediaDescription](x: Self) {
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsHdrVideoSupported(value: Boolean): Self = StObject.set(x, "isHdrVideoSupported", value.asInstanceOf[js.Any])
    
    inline def setIsVariablePhotoSequenceSupported(value: Boolean): Self = StObject.set(x, "isVariablePhotoSequenceSupported", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
