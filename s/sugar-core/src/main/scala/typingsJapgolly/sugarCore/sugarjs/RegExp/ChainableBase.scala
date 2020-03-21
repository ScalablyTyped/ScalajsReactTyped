package typingsJapgolly.sugarCore.sugarjs.RegExp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.RegExpExecArray
import typingsJapgolly.sugarCore.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
  def exec(string: String): SugarDefaultChainable[RegExpExecArray | Null]
  def test(string: String): SugarDefaultChainable[Boolean]
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](
    exec: String => CallbackTo[SugarDefaultChainable[RegExpExecArray | Null]],
    raw: RawValue,
    test: String => CallbackTo[SugarDefaultChainable[Boolean]]
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("exec")(js.Any.fromFunction1((t0: java.lang.String) => exec(t0).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: java.lang.String) => test(t0).runNow()))
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

