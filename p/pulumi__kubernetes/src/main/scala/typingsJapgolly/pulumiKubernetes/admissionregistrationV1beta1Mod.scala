package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationListArgs
import typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationMod.MutatingWebhookConfigurationArgs
import typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationPatchMod.MutatingWebhookConfigurationPatchArgs
import typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationListArgs
import typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationMod.ValidatingWebhookConfigurationArgs
import typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationPatchMod.ValidatingWebhookConfigurationPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object admissionregistrationV1beta1Mod {
  
  object MutatingWebhookConfiguration {
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MutatingWebhookConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration]
    
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean]
  }
  type MutatingWebhookConfiguration = typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfiguration")
  @js.native
  open class MutatingWebhookConfigurationCls protected ()
    extends typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration {
    /**
      * Create a MutatingWebhookConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: MutatingWebhookConfigurationArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: MutatingWebhookConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  object MutatingWebhookConfigurationList {
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfigurationList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MutatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList]
    
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean]
  }
  type MutatingWebhookConfigurationList = typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfigurationList")
  @js.native
  open class MutatingWebhookConfigurationListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList {
    /**
      * Create a MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: MutatingWebhookConfigurationListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: MutatingWebhookConfigurationListArgs, opts: CustomResourceOptions) = this()
  }
  
  object MutatingWebhookConfigurationPatch {
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfigurationPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MutatingWebhookConfigurationPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationPatchMod.MutatingWebhookConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationPatchMod.MutatingWebhookConfigurationPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationPatchMod.MutatingWebhookConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationPatchMod.MutatingWebhookConfigurationPatch]
    
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfigurationPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfigurationPatch.MutatingWebhookConfigurationPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfigurationPatch.MutatingWebhookConfigurationPatch */ Boolean]
  }
  type MutatingWebhookConfigurationPatch = typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationPatchMod.MutatingWebhookConfigurationPatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfigurationPatch")
  @js.native
  open class MutatingWebhookConfigurationPatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationPatchMod.MutatingWebhookConfigurationPatch {
    /**
      * Create a MutatingWebhookConfigurationPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: MutatingWebhookConfigurationPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: MutatingWebhookConfigurationPatchArgs, opts: CustomResourceOptions) = this()
  }
  
  object ValidatingWebhookConfiguration {
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "ValidatingWebhookConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ValidatingWebhookConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration]
    
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean]
  }
  type ValidatingWebhookConfiguration = typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "ValidatingWebhookConfiguration")
  @js.native
  open class ValidatingWebhookConfigurationCls protected ()
    extends typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration {
    /**
      * Create a ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ValidatingWebhookConfigurationArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ValidatingWebhookConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  object ValidatingWebhookConfigurationList {
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "ValidatingWebhookConfigurationList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ValidatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList]
    
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean]
  }
  type ValidatingWebhookConfigurationList = typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "ValidatingWebhookConfigurationList")
  @js.native
  open class ValidatingWebhookConfigurationListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList {
    /**
      * Create a ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ValidatingWebhookConfigurationListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ValidatingWebhookConfigurationListArgs, opts: CustomResourceOptions) = this()
  }
  
  object ValidatingWebhookConfigurationPatch {
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "ValidatingWebhookConfigurationPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ValidatingWebhookConfigurationPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationPatchMod.ValidatingWebhookConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationPatchMod.ValidatingWebhookConfigurationPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationPatchMod.ValidatingWebhookConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationPatchMod.ValidatingWebhookConfigurationPatch]
    
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfigurationPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfigurationPatch.ValidatingWebhookConfigurationPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfigurationPatch.ValidatingWebhookConfigurationPatch */ Boolean]
  }
  type ValidatingWebhookConfigurationPatch = typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationPatchMod.ValidatingWebhookConfigurationPatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "ValidatingWebhookConfigurationPatch")
  @js.native
  open class ValidatingWebhookConfigurationPatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.admissionregistrationV1beta1ValidatingWebhookConfigurationPatchMod.ValidatingWebhookConfigurationPatch {
    /**
      * Create a ValidatingWebhookConfigurationPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ValidatingWebhookConfigurationPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ValidatingWebhookConfigurationPatchArgs, opts: CustomResourceOptions) = this()
  }
}
