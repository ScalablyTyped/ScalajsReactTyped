package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.outputMod.apps.v1beta2.ReplicaSetSpec
import typingsJapgolly.pulumiKubernetes.outputMod.apps.v1beta2.ReplicaSetStatus
import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1beta2
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apps/v1beta2/ReplicaSet", JSImport.Namespace)
@js.native
object replicaSetMod extends js.Object {
  @js.native
  class ReplicaSet protected () extends CustomResource {
    /**
      * Create a apps.v1beta2.ReplicaSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta2.ReplicaSet) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta2.ReplicaSet,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[appsSlashv1beta2] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ReplicaSet] = js.native
    /**
      * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s)
      * that the ReplicaSet manages. Standard object's metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    /**
      * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val spec: Output_[ReplicaSetSpec] = js.native
    /**
      * Status is the most recently observed status of the ReplicaSet. This data may be out of date
      * by some window of time. Populated by the system. Read-only. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val status: Output_[ReplicaSetStatus] = js.native
  }
  
  /* static members */
  @js.native
  object ReplicaSet extends js.Object {
    /**
      * Get the state of an existing `ReplicaSet` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): ReplicaSet = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): ReplicaSet = js.native
    /**
      * Returns true if the given object is an instance of ReplicaSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/ReplicaSet.ReplicaSet */ Boolean = js.native
  }
  
}

