package typingsJapgolly.pulumiAws.pinpointMod

import typingsJapgolly.pulumiAws.admChannelMod.AdmChannelArgs
import typingsJapgolly.pulumiAws.admChannelMod.AdmChannelState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint", "AdmChannel")
@js.native
class AdmChannel protected ()
  extends typingsJapgolly.pulumiAws.admChannelMod.AdmChannel {
  /**
    * Create a AdmChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AdmChannelArgs) = this()
  def this(name: String, args: AdmChannelArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/pinpoint", "AdmChannel")
@js.native
object AdmChannel extends js.Object {
  /**
    * Get an existing AdmChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.admChannelMod.AdmChannel = js.native
  def get(name: String, id: Input[ID], state: AdmChannelState): typingsJapgolly.pulumiAws.admChannelMod.AdmChannel = js.native
  def get(name: String, id: Input[ID], state: AdmChannelState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.admChannelMod.AdmChannel = js.native
  /**
    * Returns true if the given object is an instance of AdmChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/admChannel.AdmChannel */ Boolean = js.native
}

