package typingsJapgolly.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExchangedPeeringRoute extends js.Object {
  /**
    * The destination range of the route.
    */
  var destRange: js.UndefOr[String] = js.native
  /**
    * If the peering route is imported if there is no confliction.
    */
  var imported: js.UndefOr[Boolean] = js.native
  /**
    * The region of peering route next hop, only applies to dynamic routes.
    */
  var nextHopRegion: js.UndefOr[String] = js.native
  /**
    * The priority of the peering route.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * The type of the peering route.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaExchangedPeeringRoute {
  @scala.inline
  def apply(
    destRange: String = null,
    imported: js.UndefOr[Boolean] = js.undefined,
    nextHopRegion: String = null,
    priority: Int | Double = null,
    `type`: String = null
  ): SchemaExchangedPeeringRoute = {
    val __obj = js.Dynamic.literal()
    if (destRange != null) __obj.updateDynamic("destRange")(destRange.asInstanceOf[js.Any])
    if (!js.isUndefined(imported)) __obj.updateDynamic("imported")(imported.asInstanceOf[js.Any])
    if (nextHopRegion != null) __obj.updateDynamic("nextHopRegion")(nextHopRegion.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExchangedPeeringRoute]
  }
}

