package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkListMod.AuditSinkListArgs
import typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkMod.AuditSinkArgs
import typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkPatchMod.AuditSinkPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auditregistrationV1alpha1Mod {
  
  object AuditSink {
    
    @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1", "AuditSink")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AuditSink resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkMod.AuditSink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkMod.AuditSink]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkMod.AuditSink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkMod.AuditSink]
    
    /**
      * Returns true if the given object is an instance of AuditSink.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSink.AuditSink */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSink.AuditSink */ Boolean]
  }
  type AuditSink = typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkMod.AuditSink
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1", "AuditSink")
  @js.native
  open class AuditSinkCls protected ()
    extends typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkMod.AuditSink {
    /**
      * Create a AuditSink resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AuditSinkArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AuditSinkArgs, opts: CustomResourceOptions) = this()
  }
  
  object AuditSinkList {
    
    @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1", "AuditSinkList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AuditSinkList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkListMod.AuditSinkList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkListMod.AuditSinkList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkListMod.AuditSinkList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkListMod.AuditSinkList]
    
    /**
      * Returns true if the given object is an instance of AuditSinkList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSinkList.AuditSinkList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSinkList.AuditSinkList */ Boolean]
  }
  type AuditSinkList = typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkListMod.AuditSinkList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1", "AuditSinkList")
  @js.native
  open class AuditSinkListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkListMod.AuditSinkList {
    /**
      * Create a AuditSinkList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AuditSinkListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AuditSinkListArgs, opts: CustomResourceOptions) = this()
  }
  
  object AuditSinkPatch {
    
    @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1", "AuditSinkPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AuditSinkPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkPatchMod.AuditSinkPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkPatchMod.AuditSinkPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkPatchMod.AuditSinkPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkPatchMod.AuditSinkPatch]
    
    /**
      * Returns true if the given object is an instance of AuditSinkPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSinkPatch.AuditSinkPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSinkPatch.AuditSinkPatch */ Boolean]
  }
  type AuditSinkPatch = typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkPatchMod.AuditSinkPatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1", "AuditSinkPatch")
  @js.native
  open class AuditSinkPatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.auditregistrationV1alpha1AuditSinkPatchMod.AuditSinkPatch {
    /**
      * Create a AuditSinkPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AuditSinkPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AuditSinkPatchArgs, opts: CustomResourceOptions) = this()
  }
}
