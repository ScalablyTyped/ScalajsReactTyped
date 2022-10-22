package typingsJapgolly.maximMazurokGapiClientFcm.gapi.client.fcm

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientFcm.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientFcm.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagesResource extends StObject {
  
  /** Send a message to specified target (a registration token, topic or condition). */
  def send(request: Accesstoken): Request[Message] = js.native
  def send(request: Alt, body: SendMessageRequest): Request[Message] = js.native
}
