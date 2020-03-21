package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeMaterialUi.AnonStackedActionsContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogStackedActionsProps extends js.Object {
  var actions: js.Array[String]
  var style: js.UndefOr[AnonStackedActionsContainer] = js.undefined
  def onActionPress(action: String): Unit
}

object DialogStackedActionsProps {
  @scala.inline
  def apply(
    actions: js.Array[String],
    onActionPress: String => Callback,
    style: AnonStackedActionsContainer = null
  ): DialogStackedActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.updateDynamic("onActionPress")(js.Any.fromFunction1((t0: java.lang.String) => onActionPress(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogStackedActionsProps]
  }
}

