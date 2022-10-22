package typingsJapgolly.awsSdk.clientsCloudfrontMod

import typingsJapgolly.awsSdk.awsSdkStrings.URLEncoded
import typingsJapgolly.awsSdk.awsSdkStrings.`cloudfront-js-1Dot0`
import typingsJapgolly.awsSdk.awsSdkStrings.s3_
import typingsJapgolly.awsSdk.awsSdkStrings.sigv4_
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessControlAllowHeadersList = js.Array[String]

type AccessControlAllowMethodsList = js.Array[ResponseHeadersPolicyAccessControlAllowMethodsValues]

type AccessControlAllowOriginsList = js.Array[String]

type AccessControlExposeHeadersList = js.Array[String]

type AliasICPRecordals = js.Array[AliasICPRecordal]

type AliasList = js.Array[String]

type AwsAccountNumberList = js.Array[String]

type CacheBehaviorList = js.Array[CacheBehavior]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - typingsJapgolly.awsSdk.awsSdkStrings.whitelist
  - typingsJapgolly.awsSdk.awsSdkStrings.allExcept
  - typingsJapgolly.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type CachePolicyCookieBehavior = _CachePolicyCookieBehavior | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - typingsJapgolly.awsSdk.awsSdkStrings.whitelist
  - java.lang.String
*/
type CachePolicyHeaderBehavior = _CachePolicyHeaderBehavior | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - typingsJapgolly.awsSdk.awsSdkStrings.whitelist
  - typingsJapgolly.awsSdk.awsSdkStrings.allExcept
  - typingsJapgolly.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type CachePolicyQueryStringBehavior = _CachePolicyQueryStringBehavior | String

type CachePolicySummaryList = js.Array[CachePolicySummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.managed_
  - typingsJapgolly.awsSdk.awsSdkStrings.custom__
  - java.lang.String
*/
type CachePolicyType = _CachePolicyType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.cloudfront_
  - typingsJapgolly.awsSdk.awsSdkStrings.iam_
  - typingsJapgolly.awsSdk.awsSdkStrings.acm
  - java.lang.String
*/
type CertificateSource = _CertificateSource | String

type CloudFrontOriginAccessIdentitySummaryList = js.Array[CloudFrontOriginAccessIdentitySummary]

type CommentType = String

type ConflictingAliases = js.Array[ConflictingAlias]

type ContentTypeProfileList = js.Array[ContentTypeProfile]

type CookieNameList = js.Array[String]

type CustomErrorResponseList = js.Array[CustomErrorResponse]

type DistributionIdListSummary = js.Array[String]

type DistributionSummaryList = js.Array[DistributionSummary]

type EncryptionEntityList = js.Array[EncryptionEntity]

type EndPointList = js.Array[EndPoint]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`viewer-request`
  - typingsJapgolly.awsSdk.awsSdkStrings.`viewer-response`
  - typingsJapgolly.awsSdk.awsSdkStrings.`origin-request`
  - typingsJapgolly.awsSdk.awsSdkStrings.`origin-response`
  - java.lang.String
*/
type EventType = _EventType | String

type FieldLevelEncryptionProfileSummaryList = js.Array[FieldLevelEncryptionProfileSummary]

type FieldLevelEncryptionSummaryList = js.Array[FieldLevelEncryptionSummary]

type FieldList = js.Array[String]

type FieldPatternList = js.Array[String]

type Format = URLEncoded | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DENY
  - typingsJapgolly.awsSdk.awsSdkStrings.SAMEORIGIN
  - java.lang.String
*/
type FrameOptionsList = _FrameOptionsList | String

type FunctionARN = String

type FunctionAssociationList = js.Array[FunctionAssociation]

type FunctionBlob = Buffer | js.typedarray.Uint8Array | Blob | String

type FunctionEventObject = Buffer | js.typedarray.Uint8Array | Blob | String

type FunctionExecutionLogList = js.Array[String]

type FunctionName = String

type FunctionRuntime = `cloudfront-js-1Dot0` | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEVELOPMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.LIVE
  - java.lang.String
*/
type FunctionStage = _FunctionStage | String

type FunctionSummaryList = js.Array[FunctionSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.blacklist
  - typingsJapgolly.awsSdk.awsSdkStrings.whitelist
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type GeoRestrictionType = _GeoRestrictionType | String

type HeaderList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.http1Dot1
  - typingsJapgolly.awsSdk.awsSdkStrings.http2
  - typingsJapgolly.awsSdk.awsSdkStrings.http3
  - typingsJapgolly.awsSdk.awsSdkStrings.http2and3
  - java.lang.String
*/
type HttpVersion = _HttpVersion | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.APPROVED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type ICPRecordalStatus = _ICPRecordalStatus | String

type InvalidationSummaryList = js.Array[InvalidationSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - typingsJapgolly.awsSdk.awsSdkStrings.whitelist
  - typingsJapgolly.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type ItemSelection = _ItemSelection | String

type KGKeyPairIdsList = js.Array[KGKeyPairIds]

type KeyGroupSummaryList = js.Array[KeyGroupSummary]

type KeyPairIdList = js.Array[String]

type LambdaFunctionARN = String

type LambdaFunctionAssociationList = js.Array[LambdaFunctionAssociation]

type LocationList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GET
  - typingsJapgolly.awsSdk.awsSdkStrings.HEAD
  - typingsJapgolly.awsSdk.awsSdkStrings.POST
  - typingsJapgolly.awsSdk.awsSdkStrings.PUT
  - typingsJapgolly.awsSdk.awsSdkStrings.PATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIONS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type Method = _Method | String

type MethodsList = js.Array[Method]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SSLv3
  - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1
  - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1_2016
  - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1Dot1_2016
  - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1Dot2_2018
  - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1Dot2_2019
  - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1Dot2_2021
  - java.lang.String
*/
type MinimumProtocolVersion = _MinimumProtocolVersion | String

type OriginAccessControlOriginTypes = s3_ | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.never__
  - typingsJapgolly.awsSdk.awsSdkStrings.always__
  - typingsJapgolly.awsSdk.awsSdkStrings.`no-override`
  - java.lang.String
*/
type OriginAccessControlSigningBehaviors = _OriginAccessControlSigningBehaviors | String

type OriginAccessControlSigningProtocols = sigv4_ | String

type OriginAccessControlSummaryList = js.Array[OriginAccessControlSummary]

type OriginCustomHeadersList = js.Array[OriginCustomHeader]

type OriginGroupList = js.Array[OriginGroup]

type OriginGroupMemberList = js.Array[OriginGroupMember]

type OriginList = js.Array[Origin]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`http-only`
  - typingsJapgolly.awsSdk.awsSdkStrings.`match-viewer`
  - typingsJapgolly.awsSdk.awsSdkStrings.`https-only`
  - java.lang.String
*/
type OriginProtocolPolicy = _OriginProtocolPolicy | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - typingsJapgolly.awsSdk.awsSdkStrings.whitelist
  - typingsJapgolly.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type OriginRequestPolicyCookieBehavior = _OriginRequestPolicyCookieBehavior | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - typingsJapgolly.awsSdk.awsSdkStrings.whitelist
  - typingsJapgolly.awsSdk.awsSdkStrings.allViewer
  - typingsJapgolly.awsSdk.awsSdkStrings.allViewerAndWhitelistCloudFront
  - java.lang.String
*/
type OriginRequestPolicyHeaderBehavior = _OriginRequestPolicyHeaderBehavior | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - typingsJapgolly.awsSdk.awsSdkStrings.whitelist
  - typingsJapgolly.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type OriginRequestPolicyQueryStringBehavior = _OriginRequestPolicyQueryStringBehavior | String

type OriginRequestPolicySummaryList = js.Array[OriginRequestPolicySummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.managed_
  - typingsJapgolly.awsSdk.awsSdkStrings.custom__
  - java.lang.String
*/
type OriginRequestPolicyType = _OriginRequestPolicyType | String

type OriginShieldRegion = String

type PathList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PriceClass_100
  - typingsJapgolly.awsSdk.awsSdkStrings.PriceClass_200
  - typingsJapgolly.awsSdk.awsSdkStrings.PriceClass_All
  - java.lang.String
*/
type PriceClass = _PriceClass | String

type PublicKeyIdList = js.Array[String]

type PublicKeySummaryList = js.Array[PublicKeySummary]

type QueryArgProfileList = js.Array[QueryArgProfile]

type QueryStringCacheKeysList = js.Array[String]

type QueryStringNamesList = js.Array[String]

type RealtimeLogConfigList = js.Array[RealtimeLogConfig]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type RealtimeMetricsSubscriptionStatus = _RealtimeMetricsSubscriptionStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`no-referrer`
  - typingsJapgolly.awsSdk.awsSdkStrings.`no-referrer-when-downgrade`
  - typingsJapgolly.awsSdk.awsSdkStrings.origin__
  - typingsJapgolly.awsSdk.awsSdkStrings.`origin-when-cross-origin`
  - typingsJapgolly.awsSdk.awsSdkStrings.`same-origin`
  - typingsJapgolly.awsSdk.awsSdkStrings.`strict-origin`
  - typingsJapgolly.awsSdk.awsSdkStrings.`strict-origin-when-cross-origin`
  - typingsJapgolly.awsSdk.awsSdkStrings.`unsafe-url`
  - java.lang.String
*/
type ReferrerPolicyList = _ReferrerPolicyList | String

type ResourceARN = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GET
  - typingsJapgolly.awsSdk.awsSdkStrings.POST
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIONS
  - typingsJapgolly.awsSdk.awsSdkStrings.PUT
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.PATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.HEAD
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type ResponseHeadersPolicyAccessControlAllowMethodsValues = _ResponseHeadersPolicyAccessControlAllowMethodsValues | String

type ResponseHeadersPolicyCustomHeaderList = js.Array[ResponseHeadersPolicyCustomHeader]

type ResponseHeadersPolicySummaryList = js.Array[ResponseHeadersPolicySummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.managed_
  - typingsJapgolly.awsSdk.awsSdkStrings.custom__
  - java.lang.String
*/
type ResponseHeadersPolicyType = _ResponseHeadersPolicyType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`sni-only`
  - typingsJapgolly.awsSdk.awsSdkStrings.vip
  - typingsJapgolly.awsSdk.awsSdkStrings.`static-ip`
  - java.lang.String
*/
type SSLSupportMethod = _SSLSupportMethod | String

type SamplingRate = Double

type SignerList = js.Array[_Signer]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SSLv3
  - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1
  - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1Dot1
  - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1Dot2
  - java.lang.String
*/
type SslProtocol = _SslProtocol | String

type SslProtocolsList = js.Array[SslProtocol]

type StatusCodeList = js.Array[integer]

type StreamingDistributionSummaryList = js.Array[StreamingDistributionSummary]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TrustedKeyGroupIdList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`allow-all`
  - typingsJapgolly.awsSdk.awsSdkStrings.`https-only`
  - typingsJapgolly.awsSdk.awsSdkStrings.`redirect-to-https`
  - java.lang.String
*/
type ViewerProtocolPolicy = _ViewerProtocolPolicy | String

type aliasString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2013-05-12`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2013-11-11`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-05-31`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-10-21`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-11-06`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2015-04-17`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2015-07-27`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2015-09-17`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-01-13`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-01-28`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-08-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-08-20`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-09-07`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-09-29`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-11-25`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-03-25`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-10-30`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-06-18`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-11-05`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-03-26`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-05-31`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type distributionIdString = String

type integer = Double

type listConflictingAliasesMaxItemsInteger = Double

type long = Double

type sensitiveStringType = String

type timestamp = js.Date
