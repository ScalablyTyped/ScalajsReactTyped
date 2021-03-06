package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.jwk
  - typingsJapgolly.std.stdStrings.pkcs8
  - typingsJapgolly.std.stdStrings.raw
  - typingsJapgolly.std.stdStrings.spki
*/
trait KeyFormat extends js.Object

object KeyFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jwk: typingsJapgolly.std.stdStrings.jwk = this.cast("jwk")
  @scala.inline
  def pkcs8: typingsJapgolly.std.stdStrings.pkcs8 = this.cast("pkcs8")
  @scala.inline
  def raw: typingsJapgolly.std.stdStrings.raw = this.cast("raw")
  @scala.inline
  def spki: typingsJapgolly.std.stdStrings.spki = this.cast("spki")
}

