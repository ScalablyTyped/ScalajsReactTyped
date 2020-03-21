package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object healthMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.healthMod.ClientApiVersions
  type DescribeAffectedEntitiesForOrganizationFailedSet = js.Array[typingsJapgolly.awsSdk.healthMod.OrganizationAffectedEntitiesErrorItem]
  type DescribeEventDetailsFailedSet = js.Array[typingsJapgolly.awsSdk.healthMod.EventDetailsErrorItem]
  type DescribeEventDetailsForOrganizationFailedSet = js.Array[typingsJapgolly.awsSdk.healthMod.OrganizationEventDetailsErrorItem]
  type DescribeEventDetailsForOrganizationSuccessfulSet = js.Array[typingsJapgolly.awsSdk.healthMod.OrganizationEventDetails]
  type DescribeEventDetailsSuccessfulSet = js.Array[typingsJapgolly.awsSdk.healthMod.EventDetails]
  type EntityAggregateList = js.Array[typingsJapgolly.awsSdk.healthMod.EntityAggregate]
  type EntityList = js.Array[typingsJapgolly.awsSdk.healthMod.AffectedEntity]
  type EventAggregateList = js.Array[typingsJapgolly.awsSdk.healthMod.EventAggregate]
  type EventArnsList = js.Array[typingsJapgolly.awsSdk.healthMod.eventArn]
  type EventList = js.Array[typingsJapgolly.awsSdk.healthMod.Event]
  type EventTypeCategoryList_ = js.Array[typingsJapgolly.awsSdk.healthMod.eventTypeCategory]
  type EventTypeCodeList = js.Array[typingsJapgolly.awsSdk.healthMod.eventTypeCode]
  type EventTypeList_ = js.Array[typingsJapgolly.awsSdk.healthMod.EventType_]
  type OrganizationEntityFiltersList = js.Array[typingsJapgolly.awsSdk.healthMod.EventAccountFilter]
  type OrganizationEventDetailFiltersList = js.Array[typingsJapgolly.awsSdk.healthMod.EventAccountFilter]
  type OrganizationEventList = js.Array[typingsJapgolly.awsSdk.healthMod.OrganizationEvent]
  type accountId = java.lang.String
  type affectedAccountsList = js.Array[typingsJapgolly.awsSdk.healthMod.accountId]
  type aggregateValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-08-04`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.healthMod._apiVersion | java.lang.String
  type availabilityZone = java.lang.String
  type availabilityZones = js.Array[typingsJapgolly.awsSdk.healthMod.availabilityZone]
  type awsAccountIdsList = js.Array[typingsJapgolly.awsSdk.healthMod.accountId]
  type count = scala.Double
  type dateTimeRangeList = js.Array[typingsJapgolly.awsSdk.healthMod.DateTimeRange]
  type entityArn = java.lang.String
  type entityArnList = js.Array[typingsJapgolly.awsSdk.healthMod.entityArn]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPAIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNIMPAIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type entityStatusCode = typingsJapgolly.awsSdk.healthMod._entityStatusCode | java.lang.String
  type entityStatusCodeList = js.Array[typingsJapgolly.awsSdk.healthMod.entityStatusCode]
  type entityUrl = java.lang.String
  type entityValue = java.lang.String
  type entityValueList = js.Array[typingsJapgolly.awsSdk.healthMod.entityValue]
  type eventAggregateField = typingsJapgolly.awsSdk.awsSdkStrings.eventTypeCategory | java.lang.String
  type eventArn = java.lang.String
  type eventArnList = js.Array[typingsJapgolly.awsSdk.healthMod.eventArn]
  type eventDescription = java.lang.String
  type eventMetadata = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.healthMod.metadataValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.open__
    - typingsJapgolly.awsSdk.awsSdkStrings.closed_
    - typingsJapgolly.awsSdk.awsSdkStrings.upcoming
    - java.lang.String
  */
  type eventStatusCode = typingsJapgolly.awsSdk.healthMod._eventStatusCode | java.lang.String
  type eventStatusCodeList = js.Array[typingsJapgolly.awsSdk.healthMod.eventStatusCode]
  type eventType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.issue
    - typingsJapgolly.awsSdk.awsSdkStrings.accountNotification
    - typingsJapgolly.awsSdk.awsSdkStrings.scheduledChange
    - typingsJapgolly.awsSdk.awsSdkStrings.investigation
    - java.lang.String
  */
  type eventTypeCategory = typingsJapgolly.awsSdk.healthMod._eventTypeCategory | java.lang.String
  type eventTypeCategoryList = js.Array[typingsJapgolly.awsSdk.healthMod.eventTypeCategory]
  type eventTypeCode = java.lang.String
  type eventTypeList = js.Array[typingsJapgolly.awsSdk.healthMod.eventType]
  type healthServiceAccessStatusForOrganization = java.lang.String
  type locale = java.lang.String
  type maxResults = scala.Double
  type metadataKey = java.lang.String
  type metadataValue = java.lang.String
  type nextToken = java.lang.String
  type region = java.lang.String
  type regionList = js.Array[typingsJapgolly.awsSdk.healthMod.region]
  type service = java.lang.String
  type serviceList = js.Array[typingsJapgolly.awsSdk.healthMod.service]
  type tagFilter = js.Array[typingsJapgolly.awsSdk.healthMod.tagSet]
  type tagKey = java.lang.String
  type tagSet = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.healthMod.tagValue]
  type tagValue = java.lang.String
  type timestamp = js.Date
}
