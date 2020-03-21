package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.Parser")
@js.native
object Parser extends js.Object {
  def getHeader(data: js.Any, headerStart: Double): Double = js.native
  def parseHeader(
    message: typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | AnonError = js.native
  def parseHeader(
    message: typingsJapgolly.sipJs.incomingResponseMessageMod.IncomingResponseMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | AnonError = js.native
  def parseMessage(data: String, logger: typingsJapgolly.sipJs.loggerMod.Logger): js.UndefOr[
    typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage | typingsJapgolly.sipJs.incomingResponseMessageMod.IncomingResponseMessage
  ] = js.native
}

