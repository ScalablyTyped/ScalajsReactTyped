package typingsJapgolly.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.SAML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AcmCertificateArn = String

type AuditStreamArn = String

type AuthorizationProviderType = SAML | String

type Boolean = scala.Boolean

type Certificate = String

type CertificateChain = String

type CompanyCode = String

type DateTime = js.Date

type DeviceManufacturer = String

type DeviceModel = String

type DeviceOperatingSystemName = String

type DeviceOperatingSystemVersion = String

type DevicePatchLevel = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.SIGNED_OUT
  - java.lang.String
*/
type DeviceStatus = _DeviceStatus | String

type DeviceSummaryList = js.Array[DeviceSummary]

type DisplayName = String

type DomainName = String

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
type DomainStatus = _DomainStatus | String

type DomainSummaryList = js.Array[DomainSummary]

type FleetArn = String

type FleetName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_CREATE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_DELETE
  - java.lang.String
*/
type FleetStatus = _FleetStatus | String

type FleetSummaryList = js.Array[FleetSummary]

type Id = String

type IdentityProviderType = SAML | String

type MaxResults = Double

type NextToken = String

type SamlMetadata = String

type SecurityGroupId = String

type SecurityGroupIds = js.Array[SecurityGroupId]

type SubnetId = String

type SubnetIds = js.Array[SubnetId]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type Username = String

type VpcId = String

type WebsiteAuthorizationProvidersSummaryList = js.Array[WebsiteAuthorizationProviderSummary]

type WebsiteCaSummaryList = js.Array[WebsiteCaSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-09-25`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
