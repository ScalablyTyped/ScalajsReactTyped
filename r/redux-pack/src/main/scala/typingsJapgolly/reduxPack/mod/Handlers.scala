package typingsJapgolly.reduxPack.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] extends js.Object {
  var always: js.UndefOr[handlerReducer[S, typingsJapgolly.redux.mod.Action[_]]] = js.undefined
  var failure: js.UndefOr[handlerReducer[S, PackActionPayload[TErrorPayload, TMetaPayload]]] = js.undefined
  var finish: js.UndefOr[handlerReducer[S, typingsJapgolly.redux.mod.Action[_]]] = js.undefined
  var start: js.UndefOr[handlerReducer[S, PackActionPayload[TStartPayload, TMetaPayload]]] = js.undefined
  var success: js.UndefOr[handlerReducer[S, PackActionPayload[TSuccessPayload, TMetaPayload]]] = js.undefined
}

object Handlers {
  @scala.inline
  def apply[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](
    always: (S, typingsJapgolly.redux.mod.Action[js.Any]) => CallbackTo[S] = null,
    failure: (S, PackActionPayload[TErrorPayload, TMetaPayload]) => CallbackTo[S] = null,
    finish: (S, typingsJapgolly.redux.mod.Action[js.Any]) => CallbackTo[S] = null,
    start: (S, PackActionPayload[TStartPayload, TMetaPayload]) => CallbackTo[S] = null,
    success: (S, PackActionPayload[TSuccessPayload, TMetaPayload]) => CallbackTo[S] = null
  ): Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
    val __obj = js.Dynamic.literal()
    if (always != null) __obj.updateDynamic("always")(js.Any.fromFunction2((t0: S, t1: typingsJapgolly.redux.mod.Action[js.Any]) => always(t0, t1).runNow()))
    if (failure != null) __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: S, t1: typingsJapgolly.reduxPack.mod.PackActionPayload[TErrorPayload, TMetaPayload]) => failure(t0, t1).runNow()))
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction2((t0: S, t1: typingsJapgolly.redux.mod.Action[js.Any]) => finish(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: S, t1: typingsJapgolly.reduxPack.mod.PackActionPayload[TStartPayload, TMetaPayload]) => start(t0, t1).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction2((t0: S, t1: typingsJapgolly.reduxPack.mod.PackActionPayload[TSuccessPayload, TMetaPayload]) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
  }
}

