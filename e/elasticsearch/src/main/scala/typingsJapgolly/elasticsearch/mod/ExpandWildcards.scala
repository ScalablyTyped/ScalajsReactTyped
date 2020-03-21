package typingsJapgolly.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticsearch.elasticsearchStrings.open
  - typingsJapgolly.elasticsearch.elasticsearchStrings.closed
  - typingsJapgolly.elasticsearch.elasticsearchStrings.none
  - typingsJapgolly.elasticsearch.elasticsearchStrings.all
*/
trait ExpandWildcards extends js.Object

object ExpandWildcards {
  @scala.inline
  def all: typingsJapgolly.elasticsearch.elasticsearchStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.elasticsearch.elasticsearchStrings.closed = this.cast("closed")
  @scala.inline
  def none: typingsJapgolly.elasticsearch.elasticsearchStrings.none = this.cast("none")
  @scala.inline
  def open: typingsJapgolly.elasticsearch.elasticsearchStrings.open = this.cast("open")
}

