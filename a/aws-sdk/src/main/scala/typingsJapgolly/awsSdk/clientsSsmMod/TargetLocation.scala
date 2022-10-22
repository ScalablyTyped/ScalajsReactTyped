package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetLocation extends StObject {
  
  /**
    * The Amazon Web Services accounts targeted by the current Automation execution.
    */
  var Accounts: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.Accounts] = js.undefined
  
  /**
    * The Automation execution role used by the currently running Automation. If not specified, the default value is AWS-SystemsManager-AutomationExecutionRole.
    */
  var ExecutionRoleName: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.ExecutionRoleName] = js.undefined
  
  /**
    * The Amazon Web Services Regions targeted by the current Automation execution.
    */
  var Regions: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.Regions] = js.undefined
  
  /**
    * The maximum number of Amazon Web Services Regions and Amazon Web Services accounts allowed to run the Automation concurrently.
    */
  var TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
  
  /**
    * The maximum number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation.
    */
  var TargetLocationMaxErrors: js.UndefOr[MaxErrors] = js.undefined
}
object TargetLocation {
  
  inline def apply(): TargetLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetLocation]
  }
  
  extension [Self <: TargetLocation](x: Self) {
    
    inline def setAccounts(value: Accounts): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "Accounts", js.Array(value*))
    
    inline def setExecutionRoleName(value: ExecutionRoleName): Self = StObject.set(x, "ExecutionRoleName", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleNameUndefined: Self = StObject.set(x, "ExecutionRoleName", js.undefined)
    
    inline def setRegions(value: Regions): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    inline def setRegionsVarargs(value: Region*): Self = StObject.set(x, "Regions", js.Array(value*))
    
    inline def setTargetLocationMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "TargetLocationMaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setTargetLocationMaxConcurrencyUndefined: Self = StObject.set(x, "TargetLocationMaxConcurrency", js.undefined)
    
    inline def setTargetLocationMaxErrors(value: MaxErrors): Self = StObject.set(x, "TargetLocationMaxErrors", value.asInstanceOf[js.Any])
    
    inline def setTargetLocationMaxErrorsUndefined: Self = StObject.set(x, "TargetLocationMaxErrors", js.undefined)
  }
}
