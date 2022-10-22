package typingsJapgolly.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SenderIdFilter extends StObject {
  
  /**
    * The name of the attribute to filter on.
    */
  var Name: SenderIdFilterName
  
  /**
    * An array of values to filter for.
    */
  var Values: FilterValueList
}
object SenderIdFilter {
  
  inline def apply(Name: SenderIdFilterName, Values: FilterValueList): SenderIdFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SenderIdFilter]
  }
  
  extension [Self <: SenderIdFilter](x: Self) {
    
    inline def setName(value: SenderIdFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
