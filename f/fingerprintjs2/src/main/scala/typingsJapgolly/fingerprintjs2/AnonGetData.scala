package typingsJapgolly.fingerprintjs2

import japgolly.scalajs.react.Callback
import typingsJapgolly.fingerprintjs2.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetData extends js.Object {
  var key: String
  var pauseBefore: js.UndefOr[Boolean] = js.undefined
  def getData(done: js.Function1[/* value */ js.Any, Unit], options: Options): Unit
}

object AnonGetData {
  @scala.inline
  def apply(
    getData: (js.Function1[/* value */ js.Any, Unit], Options) => Callback,
    key: String,
    pauseBefore: js.UndefOr[Boolean] = js.undefined
  ): AnonGetData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("getData")(js.Any.fromFunction2((t0: js.Function1[/* value */ js.Any, scala.Unit], t1: typingsJapgolly.fingerprintjs2.mod.Options) => getData(t0, t1).runNow()))
    if (!js.isUndefined(pauseBefore)) __obj.updateDynamic("pauseBefore")(pauseBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetData]
  }
}

