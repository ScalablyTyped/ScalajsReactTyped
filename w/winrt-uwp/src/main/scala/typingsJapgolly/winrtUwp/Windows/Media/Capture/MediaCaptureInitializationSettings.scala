package typingsJapgolly.winrtUwp.Windows.Media.Capture

import typingsJapgolly.winrtUwp.Windows.Media.AudioProcessing
import typingsJapgolly.winrtUwp.Windows.Media.Core.IMediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains initialization settings for the MediaCapture object which are passed to the MediaCapture.InitializeAsync method. */
trait MediaCaptureInitializationSettings extends StObject {
  
  /** Gets the DeviceInformation.Id of the microphone. */
  var audioDeviceId: String
  
  /** Gets or sets a value that specifies the audio processing mode. */
  var audioProcessing: AudioProcessing
  
  /** Gets or sets the audio source for the capture operation. */
  var audioSource: IMediaSource
  
  /** Gets or set the media category. */
  var mediaCategory: MediaCategory
  
  /** Gets or sets the stream that is used for photo capture. */
  var photoCaptureSource: PhotoCaptureSource
  
  /** Gets or sets the media description for photo capture. */
  var photoMediaDescription: MediaCaptureVideoProfileMediaDescription
  
  /** Gets or sets the media description for preview video. */
  var previewMediaDescription: MediaCaptureVideoProfileMediaDescription
  
  /** Gets or sets the media description for video recording. */
  var recordMediaDescription: MediaCaptureVideoProfileMediaDescription
  
  /** Gets or sets the streaming mode. */
  var streamingCaptureMode: StreamingCaptureMode
  
  /** Gets the DeviceInformation.Id of the video camera. */
  var videoDeviceId: String
  
  /** Gets or sets the video profile which provides hints to the driver to allow it to optimize for different capture scenarios. */
  var videoProfile: MediaCaptureVideoProfile
  
  /** Gets or sets the video source for the capture operation. */
  var videoSource: IMediaSource
}
object MediaCaptureInitializationSettings {
  
  inline def apply(
    audioDeviceId: String,
    audioProcessing: AudioProcessing,
    audioSource: IMediaSource,
    mediaCategory: MediaCategory,
    photoCaptureSource: PhotoCaptureSource,
    photoMediaDescription: MediaCaptureVideoProfileMediaDescription,
    previewMediaDescription: MediaCaptureVideoProfileMediaDescription,
    recordMediaDescription: MediaCaptureVideoProfileMediaDescription,
    streamingCaptureMode: StreamingCaptureMode,
    videoDeviceId: String,
    videoProfile: MediaCaptureVideoProfile,
    videoSource: IMediaSource
  ): MediaCaptureInitializationSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId.asInstanceOf[js.Any], audioProcessing = audioProcessing.asInstanceOf[js.Any], audioSource = audioSource.asInstanceOf[js.Any], mediaCategory = mediaCategory.asInstanceOf[js.Any], photoCaptureSource = photoCaptureSource.asInstanceOf[js.Any], photoMediaDescription = photoMediaDescription.asInstanceOf[js.Any], previewMediaDescription = previewMediaDescription.asInstanceOf[js.Any], recordMediaDescription = recordMediaDescription.asInstanceOf[js.Any], streamingCaptureMode = streamingCaptureMode.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any], videoProfile = videoProfile.asInstanceOf[js.Any], videoSource = videoSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureInitializationSettings]
  }
  
  extension [Self <: MediaCaptureInitializationSettings](x: Self) {
    
    inline def setAudioDeviceId(value: String): Self = StObject.set(x, "audioDeviceId", value.asInstanceOf[js.Any])
    
    inline def setAudioProcessing(value: AudioProcessing): Self = StObject.set(x, "audioProcessing", value.asInstanceOf[js.Any])
    
    inline def setAudioSource(value: IMediaSource): Self = StObject.set(x, "audioSource", value.asInstanceOf[js.Any])
    
    inline def setMediaCategory(value: MediaCategory): Self = StObject.set(x, "mediaCategory", value.asInstanceOf[js.Any])
    
    inline def setPhotoCaptureSource(value: PhotoCaptureSource): Self = StObject.set(x, "photoCaptureSource", value.asInstanceOf[js.Any])
    
    inline def setPhotoMediaDescription(value: MediaCaptureVideoProfileMediaDescription): Self = StObject.set(x, "photoMediaDescription", value.asInstanceOf[js.Any])
    
    inline def setPreviewMediaDescription(value: MediaCaptureVideoProfileMediaDescription): Self = StObject.set(x, "previewMediaDescription", value.asInstanceOf[js.Any])
    
    inline def setRecordMediaDescription(value: MediaCaptureVideoProfileMediaDescription): Self = StObject.set(x, "recordMediaDescription", value.asInstanceOf[js.Any])
    
    inline def setStreamingCaptureMode(value: StreamingCaptureMode): Self = StObject.set(x, "streamingCaptureMode", value.asInstanceOf[js.Any])
    
    inline def setVideoDeviceId(value: String): Self = StObject.set(x, "videoDeviceId", value.asInstanceOf[js.Any])
    
    inline def setVideoProfile(value: MediaCaptureVideoProfile): Self = StObject.set(x, "videoProfile", value.asInstanceOf[js.Any])
    
    inline def setVideoSource(value: IMediaSource): Self = StObject.set(x, "videoSource", value.asInstanceOf[js.Any])
  }
}
