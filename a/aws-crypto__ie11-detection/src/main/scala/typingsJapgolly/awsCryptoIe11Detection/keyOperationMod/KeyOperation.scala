package typingsJapgolly.awsCryptoIe11Detection.keyOperationMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.awsCryptoIe11Detection.keyMod.Key
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyOperation extends js.Object {
  val result: js.UndefOr[Key] = js.undefined
  def oncomplete(event: Event_): Unit
  def onerror(event: Event_): Unit
}

object KeyOperation {
  @scala.inline
  def apply(oncomplete: Event_ => Callback, onerror: Event_ => Callback, result: Key = null): KeyOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("oncomplete")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => oncomplete(t0).runNow()))
    __obj.updateDynamic("onerror")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onerror(t0).runNow()))
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOperation]
  }
}

