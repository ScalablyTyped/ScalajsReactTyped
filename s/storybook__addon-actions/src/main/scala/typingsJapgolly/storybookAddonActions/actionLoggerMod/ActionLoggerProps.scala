package typingsJapgolly.storybookAddonActions.actionLoggerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookAddonActions.actionDisplayMod.ActionDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionLoggerProps extends js.Object {
  var actions: js.Array[ActionDisplay]
  def onClear(): Unit
}

object ActionLoggerProps {
  @scala.inline
  def apply(actions: js.Array[ActionDisplay], onClear: Callback): ActionLoggerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.updateDynamic("onClear")(onClear.toJsFn)
    __obj.asInstanceOf[ActionLoggerProps]
  }
}

