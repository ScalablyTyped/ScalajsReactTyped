package typingsJapgolly.gapiClientContainer.gapi.client.container

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContainer.AnonAlt
import typingsJapgolly.gapiClientContainer.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  var nodePools: NodePoolsResource
  /** Sets the addons of a specific cluster. */
  def addons(request: AnonAlt): Request_[Operation]
  /** Completes master IP rotation. */
  def completeIpRotation(request: AnonAlt): Request_[Operation]
  /**
    * Creates a cluster, consisting of the specified number and type of Google
    * Compute Engine instances.
    *
    * By default, the cluster is created in the project's
    * [default network](/compute/docs/networks-and-firewalls#networks).
    *
    * One firewall is added for the cluster. After cluster creation,
    * the cluster creates routes for each node to allow the containers
    * on that node to communicate with all other instances in the
    * cluster.
    *
    * Finally, an entry is added to the project's global metadata indicating
    * which CIDR range is being used by the cluster.
    */
  def create(request: AnonBearertoken): Request_[Operation]
  /**
    * Deletes the cluster, including the Kubernetes endpoint and all worker
    * nodes.
    *
    * Firewalls and routes that were configured during cluster creation
    * are also deleted.
    *
    * Other Google Compute Engine resources that might be in use by the cluster
    * (e.g. load balancer resources) will not be deleted if they weren't present
    * at the initial create time.
    */
  def delete(request: AnonAlt): Request_[Operation]
  /** Gets the details of a specific cluster. */
  def get(request: AnonAlt): Request_[Cluster]
  /** Enables or disables the ABAC authorization mechanism on a cluster. */
  def legacyAbac(request: AnonAlt): Request_[Operation]
  /**
    * Lists all clusters owned by a project in either the specified zone or all
    * zones.
    */
  def list(request: AnonBearertoken): Request_[ListClustersResponse]
  /** Sets the locations of a specific cluster. */
  def locations(request: AnonAlt): Request_[Operation]
  /** Sets the logging service of a specific cluster. */
  def logging(request: AnonAlt): Request_[Operation]
  /** Updates the master of a specific cluster. */
  def master(request: AnonAlt): Request_[Operation]
  /** Sets the monitoring service of a specific cluster. */
  def monitoring(request: AnonAlt): Request_[Operation]
  /** Sets labels on a cluster. */
  def resourceLabels(request: AnonAlt): Request_[Operation]
  /** Sets the maintenance policy for a cluster. */
  def setMaintenancePolicy(request: AnonAlt): Request_[Operation]
  /**
    * Used to set master auth materials. Currently supports :-
    * Changing the admin password of a specific cluster.
    * This can be either via password generation or explicitly set the password.
    */
  def setMasterAuth(request: AnonAlt): Request_[Operation]
  /** Enables/Disables Network Policy for a cluster. */
  def setNetworkPolicy(request: AnonAlt): Request_[Operation]
  /** Start master IP rotation. */
  def startIpRotation(request: AnonAlt): Request_[Operation]
  /** Updates the settings of a specific cluster. */
  def update(request: AnonAlt): Request_[Operation]
}

object ClustersResource {
  @scala.inline
  def apply(
    addons: AnonAlt => CallbackTo[Request_[Operation]],
    completeIpRotation: AnonAlt => CallbackTo[Request_[Operation]],
    create: AnonBearertoken => CallbackTo[Request_[Operation]],
    delete: AnonAlt => CallbackTo[Request_[Operation]],
    get: AnonAlt => CallbackTo[Request_[Cluster]],
    legacyAbac: AnonAlt => CallbackTo[Request_[Operation]],
    list: AnonBearertoken => CallbackTo[Request_[ListClustersResponse]],
    locations: AnonAlt => CallbackTo[Request_[Operation]],
    logging: AnonAlt => CallbackTo[Request_[Operation]],
    master: AnonAlt => CallbackTo[Request_[Operation]],
    monitoring: AnonAlt => CallbackTo[Request_[Operation]],
    nodePools: NodePoolsResource,
    resourceLabels: AnonAlt => CallbackTo[Request_[Operation]],
    setMaintenancePolicy: AnonAlt => CallbackTo[Request_[Operation]],
    setMasterAuth: AnonAlt => CallbackTo[Request_[Operation]],
    setNetworkPolicy: AnonAlt => CallbackTo[Request_[Operation]],
    startIpRotation: AnonAlt => CallbackTo[Request_[Operation]],
    update: AnonAlt => CallbackTo[Request_[Operation]]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(nodePools = nodePools.asInstanceOf[js.Any])
    __obj.updateDynamic("addons")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => addons(t0).runNow()))
    __obj.updateDynamic("completeIpRotation")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => completeIpRotation(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonBearertoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("legacyAbac")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => legacyAbac(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonBearertoken) => list(t0).runNow()))
    __obj.updateDynamic("locations")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => locations(t0).runNow()))
    __obj.updateDynamic("logging")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => logging(t0).runNow()))
    __obj.updateDynamic("master")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => master(t0).runNow()))
    __obj.updateDynamic("monitoring")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => monitoring(t0).runNow()))
    __obj.updateDynamic("resourceLabels")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => resourceLabels(t0).runNow()))
    __obj.updateDynamic("setMaintenancePolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => setMaintenancePolicy(t0).runNow()))
    __obj.updateDynamic("setMasterAuth")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => setMasterAuth(t0).runNow()))
    __obj.updateDynamic("setNetworkPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => setNetworkPolicy(t0).runNow()))
    __obj.updateDynamic("startIpRotation")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => startIpRotation(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[ClustersResource]
  }
}

