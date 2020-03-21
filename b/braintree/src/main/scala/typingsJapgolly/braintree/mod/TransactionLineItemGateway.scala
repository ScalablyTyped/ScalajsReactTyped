package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionLineItemGateway extends js.Object {
  def findAll(transactionId: String): js.Promise[js.Array[TransactionLineItem]]
}

object TransactionLineItemGateway {
  @scala.inline
  def apply(findAll: String => CallbackTo[js.Promise[js.Array[TransactionLineItem]]]): TransactionLineItemGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findAll")(js.Any.fromFunction1((t0: java.lang.String) => findAll(t0).runNow()))
    __obj.asInstanceOf[TransactionLineItemGateway]
  }
}

