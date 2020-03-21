package typingsJapgolly.reactAdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactAdal.reactAdalStrings.LOGIN
  - typingsJapgolly.reactAdal.reactAdalStrings.RENEW_TOKEN
  - typingsJapgolly.reactAdal.reactAdalStrings.UNKNOWN
*/
trait RequestType extends js.Object

object RequestType {
  @scala.inline
  def LOGIN: typingsJapgolly.reactAdal.reactAdalStrings.LOGIN = this.cast("LOGIN")
  @scala.inline
  def RENEW_TOKEN: typingsJapgolly.reactAdal.reactAdalStrings.RENEW_TOKEN = this.cast("RENEW_TOKEN")
  @scala.inline
  def UNKNOWN: typingsJapgolly.reactAdal.reactAdalStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

