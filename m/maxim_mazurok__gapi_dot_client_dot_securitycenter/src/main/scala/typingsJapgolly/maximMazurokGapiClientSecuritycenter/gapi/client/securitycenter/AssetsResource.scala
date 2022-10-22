package typingsJapgolly.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.Alt
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.Callback
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.Fields
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.Key
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetsResource extends StObject {
  
  /** Filters an organization's assets and groups them by their specified properties. */
  def group(request: Accesstoken): Request[GroupAssetsResponse] = js.native
  def group(request: Alt, body: GroupAssetsRequest): Request[GroupAssetsResponse] = js.native
  
  /** Lists an organization's assets. */
  def list(): Request[ListAssetsResponse] = js.native
  def list(request: Callback): Request[ListAssetsResponse] = js.native
  
  def runDiscovery(request: Alt, body: RunAssetDiscoveryRequest): Request[Operation] = js.native
  /**
    * Runs asset discovery. The discovery is tracked with a long-running operation. This API can only be called with limited frequency for an organization. If it is called too frequently
    * the caller will receive a TOO_MANY_REQUESTS error.
    */
  def runDiscovery(request: Oauthtoken): Request[Operation] = js.native
  
  /** Updates security marks. */
  def updateSecurityMarks(request: Fields): Request[SecurityMarks] = js.native
  def updateSecurityMarks(request: Key, body: SecurityMarks): Request[SecurityMarks] = js.native
}
