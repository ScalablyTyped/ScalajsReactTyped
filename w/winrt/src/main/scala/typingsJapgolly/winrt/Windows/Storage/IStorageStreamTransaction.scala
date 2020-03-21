package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageStreamTransaction extends IClosable {
  var stream: IRandomAccessStream
  def commitAsync(): IAsyncAction
}

object IStorageStreamTransaction {
  @scala.inline
  def apply(close: Callback, commitAsync: CallbackTo[IAsyncAction], stream: IRandomAccessStream): IStorageStreamTransaction = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("commitAsync")(commitAsync.toJsFn)
    __obj.asInstanceOf[IStorageStreamTransaction]
  }
}

