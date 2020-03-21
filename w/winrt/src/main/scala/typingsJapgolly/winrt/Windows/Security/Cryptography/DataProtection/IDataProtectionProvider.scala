package typingsJapgolly.winrt.Windows.Security.Cryptography.DataProtection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProtectionProvider extends js.Object {
  def protectAsync(data: IBuffer): IAsyncOperation[IBuffer]
  def protectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction
  def unprotectAsync(data: IBuffer): IAsyncOperation[IBuffer]
  def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction
}

object IDataProtectionProvider {
  @scala.inline
  def apply(
    protectAsync: IBuffer => CallbackTo[IAsyncOperation[IBuffer]],
    protectStreamAsync: (IInputStream, IOutputStream) => CallbackTo[IAsyncAction],
    unprotectAsync: IBuffer => CallbackTo[IAsyncOperation[IBuffer]],
    unprotectStreamAsync: (IInputStream, IOutputStream) => CallbackTo[IAsyncAction]
  ): IDataProtectionProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("protectAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => protectAsync(t0).runNow()))
    __obj.updateDynamic("protectStreamAsync")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream) => protectStreamAsync(t0, t1).runNow()))
    __obj.updateDynamic("unprotectAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => unprotectAsync(t0).runNow()))
    __obj.updateDynamic("unprotectStreamAsync")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream) => unprotectStreamAsync(t0, t1).runNow()))
    __obj.asInstanceOf[IDataProtectionProvider]
  }
}

