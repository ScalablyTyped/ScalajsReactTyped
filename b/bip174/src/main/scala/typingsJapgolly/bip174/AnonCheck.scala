package typingsJapgolly.bip174

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.bip174.interfacesMod.RedeemScript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheck extends js.Object {
  var expected: String
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.RedeemScript */ Boolean
  def decode(keyVal: KeyValue): RedeemScript
  def encode(data: RedeemScript): KeyValue
}

object AnonCheck {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => CallbackTo[Boolean],
    check: js.Any => CallbackTo[/* is bip174.bip174/src/lib/interfaces.RedeemScript */ Boolean],
    decode: KeyValue => CallbackTo[RedeemScript],
    encode: RedeemScript => CallbackTo[KeyValue],
    expected: String
  ): AnonCheck = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any])
    __obj.updateDynamic("canAdd")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => canAdd(t0, t1).runNow()))
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: js.Any) => check(t0).runNow()))
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.KeyValue) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.RedeemScript) => encode(t0).runNow()))
    __obj.asInstanceOf[AnonCheck]
  }
}

