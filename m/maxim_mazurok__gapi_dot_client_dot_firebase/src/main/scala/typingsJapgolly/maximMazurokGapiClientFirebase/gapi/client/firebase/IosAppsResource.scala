package typingsJapgolly.maximMazurokGapiClientFirebase.gapi.client.firebase

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Alt
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Fields
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.Resource
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.UpdateMask
import typingsJapgolly.maximMazurokGapiClientFirebase.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosAppsResource extends StObject {
  
  def create(request: Fields, body: IosApp): Request[Operation] = js.native
  /**
    * Requests the creation of a new IosApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The
    * `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
    */
  def create(request: Resource): Request[Operation] = js.native
  
  /** Gets the specified IosApp. */
  def get(): Request[IosApp] = js.native
  def get(request: Alt): Request[IosApp] = js.native
  
  /** Gets the configuration artifact associated with the specified IosApp. */
  def getConfig(): Request[IosAppConfig] = js.native
  def getConfig(request: Alt): Request[IosAppConfig] = js.native
  
  /**
    * Lists each IosApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional requests
    * are made with a `pageToken`.
    */
  def list(): Request[ListIosAppsResponse] = js.native
  def list(request: Oauthtoken): Request[ListIosAppsResponse] = js.native
  
  def patch(request: PrettyPrint, body: IosApp): Request[IosApp] = js.native
  /** Updates the attributes of the specified IosApp. */
  def patch(request: UpdateMask): Request[IosApp] = js.native
  
  def remove(request: Alt, body: RemoveIosAppRequest): Request[Operation] = js.native
  /** Removes the specified IosApp from the project. */
  def remove(request: UploadType): Request[Operation] = js.native
}
