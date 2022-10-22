package typingsJapgolly.pulumiKubernetes.mod

import typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceListMod.EndpointSliceList
import typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceListMod.EndpointSliceListArgs
import typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceMod.EndpointSlice
import typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceMod.EndpointSliceArgs
import typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSlicePatchMod.EndpointSlicePatch
import typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSlicePatchMod.EndpointSlicePatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discovery {
  
  object v1beta1 {
    
    object EndpointSlice {
      
      @JSImport("@pulumi/kubernetes", "discovery.v1beta1.EndpointSlice")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing EndpointSlice resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceMod.EndpointSlice = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceMod.EndpointSlice]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceMod.EndpointSlice = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceMod.EndpointSlice]
      
      /**
        * Returns true if the given object is an instance of EndpointSlice.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSlice.EndpointSlice */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSlice.EndpointSlice */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "discovery.v1beta1.EndpointSlice")
    @js.native
    open class EndpointSliceCls protected () extends EndpointSlice {
      /**
        * Create a EndpointSlice resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: EndpointSliceArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: EndpointSliceArgs, opts: CustomResourceOptions) = this()
    }
    
    object EndpointSliceList {
      
      @JSImport("@pulumi/kubernetes", "discovery.v1beta1.EndpointSliceList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing EndpointSliceList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceListMod.EndpointSliceList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceListMod.EndpointSliceList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceListMod.EndpointSliceList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSliceListMod.EndpointSliceList]
      
      /**
        * Returns true if the given object is an instance of EndpointSliceList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSliceList.EndpointSliceList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSliceList.EndpointSliceList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "discovery.v1beta1.EndpointSliceList")
    @js.native
    open class EndpointSliceListCls protected () extends EndpointSliceList {
      /**
        * Create a EndpointSliceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: EndpointSliceListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: EndpointSliceListArgs, opts: CustomResourceOptions) = this()
    }
    
    object EndpointSlicePatch {
      
      @JSImport("@pulumi/kubernetes", "discovery.v1beta1.EndpointSlicePatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing EndpointSlicePatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSlicePatchMod.EndpointSlicePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSlicePatchMod.EndpointSlicePatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSlicePatchMod.EndpointSlicePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.discoveryV1beta1EndpointSlicePatchMod.EndpointSlicePatch]
      
      /**
        * Returns true if the given object is an instance of EndpointSlicePatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSlicePatch.EndpointSlicePatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSlicePatch.EndpointSlicePatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "discovery.v1beta1.EndpointSlicePatch")
    @js.native
    open class EndpointSlicePatchCls protected () extends EndpointSlicePatch {
      /**
        * Create a EndpointSlicePatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: EndpointSlicePatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: EndpointSlicePatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
