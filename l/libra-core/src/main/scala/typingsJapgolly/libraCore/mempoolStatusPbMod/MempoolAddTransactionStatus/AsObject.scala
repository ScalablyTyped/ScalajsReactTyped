package typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus

import typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var code: MempoolAddTransactionStatusCode
  var message: String
}

object AsObject {
  @scala.inline
  def apply(code: MempoolAddTransactionStatusCode, message: String): AsObject = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

