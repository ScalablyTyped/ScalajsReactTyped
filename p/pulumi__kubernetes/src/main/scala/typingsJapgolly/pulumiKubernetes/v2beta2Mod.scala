package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/autoscaling/v2beta2", JSImport.Namespace)
@js.native
object v2beta2Mod extends js.Object {
  @js.native
  class HorizontalPodAutoscaler protected ()
    extends typingsJapgolly.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler {
    /**
      * Create a autoscaling.v2beta2.HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.autoscaling.v2beta2.HorizontalPodAutoscaler
    ) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.autoscaling.v2beta2.HorizontalPodAutoscaler,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class HorizontalPodAutoscalerList protected ()
    extends typingsJapgolly.pulumiKubernetes.v2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList {
    /**
      * Create a autoscaling.v2beta2.HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.autoscaling.v2beta2.HorizontalPodAutoscalerList
    ) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.autoscaling.v2beta2.HorizontalPodAutoscalerList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object HorizontalPodAutoscaler extends js.Object {
    /**
      * Get the state of an existing `HorizontalPodAutoscaler` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod.HorizontalPodAutoscaler = js.native
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/HorizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object HorizontalPodAutoscalerList extends js.Object {
    /**
      * Get the state of an existing `HorizontalPodAutoscalerList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.v2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.v2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/HorizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = js.native
  }
  
}

