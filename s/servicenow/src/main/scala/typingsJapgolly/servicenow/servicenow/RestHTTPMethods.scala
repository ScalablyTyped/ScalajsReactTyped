package typingsJapgolly.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.servicenow.servicenowStrings.get
  - typingsJapgolly.servicenow.servicenowStrings.post
  - typingsJapgolly.servicenow.servicenowStrings.delete
  - typingsJapgolly.servicenow.servicenowStrings.patch
  - typingsJapgolly.servicenow.servicenowStrings.put
  - typingsJapgolly.servicenow.servicenowStrings.head
  - typingsJapgolly.servicenow.servicenowStrings.options
*/
trait RestHTTPMethods extends js.Object

object RestHTTPMethods {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsJapgolly.servicenow.servicenowStrings.delete = this.cast("delete")
  @scala.inline
  def get: typingsJapgolly.servicenow.servicenowStrings.get = this.cast("get")
  @scala.inline
  def head: typingsJapgolly.servicenow.servicenowStrings.head = this.cast("head")
  @scala.inline
  def options: typingsJapgolly.servicenow.servicenowStrings.options = this.cast("options")
  @scala.inline
  def patch: typingsJapgolly.servicenow.servicenowStrings.patch = this.cast("patch")
  @scala.inline
  def post: typingsJapgolly.servicenow.servicenowStrings.post = this.cast("post")
  @scala.inline
  def put: typingsJapgolly.servicenow.servicenowStrings.put = this.cast("put")
}

