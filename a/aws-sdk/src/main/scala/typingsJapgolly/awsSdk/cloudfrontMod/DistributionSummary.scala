package typingsJapgolly.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionSummary extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  var ARN: String = js.native
  /**
    * AWS services in China customers must file for an Internet Content Provider (ICP) recordal if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions. For more information about ICP recordals, see  Signup, Accounts, and Credentials in Getting Started with AWS services in China.
    */
  var AliasICPRecordals: js.UndefOr[typingsJapgolly.awsSdk.cloudfrontMod.AliasICPRecordals] = js.native
  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
    */
  var Aliases: typingsJapgolly.awsSdk.cloudfrontMod.Aliases = js.native
  /**
    * A complex type that contains zero or more CacheBehavior elements.
    */
  var CacheBehaviors: typingsJapgolly.awsSdk.cloudfrontMod.CacheBehaviors = js.native
  /**
    * The comment originally specified when this distribution was created.
    */
  var Comment: String = js.native
  /**
    * A complex type that contains zero or more CustomErrorResponses elements.
    */
  var CustomErrorResponses: typingsJapgolly.awsSdk.cloudfrontMod.CustomErrorResponses = js.native
  /**
    * A complex type that describes the default cache behavior if you don't specify a CacheBehavior element or if files don't match any of the values of PathPattern in CacheBehavior elements. You must create exactly one default cache behavior.
    */
  var DefaultCacheBehavior: typingsJapgolly.awsSdk.cloudfrontMod.DefaultCacheBehavior = js.native
  /**
    * The domain name that corresponds to the distribution, for example, d111111abcdef8.cloudfront.net.
    */
  var DomainName: String = js.native
  /**
    * Whether the distribution is enabled to accept user requests for content.
    */
  var Enabled: Boolean = js.native
  /**
    *  Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value for new web distributions is http2. Viewers that don't support HTTP/2 will automatically use an earlier version.
    */
  var HttpVersion: typingsJapgolly.awsSdk.cloudfrontMod.HttpVersion = js.native
  /**
    * The identifier for the distribution. For example: EDFDVBD632BHDS5.
    */
  var Id: String = js.native
  /**
    * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
    */
  var IsIPV6Enabled: Boolean = js.native
  /**
    * The date and time the distribution was last modified.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    *  A complex type that contains information about origin groups for this distribution.
    */
  var OriginGroups: js.UndefOr[typingsJapgolly.awsSdk.cloudfrontMod.OriginGroups] = js.native
  /**
    * A complex type that contains information about origins for this distribution.
    */
  var Origins: typingsJapgolly.awsSdk.cloudfrontMod.Origins = js.native
  /**
    * A complex type that contains information about price class for this streaming distribution. 
    */
  var PriceClass: typingsJapgolly.awsSdk.cloudfrontMod.PriceClass = js.native
  /**
    * A complex type that identifies ways in which you want to restrict distribution of your content.
    */
  var Restrictions: typingsJapgolly.awsSdk.cloudfrontMod.Restrictions = js.native
  /**
    * The current status of the distribution. When the status is Deployed, the distribution's information is propagated to all CloudFront edge locations.
    */
  var Status: String = js.native
  /**
    * A complex type that determines the distribution’s SSL/TLS configuration for communicating with viewers.
    */
  var ViewerCertificate: typingsJapgolly.awsSdk.cloudfrontMod.ViewerCertificate = js.native
  /**
    * The Web ACL Id (if any) associated with the distribution.
    */
  var WebACLId: String = js.native
}

object DistributionSummary {
  @scala.inline
  def apply(
    ARN: String,
    Aliases: Aliases,
    CacheBehaviors: CacheBehaviors,
    Comment: String,
    CustomErrorResponses: CustomErrorResponses,
    DefaultCacheBehavior: DefaultCacheBehavior,
    DomainName: String,
    Enabled: Boolean,
    HttpVersion: HttpVersion,
    Id: String,
    IsIPV6Enabled: Boolean,
    LastModifiedTime: js.Date,
    Origins: Origins,
    PriceClass: PriceClass,
    Restrictions: Restrictions,
    Status: String,
    ViewerCertificate: ViewerCertificate,
    WebACLId: String,
    AliasICPRecordals: AliasICPRecordals = null,
    OriginGroups: OriginGroups = null
  ): DistributionSummary = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], Aliases = Aliases.asInstanceOf[js.Any], CacheBehaviors = CacheBehaviors.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], CustomErrorResponses = CustomErrorResponses.asInstanceOf[js.Any], DefaultCacheBehavior = DefaultCacheBehavior.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], HttpVersion = HttpVersion.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IsIPV6Enabled = IsIPV6Enabled.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Origins = Origins.asInstanceOf[js.Any], PriceClass = PriceClass.asInstanceOf[js.Any], Restrictions = Restrictions.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], ViewerCertificate = ViewerCertificate.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    if (AliasICPRecordals != null) __obj.updateDynamic("AliasICPRecordals")(AliasICPRecordals.asInstanceOf[js.Any])
    if (OriginGroups != null) __obj.updateDynamic("OriginGroups")(OriginGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionSummary]
  }
}

