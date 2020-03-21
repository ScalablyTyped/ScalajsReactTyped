package typingsJapgolly.pulumiKubernetes.mod.storage

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "storage.v1alpha1")
@js.native
object v1alpha1 extends js.Object {
  @js.native
  class VolumeAttachment protected ()
    extends typingsJapgolly.pulumiKubernetes.storageMod.v1alpha1.VolumeAttachment {
    /**
      * Create a storage.v1alpha1.VolumeAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.storage.v1alpha1.VolumeAttachment) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.storage.v1alpha1.VolumeAttachment,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class VolumeAttachmentList protected ()
    extends typingsJapgolly.pulumiKubernetes.storageMod.v1alpha1.VolumeAttachmentList {
    /**
      * Create a storage.v1alpha1.VolumeAttachmentList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.storage.v1alpha1.VolumeAttachmentList
    ) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.storage.v1alpha1.VolumeAttachmentList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object VolumeAttachment extends js.Object {
    /**
      * Get the state of an existing `VolumeAttachment` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.volumeAttachmentMod.VolumeAttachment = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.volumeAttachmentMod.VolumeAttachment = js.native
    /**
      * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/VolumeAttachment.VolumeAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VolumeAttachmentList extends js.Object {
    /**
      * Get the state of an existing `VolumeAttachmentList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.volumeAttachmentListMod.VolumeAttachmentList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.volumeAttachmentListMod.VolumeAttachmentList = js.native
    /**
      * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/VolumeAttachmentList.VolumeAttachmentList */ Boolean = js.native
  }
  
}

