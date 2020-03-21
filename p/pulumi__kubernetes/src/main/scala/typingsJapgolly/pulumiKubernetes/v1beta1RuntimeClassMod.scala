package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.outputMod.node.v1beta1.Overhead
import typingsJapgolly.pulumiKubernetes.outputMod.node.v1beta1.Scheduling
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.nodeDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/node/v1beta1/RuntimeClass", JSImport.Namespace)
@js.native
object v1beta1RuntimeClassMod extends js.Object {
  @js.native
  class RuntimeClass protected () extends CustomResource {
    /**
      * Create a node.v1beta1.RuntimeClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.node.v1beta1.RuntimeClass) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.node.v1beta1.RuntimeClass,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[nodeDotk8sDotioSlashv1beta1] = js.native
    /**
      * Handler specifies the underlying runtime and configuration that the CRI implementation will
      * use to handle pods of this class. The possible values are specific to the node & CRI
      * configuration.  It is assumed that all handlers are available on every node, and handlers
      * of the same name are equivalent on every node. For example, a handler called "runc" might
      * specify that the runc OCI runtime (using native Linux containers) will be used to run the
      * containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and
      * is immutable.
      */
    val handler: Output_[String] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass] = js.native
    /**
      * More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    /**
      * Overhead represents the resource overhead associated with running a pod for a given
      * RuntimeClass. For more details, see
      * https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is
      * alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the
      * PodOverhead feature.
      */
    val overhead: Output_[Overhead] = js.native
    /**
      * Scheduling holds the scheduling constraints to ensure that pods running with this
      * RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this
      * RuntimeClass is assumed to be supported by all nodes.
      */
    val scheduling: Output_[Scheduling] = js.native
  }
  
  /* static members */
  @js.native
  object RuntimeClass extends js.Object {
    /**
      * Get the state of an existing `RuntimeClass` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): RuntimeClass = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): RuntimeClass = js.native
    /**
      * Returns true if the given object is an instance of RuntimeClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1beta1/RuntimeClass.RuntimeClass */ Boolean = js.native
  }
  
}

