package typingsJapgolly.wordpressApiFetch.mod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.draft
  - typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.future
  - typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.pending
  - typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.`private`
  - typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.publish
*/
trait PostStatus extends js.Object

object PostStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def draft: typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.draft = this.cast("draft")
  @scala.inline
  def future: typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.future = this.cast("future")
  @scala.inline
  def pending: typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.pending = this.cast("pending")
  @scala.inline
  def `private`: typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.`private` = this.cast("private")
  @scala.inline
  def publish: typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.publish = this.cast("publish")
}

