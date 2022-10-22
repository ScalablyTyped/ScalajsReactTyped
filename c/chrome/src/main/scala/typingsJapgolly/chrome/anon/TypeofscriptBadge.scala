package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.scriptBadge.AttentionDetails
import typingsJapgolly.chrome.chrome.scriptBadge.GetPopupDetails
import typingsJapgolly.chrome.chrome.scriptBadge.ScriptBadgeClickedEvent
import typingsJapgolly.chrome.chrome.scriptBadge.SetPopupDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofscriptBadge extends StObject {
  
  def getAttention(details: AttentionDetails): Unit
  
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit
  
  var onClicked: ScriptBadgeClickedEvent
  
  def setPopup(details: SetPopupDetails): Unit
}
object TypeofscriptBadge {
  
  inline def apply(
    getAttention: AttentionDetails => Callback,
    getPopup: (GetPopupDetails, js.Function) => Callback,
    onClicked: ScriptBadgeClickedEvent,
    setPopup: SetPopupDetails => Callback
  ): TypeofscriptBadge = {
    val __obj = js.Dynamic.literal(getAttention = js.Any.fromFunction1((t0: AttentionDetails) => getAttention(t0).runNow()), getPopup = js.Any.fromFunction2((t0: GetPopupDetails, t1: js.Function) => (getPopup(t0, t1)).runNow()), onClicked = onClicked.asInstanceOf[js.Any], setPopup = js.Any.fromFunction1((t0: SetPopupDetails) => setPopup(t0).runNow()))
    __obj.asInstanceOf[TypeofscriptBadge]
  }
  
  extension [Self <: TypeofscriptBadge](x: Self) {
    
    inline def setGetAttention(value: AttentionDetails => Callback): Self = StObject.set(x, "getAttention", js.Any.fromFunction1((t0: AttentionDetails) => value(t0).runNow()))
    
    inline def setGetPopup(value: (GetPopupDetails, js.Function) => Callback): Self = StObject.set(x, "getPopup", js.Any.fromFunction2((t0: GetPopupDetails, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setOnClicked(value: ScriptBadgeClickedEvent): Self = StObject.set(x, "onClicked", value.asInstanceOf[js.Any])
    
    inline def setSetPopup(value: SetPopupDetails => Callback): Self = StObject.set(x, "setPopup", js.Any.fromFunction1((t0: SetPopupDetails) => value(t0).runNow()))
  }
}
