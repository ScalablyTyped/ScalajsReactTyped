package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shieldMod {
  type AttackId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK
    - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION
    - java.lang.String
  */
  type AttackLayer = typingsJapgolly.awsSdk.shieldMod._AttackLayer | java.lang.String
  type AttackProperties = js.Array[typingsJapgolly.awsSdk.shieldMod.AttackProperty]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DESTINATION_URL
    - typingsJapgolly.awsSdk.awsSdkStrings.REFERRER
    - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_ASN
    - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_COUNTRY
    - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_IP_ADDRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_USER_AGENT
    - typingsJapgolly.awsSdk.awsSdkStrings.WORDPRESS_PINGBACK_REFLECTOR
    - typingsJapgolly.awsSdk.awsSdkStrings.WORDPRESS_PINGBACK_SOURCE
    - java.lang.String
  */
  type AttackPropertyIdentifier = typingsJapgolly.awsSdk.shieldMod._AttackPropertyIdentifier | java.lang.String
  type AttackSummaries = js.Array[typingsJapgolly.awsSdk.shieldMod.AttackSummary]
  type AttackTimestamp = js.Date
  type AttackVectorDescriptionList = js.Array[typingsJapgolly.awsSdk.shieldMod.AttackVectorDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AutoRenew = typingsJapgolly.awsSdk.shieldMod._AutoRenew | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.shieldMod.ClientApiVersions
  type Double = scala.Double
  type DurationInSeconds = scala.Double
  type EmailAddress = java.lang.String
  type EmergencyContactList = js.Array[typingsJapgolly.awsSdk.shieldMod.EmergencyContact]
  type HealthCheckArn = java.lang.String
  type HealthCheckId = java.lang.String
  type HealthCheckIds = js.Array[typingsJapgolly.awsSdk.shieldMod.HealthCheckId]
  type Integer = scala.Double
  type Limits = js.Array[typingsJapgolly.awsSdk.shieldMod.Limit]
  type LogBucket = java.lang.String
  type LogBucketList = js.Array[typingsJapgolly.awsSdk.shieldMod.LogBucket]
  type Long = scala.Double
  type MaxResults = scala.Double
  type MitigationList = js.Array[typingsJapgolly.awsSdk.shieldMod.Mitigation]
  type ProtectionId = java.lang.String
  type ProtectionName = java.lang.String
  type Protections = js.Array[typingsJapgolly.awsSdk.shieldMod.Protection]
  type ResourceArn = java.lang.String
  type ResourceArnFilterList = js.Array[typingsJapgolly.awsSdk.shieldMod.ResourceArn]
  type RoleArn = java.lang.String
  type String = java.lang.String
  type SubResourceSummaryList = js.Array[typingsJapgolly.awsSdk.shieldMod.SubResourceSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IP
    - typingsJapgolly.awsSdk.awsSdkStrings.URL
    - java.lang.String
  */
  type SubResourceType = typingsJapgolly.awsSdk.shieldMod._SubResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type SubscriptionState = typingsJapgolly.awsSdk.shieldMod._SubscriptionState | java.lang.String
  type SummarizedAttackVectorList = js.Array[typingsJapgolly.awsSdk.shieldMod.SummarizedAttackVector]
  type SummarizedCounterList = js.Array[typingsJapgolly.awsSdk.shieldMod.SummarizedCounter]
  type Timestamp = js.Date
  type Token = java.lang.String
  type TopContributors = js.Array[typingsJapgolly.awsSdk.shieldMod.Contributor]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BITS
    - typingsJapgolly.awsSdk.awsSdkStrings.BYTES
    - typingsJapgolly.awsSdk.awsSdkStrings.PACKETS
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUESTS
    - java.lang.String
  */
  type Unit = typingsJapgolly.awsSdk.shieldMod._Unit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-06-02`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.shieldMod._apiVersion | java.lang.String
}
