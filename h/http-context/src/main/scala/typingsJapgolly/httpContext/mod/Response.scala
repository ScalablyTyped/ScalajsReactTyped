package typingsJapgolly.httpContext.mod

import typingsJapgolly.httpContext.httpContextBooleans.`false`
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.httpMod.OutgoingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends ResponseDelegate {
  var header: OutgoingHttpHeaders = js.native
  var response: OutgoingMessage = js.native
  def get(field: String): String = js.native
  def inspect(): ResponseJSON = js.native
  def is(types: String*): String | `false` = js.native
  def is(types: js.Array[String]): String | `false` = js.native
  def toJSON(): ResponseJSON = js.native
}

