package typingsJapgolly.pulumiKubernetes

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.outputMod.core.v1.TopologySelectorTerm
import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/storage/v1beta1/StorageClass", JSImport.Namespace)
@js.native
object storageClassMod extends js.Object {
  @js.native
  class StorageClass protected () extends CustomResource {
    /**
      * Create a storage.v1beta1.StorageClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.storage.v1beta1.StorageClass) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.storage.v1beta1.StorageClass,
      opts: CustomResourceOptions
    ) = this()
    /**
      * AllowVolumeExpansion shows whether the storage class allow volume expand
      */
    val allowVolumeExpansion: Output_[Boolean] = js.native
    /**
      * Restrict the node topologies where volumes can be dynamically provisioned. Each volume
      * plugin defines its own supported topology specifications. An empty TopologySelectorTerm
      * list means there is no topology restriction. This field is only honored by servers that
      * enable the VolumeScheduling feature.
      */
    val allowedTopologies: Output_[js.Array[TopologySelectorTerm]] = js.native
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[storageDotk8sDotioSlashv1beta1] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.StorageClass] = js.native
    /**
      * Standard object's metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with these
      * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
      * is invalid.
      */
    val mountOptions: Output_[js.Array[String]] = js.native
    /**
      * Parameters holds the parameters for the provisioner that should create volumes of this
      * storage class.
      */
    val parameters: Output_[StringDictionary[Output_[String]]] = js.native
    /**
      * Provisioner indicates the type of the provisioner.
      */
    val provisioner: Output_[String] = js.native
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with this
      * reclaimPolicy. Defaults to Delete.
      */
    val reclaimPolicy: Output_[String] = js.native
    /**
      * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
      * When unset, VolumeBindingImmediate is used. This field is only honored by servers that
      * enable the VolumeScheduling feature.
      */
    val volumeBindingMode: Output_[String] = js.native
  }
  
  /* static members */
  @js.native
  object StorageClass extends js.Object {
    /**
      * Get the state of an existing `StorageClass` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): StorageClass = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): StorageClass = js.native
    /**
      * Returns true if the given object is an instance of StorageClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/StorageClass.StorageClass */ Boolean = js.native
  }
  
}

