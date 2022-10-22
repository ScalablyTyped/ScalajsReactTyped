package typingsJapgolly.maximMazurokGapiClientGmail.gapi.client.gmail

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientGmail.anon.Alt
import typingsJapgolly.maximMazurokGapiClientGmail.anon.Callback
import typingsJapgolly.maximMazurokGapiClientGmail.anon.Deleted
import typingsJapgolly.maximMazurokGapiClientGmail.anon.Format
import typingsJapgolly.maximMazurokGapiClientGmail.anon.InternalDateSource
import typingsJapgolly.maximMazurokGapiClientGmail.anon.LabelIds
import typingsJapgolly.maximMazurokGapiClientGmail.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientGmail.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientGmail.anon.Resource
import typingsJapgolly.maximMazurokGapiClientGmail.anon.UploadType
import typingsJapgolly.maximMazurokGapiClientGmail.anon.Uploadprotocol
import typingsJapgolly.maximMazurokGapiClientGmail.anon.UserId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagesResource extends StObject {
  
  var attachments: AttachmentsResource = js.native
  
  def batchDelete(request: Alt, body: BatchDeleteMessagesRequest): Request[Unit] = js.native
  /** Deletes many messages by message ID. Provides no guarantees that messages were not already deleted or even existed at all. */
  def batchDelete(request: PrettyPrint): Request[Unit] = js.native
  
  def batchModify(request: Alt, body: BatchModifyMessagesRequest): Request[Unit] = js.native
  /** Modifies the labels on the specified messages. */
  def batchModify(request: QuotaUser): Request[Unit] = js.native
  
  /** Immediately and permanently deletes the specified message. This operation cannot be undone. Prefer `messages.trash` instead. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets the specified message. */
  def get(): Request[Message] = js.native
  def get(request: Format): Request[Message] = js.native
  
  /**
    * Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. This method doesn't perform SPF checks, so
    * it might not work for some spam messages, such as those attempting to perform domain spoofing. This method does not send a message. Note: This function doesn't trigger forwarding
    * rules or filters set up by the user.
    */
  def `import`(request: Deleted): Request[Message] = js.native
  def `import`(request: InternalDateSource, body: Message): Request[Message] = js.native
  
  /** Directly inserts a message into only this user's mailbox similar to `IMAP APPEND`, bypassing most scanning and classification. Does not send a message. */
  def insert(request: Resource): Request[Message] = js.native
  def insert(request: UploadType, body: Message): Request[Message] = js.native
  
  /** Lists the messages in the user's mailbox. */
  def list(): Request[ListMessagesResponse] = js.native
  def list(request: LabelIds): Request[ListMessagesResponse] = js.native
  
  def modify(request: Callback, body: ModifyMessageRequest): Request[Message] = js.native
  /** Modifies the labels on the specified message. */
  def modify(request: Uploadprotocol): Request[Message] = js.native
  
  def send(request: Alt, body: Message): Request[Message] = js.native
  /** Sends the specified message to the recipients in the `To`, `Cc`, and `Bcc` headers. */
  def send(request: UserId): Request[Message] = js.native
  
  /** Moves the specified message to the trash. */
  def trash(): Request[Message] = js.native
  def trash(request: Callback): Request[Message] = js.native
  
  /** Removes the specified message from the trash. */
  def untrash(): Request[Message] = js.native
  def untrash(request: Callback): Request[Message] = js.native
}
