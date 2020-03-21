package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessStreamReference extends js.Object {
  def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType]
}

object IRandomAccessStreamReference {
  @scala.inline
  def apply(openReadAsync: CallbackTo[IAsyncOperation[IRandomAccessStreamWithContentType]]): IRandomAccessStreamReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openReadAsync")(openReadAsync.toJsFn)
    __obj.asInstanceOf[IRandomAccessStreamReference]
  }
}

