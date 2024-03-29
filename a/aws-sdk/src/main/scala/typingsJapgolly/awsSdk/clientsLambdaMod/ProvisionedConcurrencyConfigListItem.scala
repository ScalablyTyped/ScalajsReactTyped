package typingsJapgolly.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedConcurrencyConfigListItem extends StObject {
  
  /**
    * The amount of provisioned concurrency allocated.
    */
  var AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.undefined
  
  /**
    * The amount of provisioned concurrency available.
    */
  var AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the alias or version.
    */
  var FunctionArn: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.FunctionArn] = js.undefined
  
  /**
    * The date and time that a user last updated the configuration, in ISO 8601 format.
    */
  var LastModified: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The amount of provisioned concurrency requested.
    */
  var RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * The status of the allocation process.
    */
  var Status: js.UndefOr[ProvisionedConcurrencyStatusEnum] = js.undefined
  
  /**
    * For failed allocations, the reason that provisioned concurrency could not be allocated.
    */
  var StatusReason: js.UndefOr[String] = js.undefined
}
object ProvisionedConcurrencyConfigListItem {
  
  inline def apply(): ProvisionedConcurrencyConfigListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedConcurrencyConfigListItem]
  }
  
  extension [Self <: ProvisionedConcurrencyConfigListItem](x: Self) {
    
    inline def setAllocatedProvisionedConcurrentExecutions(value: NonNegativeInteger): Self = StObject.set(x, "AllocatedProvisionedConcurrentExecutions", value.asInstanceOf[js.Any])
    
    inline def setAllocatedProvisionedConcurrentExecutionsUndefined: Self = StObject.set(x, "AllocatedProvisionedConcurrentExecutions", js.undefined)
    
    inline def setAvailableProvisionedConcurrentExecutions(value: NonNegativeInteger): Self = StObject.set(x, "AvailableProvisionedConcurrentExecutions", value.asInstanceOf[js.Any])
    
    inline def setAvailableProvisionedConcurrentExecutionsUndefined: Self = StObject.set(x, "AvailableProvisionedConcurrentExecutions", js.undefined)
    
    inline def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
    
    inline def setLastModified(value: Timestamp): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setRequestedProvisionedConcurrentExecutions(value: PositiveInteger): Self = StObject.set(x, "RequestedProvisionedConcurrentExecutions", value.asInstanceOf[js.Any])
    
    inline def setRequestedProvisionedConcurrentExecutionsUndefined: Self = StObject.set(x, "RequestedProvisionedConcurrentExecutions", js.undefined)
    
    inline def setStatus(value: ProvisionedConcurrencyStatusEnum): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
