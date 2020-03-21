package typingsJapgolly.alexaSdk.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handler_[T /* <: Request */] extends js.Object {
  var attributes: js.Any
  var context: js.Any
  var emitWithState: js.Any
  var event: RequestBody[T]
  var handler: js.Any
  var i18n: js.Any
  var isOverriden: js.Any
  var locale: js.Any
  var name: js.Any
  var on: js.Any
  var response: ResponseBuilder
  var state: js.Any
  def callback(param: js.Any): Unit
  def emit(event: String, args: js.Any*): Boolean
  def t(token: String, args: js.Any*): Unit
}

object Handler_ {
  @scala.inline
  def apply[T /* <: Request */](
    attributes: js.Any,
    callback: js.Any => Callback,
    context: js.Any,
    emit: (String, /* repeated */ js.Any) => CallbackTo[Boolean],
    emitWithState: js.Any,
    event: RequestBody[T],
    handler: js.Any,
    i18n: js.Any,
    isOverriden: js.Any,
    locale: js.Any,
    name: js.Any,
    on: js.Any,
    response: ResponseBuilder,
    state: js.Any,
    t: (String, /* repeated */ js.Any) => Callback
  ): Handler_[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], emitWithState = emitWithState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isOverriden = isOverriden.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: js.Any) => callback(t0).runNow()))
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("t")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => t(t0, t1).runNow()))
    __obj.asInstanceOf[Handler_[T]]
  }
}

