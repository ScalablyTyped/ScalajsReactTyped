package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.
  */
trait TopologySelectorLabelRequirementPatch extends StObject {
  
  /**
    * The label key that the selector applies to.
    */
  var key: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * An array of string values. One value must match the label to be selected. Each entry in Values is ORed.
    */
  var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object TopologySelectorLabelRequirementPatch {
  
  inline def apply(): TopologySelectorLabelRequirementPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopologySelectorLabelRequirementPatch]
  }
  
  extension [Self <: TopologySelectorLabelRequirementPatch](x: Self) {
    
    inline def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
