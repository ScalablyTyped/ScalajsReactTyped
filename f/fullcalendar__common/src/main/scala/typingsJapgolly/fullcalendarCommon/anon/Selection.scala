package typingsJapgolly.fullcalendarCommon.anon

import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.SELECT_DATES
import typingsJapgolly.fullcalendarCommon.mod.Action
import typingsJapgolly.fullcalendarCommon.mod.DateSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selection
  extends StObject
     with Action {
  
  var selection: DateSpan
  
  var `type`: SELECT_DATES
}
object Selection {
  
  inline def apply(selection: DateSpan): Selection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SELECT_DATES")
    __obj.asInstanceOf[Selection]
  }
  
  extension [Self <: Selection](x: Self) {
    
    inline def setSelection(value: DateSpan): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setType(value: SELECT_DATES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
