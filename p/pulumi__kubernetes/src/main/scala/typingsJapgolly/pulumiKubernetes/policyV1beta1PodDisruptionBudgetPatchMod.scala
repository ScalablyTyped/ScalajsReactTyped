package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.policy.v1beta1.PodDisruptionBudgetSpecPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.policy.v1beta1.PodDisruptionBudgetStatusPatch
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyV1beta1PodDisruptionBudgetPatchMod {
  
  @JSImport("@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetPatch", "PodDisruptionBudgetPatch")
  @js.native
  open class PodDisruptionBudgetPatch protected () extends CustomResource {
    /**
      * Create a PodDisruptionBudgetPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PodDisruptionBudgetPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PodDisruptionBudgetPatchArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[policySlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[PodDisruptionBudget] = js.native
    
    val metadata: Output_[ObjectMetaPatch] = js.native
    
    /**
      * Specification of the desired behavior of the PodDisruptionBudget.
      */
    val spec: Output_[PodDisruptionBudgetSpecPatch] = js.native
    
    /**
      * Most recently observed status of the PodDisruptionBudget.
      */
    val status: Output_[PodDisruptionBudgetStatusPatch] = js.native
  }
  /* static members */
  object PodDisruptionBudgetPatch {
    
    @JSImport("@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetPatch", "PodDisruptionBudgetPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PodDisruptionBudgetPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): PodDisruptionBudgetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[PodDisruptionBudgetPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): PodDisruptionBudgetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PodDisruptionBudgetPatch]
    
    /**
      * Returns true if the given object is an instance of PodDisruptionBudgetPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetPatch.PodDisruptionBudgetPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetPatch.PodDisruptionBudgetPatch */ Boolean]
  }
  
  trait PodDisruptionBudgetPatchArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[policySlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[PodDisruptionBudget]] = js.undefined
    
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]] = js.undefined
    
    /**
      * Specification of the desired behavior of the PodDisruptionBudget.
      */
    var spec: js.UndefOr[
        Input[
          typingsJapgolly.pulumiKubernetes.typesInputMod.policy.v1beta1.PodDisruptionBudgetSpecPatch
        ]
      ] = js.undefined
  }
  object PodDisruptionBudgetPatchArgs {
    
    inline def apply(): PodDisruptionBudgetPatchArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PodDisruptionBudgetPatchArgs]
    }
    
    extension [Self <: PodDisruptionBudgetPatchArgs](x: Self) {
      
      inline def setApiVersion(value: Input[policySlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[PodDisruptionBudget]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(
        value: Input[
              typingsJapgolly.pulumiKubernetes.typesInputMod.policy.v1beta1.PodDisruptionBudgetSpecPatch
            ]
      ): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
