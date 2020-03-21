package typingsJapgolly.dustjsLinkedin.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream_ extends js.Object {
  def emit(evt: String, data: js.Any): Unit
  def flush(): Unit
  /*
    * Registers an event listener. Streams accept a single listener for a given event.
    * @param evt the event. Possible values are data, end, error (maybe more, look in the source).
    */
  def on(evt: String, callback: js.Function1[/* data */ js.UndefOr[js.Any], _]): this.type
  def pipe(stream: Stream_): Stream_
}

object Stream_ {
  @scala.inline
  def apply(
    emit: (String, js.Any) => Callback,
    flush: Callback,
    on: (String, js.Function1[/* data */ js.UndefOr[js.Any], js.Any]) => CallbackTo[Stream_],
    pipe: Stream_ => CallbackTo[Stream_]
  ): Stream_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* data */ js.UndefOr[js.Any], js.Any]) => on(t0, t1).runNow()))
    __obj.updateDynamic("pipe")(js.Any.fromFunction1((t0: typingsJapgolly.dustjsLinkedin.mod.Stream_) => pipe(t0).runNow()))
    __obj.asInstanceOf[Stream_]
  }
}

