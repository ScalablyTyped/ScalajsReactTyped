package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumPropertyOptions extends StObject {
  
  /** If set, describes how the enum should be used as a search operator. */
  var operatorOptions: js.UndefOr[EnumOperatorOptions] = js.undefined
  
  /**
    * Used to specify the ordered ranking for the enumeration that determines how the integer values provided in the possible EnumValuePairs are used to rank results. If specified,
    * integer values must be provided for all possible EnumValuePair values given for this property. Can only be used if isRepeatable is false.
    */
  var orderedRanking: js.UndefOr[String] = js.undefined
  
  /**
    * The list of possible values for the enumeration property. All EnumValuePairs must provide a string value. If you specify an integer value for one EnumValuePair, then all possible
    * EnumValuePairs must provide an integer value. Both the string value and integer value must be unique over all possible values. Once set, possible values cannot be removed or
    * modified. If you supply an ordered ranking and think you might insert additional enum values in the future, leave gaps in the initial integer values to allow adding a value in
    * between previously registered values. The maximum number of elements is 100.
    */
  var possibleValues: js.UndefOr[js.Array[EnumValuePair]] = js.undefined
}
object EnumPropertyOptions {
  
  inline def apply(): EnumPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnumPropertyOptions]
  }
  
  extension [Self <: EnumPropertyOptions](x: Self) {
    
    inline def setOperatorOptions(value: EnumOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    inline def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
    
    inline def setOrderedRanking(value: String): Self = StObject.set(x, "orderedRanking", value.asInstanceOf[js.Any])
    
    inline def setOrderedRankingUndefined: Self = StObject.set(x, "orderedRanking", js.undefined)
    
    inline def setPossibleValues(value: js.Array[EnumValuePair]): Self = StObject.set(x, "possibleValues", value.asInstanceOf[js.Any])
    
    inline def setPossibleValuesUndefined: Self = StObject.set(x, "possibleValues", js.undefined)
    
    inline def setPossibleValuesVarargs(value: EnumValuePair*): Self = StObject.set(x, "possibleValues", js.Array(value*))
  }
}
