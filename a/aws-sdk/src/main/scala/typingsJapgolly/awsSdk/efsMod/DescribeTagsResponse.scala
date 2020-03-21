package typingsJapgolly.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsResponse extends js.Object {
  /**
    * If the request included a Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typingsJapgolly.awsSdk.efsMod.Marker] = js.native
  /**
    * If a value is present, there are more tags to return. In a subsequent request, you can provide the value of NextMarker as the value of the Marker parameter in your next request to retrieve the next set of tags.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  /**
    * Returns tags associated with the file system as an array of Tag objects. 
    */
  var Tags: typingsJapgolly.awsSdk.efsMod.Tags = js.native
}

object DescribeTagsResponse {
  @scala.inline
  def apply(Tags: Tags, Marker: Marker = null, NextMarker: Marker = null): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsResponse]
  }
}

