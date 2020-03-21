package typingsJapgolly.k6.encodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.k6.k6Strings.std
  - typingsJapgolly.k6.k6Strings.rawstd
  - typingsJapgolly.k6.k6Strings.url
  - typingsJapgolly.k6.k6Strings.rawurl
*/
trait Base64Variant extends js.Object

object Base64Variant {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rawstd: typingsJapgolly.k6.k6Strings.rawstd = this.cast("rawstd")
  @scala.inline
  def rawurl: typingsJapgolly.k6.k6Strings.rawurl = this.cast("rawurl")
  @scala.inline
  def std: typingsJapgolly.k6.k6Strings.std = this.cast("std")
  @scala.inline
  def url: typingsJapgolly.k6.k6Strings.url = this.cast("url")
}

