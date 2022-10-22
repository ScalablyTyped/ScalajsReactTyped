package typingsJapgolly.winrtUwp.global.Windows.Media.Devices

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Media.Capture.MediaStreamType
import typingsJapgolly.winrtUwp.Windows.Media.Capture.PowerlineFrequency
import typingsJapgolly.winrtUwp.Windows.Media.Devices.Core.VariablePhotoSequenceController
import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typingsJapgolly.winrtUwp.anon.ReturnValueBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls device settings on the camera. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.VideoDeviceController")
@js.native
open class VideoDeviceController ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Devices.VideoDeviceController {
  
  /** Gets the advanced photo capture control for this video device. */
  /* CompleteClass */
  var advancedPhotoControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.AdvancedPhotoControl = js.native
  
  /** Specifies whether back-light compensation is enabled on the camera. */
  /* CompleteClass */
  var backlightCompensation: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  
  /** Gets or sets the brightness level on the camera. */
  /* CompleteClass */
  var brightness: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  
  /** Gets or sets the contrast level on the camera. */
  /* CompleteClass */
  var contrast: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  
  /** Gets or sets a value that indicates the optimizations the capture device should use to prioritize high quality picture, low latency, or low power consumption during video capture. */
  /* CompleteClass */
  var desiredOptimization: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaCaptureOptimization = js.native
  
  /** Gets or sets the camera's exposure time. */
  /* CompleteClass */
  var exposure: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  
  /** Gets the exposure compensation control for this video device. */
  /* CompleteClass */
  var exposureCompensationControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.ExposureCompensationControl = js.native
  
  /** Gets the exposure control for this video device. */
  /* CompleteClass */
  var exposureControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.ExposureControl = js.native
  
  /** Gets the ExposurePriorityVideoControl associated with the VideoDeviceController . */
  /* CompleteClass */
  var exposurePriorityVideoControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.ExposurePriorityVideoControl = js.native
  
  /** Gets the flash control for this video device. */
  /* CompleteClass */
  var flashControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.FlashControl = js.native
  
  /** Gets or sets the camera's focus setting. */
  /* CompleteClass */
  var focus: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  
  /** Gets the focus control for this video device. */
  /* CompleteClass */
  var focusControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.FocusControl = js.native
  
  /**
    * Gets a list of the supported encoding properties for the video device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return A list of the supported encoding properties.
    */
  /* CompleteClass */
  override def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
  
  /**
    * Gets a property on the camera. You can use this method to query properties that are specific to a particular camera.
    * @param propertyId The property identifier.
    * @return The property value.
    */
  /* CompleteClass */
  override def getDeviceProperty(propertyId: String): Any = js.native
  
  /**
    * Gets the encoding properties for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return The encoding properties.
    */
  /* CompleteClass */
  override def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
  
  /** Gets the HdrVideoControl associated with the VideoDeviceController . */
  /* CompleteClass */
  var hdrVideoControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.HdrVideoControl = js.native
  
  /** Gets or sets the camera's hue setting. */
  /* CompleteClass */
  var hue: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  
  /** Gets the ISO film speed control for this video device. */
  /* CompleteClass */
  var isoSpeedControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.IsoSpeedControl = js.native
  
  /** Gets the low shutter lag photo control for this video device. */
  /* CompleteClass */
  var lowLagPhoto: typingsJapgolly.winrtUwp.Windows.Media.Devices.LowLagPhotoControl = js.native
  
  /** Gets the low shutter lag photo sequence control for this video device. */
  /* CompleteClass */
  var lowLagPhotoSequence: typingsJapgolly.winrtUwp.Windows.Media.Devices.LowLagPhotoSequenceControl = js.native
  
  /** Gets the OpticalImageStabilizationControl associated with the VideoDeviceController . */
  /* CompleteClass */
  var opticalImageStabilizationControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.OpticalImageStabilizationControl = js.native
  
  /** Gets or sets the camera's pan setting. */
  /* CompleteClass */
  var pan: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  
  /** Gets the photo confirmation control for this video device. */
  /* CompleteClass */
  var photoConfirmationControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.PhotoConfirmationControl = js.native
  
  /** Gets or sets the primary use for the device. */
  /* CompleteClass */
  var primaryUse: typingsJapgolly.winrtUwp.Windows.Media.Devices.CaptureUse = js.native
  
  /** Gets the regions of interest control for this video device. */
  /* CompleteClass */
  var regionsOfInterestControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.RegionsOfInterestControl = js.native
  
  /** Gets or sets the camera's roll setting. */
  /* CompleteClass */
  var roll: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  
  /** Gets the scene mode control for this video device. */
  /* CompleteClass */
  var sceneModeControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.SceneModeControl = js.native
  
  /**
    * Sets a property on the device. You can use this method to set properties that are specific to a particular device.
    * @param propertyId The property identifier.
    * @param propertyValue The new value of the property.
    */
  /* CompleteClass */
  override def setDeviceProperty(propertyId: String, propertyValue: Any): Unit = js.native
  
  /**
    * Sets the encoding properties asynchronously for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to set the properties.
    * @param mediaEncodingProperties The encoding properties to set.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IPromiseWithIAsyncAction = js.native
  
  /** Gets or sets the camera's tilt setting. */
  /* CompleteClass */
  var tilt: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  
  /** Gets the torch control for this video device. */
  /* CompleteClass */
  var torchControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.TorchControl = js.native
  
  /**
    * Gets the local power line frequency.
    */
  /* CompleteClass */
  override def tryGetPowerlineFrequency(): ReturnValueBoolean = js.native
  
  /**
    * Sets the local power line frequency.
    * @param value The power line frequency.
    * @return Returns true if the method succeeded, or false otherwise.
    */
  /* CompleteClass */
  override def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean = js.native
  
  /** Gets the VariablePhotoSequenceController associated with the VideoDeviceController . */
  /* CompleteClass */
  var variablePhotoSequenceController: VariablePhotoSequenceController = js.native
  
  /** Gets or sets the white balance on the camera. */
  /* CompleteClass */
  var whiteBalance: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  
  /** Gets the white balance control for this video device. */
  /* CompleteClass */
  var whiteBalanceControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.WhiteBalanceControl = js.native
  
  /** Gets and sets the camera's zoom setting. */
  /* CompleteClass */
  var zoom: typingsJapgolly.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  
  /** Gets the ZoomControl associated with the VideoDeviceController . */
  /* CompleteClass */
  var zoomControl: typingsJapgolly.winrtUwp.Windows.Media.Devices.ZoomControl = js.native
}
