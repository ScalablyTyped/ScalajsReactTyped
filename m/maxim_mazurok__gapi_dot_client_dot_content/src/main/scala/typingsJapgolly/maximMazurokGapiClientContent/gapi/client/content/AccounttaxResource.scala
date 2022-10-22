package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.AccountIdAlt
import typingsJapgolly.maximMazurokGapiClientContent.anon.MerchantIdOauthtoken
import typingsJapgolly.maximMazurokGapiClientContent.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientContent.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccounttaxResource extends StObject {
  
  /** Retrieves and updates tax settings of multiple accounts in a single request. */
  def custombatch(request: OauthtokenPrettyPrint): Request[AccounttaxCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: AccounttaxCustomBatchRequest): Request[AccounttaxCustomBatchResponse] = js.native
  
  /** Retrieves the tax settings of the account. */
  def get(): Request[AccountTax] = js.native
  def get(request: AccountIdAlt): Request[AccountTax] = js.native
  
  /** Lists the tax settings of the sub-accounts in your Merchant Center account. */
  def list(): Request[AccounttaxListResponse] = js.native
  def list(request: PageToken): Request[AccounttaxListResponse] = js.native
  
  def update(request: AccountIdAlt, body: AccountTax): Request[AccountTax] = js.native
  /** Updates the tax settings of the account. Any fields that are not provided are deleted from the resource. */
  def update(request: MerchantIdOauthtoken): Request[AccountTax] = js.native
}
