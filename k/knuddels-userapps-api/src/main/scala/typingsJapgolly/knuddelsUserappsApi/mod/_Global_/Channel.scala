package typingsJapgolly.knuddelsUserappsApi.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/Channel.html
	 */
@JSGlobal("Channel")
@js.native
class Channel () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Channel.html#method_getAllUsersWithTalkPermission
  		 */
  def getAllUsersWithTalkPermission(channelTalkPermission: ChannelTalkPermission*): js.Array[User] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Channel.html#method_getChannelConfiguration
  		 */
  def getChannelConfiguration(): ChannelConfiguration = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Channel.html#method_getChannelDesign
  		 * @since AppServer 87470, ChatServer 87470
  		 */
  def getChannelDesign(): ChannelDesign = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Channel.html#method_getChannelName
  		 */
  def getChannelName(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Channel.html#method_getChannelRestrictions
  		 */
  def getChannelRestrictions(): ChannelRestrictions = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Channel.html#method_getOnlineUsers
  		 */
  def getOnlineUsers(userType: UserType*): js.Array[User] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Channel.html#method_getRootChannelName
  		 */
  def getRootChannelName(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Channel.html#method_getTalkMode
  		 */
  def getTalkMode(): ChannelTalkMode = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Channel.html#method_getVideoChannelData
  		 */
  def getVideoChannelData(): VideoChannelData = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Channel.html#method_isVideoChannel
  		 */
  def isVideoChannel(): Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Channel.html#method_isVisible
  		 * @since AppServer 82202
  		 */
  def isVisible(): Boolean = js.native
}

