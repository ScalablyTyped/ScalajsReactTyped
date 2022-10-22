package typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
  */
trait LabelSelectorRequirement extends StObject {
  
  /**
    * key is the label key that the selector applies to.
    */
  var key: String
  
  /**
    * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
    */
  var operator: String
  
  /**
    * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
    */
  var values: js.Array[String]
}
object LabelSelectorRequirement {
  
  inline def apply(key: String, operator: String, values: js.Array[String]): LabelSelectorRequirement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSelectorRequirement]
  }
  
  extension [Self <: LabelSelectorRequirement](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
