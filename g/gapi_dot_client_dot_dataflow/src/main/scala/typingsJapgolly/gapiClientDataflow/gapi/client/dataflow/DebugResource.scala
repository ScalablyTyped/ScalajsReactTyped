package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDataflow.AnonAccesstoken
import typingsJapgolly.gapiClientDataflow.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugResource extends js.Object {
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: AnonAccesstoken): Request_[GetDebugConfigResponse] = js.native
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: AnonAlt): Request_[GetDebugConfigResponse] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: AnonAccesstoken): Request_[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: AnonAlt): Request_[js.Object] = js.native
}

