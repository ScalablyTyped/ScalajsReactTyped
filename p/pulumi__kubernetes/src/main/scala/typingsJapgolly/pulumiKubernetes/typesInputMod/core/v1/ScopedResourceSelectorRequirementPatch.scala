package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
  */
trait ScopedResourceSelectorRequirementPatch extends StObject {
  
  /**
    * Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
    */
  var operator: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the scope that the selector applies to.
    */
  var scopeName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
    */
  var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object ScopedResourceSelectorRequirementPatch {
  
  inline def apply(): ScopedResourceSelectorRequirementPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedResourceSelectorRequirementPatch]
  }
  
  extension [Self <: ScopedResourceSelectorRequirementPatch](x: Self) {
    
    inline def setOperator(value: Input[String]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setScopeName(value: Input[String]): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    
    inline def setScopeNameUndefined: Self = StObject.set(x, "scopeName", js.undefined)
    
    inline def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
