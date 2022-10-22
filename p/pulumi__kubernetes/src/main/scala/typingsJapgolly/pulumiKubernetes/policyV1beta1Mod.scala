package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyListArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicyArgs
import typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatchArgs
import typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetListMod.PodDisruptionBudgetListArgs
import typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetMod.PodDisruptionBudgetArgs
import typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetPatchMod.PodDisruptionBudgetPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyV1beta1Mod {
  
  object PodDisruptionBudget {
    
    @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodDisruptionBudget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PodDisruptionBudget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetMod.PodDisruptionBudget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetMod.PodDisruptionBudget]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetMod.PodDisruptionBudget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetMod.PodDisruptionBudget]
    
    /**
      * Returns true if the given object is an instance of PodDisruptionBudget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudget.PodDisruptionBudget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudget.PodDisruptionBudget */ Boolean]
  }
  type PodDisruptionBudget = typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetMod.PodDisruptionBudget
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodDisruptionBudget")
  @js.native
  open class PodDisruptionBudgetCls protected ()
    extends typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetMod.PodDisruptionBudget {
    /**
      * Create a PodDisruptionBudget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PodDisruptionBudgetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PodDisruptionBudgetArgs, opts: CustomResourceOptions) = this()
  }
  
  object PodDisruptionBudgetList {
    
    @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodDisruptionBudgetList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PodDisruptionBudgetList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetListMod.PodDisruptionBudgetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetListMod.PodDisruptionBudgetList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetListMod.PodDisruptionBudgetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetListMod.PodDisruptionBudgetList]
    
    /**
      * Returns true if the given object is an instance of PodDisruptionBudgetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetList.PodDisruptionBudgetList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetList.PodDisruptionBudgetList */ Boolean]
  }
  type PodDisruptionBudgetList = typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetListMod.PodDisruptionBudgetList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodDisruptionBudgetList")
  @js.native
  open class PodDisruptionBudgetListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetListMod.PodDisruptionBudgetList {
    /**
      * Create a PodDisruptionBudgetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PodDisruptionBudgetListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PodDisruptionBudgetListArgs, opts: CustomResourceOptions) = this()
  }
  
  object PodDisruptionBudgetPatch {
    
    @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodDisruptionBudgetPatch")
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
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetPatchMod.PodDisruptionBudgetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetPatchMod.PodDisruptionBudgetPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetPatchMod.PodDisruptionBudgetPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetPatchMod.PodDisruptionBudgetPatch]
    
    /**
      * Returns true if the given object is an instance of PodDisruptionBudgetPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetPatch.PodDisruptionBudgetPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetPatch.PodDisruptionBudgetPatch */ Boolean]
  }
  type PodDisruptionBudgetPatch = typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetPatchMod.PodDisruptionBudgetPatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodDisruptionBudgetPatch")
  @js.native
  open class PodDisruptionBudgetPatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.policyV1beta1PodDisruptionBudgetPatchMod.PodDisruptionBudgetPatch {
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
  }
  
  object PodSecurityPolicy {
    
    @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodSecurityPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PodSecurityPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyMod.PodSecurityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyMod.PodSecurityPolicy]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyMod.PodSecurityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyMod.PodSecurityPolicy]
    
    /**
      * Get an existing PodSecurityPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_PodSecurityPolicy(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicy]
    inline def get_PodSecurityPolicy(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicy]
    
    /**
      * Returns true if the given object is an instance of PodSecurityPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicy.PodSecurityPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicy.PodSecurityPolicy */ Boolean]
  }
  type PodSecurityPolicy = typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicy
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodSecurityPolicy")
  @js.native
  open class PodSecurityPolicyCls protected ()
    extends typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyMod.PodSecurityPolicy {
    /**
      * Create a PodSecurityPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PodSecurityPolicyArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PodSecurityPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  object PodSecurityPolicyList {
    
    @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodSecurityPolicyList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PodSecurityPolicyList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList]
    
    /**
      * Get an existing PodSecurityPolicyList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_PodSecurityPolicyList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList]
    inline def get_PodSecurityPolicyList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList]
    
    /**
      * Returns true if the given object is an instance of PodSecurityPolicyList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicyList.PodSecurityPolicyList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicyList.PodSecurityPolicyList */ Boolean]
  }
  type PodSecurityPolicyList = typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodSecurityPolicyList")
  @js.native
  open class PodSecurityPolicyListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList {
    /**
      * Create a PodSecurityPolicyList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PodSecurityPolicyListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PodSecurityPolicyListArgs, opts: CustomResourceOptions) = this()
  }
  
  object PodSecurityPolicyPatch {
    
    @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodSecurityPolicyPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PodSecurityPolicyPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.policyV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch]
    
    /**
      * Get an existing PodSecurityPolicyPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_PodSecurityPolicyPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch]
    inline def get_PodSecurityPolicyPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch]
    
    /**
      * Returns true if the given object is an instance of PodSecurityPolicyPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicyPatch.PodSecurityPolicyPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicyPatch.PodSecurityPolicyPatch */ Boolean]
  }
  type PodSecurityPolicyPatch = typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/policy/v1beta1", "PodSecurityPolicyPatch")
  @js.native
  open class PodSecurityPolicyPatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.extensionsV1beta1PodSecurityPolicyPatchMod.PodSecurityPolicyPatch {
    /**
      * Create a PodSecurityPolicyPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PodSecurityPolicyPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PodSecurityPolicyPatchArgs, opts: CustomResourceOptions) = this()
  }
}
