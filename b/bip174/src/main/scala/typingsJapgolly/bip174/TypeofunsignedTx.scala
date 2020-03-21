package typingsJapgolly.bip174

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.bip174.interfacesMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofunsignedTx extends js.Object {
  def encode(data: Transaction): KeyValue
}

object TypeofunsignedTx {
  @scala.inline
  def apply(encode: Transaction => CallbackTo[KeyValue]): TypeofunsignedTx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.Transaction) => encode(t0).runNow()))
    __obj.asInstanceOf[TypeofunsignedTx]
  }
}

