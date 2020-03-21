package typingsJapgolly.pulumiAws.channelMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelArgs extends js.Object {
  /**
    * A unique identifier describing the channel
    */
  val channelId: Input[String] = js.native
  /**
    * A description of the channel
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ChannelArgs {
  @scala.inline
  def apply(
    channelId: Input[String],
    description: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ChannelArgs = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelArgs]
  }
}

