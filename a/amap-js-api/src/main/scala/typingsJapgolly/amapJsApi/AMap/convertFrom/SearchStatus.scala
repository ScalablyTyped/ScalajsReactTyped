package typingsJapgolly.amapJsApi.AMap.convertFrom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApi.amapJsApiStrings.complete
  - typingsJapgolly.amapJsApi.amapJsApiStrings.error
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.amapJsApi.amapJsApiStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsJapgolly.amapJsApi.amapJsApiStrings.error = this.cast("error")
}

