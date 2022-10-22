package typingsJapgolly.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFilterData
  extends StObject
     with FilterValue {
  
  var `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter
  
  var value: NumberFilterValue
}
object NumberFilterData {
  
  inline def apply(value: NumberFilterValue): NumberFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberFilter")
    __obj.asInstanceOf[NumberFilterData]
  }
  
  extension [Self <: NumberFilterData](x: Self) {
    
    inline def setType(value: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: NumberFilterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
