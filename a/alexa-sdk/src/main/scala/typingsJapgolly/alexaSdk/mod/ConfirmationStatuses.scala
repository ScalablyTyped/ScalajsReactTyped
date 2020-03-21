package typingsJapgolly.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.alexaSdk.alexaSdkStrings.NONE
  - typingsJapgolly.alexaSdk.alexaSdkStrings.DENIED
  - typingsJapgolly.alexaSdk.alexaSdkStrings.CONFIRMED
*/
trait ConfirmationStatuses extends js.Object

object ConfirmationStatuses {
  @scala.inline
  def CONFIRMED: typingsJapgolly.alexaSdk.alexaSdkStrings.CONFIRMED = this.cast("CONFIRMED")
  @scala.inline
  def DENIED: typingsJapgolly.alexaSdk.alexaSdkStrings.DENIED = this.cast("DENIED")
  @scala.inline
  def NONE: typingsJapgolly.alexaSdk.alexaSdkStrings.NONE = this.cast("NONE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

