package typingsJapgolly.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComponentConfigurationRecommendationRequest extends StObject {
  
  /**
    * The name of the component.
    */
  var ComponentName: typingsJapgolly.awsSdk.clientsApplicationinsightsMod.ComponentName
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsJapgolly.awsSdk.clientsApplicationinsightsMod.ResourceGroupName
  
  /**
    * The tier of the application component.
    */
  var Tier: typingsJapgolly.awsSdk.clientsApplicationinsightsMod.Tier
}
object DescribeComponentConfigurationRecommendationRequest {
  
  inline def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName, Tier: Tier): DescribeComponentConfigurationRecommendationRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any], Tier = Tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComponentConfigurationRecommendationRequest]
  }
  
  extension [Self <: DescribeComponentConfigurationRecommendationRequest](x: Self) {
    
    inline def setComponentName(value: ComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setTier(value: Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
  }
}
