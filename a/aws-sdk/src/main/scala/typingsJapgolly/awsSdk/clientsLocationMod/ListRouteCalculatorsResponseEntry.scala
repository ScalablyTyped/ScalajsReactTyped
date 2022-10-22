package typingsJapgolly.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRouteCalculatorsResponseEntry extends StObject {
  
  /**
    * The name of the route calculator resource.
    */
  var CalculatorName: ResourceName
  
  /**
    * The timestamp when the route calculator resource was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.    For example, 2020–07-2T12:15:20.000Z+01:00   
    */
  var CreateTime: js.Date
  
  /**
    * The data provider of traffic and road network data. Indicates one of the available providers:    Esri     Here    For more information about data providers, see Amazon Location Service data providers.
    */
  var DataSource: String
  
  /**
    * The optional description of the route calculator resource.
    */
  var Description: ResourceDescription
  
  /**
    * Always returns RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typingsJapgolly.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * The timestamp when the route calculator resource was last updated in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.    For example, 2020–07-2T12:15:20.000Z+01:00   
    */
  var UpdateTime: js.Date
}
object ListRouteCalculatorsResponseEntry {
  
  inline def apply(
    CalculatorName: ResourceName,
    CreateTime: js.Date,
    DataSource: String,
    Description: ResourceDescription,
    UpdateTime: js.Date
  ): ListRouteCalculatorsResponseEntry = {
    val __obj = js.Dynamic.literal(CalculatorName = CalculatorName.asInstanceOf[js.Any], CreateTime = CreateTime.asInstanceOf[js.Any], DataSource = DataSource.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRouteCalculatorsResponseEntry]
  }
  
  extension [Self <: ListRouteCalculatorsResponseEntry](x: Self) {
    
    inline def setCalculatorName(value: ResourceName): Self = StObject.set(x, "CalculatorName", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
