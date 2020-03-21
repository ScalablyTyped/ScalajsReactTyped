package typingsJapgolly.winrt.Windows.Media.Capture

import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Media.Devices.AudioDeviceController
import typingsJapgolly.winrt.Windows.Media.Devices.VideoDeviceController
import typingsJapgolly.winrt.Windows.Media.IMediaExtension
import typingsJapgolly.winrt.Windows.Media.MediaProperties.ImageEncodingProperties
import typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaCapture extends js.Object {
  var audioDeviceController: AudioDeviceController = js.native
  var mediaCaptureSettings: MediaCaptureSettings = js.native
  var onfailed: js.Any = js.native
  var onrecordlimitationexceeded: js.Any = js.native
  var videoDeviceController: VideoDeviceController = js.native
  def addEffectAsync(mediaStreamType: MediaStreamType, effectActivationID: String, effectSettings: IPropertySet): IAsyncAction = js.native
  def capturePhotoToStorageFileAsync(`type`: ImageEncodingProperties, file: IStorageFile): IAsyncAction = js.native
  def capturePhotoToStreamAsync(`type`: ImageEncodingProperties, stream: IRandomAccessStream): IAsyncAction = js.native
  def clearEffectsAsync(mediaStreamType: MediaStreamType): IAsyncAction = js.native
  def getEncoderProperty(mediaStreamType: MediaStreamType, propertyId: String): js.Any = js.native
  def getPreviewMirroring(): Boolean = js.native
  def getPreviewRotation(): VideoRotation = js.native
  def getRecordRotation(): VideoRotation = js.native
  def initializeAsync(): IAsyncAction = js.native
  def initializeAsync(mediaCaptureInitializationSettings: MediaCaptureInitializationSettings): IAsyncAction = js.native
  def setEncoderProperty(mediaStreamType: MediaStreamType, propertyId: String, propertyValue: js.Any): Unit = js.native
  def setPreviewMirroring(value: Boolean): Unit = js.native
  def setPreviewRotation(value: VideoRotation): Unit = js.native
  def setRecordRotation(value: VideoRotation): Unit = js.native
  def startRecordToCustomSinkAsync(encodingProfile: MediaEncodingProfile, customMediaSink: IMediaExtension): IAsyncAction = js.native
  def startRecordToCustomSinkAsync(
    encodingProfile: MediaEncodingProfile,
    customSinkActivationId: String,
    customSinkSettings: IPropertySet
  ): IAsyncAction = js.native
  def startRecordToStorageFileAsync(encodingProfile: MediaEncodingProfile, file: IStorageFile): IAsyncAction = js.native
  def startRecordToStreamAsync(encodingProfile: MediaEncodingProfile, stream: IRandomAccessStream): IAsyncAction = js.native
  def stopRecordAsync(): IAsyncAction = js.native
}

