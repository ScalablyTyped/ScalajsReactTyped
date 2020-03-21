package typingsJapgolly.knuddelsUserappsApi.mod._Global_

import typingsJapgolly.knuddelsUserappsApi.AnonDisplayReasonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/BotUser.html
	 */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.knuddelsUserappsApi.mod._KnuddelsJsonData because Already inherited
- typingsJapgolly.knuddelsUserappsApi.mod._KnuddelsSerializable because Already inherited */ @JSGlobal("BotUser")
@js.native
class BotUser () extends User {
  def sendPostMessage(topic: java.lang.String, text: java.lang.String, receivingUser: User): Unit = js.native
  def sendPrivateMessage(message: java.lang.String, users: js.Array[User]): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_sendPublicActionMessage
  		 */
  def sendPublicActionMessage(actionMessage: java.lang.String): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_sendPublicMessage
  		 */
  def sendPublicMessage(message: java.lang.String): Unit = js.native
  def transferKnuddel(receivingUserOrAccount: KnuddelAccount, knuddelAmount: KnuddelAmount): Unit = js.native
  def transferKnuddel(
    receivingUserOrAccount: KnuddelAccount,
    knuddelAmount: KnuddelAmount,
    parameters: AnonDisplayReasonText
  ): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_transferKnuddel
  		 */
  def transferKnuddel(receivingUserOrAccount: User, knuddelAmount: KnuddelAmount): Unit = js.native
  def transferKnuddel(receivingUserOrAccount: User, knuddelAmount: KnuddelAmount, parameters: AnonDisplayReasonText): Unit = js.native
}

