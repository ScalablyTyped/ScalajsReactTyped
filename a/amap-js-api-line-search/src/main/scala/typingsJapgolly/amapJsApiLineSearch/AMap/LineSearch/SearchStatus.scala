package typingsJapgolly.amapJsApiLineSearch.AMap.LineSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete
  - typingsJapgolly.amapJsApiLineSearch.amapJsApiLineSearchStrings.error
  - typingsJapgolly.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsJapgolly.amapJsApiLineSearch.amapJsApiLineSearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsJapgolly.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data = this.cast("no_data")
}

