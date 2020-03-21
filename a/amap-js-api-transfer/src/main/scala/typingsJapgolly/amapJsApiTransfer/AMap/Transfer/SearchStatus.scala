package typingsJapgolly.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.complete
  - typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.error
  - typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.no_data = this.cast("no_data")
}

