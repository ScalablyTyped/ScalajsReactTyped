package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseListMod.LeaseListArgs
import typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseMod.LeaseArgs
import typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeasePatchMod.LeasePatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coordinationV1beta1Mod {
  
  object Lease {
    
    @JSImport("@pulumi/kubernetes/coordination/v1beta1", "Lease")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Lease resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseMod.Lease = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseMod.Lease]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseMod.Lease = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseMod.Lease]
    
    /**
      * Returns true if the given object is an instance of Lease.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/lease.Lease */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/lease.Lease */ Boolean]
  }
  type Lease = typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseMod.Lease
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/coordination/v1beta1", "Lease")
  @js.native
  open class LeaseCls protected ()
    extends typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseMod.Lease {
    /**
      * Create a Lease resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LeaseArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: LeaseArgs, opts: CustomResourceOptions) = this()
  }
  
  object LeaseList {
    
    @JSImport("@pulumi/kubernetes/coordination/v1beta1", "LeaseList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LeaseList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseListMod.LeaseList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseListMod.LeaseList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseListMod.LeaseList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseListMod.LeaseList]
    
    /**
      * Returns true if the given object is an instance of LeaseList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/leaseList.LeaseList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/leaseList.LeaseList */ Boolean]
  }
  type LeaseList = typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseListMod.LeaseList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/coordination/v1beta1", "LeaseList")
  @js.native
  open class LeaseListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeaseListMod.LeaseList {
    /**
      * Create a LeaseList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LeaseListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: LeaseListArgs, opts: CustomResourceOptions) = this()
  }
  
  object LeasePatch {
    
    @JSImport("@pulumi/kubernetes/coordination/v1beta1", "LeasePatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LeasePatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeasePatchMod.LeasePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeasePatchMod.LeasePatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeasePatchMod.LeasePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeasePatchMod.LeasePatch]
    
    /**
      * Returns true if the given object is an instance of LeasePatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/leasePatch.LeasePatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1beta1/leasePatch.LeasePatch */ Boolean]
  }
  type LeasePatch = typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeasePatchMod.LeasePatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/coordination/v1beta1", "LeasePatch")
  @js.native
  open class LeasePatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.coordinationV1beta1LeasePatchMod.LeasePatch {
    /**
      * Create a LeasePatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LeasePatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: LeasePatchArgs, opts: CustomResourceOptions) = this()
  }
}
