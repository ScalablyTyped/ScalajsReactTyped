package typingsJapgolly.swPrecache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swPrecache.swPrecacheStrings.get
  - typingsJapgolly.swPrecache.swPrecacheStrings.post
  - typingsJapgolly.swPrecache.swPrecacheStrings.put
  - typingsJapgolly.swPrecache.swPrecacheStrings.delete
  - typingsJapgolly.swPrecache.swPrecacheStrings.head
*/
trait Method extends js.Object

object Method {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsJapgolly.swPrecache.swPrecacheStrings.delete = this.cast("delete")
  @scala.inline
  def get: typingsJapgolly.swPrecache.swPrecacheStrings.get = this.cast("get")
  @scala.inline
  def head: typingsJapgolly.swPrecache.swPrecacheStrings.head = this.cast("head")
  @scala.inline
  def post: typingsJapgolly.swPrecache.swPrecacheStrings.post = this.cast("post")
  @scala.inline
  def put: typingsJapgolly.swPrecache.swPrecacheStrings.put = this.cast("put")
}

