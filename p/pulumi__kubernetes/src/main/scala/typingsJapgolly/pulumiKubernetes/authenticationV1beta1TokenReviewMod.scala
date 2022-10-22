package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.authenticationDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.authentication.v1beta1.TokenReviewSpec
import typingsJapgolly.pulumiKubernetes.typesOutputMod.authentication.v1beta1.TokenReviewStatus
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authenticationV1beta1TokenReviewMod {
  
  @JSImport("@pulumi/kubernetes/authentication/v1beta1/tokenReview", "TokenReview")
  @js.native
  open class TokenReview protected () extends CustomResource {
    /**
      * Create a TokenReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TokenReviewArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: TokenReviewArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[authenticationDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.TokenReview] = js.native
    
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Spec holds information about the request being evaluated
      */
    val spec: Output_[TokenReviewSpec] = js.native
    
    /**
      * Status is filled in by the server and indicates whether the request can be authenticated.
      */
    val status: Output_[TokenReviewStatus] = js.native
  }
  /* static members */
  object TokenReview {
    
    @JSImport("@pulumi/kubernetes/authentication/v1beta1/tokenReview", "TokenReview")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TokenReview resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): TokenReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[TokenReview]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): TokenReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TokenReview]
    
    /**
      * Returns true if the given object is an instance of TokenReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1beta1/tokenReview.TokenReview */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1beta1/tokenReview.TokenReview */ Boolean]
  }
  
  trait TokenReviewArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[authenticationDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.TokenReview]] = js.undefined
    
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * Spec holds information about the request being evaluated
      */
    var spec: Input[
        typingsJapgolly.pulumiKubernetes.typesInputMod.authentication.v1beta1.TokenReviewSpec
      ]
  }
  object TokenReviewArgs {
    
    inline def apply(
      spec: Input[
          typingsJapgolly.pulumiKubernetes.typesInputMod.authentication.v1beta1.TokenReviewSpec
        ]
    ): TokenReviewArgs = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenReviewArgs]
    }
    
    extension [Self <: TokenReviewArgs](x: Self) {
      
      inline def setApiVersion(value: Input[authenticationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.TokenReview]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(
        value: Input[
              typingsJapgolly.pulumiKubernetes.typesInputMod.authentication.v1beta1.TokenReviewSpec
            ]
      ): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
}
