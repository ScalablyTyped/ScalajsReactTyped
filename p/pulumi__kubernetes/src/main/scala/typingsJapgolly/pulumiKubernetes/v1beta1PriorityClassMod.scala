package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/scheduling/v1beta1/PriorityClass", JSImport.Namespace)
@js.native
object v1beta1PriorityClassMod extends js.Object {
  @js.native
  class PriorityClass protected () extends CustomResource {
    /**
      * Create a scheduling.v1beta1.PriorityClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.scheduling.v1beta1.PriorityClass) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.scheduling.v1beta1.PriorityClass,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[schedulingDotk8sDotioSlashv1beta1] = js.native
    /**
      * description is an arbitrary string that usually provides guidelines on when this priority
      * class should be used.
      */
    val description: Output_[String] = js.native
    /**
      * globalDefault specifies whether this PriorityClass should be considered as the default
      * priority for pods that do not have any priority class. Only one PriorityClass can be marked
      * as `globalDefault`. However, if more than one PriorityClasses exists with their
      * `globalDefault` field set to true, the smallest value of such global default
      * PriorityClasses will be used as the default priority.
      */
    val globalDefault: Output_[Boolean] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass] = js.native
    /**
      * Standard object's metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    /**
      * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
      * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
      * and is only honored by servers that enable the NonPreemptingPriority feature.
      */
    val preemptionPolicy: Output_[String] = js.native
    /**
      * The value of this priority class. This is the actual priority that pods receive when they
      * have the name of this class in their pod spec.
      */
    val value: Output_[Double] = js.native
  }
  
  /* static members */
  @js.native
  object PriorityClass extends js.Object {
    /**
      * Get the state of an existing `PriorityClass` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): PriorityClass = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): PriorityClass = js.native
    /**
      * Returns true if the given object is an instance of PriorityClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1beta1/PriorityClass.PriorityClass */ Boolean = js.native
  }
  
}

