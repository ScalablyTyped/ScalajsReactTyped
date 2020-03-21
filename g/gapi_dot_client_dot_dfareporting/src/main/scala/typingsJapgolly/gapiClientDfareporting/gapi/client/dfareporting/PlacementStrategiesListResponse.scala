package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementStrategiesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementStrategiesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Placement strategy collection. */
  var placementStrategies: js.UndefOr[js.Array[PlacementStrategy]] = js.undefined
}

object PlacementStrategiesListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    placementStrategies: js.Array[PlacementStrategy] = null
  ): PlacementStrategiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (placementStrategies != null) __obj.updateDynamic("placementStrategies")(placementStrategies.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementStrategiesListResponse]
  }
}

