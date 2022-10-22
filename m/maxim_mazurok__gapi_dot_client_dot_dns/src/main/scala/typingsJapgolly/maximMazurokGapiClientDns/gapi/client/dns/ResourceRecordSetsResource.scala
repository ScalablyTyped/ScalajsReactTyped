package typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDns.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDns.anon.Name
import typingsJapgolly.maximMazurokGapiClientDns.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientDns.anon.Type
import typingsJapgolly.maximMazurokGapiClientDns.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRecordSetsResource extends StObject {
  
  def create(request: Alt, body: ResourceRecordSet): Request[ResourceRecordSet] = js.native
  /** Creates a new ResourceRecordSet. */
  def create(request: Uploadprotocol): Request[ResourceRecordSet] = js.native
  
  /** Deletes a previously created ResourceRecordSet. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Fetches the representation of an existing ResourceRecordSet. */
  def get(): Request[ResourceRecordSet] = js.native
  def get(request: Name): Request[ResourceRecordSet] = js.native
  
  /** Enumerates ResourceRecordSets that you have created but not yet deleted. */
  def list(): Request[ResourceRecordSetsListResponse] = js.native
  def list(request: PageToken): Request[ResourceRecordSetsListResponse] = js.native
  
  def patch(request: Name, body: ResourceRecordSet): Request[ResourceRecordSet] = js.native
  /** Applies a partial update to an existing ResourceRecordSet. */
  def patch(request: Type): Request[ResourceRecordSet] = js.native
}
