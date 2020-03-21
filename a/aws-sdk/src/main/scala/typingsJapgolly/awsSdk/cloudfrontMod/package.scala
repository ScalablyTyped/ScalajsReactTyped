package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudfrontMod {
  type AliasICPRecordals = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.AliasICPRecordal]
  type AliasList = js.Array[java.lang.String]
  type AwsAccountNumberList = js.Array[java.lang.String]
  type CacheBehaviorList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.CacheBehavior]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.cloudfront_
    - typingsJapgolly.awsSdk.awsSdkStrings.iam_
    - typingsJapgolly.awsSdk.awsSdkStrings.acm
    - java.lang.String
  */
  type CertificateSource = typingsJapgolly.awsSdk.cloudfrontMod._CertificateSource | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cloudfrontMod.ClientApiVersions
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentitySummary]
  type CommentType = java.lang.String
  type ContentTypeProfileList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.ContentTypeProfile]
  type CookieNameList = js.Array[java.lang.String]
  type CustomErrorResponseList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.CustomErrorResponse]
  type DistributionSummaryList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.DistributionSummary]
  type EncryptionEntityList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.EncryptionEntity]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`viewer-request`
    - typingsJapgolly.awsSdk.awsSdkStrings.`viewer-response`
    - typingsJapgolly.awsSdk.awsSdkStrings.`origin-request`
    - typingsJapgolly.awsSdk.awsSdkStrings.`origin-response`
    - java.lang.String
  */
  type EventType = typingsJapgolly.awsSdk.cloudfrontMod._EventType | java.lang.String
  type FieldLevelEncryptionProfileSummaryList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileSummary]
  type FieldLevelEncryptionSummaryList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.FieldLevelEncryptionSummary]
  type FieldPatternList = js.Array[java.lang.String]
  type Format = typingsJapgolly.awsSdk.awsSdkStrings.URLEncoded | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.blacklist
    - typingsJapgolly.awsSdk.awsSdkStrings.whitelist
    - typingsJapgolly.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type GeoRestrictionType = typingsJapgolly.awsSdk.cloudfrontMod._GeoRestrictionType | java.lang.String
  type HeaderList = js.Array[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.http1Dot1
    - typingsJapgolly.awsSdk.awsSdkStrings.http2
    - java.lang.String
  */
  type HttpVersion = typingsJapgolly.awsSdk.cloudfrontMod._HttpVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.APPROVED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type ICPRecordalStatus = typingsJapgolly.awsSdk.cloudfrontMod._ICPRecordalStatus | java.lang.String
  type InvalidationSummaryList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.InvalidationSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.none__
    - typingsJapgolly.awsSdk.awsSdkStrings.whitelist
    - typingsJapgolly.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type ItemSelection = typingsJapgolly.awsSdk.cloudfrontMod._ItemSelection | java.lang.String
  type KeyPairIdList = js.Array[java.lang.String]
  type LambdaFunctionARN = java.lang.String
  type LambdaFunctionAssociationList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.LambdaFunctionAssociation]
  type LocationList = js.Array[java.lang.String]
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
  type Method = typingsJapgolly.awsSdk.cloudfrontMod._Method | java.lang.String
  type MethodsList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.Method]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SSLv3
    - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1
    - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1_2016
    - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1Dot1_2016
    - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1Dot2_2018
    - java.lang.String
  */
  type MinimumProtocolVersion = typingsJapgolly.awsSdk.cloudfrontMod._MinimumProtocolVersion | java.lang.String
  type OriginCustomHeadersList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.OriginCustomHeader]
  type OriginGroupList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.OriginGroup]
  type OriginGroupMemberList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.OriginGroupMember]
  type OriginList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.Origin]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`http-only`
    - typingsJapgolly.awsSdk.awsSdkStrings.`match-viewer`
    - typingsJapgolly.awsSdk.awsSdkStrings.`https-only`
    - java.lang.String
  */
  type OriginProtocolPolicy = typingsJapgolly.awsSdk.cloudfrontMod._OriginProtocolPolicy | java.lang.String
  type PathList = js.Array[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PriceClass_100
    - typingsJapgolly.awsSdk.awsSdkStrings.PriceClass_200
    - typingsJapgolly.awsSdk.awsSdkStrings.PriceClass_All
    - java.lang.String
  */
  type PriceClass = typingsJapgolly.awsSdk.cloudfrontMod._PriceClass | java.lang.String
  type PublicKeySummaryList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.PublicKeySummary]
  type QueryArgProfileList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.QueryArgProfile]
  type QueryStringCacheKeysList = js.Array[java.lang.String]
  type ResourceARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`sni-only`
    - typingsJapgolly.awsSdk.awsSdkStrings.vip
    - java.lang.String
  */
  type SSLSupportMethod = typingsJapgolly.awsSdk.cloudfrontMod._SSLSupportMethod | java.lang.String
  type SignerList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod._Signer]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SSLv3
    - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1
    - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1Dot1
    - typingsJapgolly.awsSdk.awsSdkStrings.TLSv1Dot2
    - java.lang.String
  */
  type SslProtocol = typingsJapgolly.awsSdk.cloudfrontMod._SslProtocol | java.lang.String
  type SslProtocolsList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.SslProtocol]
  type StatusCodeList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.integer]
  type StreamingDistributionSummaryList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.StreamingDistributionSummary]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.cloudfrontMod.Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`allow-all`
    - typingsJapgolly.awsSdk.awsSdkStrings.`https-only`
    - typingsJapgolly.awsSdk.awsSdkStrings.`redirect-to-https`
    - java.lang.String
  */
  type ViewerProtocolPolicy = typingsJapgolly.awsSdk.cloudfrontMod._ViewerProtocolPolicy | java.lang.String
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
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cloudfrontMod._apiVersion | java.lang.String
  type integer = scala.Double
  type long = scala.Double
  type timestamp = js.Date
}
