package typingsJapgolly.parameter.mod

import typingsJapgolly.parameter.parameterStrings.`enum`
import typingsJapgolly.parameter.parameterStrings.`object`
import typingsJapgolly.parameter.parameterStrings.array
import typingsJapgolly.parameter.parameterStrings.arrayQuestionmark
import typingsJapgolly.parameter.parameterStrings.date
import typingsJapgolly.parameter.parameterStrings.dateQuestionmark
import typingsJapgolly.parameter.parameterStrings.dateTime
import typingsJapgolly.parameter.parameterStrings.dateTimeQuestionmark
import typingsJapgolly.parameter.parameterStrings.datetimeQuestionmark
import typingsJapgolly.parameter.parameterStrings.datetime_
import typingsJapgolly.parameter.parameterStrings.email
import typingsJapgolly.parameter.parameterStrings.emailQuestionmark
import typingsJapgolly.parameter.parameterStrings.enumQuestionmark
import typingsJapgolly.parameter.parameterStrings.id
import typingsJapgolly.parameter.parameterStrings.idQuestionmark
import typingsJapgolly.parameter.parameterStrings.int
import typingsJapgolly.parameter.parameterStrings.intQuestionmark
import typingsJapgolly.parameter.parameterStrings.integer
import typingsJapgolly.parameter.parameterStrings.integerQuestionmark
import typingsJapgolly.parameter.parameterStrings.number
import typingsJapgolly.parameter.parameterStrings.numberQuestionmark
import typingsJapgolly.parameter.parameterStrings.objectQuestionmark
import typingsJapgolly.parameter.parameterStrings.password
import typingsJapgolly.parameter.parameterStrings.passwordQuestionmark
import typingsJapgolly.parameter.parameterStrings.string
import typingsJapgolly.parameter.parameterStrings.stringQuestionmark
import typingsJapgolly.parameter.parameterStrings.url
import typingsJapgolly.parameter.parameterStrings.urlQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ParameterRuleItem
  extends StObject
     with _ParameterRule
object _ParameterRuleItem {
  
  inline def ParameterRuleArray(`type`: array | arrayQuestionmark): typingsJapgolly.parameter.mod.ParameterRuleArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parameter.mod.ParameterRuleArray]
  }
  
  inline def ParameterRuleCustom(`type`: String): typingsJapgolly.parameter.mod.ParameterRuleCustom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parameter.mod.ParameterRuleCustom]
  }
  
  inline def ParameterRuleDateTime(
    `type`: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
  ): typingsJapgolly.parameter.mod.ParameterRuleDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parameter.mod.ParameterRuleDateTime]
  }
  
  inline def ParameterRuleEmail(`type`: email | emailQuestionmark): typingsJapgolly.parameter.mod.ParameterRuleEmail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parameter.mod.ParameterRuleEmail]
  }
  
  inline def ParameterRuleEnum(`type`: `enum` | enumQuestionmark, values: js.Array[Any]): typingsJapgolly.parameter.mod.ParameterRuleEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parameter.mod.ParameterRuleEnum]
  }
  
  inline def ParameterRuleID(`type`: id | idQuestionmark): typingsJapgolly.parameter.mod.ParameterRuleID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parameter.mod.ParameterRuleID]
  }
  
  inline def ParameterRuleNumber(`type`: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark): typingsJapgolly.parameter.mod.ParameterRuleNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parameter.mod.ParameterRuleNumber]
  }
  
  inline def ParameterRuleObject(`type`: `object` | objectQuestionmark): typingsJapgolly.parameter.mod.ParameterRuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parameter.mod.ParameterRuleObject]
  }
  
  inline def ParameterRulePassword(`type`: password | passwordQuestionmark): typingsJapgolly.parameter.mod.ParameterRulePassword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parameter.mod.ParameterRulePassword]
  }
  
  inline def ParameterRuleString(`type`: string | stringQuestionmark): typingsJapgolly.parameter.mod.ParameterRuleString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parameter.mod.ParameterRuleString]
  }
  
  inline def ParameterRuleUrl(`type`: url | urlQuestionmark): typingsJapgolly.parameter.mod.ParameterRuleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parameter.mod.ParameterRuleUrl]
  }
}
