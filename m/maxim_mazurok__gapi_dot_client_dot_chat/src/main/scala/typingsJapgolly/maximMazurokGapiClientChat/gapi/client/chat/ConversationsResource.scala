package typingsJapgolly.maximMazurokGapiClientChat.gapi.client.chat

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientChat.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientChat.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversationsResource extends StObject {
  
  /** Legacy path for creating message. Calling these will result in a BadRequest response. */
  def messages(request: Accesstoken): Request[Message] = js.native
  def messages(request: Alt, body: Message): Request[Message] = js.native
}
