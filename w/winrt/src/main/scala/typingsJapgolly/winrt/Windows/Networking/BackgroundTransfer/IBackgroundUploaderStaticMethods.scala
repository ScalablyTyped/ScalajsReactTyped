package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundUploaderStaticMethods extends js.Object {
  def getCurrentUploadsAsync(): IAsyncOperation[IVectorView[UploadOperation]] = js.native
  def getCurrentUploadsAsync(group: String): IAsyncOperation[IVectorView[UploadOperation]] = js.native
}

