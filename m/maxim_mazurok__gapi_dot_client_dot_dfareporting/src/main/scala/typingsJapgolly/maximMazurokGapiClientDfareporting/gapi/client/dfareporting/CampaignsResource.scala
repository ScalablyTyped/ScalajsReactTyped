package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Archived
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.FieldsId
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.FieldsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignsResource extends StObject {
  
  /** Gets one campaign by ID. */
  def get(): Request[Campaign] = js.native
  def get(request: Alt): Request[Campaign] = js.native
  
  def insert(request: Callback, body: Campaign): Request[Campaign] = js.native
  /** Inserts a new campaign. */
  def insert(request: FieldsKey): Request[Campaign] = js.native
  
  /** Retrieves a list of campaigns, possibly filtered. This method supports paging. */
  def list(): Request[CampaignsListResponse] = js.native
  def list(request: Archived): Request[CampaignsListResponse] = js.native
  
  def patch(request: Alt, body: Campaign): Request[Campaign] = js.native
  /** Updates an existing campaign. This method supports patch semantics. */
  def patch(request: FieldsId): Request[Campaign] = js.native
  
  def update(request: Callback, body: Campaign): Request[Campaign] = js.native
  /** Updates an existing campaign. */
  def update(request: FieldsKey): Request[Campaign] = js.native
}
