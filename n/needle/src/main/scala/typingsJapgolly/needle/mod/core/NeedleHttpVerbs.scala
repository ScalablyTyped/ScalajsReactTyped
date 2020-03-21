package typingsJapgolly.needle.mod.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.needle.needleStrings.get
  - typingsJapgolly.needle.needleStrings.head
  - typingsJapgolly.needle.needleStrings.delete
  - typingsJapgolly.needle.needleStrings.patch
  - typingsJapgolly.needle.needleStrings.post
  - typingsJapgolly.needle.needleStrings.put
*/
trait NeedleHttpVerbs extends js.Object

object NeedleHttpVerbs {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsJapgolly.needle.needleStrings.delete = this.cast("delete")
  @scala.inline
  def get: typingsJapgolly.needle.needleStrings.get = this.cast("get")
  @scala.inline
  def head: typingsJapgolly.needle.needleStrings.head = this.cast("head")
  @scala.inline
  def patch: typingsJapgolly.needle.needleStrings.patch = this.cast("patch")
  @scala.inline
  def post: typingsJapgolly.needle.needleStrings.post = this.cast("post")
  @scala.inline
  def put: typingsJapgolly.needle.needleStrings.put = this.cast("put")
}

