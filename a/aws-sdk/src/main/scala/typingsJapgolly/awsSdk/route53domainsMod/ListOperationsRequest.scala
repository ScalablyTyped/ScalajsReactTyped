package typingsJapgolly.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOperationsRequest extends js.Object {
  /**
    * For an initial request for a list of operations, omit this element. If the number of operations that are not yet complete is greater than the value that you specified for MaxItems, you can use Marker to return additional operations. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  /**
    * Number of domains to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * An optional parameter that lets you get information about all the operations that you submitted after a specified date and time. Specify the date and time in Coordinated Universal time (UTC).
    */
  var SubmittedSince: js.UndefOr[js.Date] = js.native
}

object ListOperationsRequest {
  @scala.inline
  def apply(Marker: PageMarker = null, MaxItems: Int | Double = null, SubmittedSince: js.Date = null): ListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    if (SubmittedSince != null) __obj.updateDynamic("SubmittedSince")(SubmittedSince.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOperationsRequest]
  }
}

