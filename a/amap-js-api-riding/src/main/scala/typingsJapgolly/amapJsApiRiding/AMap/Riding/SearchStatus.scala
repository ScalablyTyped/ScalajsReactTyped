package typingsJapgolly.amapJsApiRiding.AMap.Riding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.complete
  - typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.error
  - typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.no_data = this.cast("no_data")
}

