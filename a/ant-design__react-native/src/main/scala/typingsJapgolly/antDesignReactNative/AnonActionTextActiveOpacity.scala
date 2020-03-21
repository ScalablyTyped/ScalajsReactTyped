package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionTextActiveOpacity extends js.Object {
  var WrapComponent: View
  var actionTextActiveOpacity: Double
  var actionTextUnderlayColor: String
  var dismissText: String
  var okText: String
  var title: String
  var triggerType: String
  def onDismiss(): Unit
  def onOk(_underscore: js.Any): Unit
  def onVisibleChange(_underscore: js.Any): Unit
}

object AnonActionTextActiveOpacity {
  @scala.inline
  def apply(
    WrapComponent: View,
    actionTextActiveOpacity: Double,
    actionTextUnderlayColor: String,
    dismissText: String,
    okText: String,
    onDismiss: Callback,
    onOk: js.Any => Callback,
    onVisibleChange: js.Any => Callback,
    title: String,
    triggerType: String
  ): AnonActionTextActiveOpacity = {
    val __obj = js.Dynamic.literal(WrapComponent = WrapComponent.asInstanceOf[js.Any], actionTextActiveOpacity = actionTextActiveOpacity.asInstanceOf[js.Any], actionTextUnderlayColor = actionTextUnderlayColor.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.updateDynamic("onDismiss")(onDismiss.toJsFn)
    __obj.updateDynamic("onOk")(js.Any.fromFunction1((t0: js.Any) => onOk(t0).runNow()))
    __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: js.Any) => onVisibleChange(t0).runNow()))
    __obj.asInstanceOf[AnonActionTextActiveOpacity]
  }
}

