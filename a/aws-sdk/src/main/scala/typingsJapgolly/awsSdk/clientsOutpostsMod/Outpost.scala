package typingsJapgolly.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outpost extends StObject {
  
  var AvailabilityZone: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.AvailabilityZone] = js.undefined
  
  var AvailabilityZoneId: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.AvailabilityZoneId] = js.undefined
  
  var Description: js.UndefOr[OutpostDescription] = js.undefined
  
  var LifeCycleStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.LifeCycleStatus] = js.undefined
  
  var Name: js.UndefOr[OutpostName] = js.undefined
  
  var OutpostArn: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.OutpostArn] = js.undefined
  
  /**
    *  The ID of the Outpost. 
    */
  var OutpostId: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.OutpostId] = js.undefined
  
  var OwnerId: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.OwnerId] = js.undefined
  
  var SiteArn: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.SiteArn] = js.undefined
  
  var SiteId: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.SiteId] = js.undefined
  
  /**
    *  The hardware type. 
    */
  var SupportedHardwareType: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.SupportedHardwareType] = js.undefined
  
  /**
    * The Outpost tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Outpost {
  
  inline def apply(): Outpost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outpost]
  }
  
  extension [Self <: Outpost](x: Self) {
    
    inline def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneId(value: AvailabilityZoneId): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setDescription(value: OutpostDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLifeCycleStatus(value: LifeCycleStatus): Self = StObject.set(x, "LifeCycleStatus", value.asInstanceOf[js.Any])
    
    inline def setLifeCycleStatusUndefined: Self = StObject.set(x, "LifeCycleStatus", js.undefined)
    
    inline def setName(value: OutpostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutpostArn(value: OutpostArn): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    inline def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
    
    inline def setOwnerId(value: OwnerId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setSiteArn(value: SiteArn): Self = StObject.set(x, "SiteArn", value.asInstanceOf[js.Any])
    
    inline def setSiteArnUndefined: Self = StObject.set(x, "SiteArn", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
    
    inline def setSupportedHardwareType(value: SupportedHardwareType): Self = StObject.set(x, "SupportedHardwareType", value.asInstanceOf[js.Any])
    
    inline def setSupportedHardwareTypeUndefined: Self = StObject.set(x, "SupportedHardwareType", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
