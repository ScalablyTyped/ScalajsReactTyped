package typingsJapgolly.knuddelsUserappsApi.mod._Global_

import typingsJapgolly.knuddelsUserappsApi.AnonCustomMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/PaymentAccess.html
	 * @since AppServer 108571, ChatServer 108571
	 */
@JSGlobal("PaymentAccess")
@js.native
class PaymentAccess () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/PaymentAccess.html#method_startKnuddelPurchase
  		 * @since AppServer 108571, ChatServer 108571
  		 */
  def startKnuddelPurchase(user: User, amount: KnuddelAmount): Unit = js.native
  def startKnuddelPurchase(user: User, amount: KnuddelAmount, parameters: AnonCustomMessage): Unit = js.native
}

