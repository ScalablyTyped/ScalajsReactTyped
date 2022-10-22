package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.FieldsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectedRepositoriesResource extends StObject {
  
  /** Batch connecting Bitbucket Server repositories to Cloud Build. */
  def batchCreate(request: CallbackFields): Request[Operation] = js.native
  def batchCreate(request: FieldsKey, body: BatchCreateBitbucketServerConnectedRepositoriesRequest): Request[Operation] = js.native
}
