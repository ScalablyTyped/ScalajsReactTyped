package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to locate this button in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  var title: String
  def onPress(ev: ReactEventFrom[NodeHandle with Element]): Unit
}

object ButtonProps {
  @scala.inline
  def apply(
    onPress: ReactEventFrom[NodeHandle with Element] => Callback,
    title: String,
    accessibilityLabel: String = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    testID: String = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.reactDashNative.reactDashNativeMod.NodeHandle with org.scalajs.dom.raw.Element]) => onPress(t0).runNow()))
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

