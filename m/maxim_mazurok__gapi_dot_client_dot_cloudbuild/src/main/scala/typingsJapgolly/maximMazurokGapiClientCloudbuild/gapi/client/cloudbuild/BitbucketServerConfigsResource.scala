package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.AltBitbucketServerConfigId
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.BitbucketServerConfigId
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.CallbackConfig
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Config
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Fields
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.KeyName
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitbucketServerConfigsResource extends StObject {
  
  var connectedRepositories: ConnectedRepositoriesResource = js.native
  
  def create(request: AltBitbucketServerConfigId, body: BitbucketServerConfig): Request[Operation] = js.native
  /** Creates a new `BitbucketServerConfig`. This API is experimental. */
  def create(request: BitbucketServerConfigId): Request[Operation] = js.native
  
  /** Delete a `BitbucketServerConfig`. This API is experimental. */
  def delete(): Request[Operation] = js.native
  def delete(request: Fields): Request[Operation] = js.native
  
  /** Retrieve a `BitbucketServerConfig`. This API is experimental. */
  def get(): Request[BitbucketServerConfig] = js.native
  def get(request: Fields): Request[BitbucketServerConfig] = js.native
  
  /** List all `BitbucketServerConfigs` for a given project. This API is experimental. */
  def list(): Request[ListBitbucketServerConfigsResponse] = js.native
  def list(request: PageToken): Request[ListBitbucketServerConfigsResponse] = js.native
  
  def patch(request: AltCallback, body: BitbucketServerConfig): Request[Operation] = js.native
  /** Updates an existing `BitbucketServerConfig`. This API is experimental. */
  def patch(request: KeyName): Request[Operation] = js.native
  
  def removeBitbucketServerConnectedRepository(request: CallbackConfig, body: RemoveBitbucketServerConnectedRepositoryRequest): Request[js.Object] = js.native
  /** Remove a Bitbucket Server repository from a given BitbucketServerConfig's connected repositories. This API is experimental. */
  def removeBitbucketServerConnectedRepository(request: Config): Request[js.Object] = js.native
  
  var repos: ReposResource = js.native
}
