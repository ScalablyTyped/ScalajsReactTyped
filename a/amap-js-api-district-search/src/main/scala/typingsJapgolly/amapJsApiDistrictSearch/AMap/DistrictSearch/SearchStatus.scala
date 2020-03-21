package typingsJapgolly.amapJsApiDistrictSearch.AMap.DistrictSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete
  - typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error
  - typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data = this.cast("no_data")
}

