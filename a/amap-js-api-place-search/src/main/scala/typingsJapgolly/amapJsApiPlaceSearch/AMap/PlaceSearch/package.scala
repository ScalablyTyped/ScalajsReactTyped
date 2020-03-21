package typingsJapgolly.amapJsApiPlaceSearch.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PlaceSearch {
  type Poi = typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiBase | typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
  type PoiExt = typingsJapgolly.amapJsApiPlaceSearch.AnonAdcode with typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiBase with (typingsJapgolly.amapJsApiPlaceSearch.AnonIndoordata | typingsJapgolly.amapJsApiPlaceSearch.AnonIndoormap) with (typingsJapgolly.amapJsApiPlaceSearch.AnonCinema | typingsJapgolly.amapJsApiPlaceSearch.AnonDeeptype | typingsJapgolly.amapJsApiPlaceSearch.AnonScenic | typingsJapgolly.amapJsApiPlaceSearch.AnonHotel)
  type SelectChangeEvent[N /* <: java.lang.String */, E] = typingsJapgolly.amapJsApi.AMap.Event_[
    N, 
    typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData with typingsJapgolly.amapJsApiPlaceSearch.AnonEvent[E]
  ]
}
