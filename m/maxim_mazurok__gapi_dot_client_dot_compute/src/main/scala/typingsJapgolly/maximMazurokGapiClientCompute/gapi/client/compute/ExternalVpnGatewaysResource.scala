package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.CallbackExternalVpnGateway
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ResourceUploadType
import typingsJapgolly.maximMazurokGapiClientCompute.anon.UploadTypeUploadprotocol
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalVpnGatewaysResource extends StObject {
  
  /** Deletes the specified externalVpnGateway. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.ExternalVpnGateway): Request[Operation] = js.native
  
  /** Returns the specified externalVpnGateway. Get a list of available externalVpnGateways by making a list() request. */
  def get(): Request[ExternalVpnGateway] = js.native
  def get(request: CallbackExternalVpnGateway): Request[ExternalVpnGateway] = js.native
  
  /** Creates a ExternalVpnGateway in the specified project using the data included in the request. */
  def insert(request: ResourceUploadType): Request[Operation] = js.native
  def insert(request: Xgafv, body: ExternalVpnGateway): Request[Operation] = js.native
  
  /** Retrieves the list of ExternalVpnGateway available to the specified project. */
  def list(): Request[ExternalVpnGatewayList] = js.native
  def list(request: MaxResults): Request[ExternalVpnGatewayList] = js.native
  
  /** Sets the labels on an ExternalVpnGateway. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: UploadTypeUploadprotocol, body: GlobalSetLabelsRequest): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: UploadTypeUploadprotocol, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
