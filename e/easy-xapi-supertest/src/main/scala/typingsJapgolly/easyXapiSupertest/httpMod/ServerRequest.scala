package typingsJapgolly.easyXapiSupertest.httpMod

import typingsJapgolly.easyXapiSupertest.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRequest extends IncomingMessage {
  var connection: Socket = js.native
}

