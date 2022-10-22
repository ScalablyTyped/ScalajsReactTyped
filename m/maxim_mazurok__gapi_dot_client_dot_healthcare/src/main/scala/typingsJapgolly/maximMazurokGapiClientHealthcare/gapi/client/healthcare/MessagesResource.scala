package typingsJapgolly.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientHealthcare.anon.AccesstokenAltCallback
import typingsJapgolly.maximMazurokGapiClientHealthcare.anon.Callback
import typingsJapgolly.maximMazurokGapiClientHealthcare.anon.Name
import typingsJapgolly.maximMazurokGapiClientHealthcare.anon.OrderBy
import typingsJapgolly.maximMazurokGapiClientHealthcare.anon.Parent
import typingsJapgolly.maximMazurokGapiClientHealthcare.anon.UpdateMaskUploadType
import typingsJapgolly.maximMazurokGapiClientHealthcare.anon.UploadprotocolXgafv
import typingsJapgolly.maximMazurokGapiClientHealthcare.anon.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagesResource extends StObject {
  
  def create(request: Parent, body: CreateMessageRequest): Request[Message] = js.native
  /**
    * Parses and stores an HL7v2 message. This method triggers an asynchronous notification to any Pub/Sub topic configured in Hl7V2Store.Hl7V2NotificationConfig, if the filtering matches
    * the message. If an MLLP adapter is configured to listen to a Pub/Sub topic, the adapter transmits the message when a notification is received.
    */
  def create(request: UploadprotocolXgafv): Request[Message] = js.native
  
  /** Deletes an HL7v2 message. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets an HL7v2 message. */
  def get(): Request[Message] = js.native
  def get(request: View): Request[Message] = js.native
  
  /**
    * Parses and stores an HL7v2 message. This method triggers an asynchronous notification to any Pub/Sub topic configured in Hl7V2Store.Hl7V2NotificationConfig, if the filtering matches
    * the message. If an MLLP adapter is configured to listen to a Pub/Sub topic, the adapter transmits the message when a notification is received. If the method is successful, it
    * generates a response containing an HL7v2 acknowledgment (`ACK`) message. If the method encounters an error, it returns a negative acknowledgment (`NACK`) message. This behavior is
    * suitable for replying to HL7v2 interface systems that expect these acknowledgments.
    */
  def ingest(request: AccesstokenAltCallback): Request[IngestMessageResponse] = js.native
  def ingest(request: Parent, body: IngestMessageRequest): Request[IngestMessageResponse] = js.native
  
  /**
    * Lists all the messages in the given HL7v2 store with support for filtering. Note: HL7v2 messages are indexed asynchronously, so there might be a slight delay between the time a
    * message is created and when it can be found through a filter.
    */
  def list(): Request[ListMessagesResponse] = js.native
  def list(request: OrderBy): Request[ListMessagesResponse] = js.native
  
  def patch(request: Name, body: Message): Request[Message] = js.native
  /**
    * Update the message. The contents of the message in Message.data and data extracted from the contents such as Message.create_time cannot be altered. Only the Message.labels field is
    * allowed to be updated. The labels in the request are merged with the existing set of labels. Existing labels with the same keys are updated.
    */
  def patch(request: UpdateMaskUploadType): Request[Message] = js.native
}
