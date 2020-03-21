package typingsJapgolly.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSignalingChannelInput extends js.Object {
  /**
    * A name for the signaling channel that you are creating. It must be unique for each account and region.
    */
  var ChannelName: typingsJapgolly.awsSdk.kinesisvideoMod.ChannelName = js.native
  /**
    * A type of the signaling channel that you are creating. Currently, SINGLE_MASTER is the only supported channel type. 
    */
  var ChannelType: js.UndefOr[typingsJapgolly.awsSdk.kinesisvideoMod.ChannelType] = js.native
  /**
    * A structure containing the configuration for the SINGLE_MASTER channel type. 
    */
  var SingleMasterConfiguration: js.UndefOr[typingsJapgolly.awsSdk.kinesisvideoMod.SingleMasterConfiguration] = js.native
  /**
    * A set of tags (key/value pairs) that you want to associate with this channel.
    */
  var Tags: js.UndefOr[TagOnCreateList] = js.native
}

object CreateSignalingChannelInput {
  @scala.inline
  def apply(
    ChannelName: ChannelName,
    ChannelType: ChannelType = null,
    SingleMasterConfiguration: SingleMasterConfiguration = null,
    Tags: TagOnCreateList = null
  ): CreateSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (SingleMasterConfiguration != null) __obj.updateDynamic("SingleMasterConfiguration")(SingleMasterConfiguration.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSignalingChannelInput]
  }
}

