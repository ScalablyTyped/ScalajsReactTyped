package typingsJapgolly.ts3NodejsLibrary.eventsMod

import typingsJapgolly.ts3NodejsLibrary.PartialQueryResponseTypes
import typingsJapgolly.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typingsJapgolly.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelCreate extends js.Object {
  var channel: TeamSpeakChannel
  var cpid: Double
  var invoker: TeamSpeakClient
  var modified: PartialQueryResponseTypes
}

object ChannelCreate {
  @scala.inline
  def apply(
    channel: TeamSpeakChannel,
    cpid: Double,
    invoker: TeamSpeakClient,
    modified: PartialQueryResponseTypes
  ): ChannelCreate = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], cpid = cpid.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelCreate]
  }
}

