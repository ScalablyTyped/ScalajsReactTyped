package typingsJapgolly.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBigquerydatatransfer.anon.Alt
import typingsJapgolly.maximMazurokGapiClientBigquerydatatransfer.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunsResource extends StObject {
  
  /** Deletes the specified transfer run. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Returns information about the particular transfer run. */
  def get(): Request[TransferRun] = js.native
  def get(request: Alt): Request[TransferRun] = js.native
  
  /** Returns information about running and completed transfer runs. */
  def list(): Request[ListTransferRunsResponse] = js.native
  def list(request: Key): Request[ListTransferRunsResponse] = js.native
  
  var transferLogs: TransferLogsResource = js.native
}
