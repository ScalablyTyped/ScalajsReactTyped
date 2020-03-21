package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputStreamReference extends js.Object {
  def openSequentialReadAsync(): IAsyncOperation[IInputStream]
}

object IInputStreamReference {
  @scala.inline
  def apply(openSequentialReadAsync: CallbackTo[IAsyncOperation[IInputStream]]): IInputStreamReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openSequentialReadAsync")(openSequentialReadAsync.toJsFn)
    __obj.asInstanceOf[IInputStreamReference]
  }
}

