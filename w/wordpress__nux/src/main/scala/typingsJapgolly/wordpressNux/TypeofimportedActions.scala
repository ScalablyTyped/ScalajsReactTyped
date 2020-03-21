package typingsJapgolly.wordpressNux

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofimportedActions extends js.Object {
  def disableTips(): Unit
  def dismissTip(id: String): Unit
  def enableTips(): Unit
  def triggerGuide(tipIds: js.Array[String]): Unit
}

object TypeofimportedActions {
  @scala.inline
  def apply(
    disableTips: Callback,
    dismissTip: String => Callback,
    enableTips: Callback,
    triggerGuide: js.Array[String] => Callback
  ): TypeofimportedActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disableTips")(disableTips.toJsFn)
    __obj.updateDynamic("dismissTip")(js.Any.fromFunction1((t0: java.lang.String) => dismissTip(t0).runNow()))
    __obj.updateDynamic("enableTips")(enableTips.toJsFn)
    __obj.updateDynamic("triggerGuide")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => triggerGuide(t0).runNow()))
    __obj.asInstanceOf[TypeofimportedActions]
  }
}

