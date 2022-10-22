package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSetOperationPreferences extends StObject {
  
  /**
    * The number of accounts, per Region, for which this operation can fail before CloudFormation stops the operation in that Region. If the operation is stopped in a Region, CloudFormation doesn't attempt the operation in any subsequent Regions. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage (but not both). By default, 0 is specified.
    */
  var FailureToleranceCount: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.FailureToleranceCount] = js.undefined
  
  /**
    * The percentage of accounts, per Region, for which this stack operation can fail before CloudFormation stops the operation in that Region. If the operation is stopped in a Region, CloudFormation doesn't attempt the operation in any subsequent Regions. When calculating the number of accounts based on the specified percentage, CloudFormation rounds down to the next whole number. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage, but not both. By default, 0 is specified.
    */
  var FailureTolerancePercentage: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.FailureTolerancePercentage] = js.undefined
  
  /**
    * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of FailureToleranceCount.MaxConcurrentCount is at most one more than the FailureToleranceCount. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both. By default, 1 is specified.
    */
  var MaxConcurrentCount: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.MaxConcurrentCount] = js.undefined
  
  /**
    * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, CloudFormation rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, CloudFormation sets the number as one instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both. By default, 1 is specified.
    */
  var MaxConcurrentPercentage: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.MaxConcurrentPercentage] = js.undefined
  
  /**
    * The concurrency type of deploying StackSets operations in Regions, could be in parallel or one Region at a time.
    */
  var RegionConcurrencyType: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.RegionConcurrencyType] = js.undefined
  
  /**
    * The order of the Regions in where you want to perform the stack operation.
    */
  var RegionOrder: js.UndefOr[RegionList] = js.undefined
}
object StackSetOperationPreferences {
  
  inline def apply(): StackSetOperationPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperationPreferences]
  }
  
  extension [Self <: StackSetOperationPreferences](x: Self) {
    
    inline def setFailureToleranceCount(value: FailureToleranceCount): Self = StObject.set(x, "FailureToleranceCount", value.asInstanceOf[js.Any])
    
    inline def setFailureToleranceCountUndefined: Self = StObject.set(x, "FailureToleranceCount", js.undefined)
    
    inline def setFailureTolerancePercentage(value: FailureTolerancePercentage): Self = StObject.set(x, "FailureTolerancePercentage", value.asInstanceOf[js.Any])
    
    inline def setFailureTolerancePercentageUndefined: Self = StObject.set(x, "FailureTolerancePercentage", js.undefined)
    
    inline def setMaxConcurrentCount(value: MaxConcurrentCount): Self = StObject.set(x, "MaxConcurrentCount", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentCountUndefined: Self = StObject.set(x, "MaxConcurrentCount", js.undefined)
    
    inline def setMaxConcurrentPercentage(value: MaxConcurrentPercentage): Self = StObject.set(x, "MaxConcurrentPercentage", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentPercentageUndefined: Self = StObject.set(x, "MaxConcurrentPercentage", js.undefined)
    
    inline def setRegionConcurrencyType(value: RegionConcurrencyType): Self = StObject.set(x, "RegionConcurrencyType", value.asInstanceOf[js.Any])
    
    inline def setRegionConcurrencyTypeUndefined: Self = StObject.set(x, "RegionConcurrencyType", js.undefined)
    
    inline def setRegionOrder(value: RegionList): Self = StObject.set(x, "RegionOrder", value.asInstanceOf[js.Any])
    
    inline def setRegionOrderUndefined: Self = StObject.set(x, "RegionOrder", js.undefined)
    
    inline def setRegionOrderVarargs(value: Region*): Self = StObject.set(x, "RegionOrder", js.Array(value*))
  }
}
