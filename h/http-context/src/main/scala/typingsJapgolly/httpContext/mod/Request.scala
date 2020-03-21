package typingsJapgolly.httpContext.mod

import typingsJapgolly.accepts.mod.Accepts
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends RequestDelegate {
  var accept: Accepts = js.native
  var charset: String = js.native
  var length: Double = js.native
  var request: IncomingMessage = js.native
  var `type`: String = js.native
  def inspect(): RequestJSON = js.native
  def toJSON(): RequestJSON = js.native
}

