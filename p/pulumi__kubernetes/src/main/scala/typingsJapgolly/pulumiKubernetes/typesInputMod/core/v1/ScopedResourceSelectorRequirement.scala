package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
  */
trait ScopedResourceSelectorRequirement extends StObject {
  
  /**
    * Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
    */
  var operator: Input[String]
  
  /**
    * The name of the scope that the selector applies to.
    */
  var scopeName: Input[String]
  
  /**
    * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
    */
  var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object ScopedResourceSelectorRequirement {
  
  inline def apply(operator: Input[String], scopeName: Input[String]): ScopedResourceSelectorRequirement = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedResourceSelectorRequirement]
  }
  
  extension [Self <: ScopedResourceSelectorRequirement](x: Self) {
    
    inline def setOperator(value: Input[String]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setScopeName(value: Input[String]): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
