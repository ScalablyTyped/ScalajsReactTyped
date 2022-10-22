package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapMPlanningCalendarRowMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderId extends StObject {
  
  /**
    * The ID of the `PlanningCalendarRowHeader` of the selected appointment.
    *
    * **Note:** Intended to be used as an easy way to get an ID of a `PlanningCalendarRowHeader`. Do NOT use
    * for modification.
    */
  var headerId: js.UndefOr[String] = js.undefined
  
  /**
    * The row user clicked on.
    */
  var row: js.UndefOr[default] = js.undefined
}
object HeaderId {
  
  inline def apply(): HeaderId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderId]
  }
  
  extension [Self <: HeaderId](x: Self) {
    
    inline def setHeaderId(value: String): Self = StObject.set(x, "headerId", value.asInstanceOf[js.Any])
    
    inline def setHeaderIdUndefined: Self = StObject.set(x, "headerId", js.undefined)
    
    inline def setRow(value: default): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
