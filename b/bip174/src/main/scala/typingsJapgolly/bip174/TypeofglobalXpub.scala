package typingsJapgolly.bip174

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bip174.bip174Strings.`Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket`
import typingsJapgolly.bip174.interfacesMod.GlobalXpub
import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofglobalXpub extends js.Object {
  val expected: `Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket`
  def canAddToArray(array: js.Array[GlobalXpub], item: GlobalXpub, dupeSet: Set[String]): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean
  def decode(keyVal: KeyValue): GlobalXpub
  def encode(data: GlobalXpub): KeyValue
}

object TypeofglobalXpub {
  @scala.inline
  def apply(
    canAddToArray: (js.Array[GlobalXpub], GlobalXpub, Set[String]) => CallbackTo[Boolean],
    check: js.Any => CallbackTo[/* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean],
    decode: KeyValue => CallbackTo[GlobalXpub],
    encode: GlobalXpub => CallbackTo[KeyValue],
    expected: `Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket`
  ): TypeofglobalXpub = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any])
    __obj.updateDynamic("canAddToArray")(js.Any.fromFunction3((t0: js.Array[typingsJapgolly.bip174.interfacesMod.GlobalXpub], t1: typingsJapgolly.bip174.interfacesMod.GlobalXpub, t2: typingsJapgolly.std.Set[java.lang.String]) => canAddToArray(t0, t1, t2).runNow()))
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: js.Any) => check(t0).runNow()))
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.KeyValue) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.GlobalXpub) => encode(t0).runNow()))
    __obj.asInstanceOf[TypeofglobalXpub]
  }
}

