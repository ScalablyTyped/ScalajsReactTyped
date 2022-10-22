package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.FieldsKeyNetworkEndpointGroupOauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.KeyNetworkEndpointGroupOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RegionRequestIdResourceUploadTypeUploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionNetworkEndpointGroupsResource extends StObject {
  
  /** Deletes the specified network endpoint group. Note that the NEG cannot be deleted if it is configured as a backend of a backend service. */
  def delete(): Request[Operation] = js.native
  def delete(request: FieldsKeyNetworkEndpointGroupOauthtoken): Request[Operation] = js.native
  
  /** Returns the specified network endpoint group. Gets a list of available network endpoint groups by making a list() request. */
  def get(): Request[NetworkEndpointGroup] = js.native
  def get(request: KeyNetworkEndpointGroupOauthtokenPrettyPrint): Request[NetworkEndpointGroup] = js.native
  
  def insert(request: Oauthtoken, body: NetworkEndpointGroup): Request[Operation] = js.native
  /** Creates a network endpoint group in the specified project using the parameters that are included in the request. */
  def insert(request: RegionRequestIdResourceUploadTypeUploadprotocol): Request[Operation] = js.native
  
  /** Retrieves the list of regional network endpoint groups available to the specified project in the given region. */
  def list(): Request[NetworkEndpointGroupList] = js.native
  def list(request: Filter): Request[NetworkEndpointGroupList] = js.native
}
