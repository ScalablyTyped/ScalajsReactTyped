package typingsJapgolly.bip174

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bip174.bip174Strings.`Leftcurlybracket pubkeyColon BufferSemicolon signatureColon BufferSemicolon Rightcurlybracket`
import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.bip174.interfacesMod.PartialSig
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpartialSig extends js.Object {
  val expected: `Leftcurlybracket pubkeyColon BufferSemicolon signatureColon BufferSemicolon Rightcurlybracket`
  def canAddToArray(array: js.Array[PartialSig], item: PartialSig, dupeSet: Set[String]): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean
  def decode(keyVal: KeyValue): PartialSig
  def encode(pSig: PartialSig): KeyValue
}

object TypeofpartialSig {
  @scala.inline
  def apply(
    canAddToArray: (js.Array[PartialSig], PartialSig, Set[String]) => CallbackTo[Boolean],
    check: js.Any => CallbackTo[/* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean],
    decode: KeyValue => CallbackTo[PartialSig],
    encode: PartialSig => CallbackTo[KeyValue],
    expected: `Leftcurlybracket pubkeyColon BufferSemicolon signatureColon BufferSemicolon Rightcurlybracket`
  ): TypeofpartialSig = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any])
    __obj.updateDynamic("canAddToArray")(js.Any.fromFunction3((t0: js.Array[typingsJapgolly.bip174.interfacesMod.PartialSig], t1: typingsJapgolly.bip174.interfacesMod.PartialSig, t2: typingsJapgolly.std.Set[java.lang.String]) => canAddToArray(t0, t1, t2).runNow()))
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: js.Any) => check(t0).runNow()))
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.KeyValue) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.PartialSig) => encode(t0).runNow()))
    __obj.asInstanceOf[TypeofpartialSig]
  }
}

