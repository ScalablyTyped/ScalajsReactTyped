package typingsJapgolly.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBigquerydatatransfer.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferLogsResource extends StObject {
  
  /** Returns log messages for the transfer run. */
  def list(): Request[ListTransferLogsResponse] = js.native
  def list(request: Fields): Request[ListTransferLogsResponse] = js.native
}
