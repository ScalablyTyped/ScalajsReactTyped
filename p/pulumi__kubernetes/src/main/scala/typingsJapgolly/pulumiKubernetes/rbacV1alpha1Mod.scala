package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingListMod.ClusterRoleBindingListArgs
import typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingMod.ClusterRoleBindingArgs
import typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingPatchMod.ClusterRoleBindingPatchArgs
import typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleListMod.ClusterRoleListArgs
import typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleMod.ClusterRoleArgs
import typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRolePatchMod.ClusterRolePatchArgs
import typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingListMod.RoleBindingListArgs
import typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingMod.RoleBindingArgs
import typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingPatchMod.RoleBindingPatchArgs
import typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleListMod.RoleListArgs
import typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleMod.RoleArgs
import typingsJapgolly.pulumiKubernetes.rbacV1alpha1RolePatchMod.RolePatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rbacV1alpha1Mod {
  
  object ClusterRole {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRole")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRole resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleMod.ClusterRole = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleMod.ClusterRole]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleMod.ClusterRole = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleMod.ClusterRole]
    
    /**
      * Get an existing ClusterRole resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_ClusterRole(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleMod.ClusterRole = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleMod.ClusterRole]
    inline def get_ClusterRole(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleMod.ClusterRole = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleMod.ClusterRole]
    
    /**
      * Returns true if the given object is an instance of ClusterRole.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRole.ClusterRole */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRole.ClusterRole */ Boolean]
  }
  type ClusterRole = typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleMod.ClusterRole
  
  object ClusterRoleBinding {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRoleBinding")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingMod.ClusterRoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingMod.ClusterRoleBinding]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingMod.ClusterRoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingMod.ClusterRoleBinding]
    
    /**
      * Get an existing ClusterRoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_ClusterRoleBinding(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingMod.ClusterRoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingMod.ClusterRoleBinding]
    inline def get_ClusterRoleBinding(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingMod.ClusterRoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingMod.ClusterRoleBinding]
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBinding.ClusterRoleBinding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBinding.ClusterRoleBinding */ Boolean]
  }
  type ClusterRoleBinding = typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingMod.ClusterRoleBinding
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRoleBinding")
  @js.native
  open class ClusterRoleBindingCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingMod.ClusterRoleBinding {
    /**
      * Create a ClusterRoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingArgs, opts: CustomResourceOptions) = this()
  }
  
  object ClusterRoleBindingList {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRoleBindingList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRoleBindingList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingListMod.ClusterRoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingListMod.ClusterRoleBindingList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingListMod.ClusterRoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingListMod.ClusterRoleBindingList]
    
    /**
      * Get an existing ClusterRoleBindingList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_ClusterRoleBindingList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingListMod.ClusterRoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingListMod.ClusterRoleBindingList]
    inline def get_ClusterRoleBindingList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingListMod.ClusterRoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingListMod.ClusterRoleBindingList]
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBindingList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingList.ClusterRoleBindingList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingList.ClusterRoleBindingList */ Boolean]
  }
  type ClusterRoleBindingList = typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingListMod.ClusterRoleBindingList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRoleBindingList")
  @js.native
  open class ClusterRoleBindingListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingListMod.ClusterRoleBindingList {
    /**
      * Create a ClusterRoleBindingList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingListArgs, opts: CustomResourceOptions) = this()
  }
  
  object ClusterRoleBindingPatch {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRoleBindingPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRoleBindingPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingPatchMod.ClusterRoleBindingPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingPatchMod.ClusterRoleBindingPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingPatchMod.ClusterRoleBindingPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingPatchMod.ClusterRoleBindingPatch]
    
    /**
      * Get an existing ClusterRoleBindingPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_ClusterRoleBindingPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingPatchMod.ClusterRoleBindingPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingPatchMod.ClusterRoleBindingPatch]
    inline def get_ClusterRoleBindingPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingPatchMod.ClusterRoleBindingPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleBindingPatchMod.ClusterRoleBindingPatch]
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBindingPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingPatch.ClusterRoleBindingPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingPatch.ClusterRoleBindingPatch */ Boolean]
  }
  type ClusterRoleBindingPatch = typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingPatchMod.ClusterRoleBindingPatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRoleBindingPatch")
  @js.native
  open class ClusterRoleBindingPatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleBindingPatchMod.ClusterRoleBindingPatch {
    /**
      * Create a ClusterRoleBindingPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingPatchArgs, opts: CustomResourceOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRole")
  @js.native
  open class ClusterRoleCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleMod.ClusterRole {
    /**
      * Create a ClusterRole resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleArgs, opts: CustomResourceOptions) = this()
  }
  
  object ClusterRoleList {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRoleList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRoleList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleListMod.ClusterRoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleListMod.ClusterRoleList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleListMod.ClusterRoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRoleListMod.ClusterRoleList]
    
    /**
      * Get an existing ClusterRoleList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_ClusterRoleList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleListMod.ClusterRoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleListMod.ClusterRoleList]
    inline def get_ClusterRoleList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleListMod.ClusterRoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleListMod.ClusterRoleList]
    
    /**
      * Returns true if the given object is an instance of ClusterRoleList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleList.ClusterRoleList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleList.ClusterRoleList */ Boolean]
  }
  type ClusterRoleList = typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleListMod.ClusterRoleList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRoleList")
  @js.native
  open class ClusterRoleListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRoleListMod.ClusterRoleList {
    /**
      * Create a ClusterRoleList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleListArgs, opts: CustomResourceOptions) = this()
  }
  
  object ClusterRolePatch {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRolePatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRolePatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRolePatchMod.ClusterRolePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRolePatchMod.ClusterRolePatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRolePatchMod.ClusterRolePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRolePatchMod.ClusterRolePatch]
    
    /**
      * Get an existing ClusterRolePatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_ClusterRolePatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRolePatchMod.ClusterRolePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRolePatchMod.ClusterRolePatch]
    inline def get_ClusterRolePatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRolePatchMod.ClusterRolePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1ClusterRolePatchMod.ClusterRolePatch]
    
    /**
      * Returns true if the given object is an instance of ClusterRolePatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRolePatch.ClusterRolePatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRolePatch.ClusterRolePatch */ Boolean]
  }
  type ClusterRolePatch = typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRolePatchMod.ClusterRolePatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "ClusterRolePatch")
  @js.native
  open class ClusterRolePatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1ClusterRolePatchMod.ClusterRolePatch {
    /**
      * Create a ClusterRolePatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRolePatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRolePatchArgs, opts: CustomResourceOptions) = this()
  }
  
  object Role {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "Role")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Role resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleMod.Role = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleMod.Role]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleMod.Role = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleMod.Role]
    
    /**
      * Get an existing Role resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_Role(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleMod.Role = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleMod.Role]
    inline def get_Role(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleMod.Role = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleMod.Role]
    
    /**
      * Returns true if the given object is an instance of Role.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/role.Role */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/role.Role */ Boolean]
  }
  type Role = typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleMod.Role
  
  object RoleBinding {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RoleBinding")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingMod.RoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingMod.RoleBinding]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingMod.RoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingMod.RoleBinding]
    
    /**
      * Get an existing RoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_RoleBinding(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingMod.RoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingMod.RoleBinding]
    inline def get_RoleBinding(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingMod.RoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingMod.RoleBinding]
    
    /**
      * Returns true if the given object is an instance of RoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/roleBinding.RoleBinding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/roleBinding.RoleBinding */ Boolean]
  }
  type RoleBinding = typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingMod.RoleBinding
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RoleBinding")
  @js.native
  open class RoleBindingCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingMod.RoleBinding {
    /**
      * Create a RoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleBindingArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleBindingArgs, opts: CustomResourceOptions) = this()
  }
  
  object RoleBindingList {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RoleBindingList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleBindingList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingListMod.RoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingListMod.RoleBindingList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingListMod.RoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingListMod.RoleBindingList]
    
    /**
      * Get an existing RoleBindingList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_RoleBindingList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingListMod.RoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingListMod.RoleBindingList]
    inline def get_RoleBindingList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingListMod.RoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingListMod.RoleBindingList]
    
    /**
      * Returns true if the given object is an instance of RoleBindingList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/roleBindingList.RoleBindingList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/roleBindingList.RoleBindingList */ Boolean]
  }
  type RoleBindingList = typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingListMod.RoleBindingList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RoleBindingList")
  @js.native
  open class RoleBindingListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingListMod.RoleBindingList {
    /**
      * Create a RoleBindingList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleBindingListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleBindingListArgs, opts: CustomResourceOptions) = this()
  }
  
  object RoleBindingPatch {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RoleBindingPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleBindingPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingPatchMod.RoleBindingPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingPatchMod.RoleBindingPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingPatchMod.RoleBindingPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingPatchMod.RoleBindingPatch]
    
    /**
      * Get an existing RoleBindingPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_RoleBindingPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingPatchMod.RoleBindingPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingPatchMod.RoleBindingPatch]
    inline def get_RoleBindingPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingPatchMod.RoleBindingPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleBindingPatchMod.RoleBindingPatch]
    
    /**
      * Returns true if the given object is an instance of RoleBindingPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/roleBindingPatch.RoleBindingPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/roleBindingPatch.RoleBindingPatch */ Boolean]
  }
  type RoleBindingPatch = typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingPatchMod.RoleBindingPatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RoleBindingPatch")
  @js.native
  open class RoleBindingPatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleBindingPatchMod.RoleBindingPatch {
    /**
      * Create a RoleBindingPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleBindingPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleBindingPatchArgs, opts: CustomResourceOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "Role")
  @js.native
  open class RoleCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleMod.Role {
    /**
      * Create a Role resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleArgs, opts: CustomResourceOptions) = this()
  }
  
  object RoleList {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RoleList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleListMod.RoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleListMod.RoleList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleListMod.RoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RoleListMod.RoleList]
    
    /**
      * Get an existing RoleList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_RoleList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleListMod.RoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleListMod.RoleList]
    inline def get_RoleList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleListMod.RoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleListMod.RoleList]
    
    /**
      * Returns true if the given object is an instance of RoleList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/roleList.RoleList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/roleList.RoleList */ Boolean]
  }
  type RoleList = typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleListMod.RoleList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RoleList")
  @js.native
  open class RoleListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1RoleListMod.RoleList {
    /**
      * Create a RoleList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleListArgs, opts: CustomResourceOptions) = this()
  }
  
  object RolePatch {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RolePatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RolePatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RolePatchMod.RolePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RolePatchMod.RolePatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1alpha1RolePatchMod.RolePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1alpha1RolePatchMod.RolePatch]
    
    /**
      * Get an existing RolePatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get_RolePatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.rbacV1beta1RolePatchMod.RolePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RolePatchMod.RolePatch]
    inline def get_RolePatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.rbacV1beta1RolePatchMod.RolePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.rbacV1beta1RolePatchMod.RolePatch]
    
    /**
      * Returns true if the given object is an instance of RolePatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/rolePatch.RolePatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/rolePatch.RolePatch */ Boolean]
  }
  type RolePatch = typingsJapgolly.pulumiKubernetes.rbacV1alpha1RolePatchMod.RolePatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RolePatch")
  @js.native
  open class RolePatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.rbacV1alpha1RolePatchMod.RolePatch {
    /**
      * Create a RolePatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RolePatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RolePatchArgs, opts: CustomResourceOptions) = this()
  }
}
