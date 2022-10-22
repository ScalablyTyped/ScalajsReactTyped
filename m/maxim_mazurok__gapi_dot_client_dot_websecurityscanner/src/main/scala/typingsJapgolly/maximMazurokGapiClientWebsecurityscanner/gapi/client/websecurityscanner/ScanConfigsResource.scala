package typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.anon.Alt
import typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.anon.Fields
import typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.anon.Name
import typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanConfigsResource extends StObject {
  
  def create(request: Fields, body: ScanConfig): Request[ScanConfig] = js.native
  /** Creates a new ScanConfig. */
  def create(request: Oauthtoken): Request[ScanConfig] = js.native
  
  /** Deletes an existing ScanConfig and its child resources. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets a ScanConfig. */
  def get(): Request[ScanConfig] = js.native
  def get(request: Alt): Request[ScanConfig] = js.native
  
  /** Lists ScanConfigs under a given project. */
  def list(): Request[ListScanConfigsResponse] = js.native
  def list(request: Accesstoken): Request[ListScanConfigsResponse] = js.native
  
  /** Updates a ScanConfig. This method support partial update of a ScanConfig. */
  def patch(request: Name): Request[ScanConfig] = js.native
  def patch(request: PrettyPrint, body: ScanConfig): Request[ScanConfig] = js.native
  
  var scanRuns: ScanRunsResource = js.native
  
  def start(request: Alt, body: StartScanRunRequest): Request[ScanRun] = js.native
  /** Start a ScanRun according to the given ScanConfig. */
  def start(request: QuotaUser): Request[ScanRun] = js.native
}
