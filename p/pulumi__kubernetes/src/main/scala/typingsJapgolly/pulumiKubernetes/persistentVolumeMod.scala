package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.outputMod.core.v1.PersistentVolumeSpec
import typingsJapgolly.pulumiKubernetes.outputMod.core.v1.PersistentVolumeStatus
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

@JSImport("@pulumi/kubernetes/core/v1/PersistentVolume", JSImport.Namespace)
@js.native
object persistentVolumeMod extends js.Object {
  @js.native
  class PersistentVolume protected () extends CustomResource {
    /**
      * Create a core.v1.PersistentVolume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.core.v1.PersistentVolume) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.core.v1.PersistentVolume,
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
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PersistentVolume] = js.native
    /**
      * Standard object's metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    /**
      * Spec defines a specification of a persistent volume owned by the cluster. Provisioned by an
      * administrator. More info:
      * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
      */
    val spec: Output_[PersistentVolumeSpec] = js.native
    /**
      * Status represents the current information/status for the persistent volume. Populated by
      * the system. Read-only. More info:
      * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
      */
    val status: Output_[PersistentVolumeStatus] = js.native
  }
  
  /* static members */
  @js.native
  object PersistentVolume extends js.Object {
    /**
      * Get the state of an existing `PersistentVolume` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): PersistentVolume = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): PersistentVolume = js.native
    /**
      * Returns true if the given object is an instance of PersistentVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/PersistentVolume.PersistentVolume */ Boolean = js.native
  }
  
}

