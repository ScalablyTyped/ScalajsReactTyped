package typingsJapgolly.pulumiKubernetes.mod

import typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewMod.LocalSubjectAccessReview
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewMod.LocalSubjectAccessReviewArgs
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewPatchMod.LocalSubjectAccessReviewPatch
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewPatchMod.LocalSubjectAccessReviewPatchArgs
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewMod.SelfSubjectAccessReview
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewMod.SelfSubjectAccessReviewArgs
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewPatchMod.SelfSubjectAccessReviewPatch
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewPatchMod.SelfSubjectAccessReviewPatchArgs
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewMod.SelfSubjectRulesReview
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewMod.SelfSubjectRulesReviewArgs
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewPatchMod.SelfSubjectRulesReviewPatch
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewPatchMod.SelfSubjectRulesReviewPatchArgs
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewMod.SubjectAccessReview
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewMod.SubjectAccessReviewArgs
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewPatchMod.SubjectAccessReviewPatch
import typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewPatchMod.SubjectAccessReviewPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorization {
  
  object v1beta1 {
    
    object LocalSubjectAccessReview {
      
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.LocalSubjectAccessReview")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing LocalSubjectAccessReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewMod.LocalSubjectAccessReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewMod.LocalSubjectAccessReview]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewMod.LocalSubjectAccessReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewMod.LocalSubjectAccessReview]
      
      /**
        * Returns true if the given object is an instance of LocalSubjectAccessReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/localSubjectAccessReview.LocalSubjectAccessReview */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/localSubjectAccessReview.LocalSubjectAccessReview */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.LocalSubjectAccessReview")
    @js.native
    open class LocalSubjectAccessReviewCls protected () extends LocalSubjectAccessReview {
      /**
        * Create a LocalSubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: LocalSubjectAccessReviewArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: LocalSubjectAccessReviewArgs, opts: CustomResourceOptions) = this()
    }
    
    object LocalSubjectAccessReviewPatch {
      
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.LocalSubjectAccessReviewPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing LocalSubjectAccessReviewPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewPatchMod.LocalSubjectAccessReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewPatchMod.LocalSubjectAccessReviewPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewPatchMod.LocalSubjectAccessReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1LocalSubjectAccessReviewPatchMod.LocalSubjectAccessReviewPatch]
      
      /**
        * Returns true if the given object is an instance of LocalSubjectAccessReviewPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/localSubjectAccessReviewPatch.LocalSubjectAccessReviewPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/localSubjectAccessReviewPatch.LocalSubjectAccessReviewPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.LocalSubjectAccessReviewPatch")
    @js.native
    open class LocalSubjectAccessReviewPatchCls protected () extends LocalSubjectAccessReviewPatch {
      /**
        * Create a LocalSubjectAccessReviewPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: LocalSubjectAccessReviewPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: LocalSubjectAccessReviewPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object SelfSubjectAccessReview {
      
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectAccessReview")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing SelfSubjectAccessReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewMod.SelfSubjectAccessReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewMod.SelfSubjectAccessReview]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewMod.SelfSubjectAccessReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewMod.SelfSubjectAccessReview]
      
      /**
        * Returns true if the given object is an instance of SelfSubjectAccessReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectAccessReview.SelfSubjectAccessReview */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectAccessReview.SelfSubjectAccessReview */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectAccessReview")
    @js.native
    open class SelfSubjectAccessReviewCls protected () extends SelfSubjectAccessReview {
      /**
        * Create a SelfSubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: SelfSubjectAccessReviewArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: SelfSubjectAccessReviewArgs, opts: CustomResourceOptions) = this()
    }
    
    object SelfSubjectAccessReviewPatch {
      
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectAccessReviewPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing SelfSubjectAccessReviewPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewPatchMod.SelfSubjectAccessReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewPatchMod.SelfSubjectAccessReviewPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewPatchMod.SelfSubjectAccessReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectAccessReviewPatchMod.SelfSubjectAccessReviewPatch]
      
      /**
        * Returns true if the given object is an instance of SelfSubjectAccessReviewPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectAccessReviewPatch.SelfSubjectAccessReviewPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectAccessReviewPatch.SelfSubjectAccessReviewPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectAccessReviewPatch")
    @js.native
    open class SelfSubjectAccessReviewPatchCls protected () extends SelfSubjectAccessReviewPatch {
      /**
        * Create a SelfSubjectAccessReviewPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: SelfSubjectAccessReviewPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: SelfSubjectAccessReviewPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object SelfSubjectRulesReview {
      
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectRulesReview")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing SelfSubjectRulesReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewMod.SelfSubjectRulesReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewMod.SelfSubjectRulesReview]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewMod.SelfSubjectRulesReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewMod.SelfSubjectRulesReview]
      
      /**
        * Returns true if the given object is an instance of SelfSubjectRulesReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectRulesReview.SelfSubjectRulesReview */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectRulesReview.SelfSubjectRulesReview */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectRulesReview")
    @js.native
    open class SelfSubjectRulesReviewCls protected () extends SelfSubjectRulesReview {
      /**
        * Create a SelfSubjectRulesReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: SelfSubjectRulesReviewArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: SelfSubjectRulesReviewArgs, opts: CustomResourceOptions) = this()
    }
    
    object SelfSubjectRulesReviewPatch {
      
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectRulesReviewPatch")
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
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewPatchMod.SelfSubjectRulesReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewPatchMod.SelfSubjectRulesReviewPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewPatchMod.SelfSubjectRulesReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SelfSubjectRulesReviewPatchMod.SelfSubjectRulesReviewPatch]
      
      /**
        * Returns true if the given object is an instance of SelfSubjectRulesReviewPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectRulesReviewPatch.SelfSubjectRulesReviewPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/selfSubjectRulesReviewPatch.SelfSubjectRulesReviewPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SelfSubjectRulesReviewPatch")
    @js.native
    open class SelfSubjectRulesReviewPatchCls protected () extends SelfSubjectRulesReviewPatch {
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
    }
    
    object SubjectAccessReview {
      
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SubjectAccessReview")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing SubjectAccessReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewMod.SubjectAccessReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewMod.SubjectAccessReview]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewMod.SubjectAccessReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewMod.SubjectAccessReview]
      
      /**
        * Returns true if the given object is an instance of SubjectAccessReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/subjectAccessReview.SubjectAccessReview */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/subjectAccessReview.SubjectAccessReview */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SubjectAccessReview")
    @js.native
    open class SubjectAccessReviewCls protected () extends SubjectAccessReview {
      /**
        * Create a SubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: SubjectAccessReviewArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: SubjectAccessReviewArgs, opts: CustomResourceOptions) = this()
    }
    
    object SubjectAccessReviewPatch {
      
      @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SubjectAccessReviewPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing SubjectAccessReviewPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewPatchMod.SubjectAccessReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewPatchMod.SubjectAccessReviewPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewPatchMod.SubjectAccessReviewPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.authorizationV1beta1SubjectAccessReviewPatchMod.SubjectAccessReviewPatch]
      
      /**
        * Returns true if the given object is an instance of SubjectAccessReviewPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/subjectAccessReviewPatch.SubjectAccessReviewPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/subjectAccessReviewPatch.SubjectAccessReviewPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "authorization.v1beta1.SubjectAccessReviewPatch")
    @js.native
    open class SubjectAccessReviewPatchCls protected () extends SubjectAccessReviewPatch {
      /**
        * Create a SubjectAccessReviewPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: SubjectAccessReviewPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: SubjectAccessReviewPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
