package typingsJapgolly.pulumiKubernetes.mod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "node")
@js.native
object node extends js.Object {
  @js.native
  object v1alpha1 extends js.Object {
    @js.native
    class RuntimeClass protected ()
      extends typingsJapgolly.pulumiKubernetes.pulumiKubernetesMod.v1alpha1.RuntimeClass {
      /**
        * Create a node.v1alpha1.RuntimeClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.node.v1alpha1.RuntimeClass) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.node.v1alpha1.RuntimeClass,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class RuntimeClassList protected ()
      extends typingsJapgolly.pulumiKubernetes.pulumiKubernetesMod.v1alpha1.RuntimeClassList {
      /**
        * Create a node.v1alpha1.RuntimeClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.node.v1alpha1.RuntimeClassList) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.node.v1alpha1.RuntimeClassList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object RuntimeClass extends js.Object {
      /**
        * Get the state of an existing `RuntimeClass` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.runtimeClassMod.RuntimeClass = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.runtimeClassMod.RuntimeClass = js.native
      /**
        * Returns true if the given object is an instance of RuntimeClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/RuntimeClass.RuntimeClass */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object RuntimeClassList extends js.Object {
      /**
        * Get the state of an existing `RuntimeClassList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.runtimeClassListMod.RuntimeClassList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.runtimeClassListMod.RuntimeClassList = js.native
      /**
        * Returns true if the given object is an instance of RuntimeClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/RuntimeClassList.RuntimeClassList */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class RuntimeClass protected ()
      extends typingsJapgolly.pulumiKubernetes.pulumiKubernetesMod.v1beta1.RuntimeClass {
      /**
        * Create a node.v1beta1.RuntimeClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.node.v1beta1.RuntimeClass) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.node.v1beta1.RuntimeClass,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class RuntimeClassList protected ()
      extends typingsJapgolly.pulumiKubernetes.pulumiKubernetesMod.v1beta1.RuntimeClassList {
      /**
        * Create a node.v1beta1.RuntimeClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.node.v1beta1.RuntimeClassList) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.node.v1beta1.RuntimeClassList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object RuntimeClass extends js.Object {
      /**
        * Get the state of an existing `RuntimeClass` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.v1beta1RuntimeClassMod.RuntimeClass = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.v1beta1RuntimeClassMod.RuntimeClass = js.native
      /**
        * Returns true if the given object is an instance of RuntimeClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1beta1/RuntimeClass.RuntimeClass */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object RuntimeClassList extends js.Object {
      /**
        * Get the state of an existing `RuntimeClassList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.v1beta1RuntimeClassListMod.RuntimeClassList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.v1beta1RuntimeClassListMod.RuntimeClassList = js.native
      /**
        * Returns true if the given object is an instance of RuntimeClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1beta1/RuntimeClassList.RuntimeClassList */ Boolean = js.native
    }
    
  }
  
}

