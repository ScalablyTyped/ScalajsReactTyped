package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList
import typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassListArgs
import typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass
import typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClassArgs
import typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassPatchMod.PriorityClassPatch
import typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassPatchMod.PriorityClassPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schedulingMod {
  
  object v1alpha1 {
    
    object PriorityClass {
      
      @JSImport("@pulumi/kubernetes/scheduling", "v1alpha1.PriorityClass")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass]
      
      /**
        * Get an existing PriorityClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityClass(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassMod.PriorityClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassMod.PriorityClass]
      inline def get_PriorityClass(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassMod.PriorityClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassMod.PriorityClass]
      
      /**
        * Returns true if the given object is an instance of PriorityClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClass.PriorityClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClass.PriorityClass */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/scheduling", "v1alpha1.PriorityClass")
    @js.native
    open class PriorityClassCls protected () extends PriorityClass {
      /**
        * Create a PriorityClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityClassArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityClassArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityClassList {
      
      @JSImport("@pulumi/kubernetes/scheduling", "v1alpha1.PriorityClassList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList]
      
      /**
        * Get an existing PriorityClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityClassList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassListMod.PriorityClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassListMod.PriorityClassList]
      inline def get_PriorityClassList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassListMod.PriorityClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassListMod.PriorityClassList]
      
      /**
        * Returns true if the given object is an instance of PriorityClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassList.PriorityClassList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassList.PriorityClassList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/scheduling", "v1alpha1.PriorityClassList")
    @js.native
    open class PriorityClassListCls protected () extends PriorityClassList {
      /**
        * Create a PriorityClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityClassListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityClassListArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityClassPatch {
      
      @JSImport("@pulumi/kubernetes/scheduling", "v1alpha1.PriorityClassPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityClassPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassPatchMod.PriorityClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassPatchMod.PriorityClassPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassPatchMod.PriorityClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassPatchMod.PriorityClassPatch]
      
      /**
        * Get an existing PriorityClassPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityClassPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassPatchMod.PriorityClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassPatchMod.PriorityClassPatch]
      inline def get_PriorityClassPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassPatchMod.PriorityClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassPatchMod.PriorityClassPatch]
      
      /**
        * Returns true if the given object is an instance of PriorityClassPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassPatch.PriorityClassPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassPatch.PriorityClassPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/scheduling", "v1alpha1.PriorityClassPatch")
    @js.native
    open class PriorityClassPatchCls protected () extends PriorityClassPatch {
      /**
        * Create a PriorityClassPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityClassPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityClassPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
  
  object v1beta1 {
    
    object PriorityClass {
      
      @JSImport("@pulumi/kubernetes/scheduling", "v1beta1.PriorityClass")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassMod.PriorityClass]
      
      /**
        * Get an existing PriorityClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityClass(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassMod.PriorityClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassMod.PriorityClass]
      inline def get_PriorityClass(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassMod.PriorityClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassMod.PriorityClass]
      
      /**
        * Returns true if the given object is an instance of PriorityClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClass.PriorityClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClass.PriorityClass */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/scheduling", "v1beta1.PriorityClass")
    @js.native
    open class PriorityClassCls protected () extends PriorityClass {
      /**
        * Create a PriorityClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityClassArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityClassArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityClassList {
      
      @JSImport("@pulumi/kubernetes/scheduling", "v1beta1.PriorityClassList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassListMod.PriorityClassList]
      
      /**
        * Get an existing PriorityClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityClassList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassListMod.PriorityClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassListMod.PriorityClassList]
      inline def get_PriorityClassList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassListMod.PriorityClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassListMod.PriorityClassList]
      
      /**
        * Returns true if the given object is an instance of PriorityClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassList.PriorityClassList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassList.PriorityClassList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/scheduling", "v1beta1.PriorityClassList")
    @js.native
    open class PriorityClassListCls protected () extends PriorityClassList {
      /**
        * Create a PriorityClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityClassListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityClassListArgs, opts: CustomResourceOptions) = this()
    }
    
    object PriorityClassPatch {
      
      @JSImport("@pulumi/kubernetes/scheduling", "v1beta1.PriorityClassPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PriorityClassPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassPatchMod.PriorityClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassPatchMod.PriorityClassPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassPatchMod.PriorityClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1alpha1PriorityClassPatchMod.PriorityClassPatch]
      
      /**
        * Get an existing PriorityClassPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_PriorityClassPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassPatchMod.PriorityClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassPatchMod.PriorityClassPatch]
      inline def get_PriorityClassPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassPatchMod.PriorityClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.schedulingV1beta1PriorityClassPatchMod.PriorityClassPatch]
      
      /**
        * Returns true if the given object is an instance of PriorityClassPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassPatch.PriorityClassPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassPatch.PriorityClassPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/scheduling", "v1beta1.PriorityClassPatch")
    @js.native
    open class PriorityClassPatchCls protected () extends PriorityClassPatch {
      /**
        * Create a PriorityClassPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PriorityClassPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PriorityClassPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
