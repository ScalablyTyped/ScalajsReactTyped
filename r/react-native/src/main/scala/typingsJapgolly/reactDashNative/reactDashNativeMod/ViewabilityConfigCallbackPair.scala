package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactDashNative.Anon_Changed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewabilityConfigCallbackPair extends js.Object {
  var onViewableItemsChanged: (js.Function1[/* info */ Anon_Changed, Unit]) | Null
  var viewabilityConfig: ViewabilityConfig
}

object ViewabilityConfigCallbackPair {
  @scala.inline
  def apply(
    viewabilityConfig: ViewabilityConfig,
    onViewableItemsChanged: /* info */ Anon_Changed => Callback = null
  ): ViewabilityConfigCallbackPair = {
    val __obj = js.Dynamic.literal(viewabilityConfig = viewabilityConfig.asInstanceOf[js.Any])
    if (onViewableItemsChanged != null) __obj.updateDynamic("onViewableItemsChanged")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactDashNative.Anon_Changed) => onViewableItemsChanged(t0).runNow()))
    __obj.asInstanceOf[ViewabilityConfigCallbackPair]
  }
}

