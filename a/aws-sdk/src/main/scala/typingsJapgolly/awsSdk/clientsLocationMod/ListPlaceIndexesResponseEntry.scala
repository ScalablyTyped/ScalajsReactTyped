package typingsJapgolly.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlaceIndexesResponseEntry extends StObject {
  
  /**
    * The timestamp for when the place index resource was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var CreateTime: js.Date
  
  /**
    * The data provider of geospatial data. Values can be one of the following:    Esri     Here    For more information about data providers, see Amazon Location Service data providers.
    */
  var DataSource: String
  
  /**
    * The optional description for the place index resource.
    */
  var Description: ResourceDescription
  
  /**
    * The name of the place index resource.
    */
  var IndexName: ResourceName
  
  /**
    * No longer used. Always returns RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typingsJapgolly.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * The timestamp for when the place index resource was last updated in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var UpdateTime: js.Date
}
object ListPlaceIndexesResponseEntry {
  
  inline def apply(
    CreateTime: js.Date,
    DataSource: String,
    Description: ResourceDescription,
    IndexName: ResourceName,
    UpdateTime: js.Date
  ): ListPlaceIndexesResponseEntry = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], DataSource = DataSource.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], IndexName = IndexName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlaceIndexesResponseEntry]
  }
  
  extension [Self <: ListPlaceIndexesResponseEntry](x: Self) {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: ResourceName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
