package typingsJapgolly.twilioChat.channelsMod

import typingsJapgolly.twilioChat.consumptionhorizonMod.ConsumptionHorizon
import typingsJapgolly.twilioChat.networkMod.Network
import typingsJapgolly.twilioChat.sessionMod.Session
import typingsJapgolly.twilioChat.synclistMod.SyncList
import typingsJapgolly.twilioChat.typingindicatorMod.TypingIndicator
import typingsJapgolly.twilioChat.usersMod.Users
import typingsJapgolly.twilioMcsClient.mod.McsClient
import typingsJapgolly.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsServices extends js.Object {
  var consumptionHorizon: ConsumptionHorizon
  var mcsClient: McsClient
  var network: Network
  var session: Session
  var syncClient: SyncClient
  var syncList: SyncList
  var typingIndicator: TypingIndicator
  var users: Users
}

object ChannelsServices {
  @scala.inline
  def apply(
    consumptionHorizon: ConsumptionHorizon,
    mcsClient: McsClient,
    network: Network,
    session: Session,
    syncClient: SyncClient,
    syncList: SyncList,
    typingIndicator: TypingIndicator,
    users: Users
  ): ChannelsServices = {
    val __obj = js.Dynamic.literal(consumptionHorizon = consumptionHorizon.asInstanceOf[js.Any], mcsClient = mcsClient.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any], syncList = syncList.asInstanceOf[js.Any], typingIndicator = typingIndicator.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelsServices]
  }
}

