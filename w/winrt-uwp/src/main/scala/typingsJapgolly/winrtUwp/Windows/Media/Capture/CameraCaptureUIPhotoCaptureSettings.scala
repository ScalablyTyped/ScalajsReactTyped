package typingsJapgolly.winrtUwp.Windows.Media.Capture

import typingsJapgolly.winrtUwp.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides settings for capturing photos. The settings include aspect ratio, image size, format, resolution, and whether or not cropping is allowed by the user interface (UI). */
trait CameraCaptureUIPhotoCaptureSettings extends StObject {
  
  /** Determines whether photo cropping will be enabled in the user interface for capture a photo. */
  var allowCropping: Boolean
  
  /** The aspect ratio of the captured photo. */
  var croppedAspectRatio: Size
  
  /** The exact size in pixels of the captured photo. */
  var croppedSizeInPixels: Size
  
  /** Determines the format that captured photos will be stored in. */
  var format: CameraCaptureUIPhotoFormat
  
  /** Determines the maximum resolution the user will be able to select. */
  var maxResolution: CameraCaptureUIMaxPhotoResolution
}
object CameraCaptureUIPhotoCaptureSettings {
  
  inline def apply(
    allowCropping: Boolean,
    croppedAspectRatio: Size,
    croppedSizeInPixels: Size,
    format: CameraCaptureUIPhotoFormat,
    maxResolution: CameraCaptureUIMaxPhotoResolution
  ): CameraCaptureUIPhotoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowCropping = allowCropping.asInstanceOf[js.Any], croppedAspectRatio = croppedAspectRatio.asInstanceOf[js.Any], croppedSizeInPixels = croppedSizeInPixels.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraCaptureUIPhotoCaptureSettings]
  }
  
  extension [Self <: CameraCaptureUIPhotoCaptureSettings](x: Self) {
    
    inline def setAllowCropping(value: Boolean): Self = StObject.set(x, "allowCropping", value.asInstanceOf[js.Any])
    
    inline def setCroppedAspectRatio(value: Size): Self = StObject.set(x, "croppedAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setCroppedSizeInPixels(value: Size): Self = StObject.set(x, "croppedSizeInPixels", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: CameraCaptureUIPhotoFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMaxResolution(value: CameraCaptureUIMaxPhotoResolution): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
  }
}
