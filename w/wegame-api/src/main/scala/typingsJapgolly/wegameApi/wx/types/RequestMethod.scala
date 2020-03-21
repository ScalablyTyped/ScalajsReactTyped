package typingsJapgolly.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wegameApi.wegameApiStrings.GET
  - typingsJapgolly.wegameApi.wegameApiStrings.HEAD
  - typingsJapgolly.wegameApi.wegameApiStrings.POST
  - typingsJapgolly.wegameApi.wegameApiStrings.PUT
  - typingsJapgolly.wegameApi.wegameApiStrings.DELETE
  - typingsJapgolly.wegameApi.wegameApiStrings.TRACE
  - typingsJapgolly.wegameApi.wegameApiStrings.CONNECT
*/
trait RequestMethod extends js.Object

object RequestMethod {
  @scala.inline
  def CONNECT: typingsJapgolly.wegameApi.wegameApiStrings.CONNECT = this.cast("CONNECT")
  @scala.inline
  def DELETE: typingsJapgolly.wegameApi.wegameApiStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.wegameApi.wegameApiStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsJapgolly.wegameApi.wegameApiStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def POST: typingsJapgolly.wegameApi.wegameApiStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.wegameApi.wegameApiStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typingsJapgolly.wegameApi.wegameApiStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

