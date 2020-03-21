package typingsJapgolly.reduxFirstRouter

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.reduxFirstRouter.mod.ConfirmLeave
import typingsJapgolly.reduxFirstRouter.mod.Meta
import typingsJapgolly.reduxFirstRouter.mod.Nullable
import typingsJapgolly.reduxFirstRouter.mod.RouteThunk
import typingsJapgolly.reduxFirstRouter.mod.StateGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapitalizedWords[TState] extends js.Object {
  var capitalizedWords: js.UndefOr[Boolean] = js.undefined
  var coerceNumbers: js.UndefOr[Boolean] = js.undefined
  var confirmLeave: js.UndefOr[ConfirmLeave] = js.undefined
  var fromPath: js.UndefOr[js.Function2[/* path */ String, /* key */ js.UndefOr[String], String]] = js.undefined
  var meta: js.UndefOr[Meta] = js.undefined
  var navKey: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var thunk: js.UndefOr[RouteThunk[TState]] = js.undefined
  var toPath: js.UndefOr[js.Function2[/* param */ String, /* key */ js.UndefOr[String], String]] = js.undefined
}

object AnonCapitalizedWords {
  @scala.inline
  def apply[TState](
    capitalizedWords: js.UndefOr[Boolean] = js.undefined,
    coerceNumbers: js.UndefOr[Boolean] = js.undefined,
    confirmLeave: (/* state */ js.Object, /* action */ js.Object) => CallbackTo[Nullable[String]] = null,
    fromPath: (/* path */ String, /* key */ js.UndefOr[String]) => CallbackTo[String] = null,
    meta: Meta = null,
    navKey: String = null,
    path: String = null,
    thunk: (/* dispatch */ Dispatch[js.Any], /* getState */ StateGetter[TState]) => CallbackTo[js.Any | js.Promise[js.Any]] = null,
    toPath: (/* param */ String, /* key */ js.UndefOr[String]) => CallbackTo[String] = null
  ): AnonCapitalizedWords[TState] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capitalizedWords)) __obj.updateDynamic("capitalizedWords")(capitalizedWords.asInstanceOf[js.Any])
    if (!js.isUndefined(coerceNumbers)) __obj.updateDynamic("coerceNumbers")(coerceNumbers.asInstanceOf[js.Any])
    if (confirmLeave != null) __obj.updateDynamic("confirmLeave")(js.Any.fromFunction2((t0: /* state */ js.Object, t1: /* action */ js.Object) => confirmLeave(t0, t1).runNow()))
    if (fromPath != null) __obj.updateDynamic("fromPath")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* key */ js.UndefOr[java.lang.String]) => fromPath(t0, t1).runNow()))
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (navKey != null) __obj.updateDynamic("navKey")(navKey.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (thunk != null) __obj.updateDynamic("thunk")(js.Any.fromFunction2((t0: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any], t1: /* getState */ typingsJapgolly.reduxFirstRouter.mod.StateGetter[TState]) => thunk(t0, t1).runNow()))
    if (toPath != null) __obj.updateDynamic("toPath")(js.Any.fromFunction2((t0: /* param */ java.lang.String, t1: /* key */ js.UndefOr[java.lang.String]) => toPath(t0, t1).runNow()))
    __obj.asInstanceOf[AnonCapitalizedWords[TState]]
  }
}

