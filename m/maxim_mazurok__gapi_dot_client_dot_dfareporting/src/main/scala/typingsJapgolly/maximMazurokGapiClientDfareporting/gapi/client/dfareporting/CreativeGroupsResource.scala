package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.GroupNumber
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.UploadTypeUploadprotocol
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.UploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeGroupsResource extends StObject {
  
  /** Gets one creative group by ID. */
  def get(): Request[CreativeGroup] = js.native
  def get(request: Alt): Request[CreativeGroup] = js.native
  
  def insert(request: Callback, body: CreativeGroup): Request[CreativeGroup] = js.native
  /** Inserts a new creative group. */
  def insert(request: UploadTypeUploadprotocol): Request[CreativeGroup] = js.native
  
  /** Retrieves a list of creative groups, possibly filtered. This method supports paging. */
  def list(): Request[CreativeGroupsListResponse] = js.native
  def list(request: GroupNumber): Request[CreativeGroupsListResponse] = js.native
  
  def patch(request: Alt, body: CreativeGroup): Request[CreativeGroup] = js.native
  /** Updates an existing creative group. This method supports patch semantics. */
  def patch(request: UploadprotocolXgafv): Request[CreativeGroup] = js.native
  
  def update(request: Callback, body: CreativeGroup): Request[CreativeGroup] = js.native
  /** Updates an existing creative group. */
  def update(request: UploadTypeUploadprotocol): Request[CreativeGroup] = js.native
}
