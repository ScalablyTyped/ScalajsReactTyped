package typingsJapgolly.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodStatus represents information about the status of a pod. Status may trail the actual state
  * of a system, especially if the node that hosts the pod cannot contact the control plane.
  */
trait PodStatus extends js.Object {
  /**
    * Current service state of pod. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
    */
  val conditions: js.Array[PodCondition]
  /**
    * The list has one entry per container in the manifest. Each entry is currently the output of
    * `docker inspect`. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
    */
  val containerStatuses: js.Array[ContainerStatus]
  /**
    * Status for any ephemeral containers that have run in this pod. This field is alpha-level
    * and is only populated by servers that enable the EphemeralContainers feature.
    */
  val ephemeralContainerStatuses: js.Array[ContainerStatus]
  /**
    * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
    */
  val hostIP: String
  /**
    * The list has one entry per init container in the manifest. The most recent successful init
    * container will have ready = true, the most recently started container will have startTime
    * set. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
    */
  val initContainerStatuses: js.Array[ContainerStatus]
  /**
    * A human readable message indicating details about why the pod is in this condition.
    */
  val message: String
  /**
    * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot
    * be scheduled right away as preemption victims receive their graceful termination periods.
    * This field does not guarantee that the pod will be scheduled on this node. Scheduler may
    * decide to place the pod elsewhere if other nodes become available sooner. Scheduler may
    * also decide to give the resources on this node to a higher priority pod that is created
    * after preemption. As a result, this field may be different than PodSpec.nodeName when the
    * pod is scheduled.
    */
  val nominatedNodeName: String
  /**
    * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle.
    * The conditions array, the reason and message fields, and the individual container status
    * arrays contain more detail about the pod's status. There are five possible phase values:
    *
    * Pending: The pod has been accepted by the Kubernetes system, but one or more of the
    * container images has not been created. This includes time before being scheduled as well as
    * time spent downloading images over the network, which could take a while. Running: The pod
    * has been bound to a node, and all of the containers have been created. At least one
    * container is still running, or is in the process of starting or restarting. Succeeded: All
    * containers in the pod have terminated in success, and will not be restarted. Failed: All
    * containers in the pod have terminated, and at least one container has terminated in
    * failure. The container either exited with non-zero status or was terminated by the system.
    * Unknown: For some reason the state of the pod could not be obtained, typically due to an
    * error in communicating with the host of the pod.
    *
    * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
    */
  val phase: String
  /**
    * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet
    * allocated.
    */
  val podIP: String
  /**
    * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th
    * entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4
    * and IPv6. This list is empty if no IPs have been allocated yet.
    */
  val podIPs: js.Array[PodIP]
  /**
    * The Quality of Service (QOS) classification assigned to the pod based on resource
    * requirements See PodQOSClass type for available QOS classes More info:
    * https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
    */
  val qosClass: String
  /**
    * A brief CamelCase message indicating details about why the pod is in this state. e.g.
    * 'Evicted'
    */
  val reason: String
  /**
    * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before
    * the Kubelet pulled the container image(s) for the pod.
    */
  val startTime: String
}

object PodStatus {
  @scala.inline
  def apply(
    conditions: js.Array[PodCondition],
    containerStatuses: js.Array[ContainerStatus],
    ephemeralContainerStatuses: js.Array[ContainerStatus],
    hostIP: String,
    initContainerStatuses: js.Array[ContainerStatus],
    message: String,
    nominatedNodeName: String,
    phase: String,
    podIP: String,
    podIPs: js.Array[PodIP],
    qosClass: String,
    reason: String,
    startTime: String
  ): PodStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], containerStatuses = containerStatuses.asInstanceOf[js.Any], ephemeralContainerStatuses = ephemeralContainerStatuses.asInstanceOf[js.Any], hostIP = hostIP.asInstanceOf[js.Any], initContainerStatuses = initContainerStatuses.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nominatedNodeName = nominatedNodeName.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], podIP = podIP.asInstanceOf[js.Any], podIPs = podIPs.asInstanceOf[js.Any], qosClass = qosClass.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PodStatus]
  }
}

