package typingsJapgolly.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.alexaSdk.alexaSdkStrings.INVALID_RESPONSE
  - typingsJapgolly.alexaSdk.alexaSdkStrings.DEVICE_COMMUNICATION_ERROR
  - typingsJapgolly.alexaSdk.alexaSdkStrings.INTERNAL_ERROR
*/
trait SystemErrorType extends js.Object

object SystemErrorType {
  @scala.inline
  def DEVICE_COMMUNICATION_ERROR: typingsJapgolly.alexaSdk.alexaSdkStrings.DEVICE_COMMUNICATION_ERROR = this.cast("DEVICE_COMMUNICATION_ERROR")
  @scala.inline
  def INTERNAL_ERROR: typingsJapgolly.alexaSdk.alexaSdkStrings.INTERNAL_ERROR = this.cast("INTERNAL_ERROR")
  @scala.inline
  def INVALID_RESPONSE: typingsJapgolly.alexaSdk.alexaSdkStrings.INVALID_RESPONSE = this.cast("INVALID_RESPONSE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

