package typingsJapgolly.winrt.global.Windows.Media

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Size
import typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution
import typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution
import typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMode
import typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat
import typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIVideoFormat
import typingsJapgolly.winrt.Windows.Media.Capture.PhotoCaptureSource
import typingsJapgolly.winrt.Windows.Media.Capture.StreamingCaptureMode
import typingsJapgolly.winrt.Windows.Media.Capture.VideoDeviceCharacteristic
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Capture {
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUI")
  @js.native
  open class CameraCaptureUI ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUI {
    
    /* CompleteClass */
    override def captureFileAsync(mode: CameraCaptureUIMode): IAsyncOperation[StorageFile] = js.native
    
    /* CompleteClass */
    var photoSettings: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings = js.native
    
    /* CompleteClass */
    var videoSettings: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution")
  @js.native
  object CameraCaptureUIMaxPhotoResolution extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution & Double
      ] = js.native
    
    /* 0 */ val highestAvailable: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.highestAvailable & Double = js.native
    
    /* 4 */ val large3M: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.large3M & Double = js.native
    
    /* 3 */ val mediumXga: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.mediumXga & Double = js.native
    
    /* 2 */ val smallVga: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.smallVga & Double = js.native
    
    /* 5 */ val veryLarge5M: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.veryLarge5M & Double = js.native
    
    /* 1 */ val verySmallQvga: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.verySmallQvga & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxVideoResolution")
  @js.native
  object CameraCaptureUIMaxVideoResolution extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution & Double
      ] = js.native
    
    /* 3 */ val highDefinition: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.highDefinition & Double = js.native
    
    /* 0 */ val highestAvailable: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.highestAvailable & Double = js.native
    
    /* 1 */ val lowDefinition: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.lowDefinition & Double = js.native
    
    /* 2 */ val standardDefinition: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.standardDefinition & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIMode")
  @js.native
  object CameraCaptureUIMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMode & Double] = js.native
    
    /* 1 */ val photo: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMode.photo & Double = js.native
    
    /* 0 */ val photoOrVideo: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMode.photoOrVideo & Double = js.native
    
    /* 2 */ val video: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMode.video & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings")
  @js.native
  open class CameraCaptureUIPhotoCaptureSettings ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIPhotoCaptureSettings {
    
    /* CompleteClass */
    var allowCropping: Boolean = js.native
    
    /* CompleteClass */
    var croppedAspectRatio: Size = js.native
    
    /* CompleteClass */
    var croppedSizeInPixels: Size = js.native
    
    /* CompleteClass */
    var format: CameraCaptureUIPhotoFormat = js.native
    
    /* CompleteClass */
    var maxResolution: CameraCaptureUIMaxPhotoResolution = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIPhotoFormat")
  @js.native
  object CameraCaptureUIPhotoFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat & Double] = js.native
    
    /* 0 */ val jpeg: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpeg & Double = js.native
    
    /* 2 */ val jpegXR: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.jpegXR & Double = js.native
    
    /* 1 */ val png: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIPhotoFormat.png & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings")
  @js.native
  open class CameraCaptureUIVideoCaptureSettings ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings {
    
    /* CompleteClass */
    var allowTrimming: Boolean = js.native
    
    /* CompleteClass */
    var format: CameraCaptureUIVideoFormat = js.native
    
    /* CompleteClass */
    var maxDurationInSeconds: Double = js.native
    
    /* CompleteClass */
    var maxResolution: CameraCaptureUIMaxVideoResolution = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoFormat")
  @js.native
  object CameraCaptureUIVideoFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIVideoFormat & Double] = js.native
    
    /* 0 */ val mp4: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIVideoFormat.mp4 & Double = js.native
    
    /* 1 */ val wmv: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIVideoFormat.wmv & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.CameraOptionsUI")
  @js.native
  open class CameraOptionsUI ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Capture.CameraOptionsUI
  /* static members */
  object CameraOptionsUI {
    
    @JSGlobal("Windows.Media.Capture.CameraOptionsUI")
    @js.native
    val ^ : js.Any = js.native
    
    inline def show(mediaCapture: typingsJapgolly.winrt.Windows.Media.Capture.MediaCapture): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(mediaCapture.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Windows.Media.Capture.MediaCapture")
  @js.native
  open class MediaCapture ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Capture.MediaCapture
  
  @JSGlobal("Windows.Media.Capture.MediaCaptureFailedEventArgs")
  @js.native
  open class MediaCaptureFailedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Capture.MediaCaptureFailedEventArgs {
    
    /* CompleteClass */
    var code: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.MediaCaptureInitializationSettings")
  @js.native
  open class MediaCaptureInitializationSettings ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Capture.MediaCaptureInitializationSettings {
    
    /* CompleteClass */
    var audioDeviceId: String = js.native
    
    /* CompleteClass */
    var photoCaptureSource: PhotoCaptureSource = js.native
    
    /* CompleteClass */
    var streamingCaptureMode: StreamingCaptureMode = js.native
    
    /* CompleteClass */
    var videoDeviceId: String = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.MediaCaptureSettings")
  @js.native
  open class MediaCaptureSettings ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Capture.MediaCaptureSettings {
    
    /* CompleteClass */
    var audioDeviceId: String = js.native
    
    /* CompleteClass */
    var photoCaptureSource: PhotoCaptureSource = js.native
    
    /* CompleteClass */
    var streamingCaptureMode: StreamingCaptureMode = js.native
    
    /* CompleteClass */
    var videoDeviceCharacteristic: VideoDeviceCharacteristic = js.native
    
    /* CompleteClass */
    var videoDeviceId: String = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.MediaStreamType")
  @js.native
  object MediaStreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType & Double] = js.native
    
    /* 2 */ val audio: typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType.audio & Double = js.native
    
    /* 3 */ val photo: typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType.photo & Double = js.native
    
    /* 0 */ val videoPreview: typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType.videoPreview & Double = js.native
    
    /* 1 */ val videoRecord: typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType.videoRecord & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.PhotoCaptureSource")
  @js.native
  object PhotoCaptureSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.Capture.PhotoCaptureSource & Double] = js.native
    
    /* 0 */ val auto: typingsJapgolly.winrt.Windows.Media.Capture.PhotoCaptureSource.auto & Double = js.native
    
    /* 2 */ val photo: typingsJapgolly.winrt.Windows.Media.Capture.PhotoCaptureSource.photo & Double = js.native
    
    /* 1 */ val videoPreview: typingsJapgolly.winrt.Windows.Media.Capture.PhotoCaptureSource.videoPreview & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.PowerlineFrequency")
  @js.native
  object PowerlineFrequency extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.Capture.PowerlineFrequency & Double] = js.native
    
    /* 0 */ val disabled: typingsJapgolly.winrt.Windows.Media.Capture.PowerlineFrequency.disabled & Double = js.native
    
    /* 1 */ val fiftyHertz: typingsJapgolly.winrt.Windows.Media.Capture.PowerlineFrequency.fiftyHertz & Double = js.native
    
    /* 2 */ val sixtyHertz: typingsJapgolly.winrt.Windows.Media.Capture.PowerlineFrequency.sixtyHertz & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.StreamingCaptureMode")
  @js.native
  object StreamingCaptureMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.Capture.StreamingCaptureMode & Double] = js.native
    
    /* 1 */ val audio: typingsJapgolly.winrt.Windows.Media.Capture.StreamingCaptureMode.audio & Double = js.native
    
    /* 0 */ val audioAndVideo: typingsJapgolly.winrt.Windows.Media.Capture.StreamingCaptureMode.audioAndVideo & Double = js.native
    
    /* 2 */ val video: typingsJapgolly.winrt.Windows.Media.Capture.StreamingCaptureMode.video & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.VideoDeviceCharacteristic")
  @js.native
  object VideoDeviceCharacteristic extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.Capture.VideoDeviceCharacteristic & Double] = js.native
    
    /* 4 */ val allStreamsIdentical: typingsJapgolly.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.allStreamsIdentical & Double = js.native
    
    /* 0 */ val allStreamsIndependent: typingsJapgolly.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.allStreamsIndependent & Double = js.native
    
    /* 2 */ val previewPhotoStreamsIdentical: typingsJapgolly.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.previewPhotoStreamsIdentical & Double = js.native
    
    /* 1 */ val previewRecordStreamsIdentical: typingsJapgolly.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.previewRecordStreamsIdentical & Double = js.native
    
    /* 3 */ val recordPhotoStreamsIdentical: typingsJapgolly.winrt.Windows.Media.Capture.VideoDeviceCharacteristic.recordPhotoStreamsIdentical & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Capture.VideoRotation")
  @js.native
  object VideoRotation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.Capture.VideoRotation & Double] = js.native
    
    /* 2 */ val clockwise180Degrees: typingsJapgolly.winrt.Windows.Media.Capture.VideoRotation.clockwise180Degrees & Double = js.native
    
    /* 3 */ val clockwise270Degrees: typingsJapgolly.winrt.Windows.Media.Capture.VideoRotation.clockwise270Degrees & Double = js.native
    
    /* 1 */ val clockwise90Degrees: typingsJapgolly.winrt.Windows.Media.Capture.VideoRotation.clockwise90Degrees & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Media.Capture.VideoRotation.none & Double = js.native
  }
}
