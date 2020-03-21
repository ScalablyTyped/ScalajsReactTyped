package typingsJapgolly.pulumiAws.mod.pinpoint

import typingsJapgolly.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannelArgs
import typingsJapgolly.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannelState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "pinpoint.ApnsVoipSandboxChannel")
@js.native
class ApnsVoipSandboxChannel protected ()
  extends typingsJapgolly.pulumiAws.pinpointMod.ApnsVoipSandboxChannel {
  /**
    * Create a ApnsVoipSandboxChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApnsVoipSandboxChannelArgs) = this()
  def this(name: String, args: ApnsVoipSandboxChannelArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "pinpoint.ApnsVoipSandboxChannel")
@js.native
object ApnsVoipSandboxChannel extends js.Object {
  /**
    * Get an existing ApnsVoipSandboxChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
  def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState): typingsJapgolly.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
  def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
  /**
    * Returns true if the given object is an instance of ApnsVoipSandboxChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipSandboxChannel.ApnsVoipSandboxChannel */ Boolean = js.native
}

