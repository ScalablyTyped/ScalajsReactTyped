package typingsJapgolly.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDiscovererResponse extends js.Object {
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.native
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.native
}

object StartDiscovererResponse {
  @scala.inline
  def apply(DiscovererId: string = null, State: DiscovererState = null): StartDiscovererResponse = {
    val __obj = js.Dynamic.literal()
    if (DiscovererId != null) __obj.updateDynamic("DiscovererId")(DiscovererId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDiscovererResponse]
  }
}

