package typingsJapgolly.pulumiKubernetes.inputMod.node.v1alpha1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are
  * required to describe the RuntimeClass to the Container Runtime Interface (CRI)
  * implementation, as well as any other components that need to understand how the pod will be
  * run. The RuntimeClassSpec is immutable.
  */
trait RuntimeClassSpec extends js.Object {
  /**
    * Overhead represents the resource overhead associated with running a pod for a given
    * RuntimeClass. For more details, see
    * https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is
    * alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the
    * PodOverhead feature.
    */
  var overhead: js.UndefOr[Input[Overhead]] = js.undefined
  /**
    * RuntimeHandler specifies the underlying runtime and configuration that the CRI
    * implementation will use to handle pods of this class. The possible values are specific to
    * the node & CRI configuration.  It is assumed that all handlers are available on every node,
    * and handlers of the same name are equivalent on every node. For example, a handler called
    * "runc" might specify that the runc OCI runtime (using native Linux containers) will be used
    * to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123)
    * requirements and is immutable.
    */
  var runtimeHandler: Input[String]
  /**
    * Scheduling holds the scheduling constraints to ensure that pods running with this
    * RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this
    * RuntimeClass is assumed to be supported by all nodes.
    */
  var scheduling: js.UndefOr[Input[Scheduling]] = js.undefined
}

object RuntimeClassSpec {
  @scala.inline
  def apply(
    runtimeHandler: Input[String],
    overhead: Input[Overhead] = null,
    scheduling: Input[Scheduling] = null
  ): RuntimeClassSpec = {
    val __obj = js.Dynamic.literal(runtimeHandler = runtimeHandler.asInstanceOf[js.Any])
    if (overhead != null) __obj.updateDynamic("overhead")(overhead.asInstanceOf[js.Any])
    if (scheduling != null) __obj.updateDynamic("scheduling")(scheduling.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeClassSpec]
  }
}

