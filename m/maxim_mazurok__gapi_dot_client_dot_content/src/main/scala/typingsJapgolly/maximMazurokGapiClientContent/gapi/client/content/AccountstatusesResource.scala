package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.Destinations
import typingsJapgolly.maximMazurokGapiClientContent.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientContent.anon.Name
import typingsJapgolly.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountstatusesResource extends StObject {
  
  /** Retrieves multiple Merchant Center account statuses in a single request. */
  def custombatch(request: KeyOauthtoken): Request[AccountstatusesCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: AccountstatusesCustomBatchRequest): Request[AccountstatusesCustomBatchResponse] = js.native
  
  /** Retrieves the status of a Merchant Center account. No itemLevelIssues are returned for multi-client accounts. */
  def get(): Request[AccountStatus] = js.native
  def get(request: Destinations): Request[AccountStatus] = js.native
  
  /** Lists the statuses of the sub-accounts in your Merchant Center account. */
  def list(): Request[AccountstatusesListResponse] = js.native
  def list(request: Name): Request[AccountstatusesListResponse] = js.native
}
