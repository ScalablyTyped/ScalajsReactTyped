package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.Alt
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.OauthtokenPart
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatBansResource extends StObject {
  
  /** Deletes a chat ban. */
  def delete(): Request[Unit] = js.native
  def delete(request: Uploadprotocol): Request[Unit] = js.native
  
  def insert(request: Alt, body: LiveChatBan): Request[LiveChatBan] = js.native
  /** Inserts a new resource into this collection. */
  def insert(request: OauthtokenPart): Request[LiveChatBan] = js.native
}
