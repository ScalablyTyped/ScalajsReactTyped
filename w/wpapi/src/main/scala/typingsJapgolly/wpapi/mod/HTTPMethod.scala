package typingsJapgolly.wpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wpapi.wpapiStrings.GET
  - typingsJapgolly.wpapi.wpapiStrings.POST
  - typingsJapgolly.wpapi.wpapiStrings.PUT
  - typingsJapgolly.wpapi.wpapiStrings.PATCH
  - typingsJapgolly.wpapi.wpapiStrings.DELETE
*/
trait HTTPMethod extends js.Object

object HTTPMethod {
  @scala.inline
  def DELETE: typingsJapgolly.wpapi.wpapiStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.wpapi.wpapiStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typingsJapgolly.wpapi.wpapiStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsJapgolly.wpapi.wpapiStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.wpapi.wpapiStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

