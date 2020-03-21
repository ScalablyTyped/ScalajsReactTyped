package typingsJapgolly.naja.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.naja.najaStrings.GET
  - typingsJapgolly.naja.najaStrings.POST
  - typingsJapgolly.naja.najaStrings.PUT
  - typingsJapgolly.naja.najaStrings.PATCH
  - typingsJapgolly.naja.najaStrings.DELETE
*/
trait RequestMethod extends js.Object

object RequestMethod {
  @scala.inline
  def DELETE: typingsJapgolly.naja.najaStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.naja.najaStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typingsJapgolly.naja.najaStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsJapgolly.naja.najaStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.naja.najaStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

