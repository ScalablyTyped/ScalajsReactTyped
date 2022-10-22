package typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDns.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  /** Fetches the representation of an existing Project. */
  def get(): Request[Project] = js.native
  def get(request: PrettyPrint): Request[Project] = js.native
}
