package typingsJapgolly.winrtUwp.Windows.Media.Capture

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video profile that indicates a configuration supported by the video capture device. */
trait MediaCaptureVideoProfile extends StObject {
  
  /**
    * Gets the list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    * @return The list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    */
  def getConcurrency(): IVectorView[MediaCaptureVideoProfile]
  
  /** Gets the unique identifier of the video profile. */
  var id: String
  
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for photo capture. */
  var supportedPhotoMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription]
  
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video preview. */
  var supportedPreviewMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription]
  
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video recording. */
  var supportedRecordMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription]
  
  /** Gets the device ID of the video device associated with the video profile. */
  var videoDeviceId: String
}
object MediaCaptureVideoProfile {
  
  inline def apply(
    getConcurrency: CallbackTo[IVectorView[MediaCaptureVideoProfile]],
    id: String,
    supportedPhotoMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    supportedPreviewMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    supportedRecordMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    videoDeviceId: String
  ): MediaCaptureVideoProfile = {
    val __obj = js.Dynamic.literal(getConcurrency = getConcurrency.toJsFn, id = id.asInstanceOf[js.Any], supportedPhotoMediaDescription = supportedPhotoMediaDescription.asInstanceOf[js.Any], supportedPreviewMediaDescription = supportedPreviewMediaDescription.asInstanceOf[js.Any], supportedRecordMediaDescription = supportedRecordMediaDescription.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureVideoProfile]
  }
  
  extension [Self <: MediaCaptureVideoProfile](x: Self) {
    
    inline def setGetConcurrency(value: CallbackTo[IVectorView[MediaCaptureVideoProfile]]): Self = StObject.set(x, "getConcurrency", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSupportedPhotoMediaDescription(value: IVectorView[MediaCaptureVideoProfileMediaDescription]): Self = StObject.set(x, "supportedPhotoMediaDescription", value.asInstanceOf[js.Any])
    
    inline def setSupportedPreviewMediaDescription(value: IVectorView[MediaCaptureVideoProfileMediaDescription]): Self = StObject.set(x, "supportedPreviewMediaDescription", value.asInstanceOf[js.Any])
    
    inline def setSupportedRecordMediaDescription(value: IVectorView[MediaCaptureVideoProfileMediaDescription]): Self = StObject.set(x, "supportedRecordMediaDescription", value.asInstanceOf[js.Any])
    
    inline def setVideoDeviceId(value: String): Self = StObject.set(x, "videoDeviceId", value.asInstanceOf[js.Any])
  }
}
