package typingsJapgolly.wordpressData

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wordpressData.mod.DispatcherMap
import typingsJapgolly.wordpressData.mod.GenericStoreConfig
import typingsJapgolly.wordpressData.mod.SelectorMap
import typingsJapgolly.wordpressData.mod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/data.@wordpress/data.DataRegistry> */
trait PartialDataRegistry extends js.Object {
  var dispatch: js.UndefOr[js.Function1[/* key */ String, DispatcherMap]] = js.undefined
  var registerGenericStore: js.UndefOr[js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit]] = js.undefined
  var registerStore: js.UndefOr[FnCall] = js.undefined
  var select: js.UndefOr[js.Function1[/* key */ String, SelectorMap]] = js.undefined
  var subscribe: js.UndefOr[Subscriber] = js.undefined
}

object PartialDataRegistry {
  @scala.inline
  def apply(
    dispatch: /* key */ String => CallbackTo[DispatcherMap] = null,
    registerGenericStore: (/* key */ String, /* config */ GenericStoreConfig) => Callback = null,
    registerStore: FnCall = null,
    select: /* key */ String => CallbackTo[SelectorMap] = null,
    subscribe: /* callback */ js.Function0[Unit] => CallbackTo[js.Function0[Unit]] = null
  ): PartialDataRegistry = {
    val __obj = js.Dynamic.literal()
    if (dispatch != null) __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => dispatch(t0).runNow()))
    if (registerGenericStore != null) __obj.updateDynamic("registerGenericStore")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* config */ typingsJapgolly.wordpressData.mod.GenericStoreConfig) => registerGenericStore(t0, t1).runNow()))
    if (registerStore != null) __obj.updateDynamic("registerStore")(registerStore.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => select(t0).runNow()))
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[PartialDataRegistry]
  }
}

