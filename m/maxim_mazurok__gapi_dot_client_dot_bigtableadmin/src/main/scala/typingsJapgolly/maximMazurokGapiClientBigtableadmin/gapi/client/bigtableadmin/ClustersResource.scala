package typingsJapgolly.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.Alt
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.ClusterId
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.Parent
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.Resource
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.UpdateMask
import typingsJapgolly.maximMazurokGapiClientBigtableadmin.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClustersResource extends StObject {
  
  var backups: BackupsResource = js.native
  
  /**
    * Creates a cluster within an instance. Note that exactly one of Cluster.serve_nodes and Cluster.cluster_config.cluster_autoscaling_config can be set. If serve_nodes is set to
    * non-zero, then the cluster is manually scaled. If cluster_config.cluster_autoscaling_config is non-empty, then autoscaling is enabled.
    */
  def create(request: ClusterId): Request[Operation] = js.native
  def create(request: Parent, body: Cluster): Request[Operation] = js.native
  
  /** Deletes a cluster from an instance. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets information about a cluster. */
  def get(): Request[Cluster] = js.native
  def get(request: Alt): Request[Cluster] = js.native
  
  var hotTablets: HotTabletsResource = js.native
  
  /** Lists information about clusters in an instance. */
  def list(): Request[ListClustersResponse] = js.native
  def list(request: PageToken): Request[ListClustersResponse] = js.native
  
  /**
    * Partially updates a cluster within a project. This method is the preferred way to update a Cluster. To enable and update autoscaling, set cluster_config.cluster_autoscaling_config.
    * When autoscaling is enabled, serve_nodes is treated as an OUTPUT_ONLY field, meaning that updates to it are ignored. Note that an update cannot simultaneously set serve_nodes to
    * non-zero and cluster_config.cluster_autoscaling_config to non-empty, and also specify both in the update_mask. To disable autoscaling, clear
    * cluster_config.cluster_autoscaling_config, and explicitly set a serve_node count via the update_mask.
    */
  def partialUpdateCluster(request: Resource): Request[Operation] = js.native
  def partialUpdateCluster(request: UpdateMask, body: Cluster): Request[Operation] = js.native
  
  def update(request: Alt, body: Cluster): Request[Operation] = js.native
  /**
    * Updates a cluster within an instance. Note that UpdateCluster does not support updating cluster_config.cluster_autoscaling_config. In order to update it, you must use
    * PartialUpdateCluster.
    */
  def update(request: UploadType): Request[Operation] = js.native
}
