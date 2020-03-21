package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.scriptBadge.AttentionDetails
import typingsJapgolly.chrome.chrome.scriptBadge.GetPopupDetails
import typingsJapgolly.chrome.chrome.scriptBadge.ScriptBadgeClickedEvent
import typingsJapgolly.chrome.chrome.scriptBadge.SetPopupDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofscriptBadge extends js.Object {
  var onClicked: ScriptBadgeClickedEvent
  def getAttention(details: AttentionDetails): Unit
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit
  def setPopup(details: SetPopupDetails): Unit
}

object TypeofscriptBadge {
  @scala.inline
  def apply(
    getAttention: AttentionDetails => Callback,
    getPopup: (GetPopupDetails, js.Function) => Callback,
    onClicked: ScriptBadgeClickedEvent,
    setPopup: SetPopupDetails => Callback
  ): TypeofscriptBadge = {
    val __obj = js.Dynamic.literal(onClicked = onClicked.asInstanceOf[js.Any])
    __obj.updateDynamic("getAttention")(js.Any.fromFunction1((t0: typingsJapgolly.chrome.chrome.scriptBadge.AttentionDetails) => getAttention(t0).runNow()))
    __obj.updateDynamic("getPopup")(js.Any.fromFunction2((t0: typingsJapgolly.chrome.chrome.scriptBadge.GetPopupDetails, t1: js.Function) => getPopup(t0, t1).runNow()))
    __obj.updateDynamic("setPopup")(js.Any.fromFunction1((t0: typingsJapgolly.chrome.chrome.scriptBadge.SetPopupDetails) => setPopup(t0).runNow()))
    __obj.asInstanceOf[TypeofscriptBadge]
  }
}

