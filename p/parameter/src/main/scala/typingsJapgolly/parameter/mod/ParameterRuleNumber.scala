package typingsJapgolly.parameter.mod

import typingsJapgolly.parameter.parameterStrings.int
import typingsJapgolly.parameter.parameterStrings.intQuestionmark
import typingsJapgolly.parameter.parameterStrings.integer
import typingsJapgolly.parameter.parameterStrings.integerQuestionmark
import typingsJapgolly.parameter.parameterStrings.number
import typingsJapgolly.parameter.parameterStrings.numberQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleNumber
  extends StObject
     with ParameterRuleBase
     with _ParameterRuleItem {
  
  /**
    * The maximum of the value, value must >= min.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum of the value, value must <= max
    */
  var min: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_ParameterRuleNumber: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark
}
object ParameterRuleNumber {
  
  inline def apply(`type`: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark): ParameterRuleNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleNumber]
  }
  
  extension [Self <: ParameterRuleNumber](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setType(value: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
