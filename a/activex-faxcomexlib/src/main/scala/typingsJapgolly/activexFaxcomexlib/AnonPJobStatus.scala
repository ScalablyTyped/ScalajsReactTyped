package typingsJapgolly.activexFaxcomexlib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxJobStatus
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPJobStatus extends js.Object {
  val bstrJobId: String
  val pFaxServer: FaxServer
  val pJobStatus: FaxJobStatus
}

object AnonPJobStatus {
  @scala.inline
  def apply(bstrJobId: String, pFaxServer: FaxServer, pJobStatus: FaxJobStatus): AnonPJobStatus = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any], pJobStatus = pJobStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPJobStatus]
  }
}

