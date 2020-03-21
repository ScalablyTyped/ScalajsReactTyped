package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.outputMod.core.v1.LocalObjectReference
import typingsJapgolly.pulumiKubernetes.outputMod.core.v1.ObjectReference
import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1/ServiceAccount", JSImport.Namespace)
@js.native
object serviceAccountMod extends js.Object {
  @js.native
  class ServiceAccount protected () extends CustomResource {
    /**
      * Create a core.v1.ServiceAccount resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.core.v1.ServiceAccount) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.core.v1.ServiceAccount,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[v1] = js.native
    /**
      * AutomountServiceAccountToken indicates whether pods running as this service account should
      * have an API token automatically mounted. Can be overridden at the pod level.
      */
    val automountServiceAccountToken: Output_[Boolean] = js.native
    /**
      * ImagePullSecrets is a list of references to secrets in the same namespace to use for
      * pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are
      * distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are
      * only accessed by the kubelet. More info:
      * https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
      */
    val imagePullSecrets: Output_[js.Array[LocalObjectReference]] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount] = js.native
    /**
      * Standard object's metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    /**
      * Secrets is the list of secrets allowed to be used by pods running using this
      * ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
      */
    val secrets: Output_[js.Array[ObjectReference]] = js.native
  }
  
  /* static members */
  @js.native
  object ServiceAccount extends js.Object {
    /**
      * Get the state of an existing `ServiceAccount` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): ServiceAccount = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): ServiceAccount = js.native
    /**
      * Returns true if the given object is an instance of ServiceAccount.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/ServiceAccount.ServiceAccount */ Boolean = js.native
  }
  
}

