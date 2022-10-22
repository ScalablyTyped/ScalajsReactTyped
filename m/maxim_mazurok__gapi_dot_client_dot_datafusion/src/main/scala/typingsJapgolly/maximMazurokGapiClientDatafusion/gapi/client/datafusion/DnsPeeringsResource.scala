package typingsJapgolly.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDatafusion.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDatafusion.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDatafusion.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDatafusion.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsPeeringsResource extends StObject {
  
  /** Creates DNS peering on the given resource. */
  def create(request: Accesstoken): Request[DnsPeering] = js.native
  def create(request: Alt, body: DnsPeering): Request[DnsPeering] = js.native
  
  /** Deletes DNS peering on the given resource. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Lists DNS peerings for a given resource. */
  def list(): Request[ListDnsPeeringsResponse] = js.native
  def list(request: Fields): Request[ListDnsPeeringsResponse] = js.native
}
