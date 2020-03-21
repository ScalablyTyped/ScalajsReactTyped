package typingsJapgolly.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.k6.k6Strings.basic
  - typingsJapgolly.k6.k6Strings.digest
  - typingsJapgolly.k6.k6Strings.ntlm
*/
trait AuthMethod extends js.Object

object AuthMethod {
  @scala.inline
  def basic: typingsJapgolly.k6.k6Strings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def digest: typingsJapgolly.k6.k6Strings.digest = this.cast("digest")
  @scala.inline
  def ntlm: typingsJapgolly.k6.k6Strings.ntlm = this.cast("ntlm")
}

