package typingsJapgolly.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.k6.k6Strings.binary
  - typingsJapgolly.k6.k6Strings.none
  - typingsJapgolly.k6.k6Strings.text
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def binary: typingsJapgolly.k6.k6Strings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.k6.k6Strings.none = this.cast("none")
  @scala.inline
  def text: typingsJapgolly.k6.k6Strings.text = this.cast("text")
}

