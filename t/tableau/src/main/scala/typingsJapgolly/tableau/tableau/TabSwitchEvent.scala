package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabSwitchEvent
  extends StObject
     with TableauEvent {
  
  /** Gets the name of the sheet that is currently active. */
  def getNewSheetName(): String
  
  /** Gets the name of the sheet that was active before the tab switch event occurred. */
  def getOldSheetName(): String
}
object TabSwitchEvent {
  
  inline def apply(
    getEventName: CallbackTo[TableauEventName],
    getNewSheetName: CallbackTo[String],
    getOldSheetName: CallbackTo[String],
    getViz: CallbackTo[Viz]
  ): TabSwitchEvent = {
    val __obj = js.Dynamic.literal(getEventName = getEventName.toJsFn, getNewSheetName = getNewSheetName.toJsFn, getOldSheetName = getOldSheetName.toJsFn, getViz = getViz.toJsFn)
    __obj.asInstanceOf[TabSwitchEvent]
  }
  
  extension [Self <: TabSwitchEvent](x: Self) {
    
    inline def setGetNewSheetName(value: CallbackTo[String]): Self = StObject.set(x, "getNewSheetName", value.toJsFn)
    
    inline def setGetOldSheetName(value: CallbackTo[String]): Self = StObject.set(x, "getOldSheetName", value.toJsFn)
  }
}
