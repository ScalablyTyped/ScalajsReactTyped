package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.outputMod.policy.v1beta1.PodDisruptionBudgetSpec
import typingsJapgolly.pulumiKubernetes.outputMod.policy.v1beta1.PodDisruptionBudgetStatus
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1beta1
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/policy/v1beta1/PodDisruptionBudget", JSImport.Namespace)
@js.native
object podDisruptionBudgetMod extends js.Object {
  @js.native
  class PodDisruptionBudget protected () extends CustomResource {
    /**
      * Create a policy.v1beta1.PodDisruptionBudget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.policy.v1beta1.PodDisruptionBudget) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.policy.v1beta1.PodDisruptionBudget,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[policySlashv1beta1] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget] = js.native
    val metadata: Output_[ObjectMeta] = js.native
    /**
      * Specification of the desired behavior of the PodDisruptionBudget.
      */
    val spec: Output_[PodDisruptionBudgetSpec] = js.native
    /**
      * Most recently observed status of the PodDisruptionBudget.
      */
    val status: Output_[PodDisruptionBudgetStatus] = js.native
  }
  
  /* static members */
  @js.native
  object PodDisruptionBudget extends js.Object {
    /**
      * Get the state of an existing `PodDisruptionBudget` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): PodDisruptionBudget = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): PodDisruptionBudget = js.native
    /**
      * Returns true if the given object is an instance of PodDisruptionBudget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/PodDisruptionBudget.PodDisruptionBudget */ Boolean = js.native
  }
  
}

