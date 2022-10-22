package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var bitbucketServerConfigs: BitbucketServerConfigsResource = js.native
  
  var builds: BuildsResource = js.native
  
  var githubEnterpriseConfigs: GithubEnterpriseConfigsResource = js.native
  
  var operations: OperationsResource = js.native
  
  /** ReceiveRegionalWebhook is called when the API receives a regional GitHub webhook. */
  def regionalWebhook(request: Accesstoken): Request[js.Object] = js.native
  def regionalWebhook(request: Alt, body: HttpBody): Request[js.Object] = js.native
  
  var triggers: TriggersResource = js.native
  
  var workerPools: WorkerPoolsResource = js.native
}
