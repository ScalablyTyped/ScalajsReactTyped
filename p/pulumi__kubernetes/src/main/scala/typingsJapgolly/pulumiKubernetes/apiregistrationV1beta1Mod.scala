package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceListMod.APIServiceListArgs
import typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceMod.APIServiceArgs
import typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiservicePatchMod.APIServicePatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiregistrationV1beta1Mod {
  
  object APIService {
    
    @JSImport("@pulumi/kubernetes/apiregistration/v1beta1", "APIService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing APIService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceMod.APIService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceMod.APIService]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceMod.APIService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceMod.APIService]
    
    /**
      * Returns true if the given object is an instance of APIService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiservice.APIService */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiservice.APIService */ Boolean]
  }
  type APIService = typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceMod.APIService
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/apiregistration/v1beta1", "APIService")
  @js.native
  open class APIServiceCls protected ()
    extends typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceMod.APIService {
    /**
      * Create a APIService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: APIServiceArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: APIServiceArgs, opts: CustomResourceOptions) = this()
  }
  
  object APIServiceList {
    
    @JSImport("@pulumi/kubernetes/apiregistration/v1beta1", "APIServiceList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing APIServiceList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceListMod.APIServiceList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceListMod.APIServiceList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceListMod.APIServiceList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceListMod.APIServiceList]
    
    /**
      * Returns true if the given object is an instance of APIServiceList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiserviceList.APIServiceList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiserviceList.APIServiceList */ Boolean]
  }
  type APIServiceList = typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceListMod.APIServiceList
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/apiregistration/v1beta1", "APIServiceList")
  @js.native
  open class APIServiceListCls protected ()
    extends typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiserviceListMod.APIServiceList {
    /**
      * Create a APIServiceList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: APIServiceListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: APIServiceListArgs, opts: CustomResourceOptions) = this()
  }
  
  object APIServicePatch {
    
    @JSImport("@pulumi/kubernetes/apiregistration/v1beta1", "APIServicePatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing APIServicePatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiservicePatchMod.APIServicePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiservicePatchMod.APIServicePatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiservicePatchMod.APIServicePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiservicePatchMod.APIServicePatch]
    
    /**
      * Returns true if the given object is an instance of APIServicePatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiservicePatch.APIServicePatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiservicePatch.APIServicePatch */ Boolean]
  }
  type APIServicePatch = typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiservicePatchMod.APIServicePatch
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/kubernetes/apiregistration/v1beta1", "APIServicePatch")
  @js.native
  open class APIServicePatchCls protected ()
    extends typingsJapgolly.pulumiKubernetes.apiregistrationV1beta1ApiservicePatchMod.APIServicePatch {
    /**
      * Create a APIServicePatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: APIServicePatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: APIServicePatchArgs, opts: CustomResourceOptions) = this()
  }
}
