package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputStream extends IClosable {
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double]
}

object IInputStream {
  @scala.inline
  def apply(
    close: Callback,
    readAsync: (IBuffer, Double, InputStreamOptions) => CallbackTo[IAsyncOperationWithProgress[IBuffer, Double]]
  ): IInputStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("readAsync")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t1: scala.Double, t2: typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions) => readAsync(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IInputStream]
  }
}

