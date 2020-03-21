package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.channelMod.ChannelArgs
import typingsJapgolly.pulumiAws.channelMod.ChannelState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/mediapackage", JSImport.Namespace)
@js.native
object mediapackageMod extends js.Object {
  @js.native
  class Channel protected ()
    extends typingsJapgolly.pulumiAws.channelMod.Channel {
    /**
      * Create a Channel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ChannelArgs) = this()
    def this(name: String, args: ChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Channel extends js.Object {
    /**
      * Get an existing Channel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.channelMod.Channel = js.native
    def get(name: String, id: Input[ID], state: ChannelState): typingsJapgolly.pulumiAws.channelMod.Channel = js.native
    def get(name: String, id: Input[ID], state: ChannelState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.channelMod.Channel = js.native
    /**
      * Returns true if the given object is an instance of Channel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediapackage/channel.Channel */ Boolean = js.native
  }
  
}

