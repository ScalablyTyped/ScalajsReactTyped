package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserRegionRequestIdResourceUploadTypeUploadprotocol
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RegionTargetVpnGateway
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetVpnGatewaysResource extends StObject {
  
  /** Retrieves an aggregated list of target VPN gateways. */
  def aggregatedList(): Request[TargetVpnGatewayAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[TargetVpnGatewayAggregatedList] = js.native
  
  /** Deletes the specified target VPN gateway. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.TargetVpnGateway): Request[Operation] = js.native
  
  /** Returns the specified target VPN gateway. Gets a list of available target VPN gateways by making a list() request. */
  def get(): Request[TargetVpnGateway] = js.native
  def get(request: RegionTargetVpnGateway): Request[TargetVpnGateway] = js.native
  
  def insert(request: Oauthtoken, body: TargetVpnGateway): Request[Operation] = js.native
  /** Creates a target VPN gateway in the specified project and region using the data included in the request. */
  def insert(request: QuotaUserRegionRequestIdResourceUploadTypeUploadprotocol): Request[Operation] = js.native
  
  /** Retrieves a list of target VPN gateways available to the specified project and region. */
  def list(): Request[TargetVpnGatewayList] = js.native
  def list(request: Filter): Request[TargetVpnGatewayList] = js.native
}
