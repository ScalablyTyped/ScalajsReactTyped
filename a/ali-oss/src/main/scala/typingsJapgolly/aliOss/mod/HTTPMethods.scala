package typingsJapgolly.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aliOss.aliOssStrings.GET
  - typingsJapgolly.aliOss.aliOssStrings.POST
  - typingsJapgolly.aliOss.aliOssStrings.DELETE
  - typingsJapgolly.aliOss.aliOssStrings.PUT
*/
trait HTTPMethods extends js.Object

object HTTPMethods {
  @scala.inline
  def DELETE: typingsJapgolly.aliOss.aliOssStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.aliOss.aliOssStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typingsJapgolly.aliOss.aliOssStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.aliOss.aliOssStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

