package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.QuotaUserResourceUploadTypeUploadprotocol
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.ResourceUploadTypeUploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubaccountsResource extends StObject {
  
  /** Gets one subaccount by ID. */
  def get(): Request[Subaccount] = js.native
  def get(request: Alt): Request[Subaccount] = js.native
  
  def insert(request: Callback, body: Subaccount): Request[Subaccount] = js.native
  /** Inserts a new subaccount. */
  def insert(request: QuotaUserResourceUploadTypeUploadprotocol): Request[Subaccount] = js.native
  
  /** Gets a list of subaccounts, possibly filtered. This method supports paging. */
  def list(): Request[SubaccountsListResponse] = js.native
  def list(request: MaxResults): Request[SubaccountsListResponse] = js.native
  
  def patch(request: Alt, body: Subaccount): Request[Subaccount] = js.native
  /** Updates an existing subaccount. This method supports patch semantics. */
  def patch(request: ResourceUploadTypeUploadprotocolXgafv): Request[Subaccount] = js.native
  
  def update(request: Callback, body: Subaccount): Request[Subaccount] = js.native
  /** Updates an existing subaccount. */
  def update(request: QuotaUserResourceUploadTypeUploadprotocol): Request[Subaccount] = js.native
}
