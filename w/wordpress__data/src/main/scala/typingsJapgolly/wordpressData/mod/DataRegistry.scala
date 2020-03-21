package typingsJapgolly.wordpressData.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wordpressData.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRegistry extends js.Object {
  var dispatch: js.Function1[/* key */ String, DispatcherMap]
  var registerGenericStore: js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit]
  var registerStore: FnCall
  var select: js.Function1[/* key */ String, SelectorMap]
  var subscribe: Subscriber
}

object DataRegistry {
  @scala.inline
  def apply(
    dispatch: /* key */ String => CallbackTo[DispatcherMap],
    registerGenericStore: (/* key */ String, /* config */ GenericStoreConfig) => Callback,
    registerStore: FnCall,
    select: /* key */ String => CallbackTo[SelectorMap],
    subscribe: /* callback */ js.Function0[Unit] => CallbackTo[js.Function0[Unit]]
  ): DataRegistry = {
    val __obj = js.Dynamic.literal(registerStore = registerStore.asInstanceOf[js.Any])
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => dispatch(t0).runNow()))
    __obj.updateDynamic("registerGenericStore")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* config */ typingsJapgolly.wordpressData.mod.GenericStoreConfig) => registerGenericStore(t0, t1).runNow()))
    __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => select(t0).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[DataRegistry]
  }
}

