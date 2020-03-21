package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceInput extends js.Object {
  /**
    * Specifies that the list of tags returned be limited to the specified number of items.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  /**
    * An opaque string that indicates the position at which to begin returning the list of tags.
    */
  var Marker: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource for which you want to list tags.
    */
  var ResourceARN: typingsJapgolly.awsSdk.storagegatewayMod.ResourceARN = js.native
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, Limit: Int | Double = null, Marker: Marker = null): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

