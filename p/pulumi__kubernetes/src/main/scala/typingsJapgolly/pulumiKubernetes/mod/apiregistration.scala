package typingsJapgolly.pulumiKubernetes.mod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "apiregistration")
@js.native
object apiregistration extends js.Object {
  @js.native
  object v1 extends js.Object {
    @js.native
    class APIService protected ()
      extends typingsJapgolly.pulumiKubernetes.apiregistrationMod.v1.APIService {
      /**
        * Create a apiregistration.v1.APIService resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.apiregistration.v1.APIService) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.apiregistration.v1.APIService,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class APIServiceList protected ()
      extends typingsJapgolly.pulumiKubernetes.apiregistrationMod.v1.APIServiceList {
      /**
        * Create a apiregistration.v1.APIServiceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.apiregistration.v1.APIServiceList) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.apiregistration.v1.APIServiceList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object APIService extends js.Object {
      /**
        * Get the state of an existing `APIService` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.v1ApiserviceMod.APIService = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.v1ApiserviceMod.APIService = js.native
      /**
        * Returns true if the given object is an instance of APIService.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/APIService.APIService */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object APIServiceList extends js.Object {
      /**
        * Get the state of an existing `APIServiceList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.v1ApiservicelistMod.APIServiceList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.v1ApiservicelistMod.APIServiceList = js.native
      /**
        * Returns true if the given object is an instance of APIServiceList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/APIServiceList.APIServiceList */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class APIService protected ()
      extends typingsJapgolly.pulumiKubernetes.apiregistrationMod.v1beta1.APIService {
      /**
        * Create a apiregistration.v1beta1.APIService resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.apiregistration.v1beta1.APIService) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.apiregistration.v1beta1.APIService,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class APIServiceList protected ()
      extends typingsJapgolly.pulumiKubernetes.apiregistrationMod.v1beta1.APIServiceList {
      /**
        * Create a apiregistration.v1beta1.APIServiceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.apiregistration.v1beta1.APIServiceList
      ) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.apiregistration.v1beta1.APIServiceList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object APIService extends js.Object {
      /**
        * Get the state of an existing `APIService` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.apiserviceMod.APIService = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.apiserviceMod.APIService = js.native
      /**
        * Returns true if the given object is an instance of APIService.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/APIService.APIService */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object APIServiceList extends js.Object {
      /**
        * Get the state of an existing `APIServiceList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.apiservicelistMod.APIServiceList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.apiservicelistMod.APIServiceList = js.native
      /**
        * Returns true if the given object is an instance of APIServiceList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/APIServiceList.APIServiceList */ Boolean = js.native
    }
    
  }
  
}

