package typingsJapgolly.amapJsApiCitySearch.AMap.CitySearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiCitySearch.amapJsApiCitySearchStrings.error
  - typingsJapgolly.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete
  - typingsJapgolly.amapJsApiCitySearch.amapJsApiCitySearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsJapgolly.amapJsApiCitySearch.amapJsApiCitySearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsJapgolly.amapJsApiCitySearch.amapJsApiCitySearchStrings.no_data = this.cast("no_data")
}

