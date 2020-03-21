package typingsJapgolly.fxn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fxn.fxnStrings.GET
  - typingsJapgolly.fxn.fxnStrings.POST
  - typingsJapgolly.fxn.fxnStrings.PUT
  - typingsJapgolly.fxn.fxnStrings.DELETE
  - typingsJapgolly.fxn.fxnStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsJapgolly.fxn.fxnStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.fxn.fxnStrings.GET = this.cast("GET")
  @scala.inline
  def OPTIONS: typingsJapgolly.fxn.fxnStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def POST: typingsJapgolly.fxn.fxnStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.fxn.fxnStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

