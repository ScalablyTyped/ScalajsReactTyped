package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AccesstokenActive
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.CallbackFieldsKeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.FieldsIdKeyOauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemarketingListsResource extends StObject {
  
  /** Gets one remarketing list by ID. */
  def get(): Request[RemarketingList] = js.native
  def get(request: Alt): Request[RemarketingList] = js.native
  
  /** Inserts a new remarketing list. */
  def insert(request: CallbackFieldsKeyOauthtoken): Request[RemarketingList] = js.native
  def insert(request: Callback, body: RemarketingList): Request[RemarketingList] = js.native
  
  /** Retrieves a list of remarketing lists, possibly filtered. This method supports paging. */
  def list(): Request[RemarketingListsListResponse] = js.native
  def list(request: AccesstokenActive): Request[RemarketingListsListResponse] = js.native
  
  def patch(request: Alt, body: RemarketingList): Request[RemarketingList] = js.native
  /** Updates an existing remarketing list. This method supports patch semantics. */
  def patch(request: FieldsIdKeyOauthtoken): Request[RemarketingList] = js.native
  
  /** Updates an existing remarketing list. */
  def update(request: CallbackFieldsKeyOauthtoken): Request[RemarketingList] = js.native
  def update(request: Callback, body: RemarketingList): Request[RemarketingList] = js.native
}
