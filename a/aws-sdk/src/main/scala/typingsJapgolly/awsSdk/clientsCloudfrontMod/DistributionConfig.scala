package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionConfig extends StObject {
  
  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
    */
  var Aliases: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.Aliases] = js.undefined
  
  /**
    * A complex type that contains zero or more CacheBehavior elements. 
    */
  var CacheBehaviors: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.CacheBehaviors] = js.undefined
  
  /**
    * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed. If the value of CallerReference is new (regardless of the content of the DistributionConfig object), CloudFront creates a new distribution. If CallerReference is a value that you already sent in a previous request to create a distribution, CloudFront returns a DistributionAlreadyExists error.
    */
  var CallerReference: String
  
  /**
    * An optional comment to describe the distribution. The comment cannot be longer than 128 characters.
    */
  var Comment: CommentType
  
  /**
    * A complex type that controls the following:   Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning the response to the viewer.   How long CloudFront caches HTTP status codes in the 4xx and 5xx range.   For more information about custom error pages, see Customizing Error Responses in the Amazon CloudFront Developer Guide.
    */
  var CustomErrorResponses: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.CustomErrorResponses] = js.undefined
  
  /**
    * A complex type that describes the default cache behavior if you don't specify a CacheBehavior element or if files don't match any of the values of PathPattern in CacheBehavior elements. You must create exactly one default cache behavior.
    */
  var DefaultCacheBehavior: typingsJapgolly.awsSdk.clientsCloudfrontMod.DefaultCacheBehavior
  
  /**
    * The object that you want CloudFront to request from your origin (for example, index.html) when a viewer requests the root URL for your distribution (http://www.example.com) instead of an object in your distribution (http://www.example.com/product-description.html). Specifying a default root object avoids exposing the contents of your distribution. Specify only the object name, for example, index.html. Don't add a / before the object name. If you don't want to specify a default root object when you create a distribution, include an empty DefaultRootObject element. To delete the default root object from an existing distribution, update the distribution configuration and include an empty DefaultRootObject element. To replace the default root object, update the distribution configuration and specify the new object. For more information about the default root object, see Creating a Default Root Object in the Amazon CloudFront Developer Guide.
    */
  var DefaultRootObject: js.UndefOr[String] = js.undefined
  
  /**
    * From this field, you can enable or disable the selected distribution.
    */
  var Enabled: Boolean
  
  /**
    * (Optional) Specify the maximum HTTP version(s) that you want viewers to use to communicate with CloudFront. The default value for new web distributions is http2. Viewers that don't support HTTP/2 automatically use an earlier HTTP version. For viewers and CloudFront to use HTTP/2, viewers must support TLSv1.2 or later, and must support Server Name Indication (SNI). For viewers and CloudFront to use HTTP/3, viewers must support TLSv1.3 and Server Name Indication (SNI). CloudFront supports HTTP/3 connection migration to allow the viewer to switch networks without losing connection. For more information about connection migration, see Connection Migration at RFC 9000. For more information about supported TLSv1.3 ciphers, see Supported protocols and ciphers between viewers and CloudFront.
    */
  var HttpVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.HttpVersion] = js.undefined
  
  /**
    * If you want CloudFront to respond to IPv6 DNS requests with an IPv6 address for your distribution, specify true. If you specify false, CloudFront responds to IPv6 DNS requests with the DNS response code NOERROR and with no IP addresses. This allows viewers to submit a second request, for an IPv4 address for your distribution.  In general, you should enable IPv6 if you have users on IPv6 networks who want to access your content. However, if you're using signed URLs or signed cookies to restrict access to your content, and if you're using a custom policy that includes the IpAddress parameter to restrict the IP addresses that can access your content, don't enable IPv6. If you want to restrict access to some content by IP address and not restrict access to other content (or restrict access but not by IP address), you can create two distributions. For more information, see Creating a Signed URL Using a Custom Policy in the Amazon CloudFront Developer Guide. If you're using an Route 53 Amazon Web Services Integration alias resource record set to route traffic to your CloudFront distribution, you need to create a second alias resource record set when both of the following are true:   You enable IPv6 for the distribution   You're using alternate domain names in the URLs for your objects   For more information, see Routing Traffic to an Amazon CloudFront Web Distribution by Using Your Domain Name in the Route 53 Amazon Web Services Integration Developer Guide. If you created a CNAME resource record set, either with Route 53 Amazon Web Services Integration or with another DNS service, you don't need to make any changes. A CNAME record will route traffic to your distribution regardless of the IP address format of the viewer request.
    */
  var IsIPV6Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A complex type that controls whether access logs are written for the distribution. For more information about logging, see Access Logs in the Amazon CloudFront Developer Guide.
    */
  var Logging: js.UndefOr[LoggingConfig] = js.undefined
  
  /**
    *  A complex type that contains information about origin groups for this distribution.
    */
  var OriginGroups: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.OriginGroups] = js.undefined
  
  /**
    * A complex type that contains information about origins for this distribution. 
    */
  var Origins: typingsJapgolly.awsSdk.clientsCloudfrontMod.Origins
  
  /**
    * The price class that corresponds with the maximum price that you want to pay for CloudFront service. If you specify PriceClass_All, CloudFront responds to requests for your objects from all CloudFront edge locations. If you specify a price class other than PriceClass_All, CloudFront serves your objects from the CloudFront edge location that has the lowest latency among the edge locations in your price class. Viewers who are in or near regions that are excluded from your specified price class may encounter slower performance. For more information about price classes, see Choosing the Price Class for a CloudFront Distribution in the Amazon CloudFront Developer Guide. For information about CloudFront pricing, including how price classes (such as Price Class 100) map to CloudFront regions, see Amazon CloudFront Pricing.
    */
  var PriceClass: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.PriceClass] = js.undefined
  
  /**
    * A complex type that identifies ways in which you want to restrict distribution of your content.
    */
  var Restrictions: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.Restrictions] = js.undefined
  
  /**
    * A complex type that determines the distribution’s SSL/TLS configuration for communicating with viewers.
    */
  var ViewerCertificate: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.ViewerCertificate] = js.undefined
  
  /**
    * A unique identifier that specifies the WAF web ACL, if any, to associate with this distribution. To specify a web ACL created using the latest version of WAF, use the ACL ARN, for example arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a. To specify a web ACL created using WAF Classic, use the ACL ID, for example 473e64fd-f30b-4765-81a0-62ad96dd167a. WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests that are forwarded to CloudFront, and lets you control access to your content. Based on conditions that you specify, such as the IP addresses that requests originate from or the values of query strings, CloudFront responds to requests either with the requested content or with an HTTP 403 status code (Forbidden). You can also configure CloudFront to return a custom error page when a request is blocked. For more information about WAF, see the WAF Developer Guide. 
    */
  var WebACLId: js.UndefOr[String] = js.undefined
}
object DistributionConfig {
  
  inline def apply(
    CallerReference: String,
    Comment: CommentType,
    DefaultCacheBehavior: DefaultCacheBehavior,
    Enabled: Boolean,
    Origins: Origins
  ): DistributionConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], DefaultCacheBehavior = DefaultCacheBehavior.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Origins = Origins.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionConfig]
  }
  
  extension [Self <: DistributionConfig](x: Self) {
    
    inline def setAliases(value: Aliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    inline def setCacheBehaviors(value: CacheBehaviors): Self = StObject.set(x, "CacheBehaviors", value.asInstanceOf[js.Any])
    
    inline def setCacheBehaviorsUndefined: Self = StObject.set(x, "CacheBehaviors", js.undefined)
    
    inline def setCallerReference(value: String): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    inline def setComment(value: CommentType): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCustomErrorResponses(value: CustomErrorResponses): Self = StObject.set(x, "CustomErrorResponses", value.asInstanceOf[js.Any])
    
    inline def setCustomErrorResponsesUndefined: Self = StObject.set(x, "CustomErrorResponses", js.undefined)
    
    inline def setDefaultCacheBehavior(value: DefaultCacheBehavior): Self = StObject.set(x, "DefaultCacheBehavior", value.asInstanceOf[js.Any])
    
    inline def setDefaultRootObject(value: String): Self = StObject.set(x, "DefaultRootObject", value.asInstanceOf[js.Any])
    
    inline def setDefaultRootObjectUndefined: Self = StObject.set(x, "DefaultRootObject", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setHttpVersion(value: HttpVersion): Self = StObject.set(x, "HttpVersion", value.asInstanceOf[js.Any])
    
    inline def setHttpVersionUndefined: Self = StObject.set(x, "HttpVersion", js.undefined)
    
    inline def setIsIPV6Enabled(value: Boolean): Self = StObject.set(x, "IsIPV6Enabled", value.asInstanceOf[js.Any])
    
    inline def setIsIPV6EnabledUndefined: Self = StObject.set(x, "IsIPV6Enabled", js.undefined)
    
    inline def setLogging(value: LoggingConfig): Self = StObject.set(x, "Logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "Logging", js.undefined)
    
    inline def setOriginGroups(value: OriginGroups): Self = StObject.set(x, "OriginGroups", value.asInstanceOf[js.Any])
    
    inline def setOriginGroupsUndefined: Self = StObject.set(x, "OriginGroups", js.undefined)
    
    inline def setOrigins(value: Origins): Self = StObject.set(x, "Origins", value.asInstanceOf[js.Any])
    
    inline def setPriceClass(value: PriceClass): Self = StObject.set(x, "PriceClass", value.asInstanceOf[js.Any])
    
    inline def setPriceClassUndefined: Self = StObject.set(x, "PriceClass", js.undefined)
    
    inline def setRestrictions(value: Restrictions): Self = StObject.set(x, "Restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "Restrictions", js.undefined)
    
    inline def setViewerCertificate(value: ViewerCertificate): Self = StObject.set(x, "ViewerCertificate", value.asInstanceOf[js.Any])
    
    inline def setViewerCertificateUndefined: Self = StObject.set(x, "ViewerCertificate", js.undefined)
    
    inline def setWebACLId(value: String): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
    
    inline def setWebACLIdUndefined: Self = StObject.set(x, "WebACLId", js.undefined)
  }
}
