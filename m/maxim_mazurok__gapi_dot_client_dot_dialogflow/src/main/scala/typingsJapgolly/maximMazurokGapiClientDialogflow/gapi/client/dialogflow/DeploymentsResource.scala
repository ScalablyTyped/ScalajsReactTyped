package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentsResource extends StObject {
  
  /** Retrieves the specified Deployment. */
  def get(): Request[GoogleCloudDialogflowCxV3Deployment] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3Deployment] = js.native
  
  /** Returns the list of all deployments in the specified Environment. */
  def list(): Request[GoogleCloudDialogflowCxV3ListDeploymentsResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDialogflowCxV3ListDeploymentsResponse] = js.native
}
