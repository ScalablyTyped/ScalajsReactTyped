package typingsJapgolly.bip174

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bip174.bip174Strings.Buffer
import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.bip174.interfacesMod.NonWitnessUtxo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofnonWitnessUtxo extends js.Object {
  val expected: Buffer
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean
  def decode(keyVal: KeyValue): NonWitnessUtxo
  def encode(data: NonWitnessUtxo): KeyValue
}

object TypeofnonWitnessUtxo {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => CallbackTo[Boolean],
    check: js.Any => CallbackTo[/* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean],
    decode: KeyValue => CallbackTo[NonWitnessUtxo],
    encode: NonWitnessUtxo => CallbackTo[KeyValue],
    expected: Buffer
  ): TypeofnonWitnessUtxo = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any])
    __obj.updateDynamic("canAdd")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => canAdd(t0, t1).runNow()))
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: js.Any) => check(t0).runNow()))
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.KeyValue) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.NonWitnessUtxo) => encode(t0).runNow()))
    __obj.asInstanceOf[TypeofnonWitnessUtxo]
  }
}

