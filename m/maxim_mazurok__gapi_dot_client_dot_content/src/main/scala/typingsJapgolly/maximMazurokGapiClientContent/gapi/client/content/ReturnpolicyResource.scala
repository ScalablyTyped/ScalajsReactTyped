package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientContent.anon.AccesstokenAltCallbackFieldsKey
import typingsJapgolly.maximMazurokGapiClientContent.anon.AltCallbackFieldsKeyMerchantId
import typingsJapgolly.maximMazurokGapiClientContent.anon.ReturnPolicyId
import typingsJapgolly.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnpolicyResource extends StObject {
  
  /** Batches multiple return policy related calls in a single request. */
  def custombatch(request: AccesstokenAltCallbackFieldsKey): Request[ReturnpolicyCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: ReturnpolicyCustomBatchRequest): Request[ReturnpolicyCustomBatchResponse] = js.native
  
  /** Deletes a return policy for the given Merchant Center account. */
  def delete(): Request[Unit] = js.native
  def delete(request: ReturnPolicyId): Request[Unit] = js.native
  
  /** Gets a return policy of the Merchant Center account. */
  def get(): Request[ReturnPolicy] = js.native
  def get(request: ReturnPolicyId): Request[ReturnPolicy] = js.native
  
  def insert(request: AccesstokenAlt, body: ReturnPolicy): Request[ReturnPolicy] = js.native
  /** Inserts a return policy for the Merchant Center account. */
  def insert(request: AltCallbackFieldsKeyMerchantId): Request[ReturnPolicy] = js.native
  
  /** Lists the return policies of the Merchant Center account. */
  def list(): Request[ReturnpolicyListResponse] = js.native
  def list(request: AccesstokenAlt): Request[ReturnpolicyListResponse] = js.native
}
