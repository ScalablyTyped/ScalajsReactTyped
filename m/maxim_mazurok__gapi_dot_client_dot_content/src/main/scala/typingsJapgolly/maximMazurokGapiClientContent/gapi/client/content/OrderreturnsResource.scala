package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientContent.anon.Acknowledged
import typingsJapgolly.maximMazurokGapiClientContent.anon.FieldsKeyMerchantId
import typingsJapgolly.maximMazurokGapiClientContent.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientContent.anon.ResourceReturnId
import typingsJapgolly.maximMazurokGapiClientContent.anon.ReturnId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreturnsResource extends StObject {
  
  def acknowledge(request: Oauthtoken, body: OrderreturnsAcknowledgeRequest): Request[OrderreturnsAcknowledgeResponse] = js.native
  /** Acks an order return in your Merchant Center account. */
  def acknowledge(request: ReturnId): Request[OrderreturnsAcknowledgeResponse] = js.native
  
  def createorderreturn(request: AccesstokenAlt, body: OrderreturnsCreateOrderReturnRequest): Request[OrderreturnsCreateOrderReturnResponse] = js.native
  /** Create return in your Merchant Center account. */
  def createorderreturn(request: FieldsKeyMerchantId): Request[OrderreturnsCreateOrderReturnResponse] = js.native
  
  /** Retrieves an order return from your Merchant Center account. */
  def get(): Request[MerchantOrderReturn] = js.native
  def get(request: Oauthtoken): Request[MerchantOrderReturn] = js.native
  
  var labels: LabelsResource = js.native
  
  /** Lists order returns in your Merchant Center account. */
  def list(): Request[OrderreturnsListResponse] = js.native
  def list(request: Acknowledged): Request[OrderreturnsListResponse] = js.native
  
  def process(request: Oauthtoken, body: OrderreturnsProcessRequest): Request[OrderreturnsProcessResponse] = js.native
  /** Processes return in your Merchant Center account. */
  def process(request: ResourceReturnId): Request[OrderreturnsProcessResponse] = js.native
}
