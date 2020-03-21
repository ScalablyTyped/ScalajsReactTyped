package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookApi.urlMod.QueryParams
import typingsJapgolly.storybookChannels.mod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/api.@storybook/api.API, 'on' | 'off' | 'emit' | 'getQueryParam' | 'setQueryParams'> */
trait PickAPIonoffemitgetQueryP extends js.Object {
  var emit: js.Function2[/* type */ String, /* repeated */ js.Any, Unit]
  var getQueryParam: js.Function1[/* key */ String, js.UndefOr[String]]
  var off: js.Function2[/* type */ String, /* cb */ Listener, Unit]
  var on: js.Function2[/* type */ String, /* cb */ Listener, js.Function0[Unit]]
  var setQueryParams: js.Function1[/* input */ QueryParams, Unit]
}

object PickAPIonoffemitgetQueryP {
  @scala.inline
  def apply(
    emit: (/* type */ String, /* repeated */ js.Any) => Callback,
    getQueryParam: /* key */ String => CallbackTo[js.UndefOr[String]],
    off: (/* type */ String, /* cb */ Listener) => Callback,
    on: (/* type */ String, /* cb */ Listener) => CallbackTo[js.Function0[Unit]],
    setQueryParams: /* input */ QueryParams => Callback
  ): PickAPIonoffemitgetQueryP = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: /* type */ java.lang.String, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("getQueryParam")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => getQueryParam(t0).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: /* type */ java.lang.String, t1: /* cb */ typingsJapgolly.storybookChannels.mod.Listener) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: /* type */ java.lang.String, t1: /* cb */ typingsJapgolly.storybookChannels.mod.Listener) => on(t0, t1).runNow()))
    __obj.updateDynamic("setQueryParams")(js.Any.fromFunction1((t0: /* input */ typingsJapgolly.storybookApi.urlMod.QueryParams) => setQueryParams(t0).runNow()))
    __obj.asInstanceOf[PickAPIonoffemitgetQueryP]
  }
}

