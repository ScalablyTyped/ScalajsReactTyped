package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.autoscalingSlashv2beta2
import typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta2.HorizontalPodAutoscalerSpecPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta2.HorizontalPodAutoscalerStatusPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoscalingV2beta2HorizontalPodAutoscalerPatchMod {
  
  @JSImport("@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscalerPatch", "HorizontalPodAutoscalerPatch")
  @js.native
  open class HorizontalPodAutoscalerPatch protected () extends CustomResource {
    /**
      * Create a HorizontalPodAutoscalerPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HorizontalPodAutoscalerPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: HorizontalPodAutoscalerPatchArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[autoscalingSlashv2beta2] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[HorizontalPodAutoscaler] = js.native
    
    /**
      * metadata is the standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMetaPatch] = js.native
    
    /**
      * spec is the specification for the behaviour of the autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
      */
    val spec: Output_[HorizontalPodAutoscalerSpecPatch] = js.native
    
    /**
      * status is the current information about the autoscaler.
      */
    val status: Output_[HorizontalPodAutoscalerStatusPatch] = js.native
  }
  /* static members */
  object HorizontalPodAutoscalerPatch {
    
    @JSImport("@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscalerPatch", "HorizontalPodAutoscalerPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HorizontalPodAutoscalerPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): HorizontalPodAutoscalerPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[HorizontalPodAutoscalerPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): HorizontalPodAutoscalerPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HorizontalPodAutoscalerPatch]
    
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscalerPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscalerPatch.HorizontalPodAutoscalerPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscalerPatch.HorizontalPodAutoscalerPatch */ Boolean]
  }
  
  trait HorizontalPodAutoscalerPatchArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[autoscalingSlashv2beta2]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[HorizontalPodAutoscaler]] = js.undefined
    
    /**
      * metadata is the standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]] = js.undefined
    
    /**
      * spec is the specification for the behaviour of the autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
      */
    var spec: js.UndefOr[
        Input[
          typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta2.HorizontalPodAutoscalerSpecPatch
        ]
      ] = js.undefined
  }
  object HorizontalPodAutoscalerPatchArgs {
    
    inline def apply(): HorizontalPodAutoscalerPatchArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalPodAutoscalerPatchArgs]
    }
    
    extension [Self <: HorizontalPodAutoscalerPatchArgs](x: Self) {
      
      inline def setApiVersion(value: Input[autoscalingSlashv2beta2]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[HorizontalPodAutoscaler]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(
        value: Input[
              typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta2.HorizontalPodAutoscalerSpecPatch
            ]
      ): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
