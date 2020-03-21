package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object worklinkMod {
  type AcmCertificateArn = java.lang.String
  type AuditStreamArn = java.lang.String
  type AuthorizationProviderType = typingsJapgolly.awsSdk.awsSdkStrings.SAML | java.lang.String
  type Boolean = scala.Boolean
  type Certificate = java.lang.String
  type CertificateChain = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.worklinkMod.ClientApiVersions
  type CompanyCode = java.lang.String
  type DateTime = js.Date
  type DeviceManufacturer = java.lang.String
  type DeviceModel = java.lang.String
  type DeviceOperatingSystemName = java.lang.String
  type DeviceOperatingSystemVersion = java.lang.String
  type DevicePatchLevel = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.SIGNED_OUT
    - java.lang.String
  */
  type DeviceStatus = typingsJapgolly.awsSdk.worklinkMod._DeviceStatus | java.lang.String
  type DeviceSummaryList = js.Array[typingsJapgolly.awsSdk.worklinkMod.DeviceSummary]
  type DisplayName = java.lang.String
  type DomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DISASSOCIATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DISASSOCIATED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_ASSOCIATE
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_DISASSOCIATE
    - java.lang.String
  */
  type DomainStatus = typingsJapgolly.awsSdk.worklinkMod._DomainStatus | java.lang.String
  type DomainSummaryList = js.Array[typingsJapgolly.awsSdk.worklinkMod.DomainSummary]
  type FleetArn = java.lang.String
  type FleetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_CREATE
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_DELETE
    - java.lang.String
  */
  type FleetStatus = typingsJapgolly.awsSdk.worklinkMod._FleetStatus | java.lang.String
  type FleetSummaryList = js.Array[typingsJapgolly.awsSdk.worklinkMod.FleetSummary]
  type Id = java.lang.String
  type IdentityProviderType = typingsJapgolly.awsSdk.awsSdkStrings.SAML | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type SamlMetadata = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typingsJapgolly.awsSdk.worklinkMod.SecurityGroupId]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsJapgolly.awsSdk.worklinkMod.SubnetId]
  type Username = java.lang.String
  type VpcId = java.lang.String
  type WebsiteAuthorizationProvidersSummaryList = js.Array[typingsJapgolly.awsSdk.worklinkMod.WebsiteAuthorizationProviderSummary]
  type WebsiteCaSummaryList = js.Array[typingsJapgolly.awsSdk.worklinkMod.WebsiteCaSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-09-25`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.worklinkMod._apiVersion | java.lang.String
}
