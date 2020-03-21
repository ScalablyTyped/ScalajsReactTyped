package typingsJapgolly.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeFetch.nodeFetchStrings.omit
  - typingsJapgolly.nodeFetch.nodeFetchStrings.include
  - typingsJapgolly.nodeFetch.nodeFetchStrings.`same-origin`
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typingsJapgolly.nodeFetch.nodeFetchStrings.include = this.cast("include")
  @scala.inline
  def omit: typingsJapgolly.nodeFetch.nodeFetchStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typingsJapgolly.nodeFetch.nodeFetchStrings.`same-origin` = this.cast("same-origin")
}

