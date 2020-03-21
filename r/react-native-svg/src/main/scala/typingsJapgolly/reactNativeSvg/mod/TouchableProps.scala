package typingsJapgolly.reactNativeSvg.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.NodeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchableProps extends js.Object {
  var delayLongPress: js.UndefOr[Double] = js.undefined
  var delayPressIn: js.UndefOr[Double] = js.undefined
  var delayPressOut: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
}

object TouchableProps {
  @scala.inline
  def apply(
    delayLongPress: Int | Double = null,
    delayPressIn: Int | Double = null,
    delayPressOut: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onLongPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPressIn: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPressOut: ReactEventFrom[NodeHandle with Element] => Callback = null
  ): TouchableProps = {
    val __obj = js.Dynamic.literal()
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onLongPress(t0).runNow()))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPress(t0).runNow()))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPressIn(t0).runNow()))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPressOut(t0).runNow()))
    __obj.asInstanceOf[TouchableProps]
  }
}

