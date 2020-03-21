package typingsJapgolly.twilioChat.channelMod

import typingsJapgolly.twilioChat.consumptionhorizonMod.ConsumptionHorizon
import typingsJapgolly.twilioChat.networkMod.Network
import typingsJapgolly.twilioChat.sessionMod.Session
import typingsJapgolly.twilioChat.typingindicatorMod.TypingIndicator
import typingsJapgolly.twilioChat.usersMod.Users
import typingsJapgolly.twilioMcsClient.mod.McsClient
import typingsJapgolly.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelServices extends js.Object {
  var consumptionHorizon: ConsumptionHorizon
  var mcsClient: McsClient
  var network: Network
  var session: Session
  var syncClient: SyncClient
  var typingIndicator: TypingIndicator
  var users: Users
}

object ChannelServices {
  @scala.inline
  def apply(
    consumptionHorizon: ConsumptionHorizon,
    mcsClient: McsClient,
    network: Network,
    session: Session,
    syncClient: SyncClient,
    typingIndicator: TypingIndicator,
    users: Users
  ): ChannelServices = {
    val __obj = js.Dynamic.literal(consumptionHorizon = consumptionHorizon.asInstanceOf[js.Any], mcsClient = mcsClient.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any], typingIndicator = typingIndicator.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelServices]
  }
}

