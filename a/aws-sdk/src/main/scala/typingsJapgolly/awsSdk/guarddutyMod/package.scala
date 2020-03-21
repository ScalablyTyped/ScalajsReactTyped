package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object guarddutyMod {
  type AccountDetails = js.Array[typingsJapgolly.awsSdk.guarddutyMod.AccountDetail]
  type AccountId = java.lang.String
  type AccountIds = js.Array[typingsJapgolly.awsSdk.guarddutyMod.AccountId]
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.guarddutyMod.ClientApiVersions
  type ClientToken = java.lang.String
  type CountBySeverity = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.guarddutyMod.Integer]
  type Criterion = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.guarddutyMod.Condition]
  type DestinationType = typingsJapgolly.awsSdk.awsSdkStrings.S3 | java.lang.String
  type Destinations = js.Array[typingsJapgolly.awsSdk.guarddutyMod.Destination]
  type DetectorId = java.lang.String
  type DetectorIds = js.Array[typingsJapgolly.awsSdk.guarddutyMod.DetectorId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DetectorStatus = typingsJapgolly.awsSdk.guarddutyMod._DetectorStatus | java.lang.String
  type Double = scala.Double
  type Email = java.lang.String
  type Eq = js.Array[typingsJapgolly.awsSdk.guarddutyMod.String]
  type Equals = js.Array[typingsJapgolly.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USEFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_USEFUL
    - java.lang.String
  */
  type Feedback = typingsJapgolly.awsSdk.guarddutyMod._Feedback | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOOP
    - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVE
    - java.lang.String
  */
  type FilterAction = typingsJapgolly.awsSdk.guarddutyMod._FilterAction | java.lang.String
  type FilterDescription = java.lang.String
  type FilterName = java.lang.String
  type FilterNames = js.Array[typingsJapgolly.awsSdk.guarddutyMod.FilterName]
  type FilterRank = scala.Double
  type FindingId = java.lang.String
  type FindingIds = js.Array[typingsJapgolly.awsSdk.guarddutyMod.FindingId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FIFTEEN_MINUTES
    - typingsJapgolly.awsSdk.awsSdkStrings.ONE_HOUR
    - typingsJapgolly.awsSdk.awsSdkStrings.SIX_HOURS
    - java.lang.String
  */
  type FindingPublishingFrequency = typingsJapgolly.awsSdk.guarddutyMod._FindingPublishingFrequency | java.lang.String
  type FindingStatisticType = typingsJapgolly.awsSdk.awsSdkStrings.COUNT_BY_SEVERITY | java.lang.String
  type FindingStatisticTypes = js.Array[typingsJapgolly.awsSdk.guarddutyMod.FindingStatisticType]
  type FindingType = java.lang.String
  type FindingTypes = js.Array[typingsJapgolly.awsSdk.guarddutyMod.FindingType]
  type Findings = js.Array[typingsJapgolly.awsSdk.guarddutyMod.Finding]
  type GuardDutyArn = java.lang.String
  type Integer = scala.Double
  type Invitations = js.Array[typingsJapgolly.awsSdk.guarddutyMod.Invitation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TXT
    - typingsJapgolly.awsSdk.awsSdkStrings.STIX
    - typingsJapgolly.awsSdk.awsSdkStrings.OTX_CSV
    - typingsJapgolly.awsSdk.awsSdkStrings.ALIEN_VAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.PROOF_POINT
    - typingsJapgolly.awsSdk.awsSdkStrings.FIRE_EYE
    - java.lang.String
  */
  type IpSetFormat = typingsJapgolly.awsSdk.guarddutyMod._IpSetFormat | java.lang.String
  type IpSetIds = js.Array[typingsJapgolly.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEACTIVATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type IpSetStatus = typingsJapgolly.awsSdk.guarddutyMod._IpSetStatus | java.lang.String
  type Ipv6Addresses = js.Array[typingsJapgolly.awsSdk.guarddutyMod.String]
  type Location = java.lang.String
  type Long = scala.Double
  type MaxResults = scala.Double
  type Members = js.Array[typingsJapgolly.awsSdk.guarddutyMod.Member]
  type Name = java.lang.String
  type Neq = js.Array[typingsJapgolly.awsSdk.guarddutyMod.String]
  type NetworkInterfaces = js.Array[typingsJapgolly.awsSdk.guarddutyMod.NetworkInterface]
  type NotEquals = js.Array[typingsJapgolly.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASC
    - typingsJapgolly.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type OrderBy = typingsJapgolly.awsSdk.guarddutyMod._OrderBy | java.lang.String
  type PortProbeDetails = js.Array[typingsJapgolly.awsSdk.guarddutyMod.PortProbeDetail]
  type PrivateIpAddresses = js.Array[typingsJapgolly.awsSdk.guarddutyMod.PrivateIpAddressDetails]
  type ProductCodes = js.Array[typingsJapgolly.awsSdk.guarddutyMod.ProductCode]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VERIFICATION
    - typingsJapgolly.awsSdk.awsSdkStrings.PUBLISHING
    - typingsJapgolly.awsSdk.awsSdkStrings.UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type PublishingStatus = typingsJapgolly.awsSdk.guarddutyMod._PublishingStatus | java.lang.String
  type SecurityGroups = js.Array[typingsJapgolly.awsSdk.guarddutyMod.SecurityGroup]
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.guarddutyMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.guarddutyMod.TagValue]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.guarddutyMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TXT
    - typingsJapgolly.awsSdk.awsSdkStrings.STIX
    - typingsJapgolly.awsSdk.awsSdkStrings.OTX_CSV
    - typingsJapgolly.awsSdk.awsSdkStrings.ALIEN_VAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.PROOF_POINT
    - typingsJapgolly.awsSdk.awsSdkStrings.FIRE_EYE
    - java.lang.String
  */
  type ThreatIntelSetFormat = typingsJapgolly.awsSdk.guarddutyMod._ThreatIntelSetFormat | java.lang.String
  type ThreatIntelSetIds = js.Array[typingsJapgolly.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEACTIVATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type ThreatIntelSetStatus = typingsJapgolly.awsSdk.guarddutyMod._ThreatIntelSetStatus | java.lang.String
  type ThreatIntelligenceDetails = js.Array[typingsJapgolly.awsSdk.guarddutyMod.ThreatIntelligenceDetail]
  type ThreatNames = js.Array[typingsJapgolly.awsSdk.guarddutyMod.String]
  type UnprocessedAccounts = js.Array[typingsJapgolly.awsSdk.guarddutyMod.UnprocessedAccount]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-11-28`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.guarddutyMod._apiVersion | java.lang.String
}
