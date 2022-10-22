package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackInstanceSummary extends StObject {
  
  /**
    * [Self-managed permissions] The name of the Amazon Web Services account that the stack instance is associated with.
    */
  var Account: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Account] = js.undefined
  
  /**
    * Status of the stack instance's actual configuration compared to the expected template and parameter configuration of the stack set to which it belongs.    DRIFTED: The stack differs from the expected template and parameter configuration of the stack set to which it belongs. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: CloudFormation hasn't checked if the stack instance differs from its expected stack set configuration.    IN_SYNC: The stack instance's actual configuration matches its expected stack set configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var DriftStatus: js.UndefOr[StackDriftStatus] = js.undefined
  
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack instance. This value will be NULL for any stack instance on which drift detection hasn't yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * [Service-managed permissions] The organization root ID or organizational unit (OU) IDs that you specified for DeploymentTargets.
    */
  var OrganizationalUnitId: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.OrganizationalUnitId] = js.undefined
  
  /**
    * The name of the Amazon Web Services Region that the stack instance is associated with.
    */
  var Region: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Region] = js.undefined
  
  /**
    * The ID of the stack instance.
    */
  var StackId: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.StackId] = js.undefined
  
  /**
    * The detailed status of the stack instance.
    */
  var StackInstanceStatus: js.UndefOr[StackInstanceComprehensiveStatus] = js.undefined
  
  /**
    * The name or unique ID of the stack set that the stack instance is associated with.
    */
  var StackSetId: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.StackSetId] = js.undefined
  
  /**
    * The status of the stack instance, in terms of its synchronization with its associated stack set.    INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.    OUTDATED: The stack isn't currently up to date with the stack set because:   The associated stack failed during a CreateStackSet or UpdateStackSet operation.   The stack was part of a CreateStackSet or UpdateStackSet operation that failed or was stopped before the stack was created or updated.      CURRENT: The stack is currently up to date with the stack set.  
    */
  var Status: js.UndefOr[StackInstanceStatus] = js.undefined
  
  /**
    * The explanation for the specific status code assigned to this stack instance.
    */
  var StatusReason: js.UndefOr[Reason] = js.undefined
}
object StackInstanceSummary {
  
  inline def apply(): StackInstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackInstanceSummary]
  }
  
  extension [Self <: StackInstanceSummary](x: Self) {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setDriftStatus(value: StackDriftStatus): Self = StObject.set(x, "DriftStatus", value.asInstanceOf[js.Any])
    
    inline def setDriftStatusUndefined: Self = StObject.set(x, "DriftStatus", js.undefined)
    
    inline def setLastDriftCheckTimestamp(value: js.Date): Self = StObject.set(x, "LastDriftCheckTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastDriftCheckTimestampUndefined: Self = StObject.set(x, "LastDriftCheckTimestamp", js.undefined)
    
    inline def setOrganizationalUnitId(value: OrganizationalUnitId): Self = StObject.set(x, "OrganizationalUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIdUndefined: Self = StObject.set(x, "OrganizationalUnitId", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setStackInstanceStatus(value: StackInstanceComprehensiveStatus): Self = StObject.set(x, "StackInstanceStatus", value.asInstanceOf[js.Any])
    
    inline def setStackInstanceStatusUndefined: Self = StObject.set(x, "StackInstanceStatus", js.undefined)
    
    inline def setStackSetId(value: StackSetId): Self = StObject.set(x, "StackSetId", value.asInstanceOf[js.Any])
    
    inline def setStackSetIdUndefined: Self = StObject.set(x, "StackSetId", js.undefined)
    
    inline def setStatus(value: StackInstanceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: Reason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
