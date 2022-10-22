package typingsJapgolly.maximMazurokGapiClientDataproc.gapi.client.dataproc

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.ActionOnFailedPrimaryWorkers
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.ClusterName
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.Fields
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.Filter
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.GracefulDecommissionTimeout
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.Project
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.ProjectId
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.Region
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.UpdateMask
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.Uploadprotocol
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClustersResource extends StObject {
  
  /**
    * Creates a cluster in a project. The returned Operation.metadata will be ClusterOperationMetadata
    * (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#clusteroperationmetadata).
    */
  def create(request: ActionOnFailedPrimaryWorkers): Request[Operation] = js.native
  def create(request: ProjectId, body: Cluster): Request[Operation] = js.native
  
  /**
    * Deletes a cluster in a project. The returned Operation.metadata will be ClusterOperationMetadata
    * (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#clusteroperationmetadata).
    */
  def delete(): Request[Operation] = js.native
  def delete(request: ClusterName): Request[Operation] = js.native
  
  /**
    * Gets cluster diagnostic information. The returned Operation.metadata will be ClusterOperationMetadata
    * (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#clusteroperationmetadata). After the operation completes, Operation.response contains
    * DiagnoseClusterResults (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#diagnoseclusterresults).
    */
  def diagnose(request: Region): Request[Operation] = js.native
  def diagnose(request: Uploadprotocol, body: DiagnoseClusterRequest): Request[Operation] = js.native
  
  /** Gets the resource representation for a cluster in a project. */
  def get(): Request[Cluster] = js.native
  def get(request: Uploadprotocol): Request[Cluster] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: Fields, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Inject encrypted credentials into all of the VMs in a cluster.The target cluster must be a personal auth cluster assigned to the user who is issuing the RPC. */
  def injectCredentials(request: typingsJapgolly.maximMazurokGapiClientDataproc.anon.Cluster): Request[Operation] = js.native
  def injectCredentials(request: Project, body: InjectCredentialsRequest): Request[Operation] = js.native
  
  /** Lists all regions/{region}/clusters in a project alphabetically. */
  def list(): Request[ListClustersResponse] = js.native
  def list(request: Filter): Request[ListClustersResponse] = js.native
  
  /**
    * Updates a cluster in a project. The returned Operation.metadata will be ClusterOperationMetadata
    * (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#clusteroperationmetadata). The cluster must be in a RUNNING state or an error is returned.
    */
  def patch(request: GracefulDecommissionTimeout): Request[Operation] = js.native
  def patch(request: UpdateMask, body: Cluster): Request[Operation] = js.native
  
  def repair(request: Uploadprotocol, body: RepairClusterRequest): Request[Operation] = js.native
  /** Repairs a cluster. */
  def repair(request: Xgafv): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors. */
  def setIamPolicy(request: Fields, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Starts a cluster in a project. */
  def start(request: AccesstokenAlt): Request[Operation] = js.native
  def start(request: Uploadprotocol, body: StartClusterRequest): Request[Operation] = js.native
  
  /** Stops a cluster in a project. */
  def stop(request: AltCallback): Request[Operation] = js.native
  def stop(request: Uploadprotocol, body: StopClusterRequest): Request[Operation] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Fields, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
