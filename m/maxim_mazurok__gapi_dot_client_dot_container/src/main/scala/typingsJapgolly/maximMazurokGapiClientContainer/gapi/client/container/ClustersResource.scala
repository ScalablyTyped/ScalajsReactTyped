package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContainer.anon.AccesstokenAltCallback
import typingsJapgolly.maximMazurokGapiClientContainer.anon.AltCallbackClusterId
import typingsJapgolly.maximMazurokGapiClientContainer.anon.AltCallbackFields
import typingsJapgolly.maximMazurokGapiClientContainer.anon.Callback
import typingsJapgolly.maximMazurokGapiClientContainer.anon.CallbackClusterIdFields
import typingsJapgolly.maximMazurokGapiClientContainer.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientContainer.anon.CallbackFieldsKey
import typingsJapgolly.maximMazurokGapiClientContainer.anon.ClusterIdFieldsKey
import typingsJapgolly.maximMazurokGapiClientContainer.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientContainer.anon.FieldsKeyName
import typingsJapgolly.maximMazurokGapiClientContainer.anon.FieldsKeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientContainer.anon.Key
import typingsJapgolly.maximMazurokGapiClientContainer.anon.KeyName
import typingsJapgolly.maximMazurokGapiClientContainer.anon.KeyNameOauthtoken
import typingsJapgolly.maximMazurokGapiClientContainer.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientContainer.anon.KeyOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientContainer.anon.NameOauthtoken
import typingsJapgolly.maximMazurokGapiClientContainer.anon.OauthtokenParent
import typingsJapgolly.maximMazurokGapiClientContainer.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientContainer.anon.OauthtokenPrettyPrintProjectId
import typingsJapgolly.maximMazurokGapiClientContainer.anon.PrettyPrintProjectId
import typingsJapgolly.maximMazurokGapiClientContainer.anon.PrettyPrintProjectIdQuotaUser
import typingsJapgolly.maximMazurokGapiClientContainer.anon.PrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientContainer.anon.ProjectIdQuotaUser
import typingsJapgolly.maximMazurokGapiClientContainer.anon.ProjectIdQuotaUserResource
import typingsJapgolly.maximMazurokGapiClientContainer.anon.QuotaUserResource
import typingsJapgolly.maximMazurokGapiClientContainer.anon.QuotaUserResourceUploadType
import typingsJapgolly.maximMazurokGapiClientContainer.anon.QuotaUserUploadType
import typingsJapgolly.maximMazurokGapiClientContainer.anon.ResourceUploadType
import typingsJapgolly.maximMazurokGapiClientContainer.anon.ResourceUploadTypeUploadprotocol
import typingsJapgolly.maximMazurokGapiClientContainer.anon.UploadTypeUploadprotocol
import typingsJapgolly.maximMazurokGapiClientContainer.anon.UploadTypeUploadprotocolXgafv
import typingsJapgolly.maximMazurokGapiClientContainer.anon.UploadprotocolXgafv
import typingsJapgolly.maximMazurokGapiClientContainer.anon.UploadprotocolXgafvZone
import typingsJapgolly.maximMazurokGapiClientContainer.anon.Xgafv
import typingsJapgolly.maximMazurokGapiClientContainer.anon.XgafvZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClustersResource extends StObject {
  
  /** Sets the addons for a specific cluster. */
  def addons(request: PrettyPrintProjectId): Request[Operation] = js.native
  def addons(request: Xgafv, body: SetAddonsConfigRequest): Request[Operation] = js.native
  
  /** Completes master IP rotation. */
  def completeIpRotation(request: CallbackFields): Request[Operation] = js.native
  def completeIpRotation(request: Callback, body: CompleteIPRotationRequest): Request[Operation] = js.native
  /** Completes master IP rotation. */
  def completeIpRotation(request: ProjectIdQuotaUser): Request[Operation] = js.native
  def completeIpRotation(request: Xgafv, body: CompleteIPRotationRequest): Request[Operation] = js.native
  
  /**
    * Creates a cluster, consisting of the specified number and type of Google Compute Engine instances. By default, the cluster is created in the project's [default
    * network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks). One firewall is added for the cluster. After cluster creation, the Kubelet creates routes for each
    * node to allow the containers on that node to communicate with all other instances in the cluster. Finally, an entry is added to the project's global metadata indicating which CIDR
    * range the cluster is using.
    */
  def create(request: FieldsKey): Request[Operation] = js.native
  def create(request: Key, body: CreateClusterRequest): Request[Operation] = js.native
  def create(request: QuotaUserUploadType, body: CreateClusterRequest): Request[Operation] = js.native
  /**
    * Creates a cluster, consisting of the specified number and type of Google Compute Engine instances. By default, the cluster is created in the project's [default
    * network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks). One firewall is added for the cluster. After cluster creation, the Kubelet creates routes for each
    * node to allow the containers on that node to communicate with all other instances in the cluster. Finally, an entry is added to the project's global metadata indicating which CIDR
    * range the cluster is using.
    */
  def create(request: XgafvZone): Request[Operation] = js.native
  
  /**
    * Deletes the cluster, including the Kubernetes endpoint and all worker nodes. Firewalls and routes that were configured during cluster creation are also deleted. Other Google Compute
    * Engine resources that might be in use by the cluster, such as load balancer resources, are not deleted if they weren't present when the cluster was initially created.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: AltCallbackClusterId): Request[Operation] = js.native
  def delete(request: KeyName): Request[Operation] = js.native
  
  /** Gets the details of a specific cluster. */
  def get(): Request[Cluster] = js.native
  def get(request: AltCallbackClusterId): Request[Cluster] = js.native
  def get(request: KeyName): Request[Cluster] = js.native
  
  /** Gets the public component of the cluster signing keys in JSON Web Key format. This API is not yet intended for general use, and is not available for all clusters. */
  def getJwks(): Request[GetJSONWebKeysResponse] = js.native
  def getJwks(request: Key): Request[GetJSONWebKeysResponse] = js.native
  
  /** Enables or disables the ABAC authorization mechanism on a cluster. */
  def legacyAbac(request: CallbackClusterIdFields): Request[Operation] = js.native
  def legacyAbac(request: Xgafv, body: SetLegacyAbacRequest): Request[Operation] = js.native
  
  /** Lists all clusters owned by a project in either the specified zone or all zones. */
  def list(): Request[ListClustersResponse] = js.native
  def list(request: KeyOauthtoken): Request[ListClustersResponse] = js.native
  def list(request: OauthtokenParent): Request[ListClustersResponse] = js.native
  
  /**
    * Sets the locations for a specific cluster. Deprecated. Use
    * [projects.locations.clusters.update](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/update) instead.
    */
  def locations(request: ClusterIdFieldsKey): Request[Operation] = js.native
  def locations(request: Xgafv, body: SetLocationsRequest): Request[Operation] = js.native
  
  /** Sets the logging service for a specific cluster. */
  def logging(request: FieldsKeyOauthtoken): Request[Operation] = js.native
  def logging(request: Xgafv, body: SetLoggingServiceRequest): Request[Operation] = js.native
  
  /** Updates the master for a specific cluster. */
  def master(request: KeyOauthtokenPrettyPrint): Request[Operation] = js.native
  def master(request: Xgafv, body: UpdateMasterRequest): Request[Operation] = js.native
  
  /** Sets the monitoring service for a specific cluster. */
  def monitoring(request: OauthtokenPrettyPrintProjectId): Request[Operation] = js.native
  def monitoring(request: Xgafv, body: SetMonitoringServiceRequest): Request[Operation] = js.native
  
  var nodePools: NodePoolsResource = js.native
  
  /** Sets labels on a cluster. */
  def resourceLabels(request: PrettyPrintProjectIdQuotaUser): Request[Operation] = js.native
  def resourceLabels(request: Xgafv, body: SetLabelsRequest): Request[Operation] = js.native
  
  def setAddons(request: Callback, body: SetAddonsConfigRequest): Request[Operation] = js.native
  /** Sets the addons for a specific cluster. */
  def setAddons(request: NameOauthtoken): Request[Operation] = js.native
  
  def setLegacyAbac(request: Callback, body: SetLegacyAbacRequest): Request[Operation] = js.native
  /** Enables or disables the ABAC authorization mechanism on a cluster. */
  def setLegacyAbac(request: OauthtokenPrettyPrint): Request[Operation] = js.native
  
  def setLocations(request: Callback, body: SetLocationsRequest): Request[Operation] = js.native
  /**
    * Sets the locations for a specific cluster. Deprecated. Use
    * [projects.locations.clusters.update](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/update) instead.
    */
  def setLocations(request: PrettyPrintQuotaUser): Request[Operation] = js.native
  
  def setLogging(request: Callback, body: SetLoggingServiceRequest): Request[Operation] = js.native
  /** Sets the logging service for a specific cluster. */
  def setLogging(request: QuotaUserResource): Request[Operation] = js.native
  
  def setMaintenancePolicy(request: Callback, body: SetMaintenancePolicyRequest): Request[Operation] = js.native
  /** Sets the maintenance policy for a cluster. */
  def setMaintenancePolicy(request: ProjectIdQuotaUserResource): Request[Operation] = js.native
  /** Sets the maintenance policy for a cluster. */
  def setMaintenancePolicy(request: ResourceUploadType): Request[Operation] = js.native
  def setMaintenancePolicy(request: Xgafv, body: SetMaintenancePolicyRequest): Request[Operation] = js.native
  
  def setMasterAuth(request: Callback, body: SetMasterAuthRequest): Request[Operation] = js.native
  /** Sets master auth materials. Currently supports changing the admin password or a specific cluster, either via password generation or explicitly setting the password. */
  def setMasterAuth(request: QuotaUserResourceUploadType): Request[Operation] = js.native
  /** Sets master auth materials. Currently supports changing the admin password or a specific cluster, either via password generation or explicitly setting the password. */
  def setMasterAuth(request: UploadTypeUploadprotocol): Request[Operation] = js.native
  def setMasterAuth(request: Xgafv, body: SetMasterAuthRequest): Request[Operation] = js.native
  
  def setMonitoring(request: Callback, body: SetMonitoringServiceRequest): Request[Operation] = js.native
  /** Sets the monitoring service for a specific cluster. */
  def setMonitoring(request: UploadprotocolXgafv): Request[Operation] = js.native
  
  /** Enables or disables Network Policy for a cluster. */
  def setNetworkPolicy(request: AccesstokenAltCallback): Request[Operation] = js.native
  def setNetworkPolicy(request: Callback, body: SetNetworkPolicyRequest): Request[Operation] = js.native
  /** Enables or disables Network Policy for a cluster. */
  def setNetworkPolicy(request: ResourceUploadTypeUploadprotocol): Request[Operation] = js.native
  def setNetworkPolicy(request: Xgafv, body: SetNetworkPolicyRequest): Request[Operation] = js.native
  
  /** Sets labels on a cluster. */
  def setResourceLabels(request: AltCallbackFields): Request[Operation] = js.native
  def setResourceLabels(request: Callback, body: SetLabelsRequest): Request[Operation] = js.native
  
  /** Starts master IP rotation. */
  def startIpRotation(request: CallbackFieldsKey): Request[Operation] = js.native
  def startIpRotation(request: Callback, body: StartIPRotationRequest): Request[Operation] = js.native
  /** Starts master IP rotation. */
  def startIpRotation(request: UploadTypeUploadprotocolXgafv): Request[Operation] = js.native
  def startIpRotation(request: Xgafv, body: StartIPRotationRequest): Request[Operation] = js.native
  
  def update(request: Callback, body: UpdateClusterRequest): Request[Operation] = js.native
  /** Updates the settings of a specific cluster. */
  def update(request: FieldsKeyName): Request[Operation] = js.native
  /** Updates the settings of a specific cluster. */
  def update(request: UploadprotocolXgafvZone): Request[Operation] = js.native
  def update(request: Xgafv, body: UpdateClusterRequest): Request[Operation] = js.native
  
  def updateMaster(request: Callback, body: UpdateMasterRequest): Request[Operation] = js.native
  /** Updates the master for a specific cluster. */
  def updateMaster(request: KeyNameOauthtoken): Request[Operation] = js.native
  
  var `well-known`: WellKnownResource = js.native
}
