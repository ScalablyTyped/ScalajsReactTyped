package typingsJapgolly.googleCloudPaginator.resourceStreamMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleCloudPaginator.googleCloudPaginatorStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceEvents[T] extends js.Object {
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
  @JSName("emit")
  def emit_data(event: data, data: T): Boolean
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
}

object ResourceEvents {
  @scala.inline
  def apply[T](
    addListener: (data, js.Function1[/* data */ T, Unit]) => CallbackTo[ResourceEvents[T]],
    emit: (data, T) => CallbackTo[Boolean],
    on: (data, js.Function1[/* data */ T, Unit]) => CallbackTo[ResourceEvents[T]],
    once: (data, js.Function1[/* data */ T, Unit]) => CallbackTo[ResourceEvents[T]],
    prependListener: (data, js.Function1[/* data */ T, Unit]) => CallbackTo[ResourceEvents[T]],
    prependOnceListener: (data, js.Function1[/* data */ T, Unit]) => CallbackTo[ResourceEvents[T]],
    removeListener: (data, js.Function1[/* data */ T, Unit]) => CallbackTo[ResourceEvents[T]]
  ): ResourceEvents[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: typingsJapgolly.googleCloudPaginator.googleCloudPaginatorStrings.data, t1: js.Function1[/* data */ T, scala.Unit]) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: typingsJapgolly.googleCloudPaginator.googleCloudPaginatorStrings.data, t1: T) => emit(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.googleCloudPaginator.googleCloudPaginatorStrings.data, t1: js.Function1[/* data */ T, scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("once")(js.Any.fromFunction2((t0: typingsJapgolly.googleCloudPaginator.googleCloudPaginatorStrings.data, t1: js.Function1[/* data */ T, scala.Unit]) => once(t0, t1).runNow()))
    __obj.updateDynamic("prependListener")(js.Any.fromFunction2((t0: typingsJapgolly.googleCloudPaginator.googleCloudPaginatorStrings.data, t1: js.Function1[/* data */ T, scala.Unit]) => prependListener(t0, t1).runNow()))
    __obj.updateDynamic("prependOnceListener")(js.Any.fromFunction2((t0: typingsJapgolly.googleCloudPaginator.googleCloudPaginatorStrings.data, t1: js.Function1[/* data */ T, scala.Unit]) => prependOnceListener(t0, t1).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: typingsJapgolly.googleCloudPaginator.googleCloudPaginatorStrings.data, t1: js.Function1[/* data */ T, scala.Unit]) => removeListener(t0, t1).runNow()))
    __obj.asInstanceOf[ResourceEvents[T]]
  }
}

