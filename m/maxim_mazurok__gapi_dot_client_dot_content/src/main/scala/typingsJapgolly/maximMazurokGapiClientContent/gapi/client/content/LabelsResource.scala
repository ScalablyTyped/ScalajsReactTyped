package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.AccountId
import typingsJapgolly.maximMazurokGapiClientContent.anon.Alt
import typingsJapgolly.maximMazurokGapiClientContent.anon.Callback
import typingsJapgolly.maximMazurokGapiClientContent.anon.Fields
import typingsJapgolly.maximMazurokGapiClientContent.anon.Key
import typingsJapgolly.maximMazurokGapiClientContent.anon.MerchantId
import typingsJapgolly.maximMazurokGapiClientContent.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelsResource extends StObject {
  
  def create(request: AccountId, body: AccountLabel): Request[AccountLabel] = js.native
  /** Creates a new label, not assigned to any account. */
  def create(request: Alt): Request[AccountLabel] = js.native
  /**
    * Links a return shipping label to a return id. You can only create one return label per return id. Since the label is sent to the buyer, the linked return label cannot be updated or
    * deleted. If you try to create multiple return shipping labels for a single return id, every create request except the first will fail.
    */
  def create(request: MerchantId): Request[ReturnShippingLabel] = js.native
  def create(request: Oauthtoken, body: ReturnShippingLabel): Request[ReturnShippingLabel] = js.native
  
  /** Deletes a label and removes it from all accounts to which it was assigned. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Lists the labels assigned to an account. */
  def list(): Request[ListAccountLabelsResponse] = js.native
  def list(request: Fields): Request[ListAccountLabelsResponse] = js.native
  
  def patch(request: Callback, body: AccountLabel): Request[AccountLabel] = js.native
  /** Updates a label. */
  def patch(request: Key): Request[AccountLabel] = js.native
}
