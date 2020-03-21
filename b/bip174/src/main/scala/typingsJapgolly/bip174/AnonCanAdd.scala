package typingsJapgolly.bip174

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanAdd extends js.Object {
  var expected: String
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is node.Buffer */ Boolean
  def decode(keyVal: KeyValue): Buffer
  def encode(data: Buffer): KeyValue
}

object AnonCanAdd {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => CallbackTo[Boolean],
    check: js.Any => CallbackTo[/* is node.Buffer */ Boolean],
    decode: KeyValue => CallbackTo[Buffer],
    encode: Buffer => CallbackTo[KeyValue],
    expected: String
  ): AnonCanAdd = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any])
    __obj.updateDynamic("canAdd")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => canAdd(t0, t1).runNow()))
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: js.Any) => check(t0).runNow()))
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: typingsJapgolly.bip174.interfacesMod.KeyValue) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => encode(t0).runNow()))
    __obj.asInstanceOf[AnonCanAdd]
  }
}

