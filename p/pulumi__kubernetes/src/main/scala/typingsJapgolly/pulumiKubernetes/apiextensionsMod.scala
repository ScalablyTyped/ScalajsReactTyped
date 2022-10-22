package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.apiextensionsCustomResourceMod.CustomResourceArgs
import typingsJapgolly.pulumiKubernetes.apiextensionsCustomResourceMod.CustomResourceGetOptions
import typingsJapgolly.pulumiKubernetes.apiextensionsCustomResourcePatchMod.CustomResourcePatchArgs
import typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionListMod.CustomResourceDefinitionList
import typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionListMod.CustomResourceDefinitionListArgs
import typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionMod.CustomResourceDefinition
import typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionMod.CustomResourceDefinitionArgs
import typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionPatchMod.CustomResourceDefinitionPatch
import typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionPatchMod.CustomResourceDefinitionPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiextensionsMod {
  
  @JSImport("@pulumi/kubernetes/apiextensions", "CustomResource")
  @js.native
  open class CustomResource protected ()
    extends typingsJapgolly.pulumiKubernetes.apiextensionsCustomResourceMod.CustomResource {
    /**
      * Create a CustomResource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CustomResourceArgs) = this()
    def this(name: String, args: CustomResourceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CustomResource {
    
    @JSImport("@pulumi/kubernetes/apiextensions", "CustomResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CustomResource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    inline def get(name: String, opts: CustomResourceGetOptions): typingsJapgolly.pulumiKubernetes.apiextensionsCustomResourceMod.CustomResource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiextensionsCustomResourceMod.CustomResource]
  }
  
  @JSImport("@pulumi/kubernetes/apiextensions", "CustomResourcePatch")
  @js.native
  open class CustomResourcePatch protected ()
    extends typingsJapgolly.pulumiKubernetes.apiextensionsCustomResourcePatchMod.CustomResourcePatch {
    /**
      * Create a CustomResourcePatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CustomResourcePatchArgs) = this()
    def this(name: String, args: CustomResourcePatchArgs, opts: CustomResourceOptions) = this()
  }
  
  object v1beta1 {
    
    object CustomResourceDefinition {
      
      @JSImport("@pulumi/kubernetes/apiextensions", "v1beta1.CustomResourceDefinition")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CustomResourceDefinition resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionMod.CustomResourceDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionMod.CustomResourceDefinition]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionMod.CustomResourceDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionMod.CustomResourceDefinition]
      
      /**
        * Returns true if the given object is an instance of CustomResourceDefinition.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinition.CustomResourceDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinition.CustomResourceDefinition */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/apiextensions", "v1beta1.CustomResourceDefinition")
    @js.native
    open class CustomResourceDefinitionCls protected () extends CustomResourceDefinition {
      /**
        * Create a CustomResourceDefinition resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CustomResourceDefinitionArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CustomResourceDefinitionArgs, opts: CustomResourceOptions) = this()
    }
    
    object CustomResourceDefinitionList {
      
      @JSImport("@pulumi/kubernetes/apiextensions", "v1beta1.CustomResourceDefinitionList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CustomResourceDefinitionList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionListMod.CustomResourceDefinitionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionListMod.CustomResourceDefinitionList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionListMod.CustomResourceDefinitionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionListMod.CustomResourceDefinitionList]
      
      /**
        * Returns true if the given object is an instance of CustomResourceDefinitionList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinitionList.CustomResourceDefinitionList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinitionList.CustomResourceDefinitionList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/apiextensions", "v1beta1.CustomResourceDefinitionList")
    @js.native
    open class CustomResourceDefinitionListCls protected () extends CustomResourceDefinitionList {
      /**
        * Create a CustomResourceDefinitionList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CustomResourceDefinitionListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CustomResourceDefinitionListArgs, opts: CustomResourceOptions) = this()
    }
    
    object CustomResourceDefinitionPatch {
      
      @JSImport("@pulumi/kubernetes/apiextensions", "v1beta1.CustomResourceDefinitionPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CustomResourceDefinitionPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionPatchMod.CustomResourceDefinitionPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionPatchMod.CustomResourceDefinitionPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionPatchMod.CustomResourceDefinitionPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionPatchMod.CustomResourceDefinitionPatch]
      
      /**
        * Returns true if the given object is an instance of CustomResourceDefinitionPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinitionPatch.CustomResourceDefinitionPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinitionPatch.CustomResourceDefinitionPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes/apiextensions", "v1beta1.CustomResourceDefinitionPatch")
    @js.native
    open class CustomResourceDefinitionPatchCls protected () extends CustomResourceDefinitionPatch {
      /**
        * Create a CustomResourceDefinitionPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CustomResourceDefinitionPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CustomResourceDefinitionPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
