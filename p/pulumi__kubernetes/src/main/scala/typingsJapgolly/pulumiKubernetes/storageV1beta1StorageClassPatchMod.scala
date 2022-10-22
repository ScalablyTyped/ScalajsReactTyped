package typingsJapgolly.pulumiKubernetes

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.StorageClass
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.TopologySelectorTermPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageV1beta1StorageClassPatchMod {
  
  @JSImport("@pulumi/kubernetes/storage/v1beta1/storageClassPatch", "StorageClassPatch")
  @js.native
  open class StorageClassPatch protected () extends CustomResource {
    /**
      * Create a StorageClassPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StorageClassPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StorageClassPatchArgs, opts: CustomResourceOptions) = this()
    
    /**
      * AllowVolumeExpansion shows whether the storage class allow volume expand
      */
    val allowVolumeExpansion: Output_[Boolean] = js.native
    
    /**
      * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    val allowedTopologies: Output_[js.Array[TopologySelectorTermPatch]] = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[storageDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[StorageClass] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMetaPatch] = js.native
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
      */
    val mountOptions: Output_[js.Array[String]] = js.native
    
    /**
      * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
      */
    val parameters: Output_[StringDictionary[String]] = js.native
    
    /**
      * Provisioner indicates the type of the provisioner.
      */
    val provisioner: Output_[String] = js.native
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
      */
    val reclaimPolicy: Output_[String] = js.native
    
    /**
      * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    val volumeBindingMode: Output_[String] = js.native
  }
  /* static members */
  object StorageClassPatch {
    
    @JSImport("@pulumi/kubernetes/storage/v1beta1/storageClassPatch", "StorageClassPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StorageClassPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): StorageClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[StorageClassPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): StorageClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StorageClassPatch]
    
    /**
      * Returns true if the given object is an instance of StorageClassPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClassPatch.StorageClassPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/storageClassPatch.StorageClassPatch */ Boolean]
  }
  
  trait StorageClassPatchArgs extends StObject {
    
    /**
      * AllowVolumeExpansion shows whether the storage class allow volume expand
      */
    var allowVolumeExpansion: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    var allowedTopologies: js.UndefOr[
        Input[
          js.Array[
            Input[typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.TopologySelectorTermPatch]
          ]
        ]
      ] = js.undefined
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[StorageClass]] = js.undefined
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]] = js.undefined
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
      */
    var mountOptions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
      */
    var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Provisioner indicates the type of the provisioner.
      */
    var provisioner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
      */
    var reclaimPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
      */
    var volumeBindingMode: js.UndefOr[Input[String]] = js.undefined
  }
  object StorageClassPatchArgs {
    
    inline def apply(): StorageClassPatchArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageClassPatchArgs]
    }
    
    extension [Self <: StorageClassPatchArgs](x: Self) {
      
      inline def setAllowVolumeExpansion(value: Input[Boolean]): Self = StObject.set(x, "allowVolumeExpansion", value.asInstanceOf[js.Any])
      
      inline def setAllowVolumeExpansionUndefined: Self = StObject.set(x, "allowVolumeExpansion", js.undefined)
      
      inline def setAllowedTopologies(
        value: Input[
              js.Array[
                Input[typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.TopologySelectorTermPatch]
              ]
            ]
      ): Self = StObject.set(x, "allowedTopologies", value.asInstanceOf[js.Any])
      
      inline def setAllowedTopologiesUndefined: Self = StObject.set(x, "allowedTopologies", js.undefined)
      
      inline def setAllowedTopologiesVarargs(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.TopologySelectorTermPatch]*): Self = StObject.set(x, "allowedTopologies", js.Array(value*))
      
      inline def setApiVersion(value: Input[storageDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[StorageClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setMountOptions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
      
      inline def setMountOptionsUndefined: Self = StObject.set(x, "mountOptions", js.undefined)
      
      inline def setMountOptionsVarargs(value: Input[String]*): Self = StObject.set(x, "mountOptions", js.Array(value*))
      
      inline def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setProvisioner(value: Input[String]): Self = StObject.set(x, "provisioner", value.asInstanceOf[js.Any])
      
      inline def setProvisionerUndefined: Self = StObject.set(x, "provisioner", js.undefined)
      
      inline def setReclaimPolicy(value: Input[String]): Self = StObject.set(x, "reclaimPolicy", value.asInstanceOf[js.Any])
      
      inline def setReclaimPolicyUndefined: Self = StObject.set(x, "reclaimPolicy", js.undefined)
      
      inline def setVolumeBindingMode(value: Input[String]): Self = StObject.set(x, "volumeBindingMode", value.asInstanceOf[js.Any])
      
      inline def setVolumeBindingModeUndefined: Self = StObject.set(x, "volumeBindingMode", js.undefined)
    }
  }
}
