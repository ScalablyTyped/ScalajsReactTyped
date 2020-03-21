package typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentsResponseMod

import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentResponseMod.SegmentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentsResponse extends js.Object {
  /**
    * The list of segments.
    */
  var Item: js.UndefOr[js.Array[SegmentResponse] | js.Iterable[SegmentResponse]] = js.undefined
  /**
    * An identifier used to retrieve the next page of results. The token is null if no additional pages exist.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object SegmentsResponse {
  @scala.inline
  def apply(Item: js.Array[SegmentResponse] | js.Iterable[SegmentResponse] = null, NextToken: String = null): SegmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentsResponse]
  }
}

