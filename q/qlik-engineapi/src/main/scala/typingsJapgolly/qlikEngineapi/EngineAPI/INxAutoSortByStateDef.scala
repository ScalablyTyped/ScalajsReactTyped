package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAutoSortByStateDef...
  */
trait INxAutoSortByStateDef extends StObject {
  
  /**
    * This parameter applies to list objects.
    *
    * If the number of selected values in the list object is greater than the value set in qDisplayNumberOfRows,
    * the selected lines are promoted at the top of the list object.
    *
    * If qDisplayNumberOfRows is set to a negative value or to 0, the sort by state is disabled.
    */
  var qDisplayNumberOfRows: Double
}
object INxAutoSortByStateDef {
  
  inline def apply(qDisplayNumberOfRows: Double): INxAutoSortByStateDef = {
    val __obj = js.Dynamic.literal(qDisplayNumberOfRows = qDisplayNumberOfRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAutoSortByStateDef]
  }
  
  extension [Self <: INxAutoSortByStateDef](x: Self) {
    
    inline def setQDisplayNumberOfRows(value: Double): Self = StObject.set(x, "qDisplayNumberOfRows", value.asInstanceOf[js.Any])
  }
}
