package typingsJapgolly.nodemailer.fetchMod

import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableResponse extends Writable {
  var headers: IncomingHttpHeaders = js.native
  var statusCode: Double = js.native
}

