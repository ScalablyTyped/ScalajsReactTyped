package typingsJapgolly.leafletGeosearch

import typingsJapgolly.leafletGeosearch.leafletGeosearchStrings.node
import typingsJapgolly.leafletGeosearch.leafletGeosearchStrings.relation
import typingsJapgolly.leafletGeosearch.leafletGeosearchStrings.way
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOsmid extends js.Object {
  var osm_id: js.UndefOr[Double] = js.undefined
  var osm_type: js.UndefOr[node | way | relation] = js.undefined
}

object AnonOsmid {
  @scala.inline
  def apply(osm_id: Int | Double = null, osm_type: node | way | relation = null): AnonOsmid = {
    val __obj = js.Dynamic.literal()
    if (osm_id != null) __obj.updateDynamic("osm_id")(osm_id.asInstanceOf[js.Any])
    if (osm_type != null) __obj.updateDynamic("osm_type")(osm_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOsmid]
  }
}

