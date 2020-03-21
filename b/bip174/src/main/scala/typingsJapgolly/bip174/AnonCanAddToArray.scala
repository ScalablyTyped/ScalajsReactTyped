package typingsJapgolly.bip174

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bip174.interfacesMod.Bip32Derivation
import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanAddToArray extends js.Object {
  var expected: String
  def canAddToArray(array: js.Array[Bip32Derivation], item: Bip32Derivation, dupeSet: Set[String]): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.Bip32Derivation */ Boolean
  def decode(keyVal: KeyValue): Bip32Derivation
  def encode(data: Bip32Derivation): KeyValue
}

object AnonCanAddToArray {
  @scala.inline
  def apply(
    canAddToArray: (js.Array[Bip32Derivation], Bip32Derivation, Set[String]) => CallbackTo[Boolean],
    check: js.Any => CallbackTo[/* is bip174.bip174/src/lib/interfaces.Bip32Derivation */ Boolean],
    decode: KeyValue => CallbackTo[Bip32Derivation],
    encode: Bip32Derivation => CallbackTo[KeyValue],
    expected: String
  ): AnonCanAddToArray = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any])
    __obj.updateDynamic("canAddToArray")(js.Any.fromFunction3((t0: js.Array[typingsJapgolly.bip174.interfacesMod.Bip32Derivation], t1: typingsJapgolly.bip174.interfacesMod.Bip32Derivation, t2: typingsJapgolly.std.Set[java.lang.String]) => canAddToArray(t0, t1, t2).runNow()))
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: js.Any) => check(t0).runNow()))
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.KeyValue) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.Bip32Derivation) => encode(t0).runNow()))
    __obj.asInstanceOf[AnonCanAddToArray]
  }
}

