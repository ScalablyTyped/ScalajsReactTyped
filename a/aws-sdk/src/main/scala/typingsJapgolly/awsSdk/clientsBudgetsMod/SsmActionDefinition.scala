package typingsJapgolly.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmActionDefinition extends StObject {
  
  /**
    * The action subType. 
    */
  var ActionSubType: typingsJapgolly.awsSdk.clientsBudgetsMod.ActionSubType
  
  /**
    * The EC2 and RDS instance IDs. 
    */
  var InstanceIds: typingsJapgolly.awsSdk.clientsBudgetsMod.InstanceIds
  
  /**
    * The Region to run the SSM document. 
    */
  var Region: typingsJapgolly.awsSdk.clientsBudgetsMod.Region
}
object SsmActionDefinition {
  
  inline def apply(ActionSubType: ActionSubType, InstanceIds: InstanceIds, Region: Region): SsmActionDefinition = {
    val __obj = js.Dynamic.literal(ActionSubType = ActionSubType.asInstanceOf[js.Any], InstanceIds = InstanceIds.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsmActionDefinition]
  }
  
  extension [Self <: SsmActionDefinition](x: Self) {
    
    inline def setActionSubType(value: ActionSubType): Self = StObject.set(x, "ActionSubType", value.asInstanceOf[js.Any])
    
    inline def setInstanceIds(value: InstanceIds): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
    
    inline def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
  }
}
