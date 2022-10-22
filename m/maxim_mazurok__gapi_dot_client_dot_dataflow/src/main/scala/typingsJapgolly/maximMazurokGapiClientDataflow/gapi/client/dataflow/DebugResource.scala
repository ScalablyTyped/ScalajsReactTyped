package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.Fields
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.JobId
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugResource extends StObject {
  
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: Accesstoken): Request[GetDebugConfigResponse] = js.native
  def getConfig(request: Alt, body: GetDebugConfigRequest): Request[GetDebugConfigResponse] = js.native
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: Fields): Request[GetDebugConfigResponse] = js.native
  def getConfig(request: JobId, body: GetDebugConfigRequest): Request[GetDebugConfigResponse] = js.native
  
  def sendCapture(request: Alt, body: SendDebugCaptureRequest): Request[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: Callback): Request[js.Object] = js.native
  def sendCapture(request: JobId, body: SendDebugCaptureRequest): Request[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: Key): Request[js.Object] = js.native
}
