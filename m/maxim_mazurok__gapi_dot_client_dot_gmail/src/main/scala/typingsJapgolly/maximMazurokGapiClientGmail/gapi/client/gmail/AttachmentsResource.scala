package typingsJapgolly.maximMazurokGapiClientGmail.gapi.client.gmail

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientGmail.anon.MessageId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsResource extends StObject {
  
  /** Gets the specified message attachment. */
  def get(): Request[MessagePartBody] = js.native
  def get(request: MessageId): Request[MessagePartBody] = js.native
}
