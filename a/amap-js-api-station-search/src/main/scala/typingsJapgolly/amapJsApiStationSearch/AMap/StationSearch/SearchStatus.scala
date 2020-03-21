package typingsJapgolly.amapJsApiStationSearch.AMap.StationSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete
  - typingsJapgolly.amapJsApiStationSearch.amapJsApiStationSearchStrings.error
  - typingsJapgolly.amapJsApiStationSearch.amapJsApiStationSearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsJapgolly.amapJsApiStationSearch.amapJsApiStationSearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsJapgolly.amapJsApiStationSearch.amapJsApiStationSearchStrings.no_data = this.cast("no_data")
}

