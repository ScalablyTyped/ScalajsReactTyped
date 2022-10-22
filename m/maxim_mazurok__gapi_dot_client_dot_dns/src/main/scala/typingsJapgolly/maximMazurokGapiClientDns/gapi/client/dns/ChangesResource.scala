package typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDns.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDns.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDns.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDns.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesResource extends StObject {
  
  /** Atomically updates the ResourceRecordSet collection. */
  def create(request: Accesstoken): Request[Change] = js.native
  def create(request: Alt, body: Change): Request[Change] = js.native
  
  /** Fetches the representation of an existing Change. */
  def get(): Request[Change] = js.native
  def get(request: Callback): Request[Change] = js.native
  
  /** Enumerates Changes to a ResourceRecordSet collection. */
  def list(): Request[ChangesListResponse] = js.native
  def list(request: Fields): Request[ChangesListResponse] = js.native
}
