package typingsJapgolly.winrt.Windows.Media.Capture

import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Media.IMediaExtension
import typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaCaptureVideoPreview extends js.Object {
  def startPreviewAsync(): IAsyncAction = js.native
  def startPreviewToCustomSinkAsync(encodingProfile: MediaEncodingProfile, customMediaSink: IMediaExtension): IAsyncAction = js.native
  def startPreviewToCustomSinkAsync(
    encodingProfile: MediaEncodingProfile,
    customSinkActivationId: String,
    customSinkSettings: IPropertySet
  ): IAsyncAction = js.native
  def stopPreviewAsync(): IAsyncAction = js.native
}

