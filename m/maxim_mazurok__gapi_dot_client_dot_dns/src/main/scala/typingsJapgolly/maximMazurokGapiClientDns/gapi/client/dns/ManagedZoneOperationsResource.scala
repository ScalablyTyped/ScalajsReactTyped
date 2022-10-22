package typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDns.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZoneOperationsResource extends StObject {
  
  /** Fetches the representation of an existing Operation. */
  def get(): Request[Operation] = js.native
  def get(request: Key): Request[Operation] = js.native
  
  /** Enumerates Operations for the given ManagedZone. */
  def list(): Request[ManagedZoneOperationsListResponse] = js.native
  def list(request: typingsJapgolly.maximMazurokGapiClientDns.anon.ManagedZone): Request[ManagedZoneOperationsListResponse] = js.native
}
