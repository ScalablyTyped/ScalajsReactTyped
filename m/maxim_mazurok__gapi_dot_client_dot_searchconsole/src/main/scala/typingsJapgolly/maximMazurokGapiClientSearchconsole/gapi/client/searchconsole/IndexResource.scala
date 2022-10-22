package typingsJapgolly.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSearchconsole.anon.Key
import typingsJapgolly.maximMazurokGapiClientSearchconsole.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexResource extends StObject {
  
  def inspect(request: Key, body: InspectUrlIndexRequest): Request[InspectUrlIndexResponse] = js.native
  /** Index inspection. */
  def inspect(request: Oauthtoken): Request[InspectUrlIndexResponse] = js.native
}
