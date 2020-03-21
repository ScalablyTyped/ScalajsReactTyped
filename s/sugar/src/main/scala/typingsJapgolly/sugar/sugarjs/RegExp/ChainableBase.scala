package typingsJapgolly.sugar.sugarjs.RegExp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.RegExpExecArray
import typingsJapgolly.sugar.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
  def addFlags(flags: String): SugarDefaultChainable[typingsJapgolly.sugar.RegExp]
  def exec(string: String): SugarDefaultChainable[RegExpExecArray | Null]
  def getFlags(): SugarDefaultChainable[String]
  def removeFlags(flags: String): SugarDefaultChainable[typingsJapgolly.sugar.RegExp]
  def setFlags(flags: String): SugarDefaultChainable[typingsJapgolly.sugar.RegExp]
  def test(string: String): SugarDefaultChainable[Boolean]
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](
    addFlags: String => CallbackTo[SugarDefaultChainable[typingsJapgolly.sugar.RegExp]],
    exec: String => CallbackTo[SugarDefaultChainable[RegExpExecArray | Null]],
    getFlags: CallbackTo[SugarDefaultChainable[String]],
    raw: RawValue,
    removeFlags: String => CallbackTo[SugarDefaultChainable[typingsJapgolly.sugar.RegExp]],
    setFlags: String => CallbackTo[SugarDefaultChainable[typingsJapgolly.sugar.RegExp]],
    test: String => CallbackTo[SugarDefaultChainable[Boolean]]
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("addFlags")(js.Any.fromFunction1((t0: java.lang.String) => addFlags(t0).runNow()))
    __obj.updateDynamic("exec")(js.Any.fromFunction1((t0: java.lang.String) => exec(t0).runNow()))
    __obj.updateDynamic("getFlags")(getFlags.toJsFn)
    __obj.updateDynamic("removeFlags")(js.Any.fromFunction1((t0: java.lang.String) => removeFlags(t0).runNow()))
    __obj.updateDynamic("setFlags")(js.Any.fromFunction1((t0: java.lang.String) => setFlags(t0).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: java.lang.String) => test(t0).runNow()))
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

