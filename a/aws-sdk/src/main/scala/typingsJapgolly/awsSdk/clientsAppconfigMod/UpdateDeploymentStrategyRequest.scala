package typingsJapgolly.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeploymentStrategyRequest extends StObject {
  
  /**
    * Total amount of time for a deployment to last.
    */
  var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined
  
  /**
    * The deployment strategy ID.
    */
  var DeploymentStrategyId: typingsJapgolly.awsSdk.clientsAppconfigMod.DeploymentStrategyId
  
  /**
    * A description of the deployment strategy.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * The amount of time that AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic rollback.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined
  
  /**
    * The percentage of targets to receive a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.GrowthFactor] = js.undefined
  
  /**
    * The algorithm used to define how percentage grows over time. AppConfig supports the following growth types:  Linear: For this type, AppConfig processes the deployment by increments of the growth factor evenly distributed over the deployment time. For example, a linear deployment that uses a growth factor of 20 initially makes the configuration available to 20 percent of the targets. After 1/5th of the deployment time has passed, the system updates the percentage to 40 percent. This continues until 100% of the targets are set to receive the deployed configuration.  Exponential: For this type, AppConfig processes the deployment exponentially using the following formula: G*(2^N). In this formula, G is the growth factor specified by the user and N is the number of steps until the configuration is deployed to all targets. For example, if you specify a growth factor of 2, then the system rolls out the configuration as follows:  2*(2^0)   2*(2^1)   2*(2^2)  Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of the targets, and continues until the configuration has been deployed to all targets.
    */
  var GrowthType: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.GrowthType] = js.undefined
}
object UpdateDeploymentStrategyRequest {
  
  inline def apply(DeploymentStrategyId: DeploymentStrategyId): UpdateDeploymentStrategyRequest = {
    val __obj = js.Dynamic.literal(DeploymentStrategyId = DeploymentStrategyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeploymentStrategyRequest]
  }
  
  extension [Self <: UpdateDeploymentStrategyRequest](x: Self) {
    
    inline def setDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "DeploymentDurationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDeploymentDurationInMinutesUndefined: Self = StObject.set(x, "DeploymentDurationInMinutes", js.undefined)
    
    inline def setDeploymentStrategyId(value: DeploymentStrategyId): Self = StObject.set(x, "DeploymentStrategyId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFinalBakeTimeInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "FinalBakeTimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setFinalBakeTimeInMinutesUndefined: Self = StObject.set(x, "FinalBakeTimeInMinutes", js.undefined)
    
    inline def setGrowthFactor(value: GrowthFactor): Self = StObject.set(x, "GrowthFactor", value.asInstanceOf[js.Any])
    
    inline def setGrowthFactorUndefined: Self = StObject.set(x, "GrowthFactor", js.undefined)
    
    inline def setGrowthType(value: GrowthType): Self = StObject.set(x, "GrowthType", value.asInstanceOf[js.Any])
    
    inline def setGrowthTypeUndefined: Self = StObject.set(x, "GrowthType", js.undefined)
  }
}
