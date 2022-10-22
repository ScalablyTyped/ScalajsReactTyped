package typingsJapgolly.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventDataStoreResponse extends StObject {
  
  /**
    * The advanced event selectors that are applied to the event data store.
    */
  var AdvancedEventSelectors: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudtrailMod.AdvancedEventSelectors] = js.undefined
  
  /**
    * The timestamp that shows when an event data store was first created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the event data store.
    */
  var EventDataStoreArn: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudtrailMod.EventDataStoreArn] = js.undefined
  
  /**
    * Indicates whether the event data store includes events from all regions, or only from the region in which it was created.
    */
  var MultiRegionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the event data store.
    */
  var Name: js.UndefOr[EventDataStoreName] = js.undefined
  
  /**
    * Indicates whether an event data store is collecting logged events for an organization in Organizations.
    */
  var OrganizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The retention period, in days.
    */
  var RetentionPeriod: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudtrailMod.RetentionPeriod] = js.undefined
  
  /**
    * The status of an event data store. Values can be ENABLED and PENDING_DELETION.
    */
  var Status: js.UndefOr[EventDataStoreStatus] = js.undefined
  
  /**
    * Indicates whether termination protection is enabled for the event data store.
    */
  var TerminationProtectionEnabled: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudtrailMod.TerminationProtectionEnabled] = js.undefined
  
  /**
    * The timestamp that shows when the event data store was last updated. UpdatedTimestamp is always either the same or newer than the time shown in CreatedTimestamp.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object UpdateEventDataStoreResponse {
  
  inline def apply(): UpdateEventDataStoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEventDataStoreResponse]
  }
  
  extension [Self <: UpdateEventDataStoreResponse](x: Self) {
    
    inline def setAdvancedEventSelectors(value: AdvancedEventSelectors): Self = StObject.set(x, "AdvancedEventSelectors", value.asInstanceOf[js.Any])
    
    inline def setAdvancedEventSelectorsUndefined: Self = StObject.set(x, "AdvancedEventSelectors", js.undefined)
    
    inline def setAdvancedEventSelectorsVarargs(value: AdvancedEventSelector*): Self = StObject.set(x, "AdvancedEventSelectors", js.Array(value*))
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setEventDataStoreArn(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStoreArn", value.asInstanceOf[js.Any])
    
    inline def setEventDataStoreArnUndefined: Self = StObject.set(x, "EventDataStoreArn", js.undefined)
    
    inline def setMultiRegionEnabled(value: Boolean): Self = StObject.set(x, "MultiRegionEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionEnabledUndefined: Self = StObject.set(x, "MultiRegionEnabled", js.undefined)
    
    inline def setName(value: EventDataStoreName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOrganizationEnabled(value: Boolean): Self = StObject.set(x, "OrganizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOrganizationEnabledUndefined: Self = StObject.set(x, "OrganizationEnabled", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
    
    inline def setStatus(value: EventDataStoreStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTerminationProtectionEnabled(value: TerminationProtectionEnabled): Self = StObject.set(x, "TerminationProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setTerminationProtectionEnabledUndefined: Self = StObject.set(x, "TerminationProtectionEnabled", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
