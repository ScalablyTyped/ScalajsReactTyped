package typingsJapgolly.sipJs.mod

import typingsJapgolly.sipJs.AnonError
import typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import typingsJapgolly.sipJs.incomingResponseMessageMod.IncomingResponseMessage
import typingsJapgolly.sipJs.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Parser")
@js.native
object Parser extends js.Object {
  def getHeader(data: js.Any, headerStart: Double): Double = js.native
  def parseHeader(message: IncomingRequestMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | AnonError = js.native
  def parseHeader(message: IncomingResponseMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | AnonError = js.native
  def parseMessage(data: String, logger: Logger): js.UndefOr[IncomingRequestMessage | IncomingResponseMessage] = js.native
}

