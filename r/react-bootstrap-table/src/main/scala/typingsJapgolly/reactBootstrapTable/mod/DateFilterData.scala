package typingsJapgolly.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFilterData
  extends StObject
     with FilterValue {
  
  var `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.DateFilter
  
  var value: DateFilterValue
}
object DateFilterData {
  
  inline def apply(value: DateFilterValue): DateFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DateFilter")
    __obj.asInstanceOf[DateFilterData]
  }
  
  extension [Self <: DateFilterData](x: Self) {
    
    inline def setType(value: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.DateFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DateFilterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
