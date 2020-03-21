package typingsJapgolly.unityWebapi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnityMessagingIndicator extends js.Object {
  // This is suppose to be readonly, but i'm not sure how to do this
  // in a definition file.
  var presence: String
  def addAction(name: String, onActionInvoked: js.Function): js.Any
  def clearIndicator(name: String): js.Any
  def clearIndicators(): js.Any
  def onPresenceChanged(onPresenceChanged: js.Function): js.Any
  def removeAction(name: String): js.Any
  def removeActions(): js.Any
  def showIndicator(name: String, indicatorProperties: UnityIndicatorProperties): js.Any
}

object UnityMessagingIndicator {
  @scala.inline
  def apply(
    addAction: (String, js.Function) => CallbackTo[js.Any],
    clearIndicator: String => CallbackTo[js.Any],
    clearIndicators: CallbackTo[js.Any],
    onPresenceChanged: js.Function => CallbackTo[js.Any],
    presence: String,
    removeAction: String => CallbackTo[js.Any],
    removeActions: CallbackTo[js.Any],
    showIndicator: (String, UnityIndicatorProperties) => CallbackTo[js.Any]
  ): UnityMessagingIndicator = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any])
    __obj.updateDynamic("addAction")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => addAction(t0, t1).runNow()))
    __obj.updateDynamic("clearIndicator")(js.Any.fromFunction1((t0: java.lang.String) => clearIndicator(t0).runNow()))
    __obj.updateDynamic("clearIndicators")(clearIndicators.toJsFn)
    __obj.updateDynamic("onPresenceChanged")(js.Any.fromFunction1((t0: js.Function) => onPresenceChanged(t0).runNow()))
    __obj.updateDynamic("removeAction")(js.Any.fromFunction1((t0: java.lang.String) => removeAction(t0).runNow()))
    __obj.updateDynamic("removeActions")(removeActions.toJsFn)
    __obj.updateDynamic("showIndicator")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.unityWebapi.UnityIndicatorProperties) => showIndicator(t0, t1).runNow()))
    __obj.asInstanceOf[UnityMessagingIndicator]
  }
}

