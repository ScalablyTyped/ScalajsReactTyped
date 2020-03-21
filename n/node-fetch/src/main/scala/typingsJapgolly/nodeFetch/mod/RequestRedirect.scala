package typingsJapgolly.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeFetch.nodeFetchStrings.error
  - typingsJapgolly.nodeFetch.nodeFetchStrings.follow
  - typingsJapgolly.nodeFetch.nodeFetchStrings.manual
*/
trait RequestRedirect extends js.Object

object RequestRedirect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.nodeFetch.nodeFetchStrings.error = this.cast("error")
  @scala.inline
  def follow: typingsJapgolly.nodeFetch.nodeFetchStrings.follow = this.cast("follow")
  @scala.inline
  def manual: typingsJapgolly.nodeFetch.nodeFetchStrings.manual = this.cast("manual")
}

