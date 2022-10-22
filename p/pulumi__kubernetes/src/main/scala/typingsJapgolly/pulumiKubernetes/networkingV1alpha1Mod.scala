package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRListArgs
import typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDRArgs
import typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkingV1alpha1Mod {
  
  object ClusterCIDR {
    
    @JSImport("@pulumi/kubernetes/networking/v1alpha1", "ClusterCIDR")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterCIDR resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDR = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDR]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDR = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDR]
    
    /**
      * Returns true if the given object is an instance of ClusterCIDR.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDR.ClusterCIDR */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDR.ClusterCIDR */ Boolean]
  }
  type ClusterCIDR = typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDR
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/networking/v1alpha1", "ClusterCIDR")
  @js.native
  open class ClusterCIDRCls protected ()
    extends typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRMod.ClusterCIDR {
    /**
      * Create a ClusterCIDR resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterCIDRArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterCIDRArgs, opts: CustomResourceOptions) = this()
  }
  
  object ClusterCIDRList {
    
    @JSImport("@pulumi/kubernetes/networking/v1alpha1", "ClusterCIDRList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterCIDRList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRList]
    
    /**
      * Returns true if the given object is an instance of ClusterCIDRList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDRList.ClusterCIDRList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDRList.ClusterCIDRList */ Boolean]
  }
  type ClusterCIDRList = typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/networking/v1alpha1", "ClusterCIDRList")
  @js.native
  open class ClusterCIDRListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRListMod.ClusterCIDRList {
    /**
      * Create a ClusterCIDRList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterCIDRListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterCIDRListArgs, opts: CustomResourceOptions) = this()
  }
  
  object ClusterCIDRPatch {
    
    @JSImport("@pulumi/kubernetes/networking/v1alpha1", "ClusterCIDRPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterCIDRPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatch]
    
    /**
      * Returns true if the given object is an instance of ClusterCIDRPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDRPatch.ClusterCIDRPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1alpha1/clusterCIDRPatch.ClusterCIDRPatch */ Boolean]
  }
  type ClusterCIDRPatch = typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/networking/v1alpha1", "ClusterCIDRPatch")
  @js.native
  open class ClusterCIDRPatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.networkingV1alpha1ClusterCIDRPatchMod.ClusterCIDRPatch {
    /**
      * Create a ClusterCIDRPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterCIDRPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterCIDRPatchArgs, opts: CustomResourceOptions) = this()
  }
}
