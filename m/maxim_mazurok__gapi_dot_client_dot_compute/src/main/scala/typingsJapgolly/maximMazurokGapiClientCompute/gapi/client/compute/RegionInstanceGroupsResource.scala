package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.AltCallbackFieldsInstanceGroup
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.InstanceGroupKeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.OauthtokenOrderBy
import typingsJapgolly.maximMazurokGapiClientCompute.anon.OrderByPageToken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RequestIdUploadTypeUploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionInstanceGroupsResource extends StObject {
  
  /** Returns the specified instance group resource. */
  def get(): Request[InstanceGroup] = js.native
  def get(request: InstanceGroupKeyOauthtoken): Request[InstanceGroup] = js.native
  
  /** Retrieves the list of instance group resources contained within the specified region. */
  def list(): Request[RegionInstanceGroupList] = js.native
  def list(request: Filter): Request[RegionInstanceGroupList] = js.native
  
  /**
    * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can list all instances or only
    * the instances that are running. The orderBy query parameter is not supported.
    */
  def listInstances(request: OauthtokenOrderBy): Request[RegionInstanceGroupsListInstances] = js.native
  def listInstances(request: OrderByPageToken, body: RegionInstanceGroupsListInstancesRequest): Request[RegionInstanceGroupsListInstances] = js.native
  
  /** Sets the named ports for the specified regional instance group. */
  def setNamedPorts(request: AltCallbackFieldsInstanceGroup): Request[Operation] = js.native
  def setNamedPorts(request: RequestIdUploadTypeUploadprotocol, body: RegionInstanceGroupsSetNamedPortsRequest): Request[Operation] = js.native
}
