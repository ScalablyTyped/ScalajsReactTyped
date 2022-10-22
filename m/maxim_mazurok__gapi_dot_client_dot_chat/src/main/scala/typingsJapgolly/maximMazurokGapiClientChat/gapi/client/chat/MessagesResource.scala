package typingsJapgolly.maximMazurokGapiClientChat.gapi.client.chat

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientChat.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientChat.anon.Alt
import typingsJapgolly.maximMazurokGapiClientChat.anon.Fields
import typingsJapgolly.maximMazurokGapiClientChat.anon.Name
import typingsJapgolly.maximMazurokGapiClientChat.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagesResource extends StObject {
  
  var attachments: AttachmentsResource = js.native
  
  /** Creates a message. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts). */
  def create(request: Accesstoken): Request[Message] = js.native
  def create(request: Alt, body: Message): Request[Message] = js.native
  
  /** Deletes a message. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts). */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /** Returns a message. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts). */
  def get(): Request[Message] = js.native
  def get(request: Fields): Request[Message] = js.native
  
  /** Updates a message. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts). */
  def update(request: Name): Request[Message] = js.native
  def update(request: Oauthtoken, body: Message): Request[Message] = js.native
}
