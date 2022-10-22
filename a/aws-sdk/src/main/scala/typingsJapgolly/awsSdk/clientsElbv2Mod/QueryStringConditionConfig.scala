package typingsJapgolly.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStringConditionConfig extends StObject {
  
  /**
    * One or more key/value pairs or values to find in the query string. The maximum size of each string is 128 characters. The comparison is case insensitive. The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?' character in a query string, you must escape these characters in Values using a '\' character. If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in the query string.
    */
  var Values: js.UndefOr[QueryStringKeyValuePairList] = js.undefined
}
object QueryStringConditionConfig {
  
  inline def apply(): QueryStringConditionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStringConditionConfig]
  }
  
  extension [Self <: QueryStringConditionConfig](x: Self) {
    
    inline def setValues(value: QueryStringKeyValuePairList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: QueryStringKeyValuePair*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
