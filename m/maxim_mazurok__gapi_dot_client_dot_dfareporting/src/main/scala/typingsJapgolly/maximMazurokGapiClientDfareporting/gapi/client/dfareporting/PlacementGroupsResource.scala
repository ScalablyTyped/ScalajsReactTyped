package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.ActiveStatus
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.ResourceUploadTypeUploadprotocol
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.UploadTypeUploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementGroupsResource extends StObject {
  
  /** Gets one placement group by ID. */
  def get(): Request[PlacementGroup] = js.native
  def get(request: Alt): Request[PlacementGroup] = js.native
  
  def insert(request: Callback, body: PlacementGroup): Request[PlacementGroup] = js.native
  /** Inserts a new placement group. */
  def insert(request: ResourceUploadTypeUploadprotocol): Request[PlacementGroup] = js.native
  
  /** Retrieves a list of placement groups, possibly filtered. This method supports paging. */
  def list(): Request[PlacementGroupsListResponse] = js.native
  def list(request: ActiveStatus): Request[PlacementGroupsListResponse] = js.native
  
  def patch(request: Alt, body: PlacementGroup): Request[PlacementGroup] = js.native
  /** Updates an existing placement group. This method supports patch semantics. */
  def patch(request: UploadTypeUploadprotocolXgafv): Request[PlacementGroup] = js.native
  
  def update(request: Callback, body: PlacementGroup): Request[PlacementGroup] = js.native
  /** Updates an existing placement group. */
  def update(request: ResourceUploadTypeUploadprotocol): Request[PlacementGroup] = js.native
}
