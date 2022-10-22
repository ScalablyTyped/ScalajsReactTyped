package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList
import typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerListArgs
import typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler
import typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscalerArgs
import typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch
import typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoscalingMod {
  
  object v2beta1 {
    
    object HorizontalPodAutoscaler {
      
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscaler")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler]
      
      /**
        * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_HorizontalPodAutoscaler(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler]
      inline def get_HorizontalPodAutoscaler(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler]
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscaler")
    @js.native
    open class HorizontalPodAutoscalerCls protected () extends HorizontalPodAutoscaler {
      /**
        * Create a HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: HorizontalPodAutoscalerArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: HorizontalPodAutoscalerArgs, opts: CustomResourceOptions) = this()
    }
    
    object HorizontalPodAutoscalerList {
      
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscalerList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList]
      
      /**
        * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_HorizontalPodAutoscalerList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList]
      inline def get_HorizontalPodAutoscalerList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList]
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscalerList")
    @js.native
    open class HorizontalPodAutoscalerListCls protected () extends HorizontalPodAutoscalerList {
      /**
        * Create a HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: HorizontalPodAutoscalerListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: HorizontalPodAutoscalerListArgs, opts: CustomResourceOptions) = this()
    }
    
    object HorizontalPodAutoscalerPatch {
      
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscalerPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing HorizontalPodAutoscalerPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch]
      
      /**
        * Get an existing HorizontalPodAutoscalerPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_HorizontalPodAutoscalerPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch]
      inline def get_HorizontalPodAutoscalerPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch]
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscalerPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscalerPatch.HorizontalPodAutoscalerPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscalerPatch.HorizontalPodAutoscalerPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/autoscaling", "v2beta1.HorizontalPodAutoscalerPatch")
    @js.native
    open class HorizontalPodAutoscalerPatchCls protected () extends HorizontalPodAutoscalerPatch {
      /**
        * Create a HorizontalPodAutoscalerPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: HorizontalPodAutoscalerPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: HorizontalPodAutoscalerPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
  
  object v2beta2 {
    
    object HorizontalPodAutoscaler {
      
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscaler")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerMod.HorizontalPodAutoscaler]
      
      /**
        * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_HorizontalPodAutoscaler(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler]
      inline def get_HorizontalPodAutoscaler(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler]
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscaler")
    @js.native
    open class HorizontalPodAutoscalerCls protected () extends HorizontalPodAutoscaler {
      /**
        * Create a HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: HorizontalPodAutoscalerArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: HorizontalPodAutoscalerArgs, opts: CustomResourceOptions) = this()
    }
    
    object HorizontalPodAutoscalerList {
      
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscalerList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList]
      
      /**
        * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_HorizontalPodAutoscalerList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList]
      inline def get_HorizontalPodAutoscalerList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList]
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscalerList")
    @js.native
    open class HorizontalPodAutoscalerListCls protected () extends HorizontalPodAutoscalerList {
      /**
        * Create a HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: HorizontalPodAutoscalerListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: HorizontalPodAutoscalerListArgs, opts: CustomResourceOptions) = this()
    }
    
    object HorizontalPodAutoscalerPatch {
      
      @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscalerPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing HorizontalPodAutoscalerPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta1HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch]
      
      /**
        * Get an existing HorizontalPodAutoscalerPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_HorizontalPodAutoscalerPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch]
      inline def get_HorizontalPodAutoscalerPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerPatchMod.HorizontalPodAutoscalerPatch]
      
      /**
        * Returns true if the given object is an instance of HorizontalPodAutoscalerPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscalerPatch.HorizontalPodAutoscalerPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta1/horizontalPodAutoscalerPatch.HorizontalPodAutoscalerPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/autoscaling", "v2beta2.HorizontalPodAutoscalerPatch")
    @js.native
    open class HorizontalPodAutoscalerPatchCls protected () extends HorizontalPodAutoscalerPatch {
      /**
        * Create a HorizontalPodAutoscalerPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: HorizontalPodAutoscalerPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: HorizontalPodAutoscalerPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
