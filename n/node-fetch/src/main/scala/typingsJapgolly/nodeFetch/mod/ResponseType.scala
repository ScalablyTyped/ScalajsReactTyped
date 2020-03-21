package typingsJapgolly.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeFetch.nodeFetchStrings.basic
  - typingsJapgolly.nodeFetch.nodeFetchStrings.cors
  - typingsJapgolly.nodeFetch.nodeFetchStrings.default
  - typingsJapgolly.nodeFetch.nodeFetchStrings.error
  - typingsJapgolly.nodeFetch.nodeFetchStrings.opaque
  - typingsJapgolly.nodeFetch.nodeFetchStrings.opaqueredirect
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def basic: typingsJapgolly.nodeFetch.nodeFetchStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typingsJapgolly.nodeFetch.nodeFetchStrings.cors = this.cast("cors")
  @scala.inline
  def default: typingsJapgolly.nodeFetch.nodeFetchStrings.default = this.cast("default")
  @scala.inline
  def error: typingsJapgolly.nodeFetch.nodeFetchStrings.error = this.cast("error")
  @scala.inline
  def opaque: typingsJapgolly.nodeFetch.nodeFetchStrings.opaque = this.cast("opaque")
  @scala.inline
  def opaqueredirect: typingsJapgolly.nodeFetch.nodeFetchStrings.opaqueredirect = this.cast("opaqueredirect")
}

