package typingsJapgolly.snyk.anon

import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsIacCustomRulesEntitlementEnabled extends StObject {
  
  var isIacCustomRulesEntitlementEnabled: Boolean
  
  var isIacShareCliResultsCustomRulesSupported: Boolean
  
  var options: IaCTestFlags
  
  var orgName: String
  
  var projectName: String
}
object IsIacCustomRulesEntitlementEnabled {
  
  inline def apply(
    isIacCustomRulesEntitlementEnabled: Boolean,
    isIacShareCliResultsCustomRulesSupported: Boolean,
    options: IaCTestFlags,
    orgName: String,
    projectName: String
  ): IsIacCustomRulesEntitlementEnabled = {
    val __obj = js.Dynamic.literal(isIacCustomRulesEntitlementEnabled = isIacCustomRulesEntitlementEnabled.asInstanceOf[js.Any], isIacShareCliResultsCustomRulesSupported = isIacShareCliResultsCustomRulesSupported.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], orgName = orgName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsIacCustomRulesEntitlementEnabled]
  }
  
  extension [Self <: IsIacCustomRulesEntitlementEnabled](x: Self) {
    
    inline def setIsIacCustomRulesEntitlementEnabled(value: Boolean): Self = StObject.set(x, "isIacCustomRulesEntitlementEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsIacShareCliResultsCustomRulesSupported(value: Boolean): Self = StObject.set(x, "isIacShareCliResultsCustomRulesSupported", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: IaCTestFlags): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOrgName(value: String): Self = StObject.set(x, "orgName", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
