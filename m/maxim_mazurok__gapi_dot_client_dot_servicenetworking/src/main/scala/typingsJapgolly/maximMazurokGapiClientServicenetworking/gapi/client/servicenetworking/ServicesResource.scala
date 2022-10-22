package typingsJapgolly.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.Key
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.OauthtokenParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  /**
    * For service producers, provisions a new subnet in a peered service's shared VPC network in the requested region and with the requested size that's expressed as a CIDR range (number
    * of leading bits of ipV4 network mask). The method checks against the assigned allocated ranges to find a non-conflicting IP address range. The method will reuse a subnet if
    * subsequent calls contain the same subnet name, region, and prefix length. This method will make producer's tenant project to be a shared VPC service project as needed.
    */
  def addSubnetwork(request: AltCallback): Request[Operation] = js.native
  def addSubnetwork(request: Key, body: AddSubnetworkRequest): Request[Operation] = js.native
  
  var connections: ConnectionsResource = js.native
  
  /** Disables VPC service controls for a connection. */
  def disableVpcServiceControls(request: CallbackFields): Request[Operation] = js.native
  def disableVpcServiceControls(request: Key, body: DisableVpcServiceControlsRequest): Request[Operation] = js.native
  
  var dnsRecordSets: DnsRecordSetsResource = js.native
  
  var dnsZones: DnsZonesResource = js.native
  
  /** Enables VPC service controls for a connection. */
  def enableVpcServiceControls(request: FieldsKey): Request[Operation] = js.native
  def enableVpcServiceControls(request: Key, body: EnableVpcServiceControlsRequest): Request[Operation] = js.native
  
  var projects: ProjectsResource = js.native
  
  var roles: RolesResource = js.native
  
  /**
    * Service producers can use this method to find a currently unused range within consumer allocated ranges. This returned range is not reserved, and not guaranteed to remain unused. It
    * will validate previously provided allocated ranges, find non-conflicting sub-range of requested size (expressed in number of leading bits of ipv4 network mask, as in CIDR range
    * notation).
    */
  def searchRange(request: KeyOauthtoken): Request[Operation] = js.native
  def searchRange(request: Key, body: SearchRangeRequest): Request[Operation] = js.native
  
  def validate(request: Key, body: ValidateConsumerConfigRequest): Request[ValidateConsumerConfigResponse] = js.native
  /**
    * Service producers use this method to validate if the consumer provided network, project and requested range are valid. This allows them to use a fail-fast mechanism for consumer
    * requests, and not have to wait for AddSubnetwork operation completion to determine if user request is invalid.
    */
  def validate(request: OauthtokenParent): Request[ValidateConsumerConfigResponse] = js.native
}
