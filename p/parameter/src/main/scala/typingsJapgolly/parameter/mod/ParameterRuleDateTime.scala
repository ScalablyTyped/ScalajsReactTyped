package typingsJapgolly.parameter.mod

import typingsJapgolly.parameter.parameterStrings.date
import typingsJapgolly.parameter.parameterStrings.dateQuestionmark
import typingsJapgolly.parameter.parameterStrings.dateTime
import typingsJapgolly.parameter.parameterStrings.dateTimeQuestionmark
import typingsJapgolly.parameter.parameterStrings.datetimeQuestionmark
import typingsJapgolly.parameter.parameterStrings.datetime_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleDateTime
  extends StObject
     with ParameterRuleBase
     with _ParameterRuleItem {
  
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_ParameterRuleDateTime: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
}
object ParameterRuleDateTime {
  
  inline def apply(
    `type`: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
  ): ParameterRuleDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleDateTime]
  }
  
  extension [Self <: ParameterRuleDateTime](x: Self) {
    
    inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    inline def setType(
      value: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
