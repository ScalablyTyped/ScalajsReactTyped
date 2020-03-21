package typingsJapgolly.urllib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.urllib.urllibStrings.GET
  - typingsJapgolly.urllib.urllibStrings.POST
  - typingsJapgolly.urllib.urllibStrings.DELETE
  - typingsJapgolly.urllib.urllibStrings.PUT
  - typingsJapgolly.urllib.urllibStrings.HEAD
  - typingsJapgolly.urllib.urllibStrings.OPTIONS
  - typingsJapgolly.urllib.urllibStrings.PATCH
  - typingsJapgolly.urllib.urllibStrings.TRACE
  - typingsJapgolly.urllib.urllibStrings.CONNECT
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def CONNECT: typingsJapgolly.urllib.urllibStrings.CONNECT = this.cast("CONNECT")
  @scala.inline
  def DELETE: typingsJapgolly.urllib.urllibStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.urllib.urllibStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsJapgolly.urllib.urllibStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typingsJapgolly.urllib.urllibStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsJapgolly.urllib.urllibStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsJapgolly.urllib.urllibStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.urllib.urllibStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typingsJapgolly.urllib.urllibStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

