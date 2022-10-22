package typingsJapgolly.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptRulesetRuleParam
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * The external rule template would be looking for the parameter by this name.
    */
  var name: String
  
  /**
    * This value can be overwritten by the assert.ruleset.rule.param.value i.e. TestScript.ruleset.rule.param.value will be used if assert.ruleset.rule.param.value is not specified.  The param value can be a string-representation of a number, string, or boolean that is expected. Test engines do have to look for placeholders (${}) and replace the variable placeholders with the variable values at runtime before supplying this value to the external rule template.
    */
  var value: js.UndefOr[String] = js.undefined
}
object TestScriptRulesetRuleParam {
  
  inline def apply(name: String): TestScriptRulesetRuleParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRulesetRuleParam]
  }
  
  extension [Self <: TestScriptRulesetRuleParam](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
