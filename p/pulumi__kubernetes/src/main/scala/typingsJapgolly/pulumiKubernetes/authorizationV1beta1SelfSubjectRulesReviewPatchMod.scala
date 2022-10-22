package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectRulesReview
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.authorizationDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1beta1.SelfSubjectRulesReviewSpecPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1beta1.SubjectRulesReviewStatusPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorizationV1beta1SelfSubjectRulesReviewPatchMod {
  
  @JSImport("@pulumi/kubernetes/authorization/v1beta1/selfSubjectRulesReviewPatch", "SelfSubjectRulesReviewPatch")
  @js.native
  open class SelfSubjectRulesReviewPatch protected () extends CustomResource {
    /**
      * Create a SelfSubjectRulesReviewPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SelfSubjectRulesReviewPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: SelfSubjectRulesReviewPatchArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[authorizationDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[SelfSubjectRulesReview] = js.native
    
    val metadata: Output_[ObjectMetaPatch] = js.native
    
    /**
      * Spec holds information about the request being evaluated.
      */
    val spec: Output_[SelfSubjectRulesReviewSpecPatch] = js.native
    
    /**
      * Status is filled in by the server and indicates the set of actions a user can perform.
      */
    val status: Output_[SubjectRulesReviewStatusPatch] = js.native
  }
  /* static members */
  object SelfSubjectRulesReviewPatch {
    
    @JSImport("@pulumi/kubernetes/authorization/v1beta1/selfSubjectRulesReviewPatch", "SelfSubjectRulesReviewPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SelfSubjectRulesReviewPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SelfSubjectRulesReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SelfSubjectRulesReviewPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): SelfSubjectRulesReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SelfSubjectRulesReviewPatch]
    
    /**
      * Returns true if the given object is an instance of SelfSubjectRulesReviewPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectRulesReviewPatch.SelfSubjectRulesReviewPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectRulesReviewPatch.SelfSubjectRulesReviewPatch */ Boolean]
  }
  
  trait SelfSubjectRulesReviewPatchArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[authorizationDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[SelfSubjectRulesReview]] = js.undefined
    
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]] = js.undefined
    
    /**
      * Spec holds information about the request being evaluated.
      */
    var spec: js.UndefOr[
        Input[
          typingsJapgolly.pulumiKubernetes.typesInputMod.authorization.v1beta1.SelfSubjectRulesReviewSpecPatch
        ]
      ] = js.undefined
  }
  object SelfSubjectRulesReviewPatchArgs {
    
    inline def apply(): SelfSubjectRulesReviewPatchArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelfSubjectRulesReviewPatchArgs]
    }
    
    extension [Self <: SelfSubjectRulesReviewPatchArgs](x: Self) {
      
      inline def setApiVersion(value: Input[authorizationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[SelfSubjectRulesReview]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(
        value: Input[
              typingsJapgolly.pulumiKubernetes.typesInputMod.authorization.v1beta1.SelfSubjectRulesReviewSpecPatch
            ]
      ): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
