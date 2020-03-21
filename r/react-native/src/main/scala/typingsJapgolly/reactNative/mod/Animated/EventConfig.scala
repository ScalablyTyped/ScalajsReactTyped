package typingsJapgolly.reactNative.mod.Animated

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.NodeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventConfig[T] extends js.Object {
  var listener: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object EventConfig {
  @scala.inline
  def apply[T](
    listener: ReactEventFrom[NodeHandle with Element] => Callback = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): EventConfig[T] = {
    val __obj = js.Dynamic.literal()
    if (listener != null) __obj.updateDynamic("listener")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => listener(t0).runNow()))
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventConfig[T]]
  }
}

