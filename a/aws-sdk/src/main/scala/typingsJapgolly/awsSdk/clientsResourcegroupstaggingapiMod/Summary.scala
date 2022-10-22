package typingsJapgolly.awsSdk.clientsResourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Summary extends StObject {
  
  /**
    * The timestamp that shows when this summary was generated in this Region. 
    */
  var LastUpdated: js.UndefOr[typingsJapgolly.awsSdk.clientsResourcegroupstaggingapiMod.LastUpdated] = js.undefined
  
  /**
    * The count of noncompliant resources.
    */
  var NonCompliantResources: js.UndefOr[typingsJapgolly.awsSdk.clientsResourcegroupstaggingapiMod.NonCompliantResources] = js.undefined
  
  /**
    * The Amazon Web Services Region that the summary applies to.
    */
  var Region: js.UndefOr[typingsJapgolly.awsSdk.clientsResourcegroupstaggingapiMod.Region] = js.undefined
  
  /**
    * The Amazon Web Services resource type.
    */
  var ResourceType: js.UndefOr[AmazonResourceType] = js.undefined
  
  /**
    * The account identifier or the root identifier of the organization. If you don't know the root ID, you can call the Organizations ListRoots API.
    */
  var TargetId: js.UndefOr[typingsJapgolly.awsSdk.clientsResourcegroupstaggingapiMod.TargetId] = js.undefined
  
  /**
    * Whether the target is an account, an OU, or the organization root.
    */
  var TargetIdType: js.UndefOr[typingsJapgolly.awsSdk.clientsResourcegroupstaggingapiMod.TargetIdType] = js.undefined
}
object Summary {
  
  inline def apply(): Summary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Summary]
  }
  
  extension [Self <: Summary](x: Self) {
    
    inline def setLastUpdated(value: LastUpdated): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setNonCompliantResources(value: NonCompliantResources): Self = StObject.set(x, "NonCompliantResources", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantResourcesUndefined: Self = StObject.set(x, "NonCompliantResources", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setResourceType(value: AmazonResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTargetId(value: TargetId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdType(value: TargetIdType): Self = StObject.set(x, "TargetIdType", value.asInstanceOf[js.Any])
    
    inline def setTargetIdTypeUndefined: Self = StObject.set(x, "TargetIdType", js.undefined)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "TargetId", js.undefined)
  }
}
