package typingsJapgolly.maximMazurokGapiClientGmail.gapi.client.gmail

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientGmail.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientGmail.anon.Alt
import typingsJapgolly.maximMazurokGapiClientGmail.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FiltersResource extends StObject {
  
  /** Creates a filter. Note: you can only create a maximum of 1,000 filters. */
  def create(request: AccesstokenAlt): Request[Filter] = js.native
  def create(request: Alt, body: Filter): Request[Filter] = js.native
  
  /** Immediately and permanently deletes the specified filter. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a filter. */
  def get(): Request[Filter] = js.native
  def get(request: Callback): Request[Filter] = js.native
  
  /** Lists the message filters of a Gmail user. */
  def list(): Request[ListFiltersResponse] = js.native
  def list(request: Alt): Request[ListFiltersResponse] = js.native
}
