package typingsJapgolly.reactNativeActionsheet.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetCustomProps extends js.Object {
  var buttonUnderlayColor: js.UndefOr[String] = js.undefined
  var cancelButtonIndex: js.UndefOr[Double] = js.undefined
  var destructiveButtonIndex: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var options: js.Array[Node]
  var styles: js.UndefOr[js.Object] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  def onPress(index: Double): Unit
}

object ActionSheetCustomProps {
  @scala.inline
  def apply(
    onPress: Double => Callback,
    options: js.Array[Node],
    buttonUnderlayColor: String = null,
    cancelButtonIndex: Int | Double = null,
    destructiveButtonIndex: Int | Double = null,
    message: String = null,
    styles: js.Object = null,
    tintColor: String = null,
    title: VdomNode = null
  ): ActionSheetCustomProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: scala.Double) => onPress(t0).runNow()))
    if (buttonUnderlayColor != null) __obj.updateDynamic("buttonUnderlayColor")(buttonUnderlayColor.asInstanceOf[js.Any])
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetCustomProps]
  }
}

