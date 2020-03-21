package typingsJapgolly.bip174

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.bip174.interfacesMod.WitnessScript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecode extends js.Object {
  var expected: String
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.WitnessScript */ Boolean
  def decode(keyVal: KeyValue): WitnessScript
  def encode(data: WitnessScript): KeyValue
}

object AnonDecode {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => CallbackTo[Boolean],
    check: js.Any => CallbackTo[/* is bip174.bip174/src/lib/interfaces.WitnessScript */ Boolean],
    decode: KeyValue => CallbackTo[WitnessScript],
    encode: WitnessScript => CallbackTo[KeyValue],
    expected: String
  ): AnonDecode = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any])
    __obj.updateDynamic("canAdd")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => canAdd(t0, t1).runNow()))
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: js.Any) => check(t0).runNow()))
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.KeyValue) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.WitnessScript) => encode(t0).runNow()))
    __obj.asInstanceOf[AnonDecode]
  }
}

