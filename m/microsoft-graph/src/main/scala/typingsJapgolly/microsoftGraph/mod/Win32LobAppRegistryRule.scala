package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobAppRegistryRule
  extends StObject
     with Win32LobAppRule {
  
  // A value indicating whether to search the 32-bit registry on 64-bit systems.
  var check32BitOn64System: js.UndefOr[Boolean] = js.undefined
  
  // The registry comparison value.
  var comparisonValue: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The full path of the registry entry containing the value to detect.
  var keyPath: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The registry operation type. Possible values are: notConfigured, exists, doesNotExist, string, integer, version.
  var operationType: js.UndefOr[Win32LobAppRegistryRuleOperationType] = js.undefined
  
  /**
    * The operator for registry detection. Possible values are: notConfigured, equal, notEqual, greaterThan,
    * greaterThanOrEqual, lessThan, lessThanOrEqual.
    */
  var operator: js.UndefOr[Win32LobAppRuleOperator] = js.undefined
  
  // The name of the registry value to detect.
  var valueName: js.UndefOr[NullableOption[String]] = js.undefined
}
object Win32LobAppRegistryRule {
  
  inline def apply(): Win32LobAppRegistryRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppRegistryRule]
  }
  
  extension [Self <: Win32LobAppRegistryRule](x: Self) {
    
    inline def setCheck32BitOn64System(value: Boolean): Self = StObject.set(x, "check32BitOn64System", value.asInstanceOf[js.Any])
    
    inline def setCheck32BitOn64SystemUndefined: Self = StObject.set(x, "check32BitOn64System", js.undefined)
    
    inline def setComparisonValue(value: NullableOption[String]): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
    
    inline def setComparisonValueNull: Self = StObject.set(x, "comparisonValue", null)
    
    inline def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
    
    inline def setKeyPath(value: NullableOption[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    inline def setKeyPathNull: Self = StObject.set(x, "keyPath", null)
    
    inline def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
    
    inline def setOperationType(value: Win32LobAppRegistryRuleOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setOperator(value: Win32LobAppRuleOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setValueName(value: NullableOption[String]): Self = StObject.set(x, "valueName", value.asInstanceOf[js.Any])
    
    inline def setValueNameNull: Self = StObject.set(x, "valueName", null)
    
    inline def setValueNameUndefined: Self = StObject.set(x, "valueName", js.undefined)
  }
}
