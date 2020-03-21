package typingsJapgolly.documentdb.mod

import typingsJapgolly.documentdb.documentdbStrings.post_
import typingsJapgolly.documentdb.documentdbStrings.pre_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.documentdb.documentdbStrings.Pre
  - typingsJapgolly.documentdb.documentdbStrings.Post
  - typingsJapgolly.documentdb.documentdbStrings.pre_
  - typingsJapgolly.documentdb.documentdbStrings.post_
*/
trait TriggerType extends js.Object

object TriggerType {
  @scala.inline
  def Post: typingsJapgolly.documentdb.documentdbStrings.Post = this.cast("Post")
  @scala.inline
  def Pre: typingsJapgolly.documentdb.documentdbStrings.Pre = this.cast("Pre")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def post: post_ = this.cast("post")
  @scala.inline
  def pre: pre_ = this.cast("pre")
}

