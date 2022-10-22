package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodPreset
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.settingsDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.settings.v1alpha1.PodPresetSpecPatch
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsV1alpha1PodPresetPatchMod {
  
  @JSImport("@pulumi/kubernetes/settings/v1alpha1/podPresetPatch", "PodPresetPatch")
  @js.native
  open class PodPresetPatch protected () extends CustomResource {
    /**
      * Create a PodPresetPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PodPresetPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PodPresetPatchArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[settingsDotk8sDotioSlashv1alpha1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[PodPreset] = js.native
    
    val metadata: Output_[ObjectMetaPatch] = js.native
    
    val spec: Output_[PodPresetSpecPatch] = js.native
  }
  /* static members */
  object PodPresetPatch {
    
    @JSImport("@pulumi/kubernetes/settings/v1alpha1/podPresetPatch", "PodPresetPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PodPresetPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): PodPresetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[PodPresetPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): PodPresetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PodPresetPatch]
    
    /**
      * Returns true if the given object is an instance of PodPresetPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPresetPatch.PodPresetPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPresetPatch.PodPresetPatch */ Boolean]
  }
  
  trait PodPresetPatchArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[settingsDotk8sDotioSlashv1alpha1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[PodPreset]] = js.undefined
    
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]] = js.undefined
    
    var spec: js.UndefOr[
        Input[
          typingsJapgolly.pulumiKubernetes.typesInputMod.settings.v1alpha1.PodPresetSpecPatch
        ]
      ] = js.undefined
  }
  object PodPresetPatchArgs {
    
    inline def apply(): PodPresetPatchArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PodPresetPatchArgs]
    }
    
    extension [Self <: PodPresetPatchArgs](x: Self) {
      
      inline def setApiVersion(value: Input[settingsDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[PodPreset]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(
        value: Input[
              typingsJapgolly.pulumiKubernetes.typesInputMod.settings.v1alpha1.PodPresetSpecPatch
            ]
      ): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
