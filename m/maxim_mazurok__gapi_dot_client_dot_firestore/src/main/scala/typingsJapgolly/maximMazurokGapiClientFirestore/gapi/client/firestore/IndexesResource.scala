package typingsJapgolly.maximMazurokGapiClientFirestore.gapi.client.firestore

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientFirestore.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientFirestore.anon.Alt
import typingsJapgolly.maximMazurokGapiClientFirestore.anon.Key
import typingsJapgolly.maximMazurokGapiClientFirestore.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexesResource extends StObject {
  
  /**
    * Creates a composite index. This returns a google.longrunning.Operation which may be used to track the status of the creation. The metadata for the operation will be the type
    * IndexOperationMetadata.
    */
  def create(request: Key): Request[GoogleLongrunningOperation] = js.native
  def create(request: Oauthtoken, body: GoogleFirestoreAdminV1Index): Request[GoogleLongrunningOperation] = js.native
  
  /** Deletes a composite index. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Gets a composite index. */
  def get(): Request[GoogleFirestoreAdminV1Index] = js.native
  def get(request: Accesstoken): Request[GoogleFirestoreAdminV1Index] = js.native
  
  /** Lists composite indexes. */
  def list(): Request[GoogleFirestoreAdminV1ListIndexesResponse] = js.native
  def list(request: Alt): Request[GoogleFirestoreAdminV1ListIndexesResponse] = js.native
}
