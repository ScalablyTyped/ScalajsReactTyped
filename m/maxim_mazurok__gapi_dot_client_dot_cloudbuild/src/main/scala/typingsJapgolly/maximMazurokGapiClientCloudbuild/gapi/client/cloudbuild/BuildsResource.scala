package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Fields
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Id
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Key
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Name
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Parent
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.ProjectId
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Resource
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.UploadType
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Uploadprotocol
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildsResource extends StObject {
  
  def approve(request: Fields, body: ApproveBuildRequest): Request[Operation] = js.native
  /**
    * Approves or rejects a pending build. If approved, the returned LRO will be analogous to the LRO returned from a CreateBuild call. If rejected, the returned LRO will be immediately
    * done.
    */
  def approve(request: Key): Request[Operation] = js.native
  
  def cancel(request: Fields, body: CancelBuildRequest): Request[Build] = js.native
  /** Cancels a build in progress. */
  def cancel(request: Id): Request[Build] = js.native
  def cancel(request: Oauthtoken, body: CancelBuildRequest): Request[Build] = js.native
  /** Cancels a build in progress. */
  def cancel(request: QuotaUser): Request[Build] = js.native
  
  /**
    * Starts a build with the specified configuration. This method returns a long-running `Operation`, which includes the build ID. Pass the build ID to `GetBuild` to determine the build
    * status (such as `SUCCESS` or `FAILURE`).
    */
  def create(request: Parent): Request[Operation] = js.native
  def create(request: PrettyPrint, body: Build): Request[Operation] = js.native
  /**
    * Starts a build with the specified configuration. This method returns a long-running `Operation`, which includes the build ID. Pass the build ID to `GetBuild` to determine the build
    * status (such as `SUCCESS` or `FAILURE`).
    */
  def create(request: Resource): Request[Operation] = js.native
  def create(request: UploadType, body: Build): Request[Operation] = js.native
  
  /** Returns information about a previously requested build. The `Build` that is returned includes its status (such as `SUCCESS`, `FAILURE`, or `WORKING`), and timing information. */
  def get(): Request[Build] = js.native
  def get(request: Name): Request[Build] = js.native
  def get(request: Uploadprotocol): Request[Build] = js.native
  
  /** Lists previously requested builds. Previously requested builds may still be in-progress, or may have finished successfully or unsuccessfully. */
  def list(): Request[ListBuildsResponse] = js.native
  def list(request: Filter): Request[ListBuildsResponse] = js.native
  def list(request: PageSize): Request[ListBuildsResponse] = js.native
  
  def retry(request: Fields, body: RetryBuildRequest): Request[Operation] = js.native
  def retry(request: Oauthtoken, body: RetryBuildRequest): Request[Operation] = js.native
  /**
    * Creates a new build based on the specified build. This method creates a new build using the original build request, which may or may not result in an identical build. For triggered
    * builds: * Triggered builds resolve to a precise revision; therefore a retry of a triggered build will result in a build that uses the same revision. For non-triggered builds that
    * specify `RepoSource`: * If the original build built from the tip of a branch, the retried build will build from the tip of that branch, which may not be the same revision as the
    * original build. * If the original build specified a commit sha or revision ID, the retried build will use the identical source. For builds that specify `StorageSource`: * If the
    * original build pulled source from Google Cloud Storage without specifying the generation of the object, the new build will use the current object, which may be different from the
    * original build source. * If the original build pulled source from Cloud Storage and specified the generation of the object, the new build will attempt to use the same object, which
    * may or may not be available depending on the bucket's lifecycle management settings.
    */
  def retry(request: ProjectId): Request[Operation] = js.native
  /**
    * Creates a new build based on the specified build. This method creates a new build using the original build request, which may or may not result in an identical build. For triggered
    * builds: * Triggered builds resolve to a precise revision; therefore a retry of a triggered build will result in a build that uses the same revision. For non-triggered builds that
    * specify `RepoSource`: * If the original build built from the tip of a branch, the retried build will build from the tip of that branch, which may not be the same revision as the
    * original build. * If the original build specified a commit sha or revision ID, the retried build will use the identical source. For builds that specify `StorageSource`: * If the
    * original build pulled source from Google Cloud Storage without specifying the generation of the object, the new build will use the current object, which may be different from the
    * original build source. * If the original build pulled source from Cloud Storage and specified the generation of the object, the new build will attempt to use the same object, which
    * may or may not be available depending on the bucket's lifecycle management settings.
    */
  def retry(request: Xgafv): Request[Operation] = js.native
}
