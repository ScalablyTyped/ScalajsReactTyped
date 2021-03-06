package typingsJapgolly.amapJsApiTransfer.AMap.Transfer

import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiTransfer.AMap.Transfer.SearchResultBase
  - typingsJapgolly.amapJsApiTransfer.AMap.Transfer.SearchResultExt
*/
trait SearchResult extends js.Object

object SearchResult {
  @scala.inline
  def SearchResultBase(
    destination: LngLat,
    info: String,
    origin: LngLat,
    plans: js.Array[TransferPlan],
    taxi_cost: Double,
    end: Poi = null,
    start: Poi = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  def SearchResultExt(
    destination: LngLat,
    destinationName: String,
    end: PoiExt,
    info: String,
    origin: LngLat,
    originName: String,
    plans: js.Array[TransferPlan],
    start: PoiExt,
    taxi_cost: Double
  ): SearchResult = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
}

