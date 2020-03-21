package typingsJapgolly.ebml.mod.Decoder

import japgolly.scalajs.react.Callback
import typingsJapgolly.ebml.mod.StateAndTagData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerMap extends js.Object {
  def close(): Unit
  def data(chunk: StateAndTagData): Unit
  def end(): Unit
  def error(err: js.Error): Unit
  def readable(): Unit
}

object EventListenerMap {
  @scala.inline
  def apply(
    close: Callback,
    data: StateAndTagData => Callback,
    end: Callback,
    error: js.Error => Callback,
    readable: Callback
  ): EventListenerMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("data")(js.Any.fromFunction1((t0: typingsJapgolly.ebml.mod.StateAndTagData) => data(t0).runNow()))
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()))
    __obj.updateDynamic("readable")(readable.toJsFn)
    __obj.asInstanceOf[EventListenerMap]
  }
}

