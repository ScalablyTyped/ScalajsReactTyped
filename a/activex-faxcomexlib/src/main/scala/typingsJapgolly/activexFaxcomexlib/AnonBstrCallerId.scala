package typingsJapgolly.activexFaxcomexlib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBstrCallerId extends js.Object {
  val bstrCallerId: String
  val lCallId: Double
  val lDeviceId: Double
  val pFaxServer: FaxServer
}

object AnonBstrCallerId {
  @scala.inline
  def apply(bstrCallerId: String, lCallId: Double, lDeviceId: Double, pFaxServer: FaxServer): AnonBstrCallerId = {
    val __obj = js.Dynamic.literal(bstrCallerId = bstrCallerId.asInstanceOf[js.Any], lCallId = lCallId.asInstanceOf[js.Any], lDeviceId = lDeviceId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBstrCallerId]
  }
}

