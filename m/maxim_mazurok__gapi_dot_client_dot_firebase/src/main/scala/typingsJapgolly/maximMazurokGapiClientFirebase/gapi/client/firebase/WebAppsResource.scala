package typingsJapgolly.maximMazurokGapiClientFirebase.gapi.client.firebase

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Alt
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Fields
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Uploadprotocol
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAppsResource extends StObject {
  
  def create(request: Fields, body: WebApp): Request[Operation] = js.native
  /**
    * Requests the creation of a new WebApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The
    * `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
    */
  def create(request: Uploadprotocol): Request[Operation] = js.native
  
  /** Gets the specified WebApp. */
  def get(): Request[WebApp] = js.native
  def get(request: Alt): Request[WebApp] = js.native
  
  /** Gets the configuration artifact associated with the specified WebApp. */
  def getConfig(): Request[WebAppConfig] = js.native
  def getConfig(request: Alt): Request[WebAppConfig] = js.native
  
  /**
    * Lists each WebApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional requests
    * are made with a `pageToken`.
    */
  def list(): Request[ListWebAppsResponse] = js.native
  def list(request: Oauthtoken): Request[ListWebAppsResponse] = js.native
  
  def patch(request: PrettyPrint, body: WebApp): Request[WebApp] = js.native
  /** Updates the attributes of the specified WebApp. */
  def patch(request: Xgafv): Request[WebApp] = js.native
  
  /** Removes the specified WebApp from the project. */
  def remove(request: AccesstokenAlt): Request[Operation] = js.native
  def remove(request: Alt, body: RemoveWebAppRequest): Request[Operation] = js.native
}
