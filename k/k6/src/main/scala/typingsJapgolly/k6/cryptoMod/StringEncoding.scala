package typingsJapgolly.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.k6.k6Strings.hex
  - typingsJapgolly.k6.k6Strings.base64
  - typingsJapgolly.k6.k6Strings.base64url
  - typingsJapgolly.k6.k6Strings.base64rawurl
*/
trait StringEncoding extends js.Object

object StringEncoding {
  @scala.inline
  def base64: typingsJapgolly.k6.k6Strings.base64 = this.cast("base64")
  @scala.inline
  def base64rawurl: typingsJapgolly.k6.k6Strings.base64rawurl = this.cast("base64rawurl")
  @scala.inline
  def base64url: typingsJapgolly.k6.k6Strings.base64url = this.cast("base64url")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsJapgolly.k6.k6Strings.hex = this.cast("hex")
}

