package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/settings", JSImport.Namespace)
@js.native
object settingsMod extends js.Object {
  @js.native
  object v1alpha1 extends js.Object {
    @js.native
    class PodPreset protected ()
      extends typingsJapgolly.pulumiKubernetes.settingsV1alpha1Mod.PodPreset {
      /**
        * Create a settings.v1alpha1.PodPreset resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.settings.v1alpha1.PodPreset) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.settings.v1alpha1.PodPreset,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class PodPresetList protected ()
      extends typingsJapgolly.pulumiKubernetes.settingsV1alpha1Mod.PodPresetList {
      /**
        * Create a settings.v1alpha1.PodPresetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.settings.v1alpha1.PodPresetList) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.settings.v1alpha1.PodPresetList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object PodPreset extends js.Object {
      /**
        * Get the state of an existing `PodPreset` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.podPresetMod.PodPreset = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.podPresetMod.PodPreset = js.native
      /**
        * Returns true if the given object is an instance of PodPreset.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/PodPreset.PodPreset */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object PodPresetList extends js.Object {
      /**
        * Get the state of an existing `PodPresetList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.podPresetListMod.PodPresetList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.podPresetListMod.PodPresetList = js.native
      /**
        * Returns true if the given object is an instance of PodPresetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/PodPresetList.PodPresetList */ Boolean = js.native
    }
    
  }
  
}

