package typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete
  - typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error
  - typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data = this.cast("no_data")
}

