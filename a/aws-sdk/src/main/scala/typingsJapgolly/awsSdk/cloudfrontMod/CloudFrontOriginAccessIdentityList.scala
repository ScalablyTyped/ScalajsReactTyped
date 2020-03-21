package typingsJapgolly.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontOriginAccessIdentityList extends js.Object {
  /**
    * A flag that indicates whether more origin access identities remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more items in the list.
    */
  var IsTruncated: Boolean = js.native
  /**
    * A complex type that contains one CloudFrontOriginAccessIdentitySummary element for each origin access identity that was created by the current AWS account.
    */
  var Items: js.UndefOr[CloudFrontOriginAccessIdentitySummaryList] = js.native
  /**
    * Use this when paginating results to indicate where to begin in your list of origin access identities. The results include identities in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last identity on that page). 
    */
  var Marker: String = js.native
  /**
    * The maximum number of origin access identities you want in the response body. 
    */
  var MaxItems: integer = js.native
  /**
    * If IsTruncated is true, this element is present and contains the value you can use for the Marker request parameter to continue listing your origin access identities where they left off. 
    */
  var NextMarker: js.UndefOr[String] = js.native
  /**
    * The number of CloudFront origin access identities that were created by the current AWS account. 
    */
  var Quantity: integer = js.native
}

object CloudFrontOriginAccessIdentityList {
  @scala.inline
  def apply(
    IsTruncated: Boolean,
    Marker: String,
    MaxItems: integer,
    Quantity: integer,
    Items: CloudFrontOriginAccessIdentitySummaryList = null,
    NextMarker: String = null
  ): CloudFrontOriginAccessIdentityList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontOriginAccessIdentityList]
  }
}

