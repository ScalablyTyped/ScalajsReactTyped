package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashComputation extends js.Object {
  def append(data: IBuffer): Unit
  def getValueAndReset(): IBuffer
}

object IHashComputation {
  @scala.inline
  def apply(append: IBuffer => Callback, getValueAndReset: CallbackTo[IBuffer]): IHashComputation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => append(t0).runNow()))
    __obj.updateDynamic("getValueAndReset")(getValueAndReset.toJsFn)
    __obj.asInstanceOf[IHashComputation]
  }
}

