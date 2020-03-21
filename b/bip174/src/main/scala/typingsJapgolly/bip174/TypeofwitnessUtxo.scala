package typingsJapgolly.bip174

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bip174.bip174Strings.`Leftcurlybracket scriptColon BufferSemicolon valueColon numberSemicolon Rightcurlybracket`
import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.bip174.interfacesMod.WitnessUtxo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofwitnessUtxo extends js.Object {
  val expected: `Leftcurlybracket scriptColon BufferSemicolon valueColon numberSemicolon Rightcurlybracket`
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean
  def decode(keyVal: KeyValue): WitnessUtxo
  def encode(data: WitnessUtxo): KeyValue
}

object TypeofwitnessUtxo {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => CallbackTo[Boolean],
    check: js.Any => CallbackTo[/* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean],
    decode: KeyValue => CallbackTo[WitnessUtxo],
    encode: WitnessUtxo => CallbackTo[KeyValue],
    expected: `Leftcurlybracket scriptColon BufferSemicolon valueColon numberSemicolon Rightcurlybracket`
  ): TypeofwitnessUtxo = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any])
    __obj.updateDynamic("canAdd")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => canAdd(t0, t1).runNow()))
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: js.Any) => check(t0).runNow()))
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.KeyValue) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.WitnessUtxo) => encode(t0).runNow()))
    __obj.asInstanceOf[TypeofwitnessUtxo]
  }
}

