package typingsJapgolly.winrtUwp.global.Windows.Media.Capture

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video profile that indicates a configuration supported by the video capture device. */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.MediaCaptureVideoProfile")
@js.native
open class MediaCaptureVideoProfile ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile {
  
  /**
    * Gets the list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    * @return The list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    */
  /* CompleteClass */
  override def getConcurrency(): IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfile] = js.native
  
  /** Gets the unique identifier of the video profile. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for photo capture. */
  /* CompleteClass */
  var supportedPhotoMediaDescription: IVectorView[
    typingsJapgolly.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription
  ] = js.native
  
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video preview. */
  /* CompleteClass */
  var supportedPreviewMediaDescription: IVectorView[
    typingsJapgolly.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription
  ] = js.native
  
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video recording. */
  /* CompleteClass */
  var supportedRecordMediaDescription: IVectorView[
    typingsJapgolly.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription
  ] = js.native
  
  /** Gets the device ID of the video device associated with the video profile. */
  /* CompleteClass */
  var videoDeviceId: String = js.native
}
