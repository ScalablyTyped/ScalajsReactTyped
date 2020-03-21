package typingsJapgolly.bent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bent.bentStrings.GET
  - typingsJapgolly.bent.bentStrings.POST
  - typingsJapgolly.bent.bentStrings.DELETE
  - typingsJapgolly.bent.bentStrings.PUT
  - typingsJapgolly.bent.bentStrings.PATCH
  - typingsJapgolly.bent.bentStrings.HEAD
  - typingsJapgolly.bent.bentStrings.OPTIONS
  - typingsJapgolly.bent.bentStrings.CONNECT
  - typingsJapgolly.bent.bentStrings.TRACE
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def CONNECT: typingsJapgolly.bent.bentStrings.CONNECT = this.cast("CONNECT")
  @scala.inline
  def DELETE: typingsJapgolly.bent.bentStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.bent.bentStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsJapgolly.bent.bentStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typingsJapgolly.bent.bentStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsJapgolly.bent.bentStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsJapgolly.bent.bentStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.bent.bentStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typingsJapgolly.bent.bentStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

