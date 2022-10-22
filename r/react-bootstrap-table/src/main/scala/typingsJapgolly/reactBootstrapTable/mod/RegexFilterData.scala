package typingsJapgolly.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexFilterData
  extends StObject
     with FilterValue {
  
  var `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter
  
  var value: String
}
object RegexFilterData {
  
  inline def apply(value: String): RegexFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegexFilter")
    __obj.asInstanceOf[RegexFilterData]
  }
  
  extension [Self <: RegexFilterData](x: Self) {
    
    inline def setType(value: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
