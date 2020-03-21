package typingsJapgolly.raven.mod.transports

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.raven.mod.CaptureCallback
import typingsJapgolly.raven.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", "transports.Transport")
@js.native
abstract class Transport () extends EventEmitter {
  def send(
    client: Client,
    message: js.Any,
    headers: OutgoingHttpHeaders,
    eventId: String,
    cb: CaptureCallback
  ): Unit = js.native
}

