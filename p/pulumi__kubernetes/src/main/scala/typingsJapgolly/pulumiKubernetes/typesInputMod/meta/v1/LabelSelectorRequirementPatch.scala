package typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
  */
trait LabelSelectorRequirementPatch extends StObject {
  
  /**
    * key is the label key that the selector applies to.
    */
  var key: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
    */
  var operator: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
    */
  var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object LabelSelectorRequirementPatch {
  
  inline def apply(): LabelSelectorRequirementPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSelectorRequirementPatch]
  }
  
  extension [Self <: LabelSelectorRequirementPatch](x: Self) {
    
    inline def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOperator(value: Input[String]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
