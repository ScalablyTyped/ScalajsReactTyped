package typingsJapgolly.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentStrategy extends StObject {
  
  /**
    * Total amount of time the deployment lasted.
    */
  var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined
  
  /**
    * The description of the deployment strategy.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * The amount of time that AppConfig monitored for alarms before considering the deployment to be complete and no longer eligible for automatic rollback.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined
  
  /**
    * The percentage of targets that received a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The algorithm used to define how percentage grew over time.
    */
  var GrowthType: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.GrowthType] = js.undefined
  
  /**
    * The deployment strategy ID.
    */
  var Id: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.Id] = js.undefined
  
  /**
    * The name of the deployment strategy.
    */
  var Name: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.Name] = js.undefined
  
  /**
    * Save the deployment strategy to a Systems Manager (SSM) document.
    */
  var ReplicateTo: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.ReplicateTo] = js.undefined
}
object DeploymentStrategy {
  
  inline def apply(): DeploymentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStrategy]
  }
  
  extension [Self <: DeploymentStrategy](x: Self) {
    
    inline def setDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "DeploymentDurationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDeploymentDurationInMinutesUndefined: Self = StObject.set(x, "DeploymentDurationInMinutes", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFinalBakeTimeInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "FinalBakeTimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setFinalBakeTimeInMinutesUndefined: Self = StObject.set(x, "FinalBakeTimeInMinutes", js.undefined)
    
    inline def setGrowthFactor(value: Percentage): Self = StObject.set(x, "GrowthFactor", value.asInstanceOf[js.Any])
    
    inline def setGrowthFactorUndefined: Self = StObject.set(x, "GrowthFactor", js.undefined)
    
    inline def setGrowthType(value: GrowthType): Self = StObject.set(x, "GrowthType", value.asInstanceOf[js.Any])
    
    inline def setGrowthTypeUndefined: Self = StObject.set(x, "GrowthType", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setReplicateTo(value: ReplicateTo): Self = StObject.set(x, "ReplicateTo", value.asInstanceOf[js.Any])
    
    inline def setReplicateToUndefined: Self = StObject.set(x, "ReplicateTo", js.undefined)
  }
}
