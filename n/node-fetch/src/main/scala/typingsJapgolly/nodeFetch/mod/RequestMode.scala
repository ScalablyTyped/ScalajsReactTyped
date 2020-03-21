package typingsJapgolly.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeFetch.nodeFetchStrings.cors
  - typingsJapgolly.nodeFetch.nodeFetchStrings.`no-cors`
  - typingsJapgolly.nodeFetch.nodeFetchStrings.`same-origin`
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typingsJapgolly.nodeFetch.nodeFetchStrings.cors = this.cast("cors")
  @scala.inline
  def `no-cors`: typingsJapgolly.nodeFetch.nodeFetchStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typingsJapgolly.nodeFetch.nodeFetchStrings.`same-origin` = this.cast("same-origin")
}

