package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassListMod.RuntimeClassList
import typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassListMod.RuntimeClassListArgs
import typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassMod.RuntimeClass
import typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassMod.RuntimeClassArgs
import typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassPatchMod.RuntimeClassPatch
import typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassPatchMod.RuntimeClassPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  object v1alpha1 {
    
    object RuntimeClass {
      
      @JSImport("@pulumi/kubernetes/node", "v1alpha1.RuntimeClass")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing RuntimeClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassMod.RuntimeClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassMod.RuntimeClass]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassMod.RuntimeClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassMod.RuntimeClass]
      
      /**
        * Get an existing RuntimeClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_RuntimeClass(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassMod.RuntimeClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassMod.RuntimeClass]
      inline def get_RuntimeClass(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassMod.RuntimeClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassMod.RuntimeClass]
      
      /**
        * Returns true if the given object is an instance of RuntimeClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClass.RuntimeClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClass.RuntimeClass */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/node", "v1alpha1.RuntimeClass")
    @js.native
    open class RuntimeClassCls protected () extends RuntimeClass {
      /**
        * Create a RuntimeClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: RuntimeClassArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: RuntimeClassArgs, opts: CustomResourceOptions) = this()
    }
    
    object RuntimeClassList {
      
      @JSImport("@pulumi/kubernetes/node", "v1alpha1.RuntimeClassList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing RuntimeClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassListMod.RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassListMod.RuntimeClassList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassListMod.RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassListMod.RuntimeClassList]
      
      /**
        * Get an existing RuntimeClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_RuntimeClassList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassListMod.RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassListMod.RuntimeClassList]
      inline def get_RuntimeClassList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassListMod.RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassListMod.RuntimeClassList]
      
      /**
        * Returns true if the given object is an instance of RuntimeClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClassList.RuntimeClassList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClassList.RuntimeClassList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/node", "v1alpha1.RuntimeClassList")
    @js.native
    open class RuntimeClassListCls protected () extends RuntimeClassList {
      /**
        * Create a RuntimeClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: RuntimeClassListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: RuntimeClassListArgs, opts: CustomResourceOptions) = this()
    }
    
    object RuntimeClassPatch {
      
      @JSImport("@pulumi/kubernetes/node", "v1alpha1.RuntimeClassPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing RuntimeClassPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassPatchMod.RuntimeClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassPatchMod.RuntimeClassPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassPatchMod.RuntimeClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassPatchMod.RuntimeClassPatch]
      
      /**
        * Get an existing RuntimeClassPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_RuntimeClassPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassPatchMod.RuntimeClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassPatchMod.RuntimeClassPatch]
      inline def get_RuntimeClassPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassPatchMod.RuntimeClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassPatchMod.RuntimeClassPatch]
      
      /**
        * Returns true if the given object is an instance of RuntimeClassPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClassPatch.RuntimeClassPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClassPatch.RuntimeClassPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/node", "v1alpha1.RuntimeClassPatch")
    @js.native
    open class RuntimeClassPatchCls protected () extends RuntimeClassPatch {
      /**
        * Create a RuntimeClassPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: RuntimeClassPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: RuntimeClassPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
  
  object v1beta1 {
    
    object RuntimeClass {
      
      @JSImport("@pulumi/kubernetes/node", "v1beta1.RuntimeClass")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing RuntimeClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassMod.RuntimeClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassMod.RuntimeClass]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassMod.RuntimeClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassMod.RuntimeClass]
      
      /**
        * Get an existing RuntimeClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_RuntimeClass(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassMod.RuntimeClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassMod.RuntimeClass]
      inline def get_RuntimeClass(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassMod.RuntimeClass = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassMod.RuntimeClass]
      
      /**
        * Returns true if the given object is an instance of RuntimeClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClass.RuntimeClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClass.RuntimeClass */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/node", "v1beta1.RuntimeClass")
    @js.native
    open class RuntimeClassCls protected () extends RuntimeClass {
      /**
        * Create a RuntimeClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: RuntimeClassArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: RuntimeClassArgs, opts: CustomResourceOptions) = this()
    }
    
    object RuntimeClassList {
      
      @JSImport("@pulumi/kubernetes/node", "v1beta1.RuntimeClassList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing RuntimeClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassListMod.RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassListMod.RuntimeClassList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassListMod.RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassListMod.RuntimeClassList]
      
      /**
        * Get an existing RuntimeClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_RuntimeClassList(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassListMod.RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassListMod.RuntimeClassList]
      inline def get_RuntimeClassList(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassListMod.RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassListMod.RuntimeClassList]
      
      /**
        * Returns true if the given object is an instance of RuntimeClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClassList.RuntimeClassList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClassList.RuntimeClassList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/node", "v1beta1.RuntimeClassList")
    @js.native
    open class RuntimeClassListCls protected () extends RuntimeClassList {
      /**
        * Create a RuntimeClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: RuntimeClassListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: RuntimeClassListArgs, opts: CustomResourceOptions) = this()
    }
    
    object RuntimeClassPatch {
      
      @JSImport("@pulumi/kubernetes/node", "v1beta1.RuntimeClassPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing RuntimeClassPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassPatchMod.RuntimeClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassPatchMod.RuntimeClassPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassPatchMod.RuntimeClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1alpha1RuntimeClassPatchMod.RuntimeClassPatch]
      
      /**
        * Get an existing RuntimeClassPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get_RuntimeClassPatch(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassPatchMod.RuntimeClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassPatchMod.RuntimeClassPatch]
      inline def get_RuntimeClassPatch(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassPatchMod.RuntimeClassPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.nodeV1beta1RuntimeClassPatchMod.RuntimeClassPatch]
      
      /**
        * Returns true if the given object is an instance of RuntimeClassPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClassPatch.RuntimeClassPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClassPatch.RuntimeClassPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/node", "v1beta1.RuntimeClassPatch")
    @js.native
    open class RuntimeClassPatchCls protected () extends RuntimeClassPatch {
      /**
        * Create a RuntimeClassPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: RuntimeClassPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: RuntimeClassPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
