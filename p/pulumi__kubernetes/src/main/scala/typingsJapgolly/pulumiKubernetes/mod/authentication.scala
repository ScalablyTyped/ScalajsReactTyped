package typingsJapgolly.pulumiKubernetes.mod

import typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewMod.TokenReview
import typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewMod.TokenReviewArgs
import typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewPatchMod.TokenReviewPatch
import typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewPatchMod.TokenReviewPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authentication {
  
  object v1beta1 {
    
    object TokenReview {
      
      @JSImport("@pulumi/kubernetes", "authentication.v1beta1.TokenReview")
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
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewMod.TokenReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewMod.TokenReview]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewMod.TokenReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewMod.TokenReview]
      
      /**
        * Returns true if the given object is an instance of TokenReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1beta1/tokenReview.TokenReview */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1beta1/tokenReview.TokenReview */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "authentication.v1beta1.TokenReview")
    @js.native
    open class TokenReviewCls protected () extends TokenReview {
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
    }
    
    object TokenReviewPatch {
      
      @JSImport("@pulumi/kubernetes", "authentication.v1beta1.TokenReviewPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing TokenReviewPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewPatchMod.TokenReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewPatchMod.TokenReviewPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewPatchMod.TokenReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authenticationV1beta1TokenReviewPatchMod.TokenReviewPatch]
      
      /**
        * Returns true if the given object is an instance of TokenReviewPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1beta1/tokenReviewPatch.TokenReviewPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1beta1/tokenReviewPatch.TokenReviewPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "authentication.v1beta1.TokenReviewPatch")
    @js.native
    open class TokenReviewPatchCls protected () extends TokenReviewPatch {
      /**
        * Create a TokenReviewPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: TokenReviewPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: TokenReviewPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
