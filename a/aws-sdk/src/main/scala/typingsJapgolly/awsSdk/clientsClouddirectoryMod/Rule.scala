package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * The minimum and maximum parameters that are associated with the rule.
    */
  var Parameters: js.UndefOr[RuleParameterMap] = js.undefined
  
  /**
    * The type of attribute validation rule.
    */
  var Type: js.UndefOr[RuleType] = js.undefined
}
object Rule {
  
  inline def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setParameters(value: RuleParameterMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setType(value: RuleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
