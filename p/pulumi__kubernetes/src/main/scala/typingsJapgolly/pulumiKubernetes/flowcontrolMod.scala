package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList
import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaListArgs
import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema
import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchemaArgs
import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch
import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatchArgs
import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList
import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationListArgs
import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration
import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfigurationArgs
import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch
import typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowcontrolMod {
  
  object v1alpha1 {
    
    object FlowSchema {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.FlowSchema")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema]
      
      /**
        * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchema(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema]
      inline def get_FlowSchema(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema]
      
      /**
        * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchema_FlowSchema(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema]
      inline def get_FlowSchema_FlowSchema(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema]
      
      /**
        * Returns true if the given object is an instance of FlowSchema.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchema.FlowSchema */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchema.FlowSchema */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.FlowSchema")
    @js.native
    open class FlowSchemaCls protected () extends FlowSchema {
      /**
        * Create a FlowSchema resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: FlowSchemaArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: FlowSchemaArgs, opts: CustomResourceOptions) = this()
    }
    
    object FlowSchemaList {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.FlowSchemaList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList]
      
      /**
        * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList]
      inline def get_FlowSchemaList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList]
      
      /**
        * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaList_FlowSchemaList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList]
      inline def get_FlowSchemaList_FlowSchemaList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList]
      
      /**
        * Returns true if the given object is an instance of FlowSchemaList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList.FlowSchemaList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList.FlowSchemaList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.FlowSchemaList")
    @js.native
    open class FlowSchemaListCls protected () extends FlowSchemaList {
      /**
        * Create a FlowSchemaList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: FlowSchemaListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: FlowSchemaListArgs, opts: CustomResourceOptions) = this()
    }
    
    object FlowSchemaPatch {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.FlowSchemaPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing FlowSchemaPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch]
      
      /**
        * Get an existing FlowSchemaPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch]
      inline def get_FlowSchemaPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch]
      
      /**
        * Get an existing FlowSchemaPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaPatch_FlowSchemaPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch]
      inline def get_FlowSchemaPatch_FlowSchemaPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch]
      
      /**
        * Returns true if the given object is an instance of FlowSchemaPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaPatch.FlowSchemaPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaPatch.FlowSchemaPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.FlowSchemaPatch")
    @js.native
    open class FlowSchemaPatchCls protected () extends FlowSchemaPatch {
      /**
        * Create a FlowSchemaPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: FlowSchemaPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: FlowSchemaPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityLevelConfiguration {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.PriorityLevelConfiguration")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      
      /**
        * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfiguration(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      inline def get_PriorityLevelConfiguration(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      
      /**
        * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfiguration_PriorityLevelConfiguration(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      inline def get_PriorityLevelConfiguration_PriorityLevelConfiguration(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      
      /**
        * Returns true if the given object is an instance of PriorityLevelConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfiguration.PriorityLevelConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfiguration.PriorityLevelConfiguration */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.PriorityLevelConfiguration")
    @js.native
    open class PriorityLevelConfigurationCls protected () extends PriorityLevelConfiguration {
      /**
        * Create a PriorityLevelConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityLevelConfigurationArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityLevelConfigurationArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityLevelConfigurationList {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.PriorityLevelConfigurationList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      
      /**
        * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      inline def get_PriorityLevelConfigurationList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      
      /**
        * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationList_PriorityLevelConfigurationList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      inline def get_PriorityLevelConfigurationList_PriorityLevelConfigurationList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      
      /**
        * Returns true if the given object is an instance of PriorityLevelConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationList.PriorityLevelConfigurationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationList.PriorityLevelConfigurationList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.PriorityLevelConfigurationList")
    @js.native
    open class PriorityLevelConfigurationListCls protected () extends PriorityLevelConfigurationList {
      /**
        * Create a PriorityLevelConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityLevelConfigurationListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityLevelConfigurationListArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityLevelConfigurationPatch {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.PriorityLevelConfigurationPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityLevelConfigurationPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      
      /**
        * Get an existing PriorityLevelConfigurationPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      inline def get_PriorityLevelConfigurationPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      
      /**
        * Get an existing PriorityLevelConfigurationPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationPatch_PriorityLevelConfigurationPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      inline def get_PriorityLevelConfigurationPatch_PriorityLevelConfigurationPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      
      /**
        * Returns true if the given object is an instance of PriorityLevelConfigurationPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationPatch.PriorityLevelConfigurationPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationPatch.PriorityLevelConfigurationPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1alpha1.PriorityLevelConfigurationPatch")
    @js.native
    open class PriorityLevelConfigurationPatchCls protected () extends PriorityLevelConfigurationPatch {
      /**
        * Create a PriorityLevelConfigurationPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityLevelConfigurationPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityLevelConfigurationPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
  
  object v1beta1 {
    
    object FlowSchema {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.FlowSchema")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema]
      
      /**
        * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchema(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema]
      inline def get_FlowSchema(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema]
      
      /**
        * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchema_FlowSchema(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema]
      inline def get_FlowSchema_FlowSchema(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema]
      
      /**
        * Returns true if the given object is an instance of FlowSchema.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchema.FlowSchema */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchema.FlowSchema */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.FlowSchema")
    @js.native
    open class FlowSchemaCls protected () extends FlowSchema {
      /**
        * Create a FlowSchema resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: FlowSchemaArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: FlowSchemaArgs, opts: CustomResourceOptions) = this()
    }
    
    object FlowSchemaList {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.FlowSchemaList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList]
      
      /**
        * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList]
      inline def get_FlowSchemaList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList]
      
      /**
        * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaList_FlowSchemaList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList]
      inline def get_FlowSchemaList_FlowSchemaList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList]
      
      /**
        * Returns true if the given object is an instance of FlowSchemaList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList.FlowSchemaList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList.FlowSchemaList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.FlowSchemaList")
    @js.native
    open class FlowSchemaListCls protected () extends FlowSchemaList {
      /**
        * Create a FlowSchemaList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: FlowSchemaListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: FlowSchemaListArgs, opts: CustomResourceOptions) = this()
    }
    
    object FlowSchemaPatch {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.FlowSchemaPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing FlowSchemaPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch]
      
      /**
        * Get an existing FlowSchemaPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch]
      inline def get_FlowSchemaPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch]
      
      /**
        * Get an existing FlowSchemaPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaPatch_FlowSchemaPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch]
      inline def get_FlowSchemaPatch_FlowSchemaPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch]
      
      /**
        * Returns true if the given object is an instance of FlowSchemaPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaPatch.FlowSchemaPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaPatch.FlowSchemaPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.FlowSchemaPatch")
    @js.native
    open class FlowSchemaPatchCls protected () extends FlowSchemaPatch {
      /**
        * Create a FlowSchemaPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: FlowSchemaPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: FlowSchemaPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityLevelConfiguration {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.PriorityLevelConfiguration")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      
      /**
        * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfiguration(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      inline def get_PriorityLevelConfiguration(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      
      /**
        * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfiguration_PriorityLevelConfiguration(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      inline def get_PriorityLevelConfiguration_PriorityLevelConfiguration(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      
      /**
        * Returns true if the given object is an instance of PriorityLevelConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfiguration.PriorityLevelConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfiguration.PriorityLevelConfiguration */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.PriorityLevelConfiguration")
    @js.native
    open class PriorityLevelConfigurationCls protected () extends PriorityLevelConfiguration {
      /**
        * Create a PriorityLevelConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityLevelConfigurationArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityLevelConfigurationArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityLevelConfigurationList {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.PriorityLevelConfigurationList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      
      /**
        * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      inline def get_PriorityLevelConfigurationList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      
      /**
        * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationList_PriorityLevelConfigurationList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      inline def get_PriorityLevelConfigurationList_PriorityLevelConfigurationList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      
      /**
        * Returns true if the given object is an instance of PriorityLevelConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationList.PriorityLevelConfigurationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationList.PriorityLevelConfigurationList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.PriorityLevelConfigurationList")
    @js.native
    open class PriorityLevelConfigurationListCls protected () extends PriorityLevelConfigurationList {
      /**
        * Create a PriorityLevelConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityLevelConfigurationListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityLevelConfigurationListArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityLevelConfigurationPatch {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.PriorityLevelConfigurationPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityLevelConfigurationPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      
      /**
        * Get an existing PriorityLevelConfigurationPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      inline def get_PriorityLevelConfigurationPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      
      /**
        * Get an existing PriorityLevelConfigurationPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationPatch_PriorityLevelConfigurationPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      inline def get_PriorityLevelConfigurationPatch_PriorityLevelConfigurationPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      
      /**
        * Returns true if the given object is an instance of PriorityLevelConfigurationPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationPatch.PriorityLevelConfigurationPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationPatch.PriorityLevelConfigurationPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta1.PriorityLevelConfigurationPatch")
    @js.native
    open class PriorityLevelConfigurationPatchCls protected () extends PriorityLevelConfigurationPatch {
      /**
        * Create a PriorityLevelConfigurationPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityLevelConfigurationPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityLevelConfigurationPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
  
  object v1beta2 {
    
    object FlowSchema {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.FlowSchema")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaMod.FlowSchema]
      
      /**
        * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchema(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema]
      inline def get_FlowSchema(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaMod.FlowSchema]
      
      /**
        * Get an existing FlowSchema resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchema_FlowSchema(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema]
      inline def get_FlowSchema_FlowSchema(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaMod.FlowSchema]
      
      /**
        * Returns true if the given object is an instance of FlowSchema.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchema.FlowSchema */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchema.FlowSchema */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.FlowSchema")
    @js.native
    open class FlowSchemaCls protected () extends FlowSchema {
      /**
        * Create a FlowSchema resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: FlowSchemaArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: FlowSchemaArgs, opts: CustomResourceOptions) = this()
    }
    
    object FlowSchemaList {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.FlowSchemaList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaListMod.FlowSchemaList]
      
      /**
        * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList]
      inline def get_FlowSchemaList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaListMod.FlowSchemaList]
      
      /**
        * Get an existing FlowSchemaList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaList_FlowSchemaList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList]
      inline def get_FlowSchemaList_FlowSchemaList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaListMod.FlowSchemaList]
      
      /**
        * Returns true if the given object is an instance of FlowSchemaList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList.FlowSchemaList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaList.FlowSchemaList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.FlowSchemaList")
    @js.native
    open class FlowSchemaListCls protected () extends FlowSchemaList {
      /**
        * Create a FlowSchemaList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: FlowSchemaListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: FlowSchemaListArgs, opts: CustomResourceOptions) = this()
    }
    
    object FlowSchemaPatch {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.FlowSchemaPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing FlowSchemaPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2FlowSchemaPatchMod.FlowSchemaPatch]
      
      /**
        * Get an existing FlowSchemaPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch]
      inline def get_FlowSchemaPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1FlowSchemaPatchMod.FlowSchemaPatch]
      
      /**
        * Get an existing FlowSchemaPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_FlowSchemaPatch_FlowSchemaPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch]
      inline def get_FlowSchemaPatch_FlowSchemaPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1FlowSchemaPatchMod.FlowSchemaPatch]
      
      /**
        * Returns true if the given object is an instance of FlowSchemaPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaPatch.FlowSchemaPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/flowSchemaPatch.FlowSchemaPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.FlowSchemaPatch")
    @js.native
    open class FlowSchemaPatchCls protected () extends FlowSchemaPatch {
      /**
        * Create a FlowSchemaPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: FlowSchemaPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: FlowSchemaPatchArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityLevelConfiguration {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.PriorityLevelConfiguration")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      
      /**
        * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfiguration(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      inline def get_PriorityLevelConfiguration(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      
      /**
        * Get an existing PriorityLevelConfiguration resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfiguration_PriorityLevelConfiguration(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      inline def get_PriorityLevelConfiguration_PriorityLevelConfiguration(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationMod.PriorityLevelConfiguration]
      
      /**
        * Returns true if the given object is an instance of PriorityLevelConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfiguration.PriorityLevelConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfiguration.PriorityLevelConfiguration */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.PriorityLevelConfiguration")
    @js.native
    open class PriorityLevelConfigurationCls protected () extends PriorityLevelConfiguration {
      /**
        * Create a PriorityLevelConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityLevelConfigurationArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityLevelConfigurationArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityLevelConfigurationList {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.PriorityLevelConfigurationList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      
      /**
        * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      inline def get_PriorityLevelConfigurationList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      
      /**
        * Get an existing PriorityLevelConfigurationList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationList_PriorityLevelConfigurationList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      inline def get_PriorityLevelConfigurationList_PriorityLevelConfigurationList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationListMod.PriorityLevelConfigurationList]
      
      /**
        * Returns true if the given object is an instance of PriorityLevelConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationList.PriorityLevelConfigurationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationList.PriorityLevelConfigurationList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.PriorityLevelConfigurationList")
    @js.native
    open class PriorityLevelConfigurationListCls protected () extends PriorityLevelConfigurationList {
      /**
        * Create a PriorityLevelConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityLevelConfigurationListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityLevelConfigurationListArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityLevelConfigurationPatch {
      
      @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.PriorityLevelConfigurationPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityLevelConfigurationPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta2PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      
      /**
        * Get an existing PriorityLevelConfigurationPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      inline def get_PriorityLevelConfigurationPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1alpha1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      
      /**
        * Get an existing PriorityLevelConfigurationPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityLevelConfigurationPatch_PriorityLevelConfigurationPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      inline def get_PriorityLevelConfigurationPatch_PriorityLevelConfigurationPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.flowcontrolV1beta1PriorityLevelConfigurationPatchMod.PriorityLevelConfigurationPatch]
      
      /**
        * Returns true if the given object is an instance of PriorityLevelConfigurationPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationPatch.PriorityLevelConfigurationPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/flowcontrol/v1alpha1/priorityLevelConfigurationPatch.PriorityLevelConfigurationPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/flowcontrol", "v1beta2.PriorityLevelConfigurationPatch")
    @js.native
    open class PriorityLevelConfigurationPatchCls protected () extends PriorityLevelConfigurationPatch {
      /**
        * Create a PriorityLevelConfigurationPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityLevelConfigurationPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityLevelConfigurationPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
