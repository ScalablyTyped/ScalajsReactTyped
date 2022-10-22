package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.FieldsInterconnectAttachment
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.InterconnectAttachmentKey
import typingsJapgolly.maximMazurokGapiClientCompute.anon.UserIpValidateOnly
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ValidateOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectAttachmentsResource extends StObject {
  
  /** Retrieves an aggregated list of interconnect attachments. */
  def aggregatedList(): Request[InterconnectAttachmentAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[InterconnectAttachmentAggregatedList] = js.native
  
  /** Deletes the specified interconnect attachment. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.InterconnectAttachment): Request[Operation] = js.native
  
  /** Returns the specified interconnect attachment. */
  def get(): Request[InterconnectAttachment] = js.native
  def get(request: FieldsInterconnectAttachment): Request[InterconnectAttachment] = js.native
  
  def insert(request: UserIpValidateOnly, body: InterconnectAttachment): Request[Operation] = js.native
  /** Creates an InterconnectAttachment in the specified project using the data included in the request. */
  def insert(request: ValidateOnly): Request[Operation] = js.native
  
  /** Retrieves the list of interconnect attachments contained within the specified region. */
  def list(): Request[InterconnectAttachmentList] = js.native
  def list(request: Filter): Request[InterconnectAttachmentList] = js.native
  
  /** Updates the specified interconnect attachment with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules. */
  def patch(request: InterconnectAttachmentKey): Request[Operation] = js.native
  def patch(
    request: typingsJapgolly.maximMazurokGapiClientCompute.anon.InterconnectAttachment,
    body: InterconnectAttachment
  ): Request[Operation] = js.native
}
