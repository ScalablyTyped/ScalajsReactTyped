package typingsJapgolly.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.AppStream
import typingsJapgolly.awsSdk.awsSdkStrings.Chrome
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

type ArnList = js.Array[ARN]

type BrowserPolicy = String

type BrowserSettingsList = js.Array[BrowserSettingsSummary]

type BrowserType = Chrome | String

type CertificateAuthorityBody = Buffer | js.typedarray.Uint8Array | Blob | String

type CertificateList = js.Array[CertificateAuthorityBody]

type CertificatePrincipal = String

type CertificateSummaryList = js.Array[CertificateSummary]

type CertificateThumbprint = String

type CertificateThumbprintList = js.Array[CertificateThumbprint]

type ClientToken = String

type DisconnectTimeoutInMinutes = Double

type DisplayName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - java.lang.String
*/
type EnabledType = _EnabledType | String

type EncryptionContextMap = StringDictionary[StringType]

type IdentityProviderDetails = StringDictionary[StringType]

type IdentityProviderList = js.Array[IdentityProviderSummary]

type IdentityProviderName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SAML
  - typingsJapgolly.awsSdk.awsSdkStrings.Facebook
  - typingsJapgolly.awsSdk.awsSdkStrings.Google
  - typingsJapgolly.awsSdk.awsSdkStrings.LoginWithAmazon
  - typingsJapgolly.awsSdk.awsSdkStrings.SignInWithApple
  - typingsJapgolly.awsSdk.awsSdkStrings.OIDC
  - java.lang.String
*/
type IdentityProviderType = _IdentityProviderType | String

type IdleDisconnectTimeoutInMinutes = Double

type MaxResults = Double

type NetworkSettingsList = js.Array[NetworkSettingsSummary]

type PaginationToken = String

type PortalEndpoint = String

type PortalList = js.Array[PortalSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Incomplete_
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - java.lang.String
*/
type PortalStatus = _PortalStatus | String

type RendererType = AppStream | String

type SamlMetadata = String

type SecurityGroupId = String

type SecurityGroupIdList = js.Array[SecurityGroupId]

type StatusReason = String

type StringType = String

type SubnetId = String

type SubnetIdList = js.Array[SubnetId]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type Timestamp = js.Date

type TrustStoreSummaryList = js.Array[TrustStoreSummary]

type UserSettingsList = js.Array[UserSettingsSummary]

type VpcId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-07-08`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type keyArn = String
