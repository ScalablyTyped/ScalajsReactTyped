package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.FieldsKeyNetworkEndpointGroup
import typingsJapgolly.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.KeyNetworkEndpointGroup
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCompute.anon.NetworkEndpointGroupOauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalNetworkEndpointGroupsResource extends StObject {
  
  def attachNetworkEndpoints(request: KeyNetworkEndpointGroup, body: GlobalNetworkEndpointGroupsAttachEndpointsRequest): Request[Operation] = js.native
  /** Attach a network endpoint to the specified network endpoint group. */
  def attachNetworkEndpoints(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.NetworkEndpointGroup): Request[Operation] = js.native
  
  /** Deletes the specified network endpoint group.Note that the NEG cannot be deleted if there are backend services referencing it. */
  def delete(): Request[Operation] = js.native
  def delete(request: KeyNetworkEndpointGroup): Request[Operation] = js.native
  
  def detachNetworkEndpoints(request: KeyNetworkEndpointGroup, body: GlobalNetworkEndpointGroupsDetachEndpointsRequest): Request[Operation] = js.native
  /** Detach the network endpoint from the specified network endpoint group. */
  def detachNetworkEndpoints(request: NetworkEndpointGroupOauthtoken): Request[Operation] = js.native
  
  /** Returns the specified network endpoint group. Gets a list of available network endpoint groups by making a list() request. */
  def get(): Request[NetworkEndpointGroup] = js.native
  def get(request: FieldsKeyNetworkEndpointGroup): Request[NetworkEndpointGroup] = js.native
  
  /** Creates a network endpoint group in the specified project using the parameters that are included in the request. */
  def insert(request: FieldsKeyOauthtoken): Request[Operation] = js.native
  def insert(request: Xgafv, body: NetworkEndpointGroup): Request[Operation] = js.native
  
  /** Retrieves the list of network endpoint groups that are located in the specified project. */
  def list(): Request[NetworkEndpointGroupList] = js.native
  def list(request: MaxResults): Request[NetworkEndpointGroupList] = js.native
  
  /** Lists the network endpoints in the specified network endpoint group. */
  def listNetworkEndpoints(): Request[NetworkEndpointGroupsListNetworkEndpoints] = js.native
  def listNetworkEndpoints(request: PageToken): Request[NetworkEndpointGroupsListNetworkEndpoints] = js.native
}
