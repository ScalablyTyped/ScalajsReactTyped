package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesApprovals extends StObject {
  
  var enumValues: Approvals
}
object EnumValuesApprovals {
  
  inline def apply(enumValues: Approvals): EnumValuesApprovals = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesApprovals]
  }
  
  extension [Self <: EnumValuesApprovals](x: Self) {
    
    inline def setEnumValues(value: Approvals): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
