package typingsJapgolly.maximMazurokGapiClientAppengine.gapi.client.appengine

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAppengine.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizedDomainsResource extends StObject {
  
  /** Lists all domains the user is authorized to administer. */
  def list(): Request[ListAuthorizedDomainsResponse] = js.native
  def list(request: Oauthtoken): Request[ListAuthorizedDomainsResponse] = js.native
}
