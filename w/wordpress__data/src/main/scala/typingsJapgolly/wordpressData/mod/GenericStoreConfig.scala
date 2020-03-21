package typingsJapgolly.wordpressData.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericStoreConfig extends js.Object {
  var subscribe: Subscriber
  def getActions(): DispatcherMap
  def getSelectors(): SelectorMap
}

object GenericStoreConfig {
  @scala.inline
  def apply(
    getActions: CallbackTo[DispatcherMap],
    getSelectors: CallbackTo[SelectorMap],
    subscribe: /* callback */ js.Function0[Unit] => CallbackTo[js.Function0[Unit]]
  ): GenericStoreConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getActions")(getActions.toJsFn)
    __obj.updateDynamic("getSelectors")(getSelectors.toJsFn)
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[GenericStoreConfig]
  }
}

