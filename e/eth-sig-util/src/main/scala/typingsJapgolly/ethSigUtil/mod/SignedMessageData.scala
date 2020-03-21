package typingsJapgolly.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedMessageData[T] extends MessageData[T] {
  var sig: String
}

object SignedMessageData {
  @scala.inline
  def apply[T](data: T, sig: String): SignedMessageData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignedMessageData[T]]
  }
}

