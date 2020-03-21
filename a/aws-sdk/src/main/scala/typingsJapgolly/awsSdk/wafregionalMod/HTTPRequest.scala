package typingsJapgolly.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPRequest extends js.Object {
  /**
    * The IP address that the request originated from. If the WebACL is associated with a CloudFront distribution, this is the value of one of the following fields in CloudFront access logs:    c-ip, if the viewer did not use an HTTP proxy or a load balancer to send the request    x-forwarded-for, if the viewer did use an HTTP proxy or a load balancer to send the request  
    */
  var ClientIP: js.UndefOr[IPString] = js.native
  /**
    * The two-letter country code for the country that the request originated from. For a current list of country codes, see the Wikipedia entry ISO 3166-1 alpha-2.
    */
  var Country: js.UndefOr[typingsJapgolly.awsSdk.wafregionalMod.Country] = js.native
  /**
    * The HTTP version specified in the sampled web request, for example, HTTP/1.1.
    */
  var HTTPVersion: js.UndefOr[typingsJapgolly.awsSdk.wafregionalMod.HTTPVersion] = js.native
  /**
    * A complex type that contains two values for each header in the sampled web request: the name of the header and the value of the header.
    */
  var Headers: js.UndefOr[HTTPHeaders] = js.native
  /**
    * The HTTP method specified in the sampled web request. CloudFront supports the following methods: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT. 
    */
  var Method: js.UndefOr[HTTPMethod] = js.native
  /**
    * The part of a web request that identifies the resource, for example, /images/daily-ad.jpg.
    */
  var URI: js.UndefOr[URIString] = js.native
}

object HTTPRequest {
  @scala.inline
  def apply(
    ClientIP: IPString = null,
    Country: Country = null,
    HTTPVersion: HTTPVersion = null,
    Headers: HTTPHeaders = null,
    Method: HTTPMethod = null,
    URI: URIString = null
  ): HTTPRequest = {
    val __obj = js.Dynamic.literal()
    if (ClientIP != null) __obj.updateDynamic("ClientIP")(ClientIP.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (HTTPVersion != null) __obj.updateDynamic("HTTPVersion")(HTTPVersion.asInstanceOf[js.Any])
    if (Headers != null) __obj.updateDynamic("Headers")(Headers.asInstanceOf[js.Any])
    if (Method != null) __obj.updateDynamic("Method")(Method.asInstanceOf[js.Any])
    if (URI != null) __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPRequest]
  }
}

