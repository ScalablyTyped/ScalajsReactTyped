package typingsJapgolly.googlemaps.google.maps.places

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceSearchPagination extends js.Object {
  var hasNextPage: Boolean
  def nextPage(): Unit
}

object PlaceSearchPagination {
  @scala.inline
  def apply(hasNextPage: Boolean, nextPage: Callback): PlaceSearchPagination = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any])
    __obj.updateDynamic("nextPage")(nextPage.toJsFn)
    __obj.asInstanceOf[PlaceSearchPagination]
  }
}

