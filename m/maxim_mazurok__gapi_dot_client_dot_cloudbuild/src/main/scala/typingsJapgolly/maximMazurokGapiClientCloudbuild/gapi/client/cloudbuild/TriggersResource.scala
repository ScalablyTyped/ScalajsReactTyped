package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Fields
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.NameOauthtoken
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.OauthtokenPageSize
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.OauthtokenParent
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.PageSizePageToken
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.PrettyPrintProjectId
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.ProjectIdQuotaUser
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.QuotaUserResource
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.QuotaUserSecret
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.QuotaUserTriggerId
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.ResourceName
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.ResourceSecret
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Trigger
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.TriggerId
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggersResource extends StObject {
  
  /** Creates a new `BuildTrigger`. This API is experimental. */
  def create(request: KeyOauthtoken): Request[BuildTrigger] = js.native
  /** Creates a new `BuildTrigger`. This API is experimental. */
  def create(request: OauthtokenParent): Request[BuildTrigger] = js.native
  def create(request: PrettyPrint, body: BuildTrigger): Request[BuildTrigger] = js.native
  def create(request: UploadType, body: BuildTrigger): Request[BuildTrigger] = js.native
  
  /** Deletes a `BuildTrigger` by its project ID and trigger ID. This API is experimental. */
  def delete(): Request[js.Object] = js.native
  def delete(request: PrettyPrintProjectId): Request[js.Object] = js.native
  def delete(request: TriggerId): Request[js.Object] = js.native
  
  /** Returns information about a `BuildTrigger`. This API is experimental. */
  def get(): Request[BuildTrigger] = js.native
  def get(request: PrettyPrintProjectId): Request[BuildTrigger] = js.native
  def get(request: TriggerId): Request[BuildTrigger] = js.native
  
  /** Lists existing `BuildTrigger`s. This API is experimental. */
  def list(): Request[ListBuildTriggersResponse] = js.native
  def list(request: OauthtokenPageSize): Request[ListBuildTriggersResponse] = js.native
  def list(request: PageSizePageToken): Request[ListBuildTriggersResponse] = js.native
  
  def patch(request: OauthtokenPrettyPrint, body: BuildTrigger): Request[BuildTrigger] = js.native
  /** Updates a `BuildTrigger` by its project ID and trigger ID. This API is experimental. */
  def patch(request: ProjectIdQuotaUser): Request[BuildTrigger] = js.native
  def patch(request: QuotaUserTriggerId, body: BuildTrigger): Request[BuildTrigger] = js.native
  /** Updates a `BuildTrigger` by its project ID and trigger ID. This API is experimental. */
  def patch(request: ResourceName): Request[BuildTrigger] = js.native
  
  def run(request: Fields, body: RunBuildTriggerRequest): Request[Operation] = js.native
  /**
    * Runs a `BuildTrigger` at a particular source revision. To run a regional or global trigger, use the POST request that includes the location endpoint in the path. The POST request
    * that does not include the location endpoint in the path can only be used when running global triggers.
    */
  def run(request: NameOauthtoken): Request[Operation] = js.native
  def run(request: PrettyPrintProjectId, body: RepoSource): Request[Operation] = js.native
  /**
    * Runs a `BuildTrigger` at a particular source revision. To run a regional or global trigger, use the POST request that includes the location endpoint in the path. The POST request
    * that does not include the location endpoint in the path can only be used when running global triggers.
    */
  def run(request: QuotaUserResource): Request[Operation] = js.native
  
  def webhook(request: QuotaUserSecret, body: HttpBody): Request[js.Object] = js.native
  /** ReceiveTriggerWebhook [Experimental] is called when the API receives a webhook request targeted at a specific trigger. */
  def webhook(request: ResourceSecret): Request[js.Object] = js.native
  /** ReceiveTriggerWebhook [Experimental] is called when the API receives a webhook request targeted at a specific trigger. */
  def webhook(request: typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Secret): Request[js.Object] = js.native
  def webhook(request: Trigger, body: HttpBody): Request[js.Object] = js.native
}
