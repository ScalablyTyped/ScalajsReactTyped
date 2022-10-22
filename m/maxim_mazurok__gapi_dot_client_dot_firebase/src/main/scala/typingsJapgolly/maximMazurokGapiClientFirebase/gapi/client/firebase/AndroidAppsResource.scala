package typingsJapgolly.maximMazurokGapiClientFirebase.gapi.client.firebase

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Alt
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Fields
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Key
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Name
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidAppsResource extends StObject {
  
  def create(request: Fields, body: AndroidApp): Request[Operation] = js.native
  /**
    * Requests the creation of a new AndroidApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The
    * `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
    */
  def create(request: Key): Request[Operation] = js.native
  
  /** Gets the specified AndroidApp. */
  def get(): Request[AndroidApp] = js.native
  def get(request: Alt): Request[AndroidApp] = js.native
  
  /** Gets the configuration artifact associated with the specified AndroidApp. */
  def getConfig(): Request[AndroidAppConfig] = js.native
  def getConfig(request: Alt): Request[AndroidAppConfig] = js.native
  
  /**
    * Lists each AndroidApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional
    * requests are made with a `pageToken`.
    */
  def list(): Request[ListAndroidAppsResponse] = js.native
  def list(request: Oauthtoken): Request[ListAndroidAppsResponse] = js.native
  
  /** Updates the attributes of the specified AndroidApp. */
  def patch(request: Name): Request[AndroidApp] = js.native
  def patch(request: PrettyPrint, body: AndroidApp): Request[AndroidApp] = js.native
  
  def remove(request: Alt, body: RemoveAndroidAppRequest): Request[Operation] = js.native
  /** Removes the specified AndroidApp from the project. */
  def remove(request: QuotaUser): Request[Operation] = js.native
  
  var sha: ShaResource = js.native
}
