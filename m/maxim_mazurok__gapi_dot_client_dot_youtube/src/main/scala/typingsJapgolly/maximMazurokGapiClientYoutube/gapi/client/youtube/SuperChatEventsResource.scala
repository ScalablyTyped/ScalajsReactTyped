package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.FieldsHl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuperChatEventsResource extends StObject {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[SuperChatEventListResponse] = js.native
  def list(request: FieldsHl): Request[SuperChatEventListResponse] = js.native
}
