package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.Alt
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.LiveChatId
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.PartPrettyPrint
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatMessagesResource extends StObject {
  
  /** Deletes a chat message. */
  def delete(): Request[Unit] = js.native
  def delete(request: Uploadprotocol): Request[Unit] = js.native
  
  def insert(request: Alt, body: LiveChatMessage): Request[LiveChatMessage] = js.native
  /** Inserts a new resource into this collection. */
  def insert(request: PartPrettyPrint): Request[LiveChatMessage] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[LiveChatMessageListResponse] = js.native
  def list(request: LiveChatId): Request[LiveChatMessageListResponse] = js.native
}
