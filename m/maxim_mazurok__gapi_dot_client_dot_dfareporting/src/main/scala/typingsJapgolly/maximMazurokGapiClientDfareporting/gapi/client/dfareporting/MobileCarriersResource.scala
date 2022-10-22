package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileCarriersResource extends StObject {
  
  /** Gets one mobile carrier by ID. */
  def get(): Request[MobileCarrier] = js.native
  def get(request: Alt): Request[MobileCarrier] = js.native
  
  /** Retrieves a list of mobile carriers. */
  def list(): Request[MobileCarriersListResponse] = js.native
  def list(request: Callback): Request[MobileCarriersListResponse] = js.native
}
