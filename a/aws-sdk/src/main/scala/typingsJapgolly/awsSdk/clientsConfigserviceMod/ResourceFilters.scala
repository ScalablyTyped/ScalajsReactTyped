package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceFilters extends StObject {
  
  /**
    * The 12-digit source account ID.
    */
  var AccountId: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.AccountId] = js.undefined
  
  /**
    * The source region.
    */
  var Region: js.UndefOr[AwsRegion] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.ResourceId] = js.undefined
  
  /**
    * The name of the resource.
    */
  var ResourceName: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.ResourceName] = js.undefined
}
object ResourceFilters {
  
  inline def apply(): ResourceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceFilters]
  }
  
  extension [Self <: ResourceFilters](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setRegion(value: AwsRegion): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
  }
}
