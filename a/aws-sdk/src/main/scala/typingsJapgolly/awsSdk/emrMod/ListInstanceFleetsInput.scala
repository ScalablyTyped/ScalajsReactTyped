package typingsJapgolly.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstanceFleetsInput extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: typingsJapgolly.awsSdk.emrMod.ClusterId = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typingsJapgolly.awsSdk.emrMod.Marker] = js.native
}

object ListInstanceFleetsInput {
  @scala.inline
  def apply(ClusterId: ClusterId, Marker: Marker = null): ListInstanceFleetsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceFleetsInput]
  }
}

