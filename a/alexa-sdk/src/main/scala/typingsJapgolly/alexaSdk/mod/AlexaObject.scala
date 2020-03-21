package typingsJapgolly.alexaSdk.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlexaObject[T /* <: Request */] extends Handler_[T] {
  var _callback: js.Any
  var _context: js.Any
  var _event: js.Any
  var appId: js.Any
  var dynamoDBTableName: js.Any
  var resources: js.Any
  var saveBeforeResponse: Boolean
  def execute(): Unit
  def registerHandlers(handlers: Handlers[T]*): js.Any
}

object AlexaObject {
  @scala.inline
  def apply[T /* <: Request */](
    _callback: js.Any,
    _context: js.Any,
    _event: js.Any,
    appId: js.Any,
    attributes: js.Any,
    callback: js.Any => Callback,
    context: js.Any,
    dynamoDBTableName: js.Any,
    emit: (String, /* repeated */ js.Any) => CallbackTo[Boolean],
    emitWithState: js.Any,
    event: RequestBody[T],
    execute: Callback,
    handler: js.Any,
    i18n: js.Any,
    isOverriden: js.Any,
    locale: js.Any,
    name: js.Any,
    on: js.Any,
    registerHandlers: /* repeated */ Handlers[T] => CallbackTo[js.Any],
    resources: js.Any,
    response: ResponseBuilder,
    saveBeforeResponse: Boolean,
    state: js.Any,
    t: (String, /* repeated */ js.Any) => Callback
  ): AlexaObject[T] = {
    val __obj = js.Dynamic.literal(_callback = _callback.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _event = _event.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], dynamoDBTableName = dynamoDBTableName.asInstanceOf[js.Any], emitWithState = emitWithState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isOverriden = isOverriden.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], saveBeforeResponse = saveBeforeResponse.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: js.Any) => callback(t0).runNow()))
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("execute")(execute.toJsFn)
    __obj.updateDynamic("registerHandlers")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.alexaSdk.mod.Handlers[T]) => registerHandlers(t0).runNow()))
    __obj.updateDynamic("t")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => t(t0, t1).runNow()))
    __obj.asInstanceOf[AlexaObject[T]]
  }
}

