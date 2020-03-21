package typingsJapgolly.jestJasmine2

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFn extends js.Object {
  var fn: js.UndefOr[js.Function] = js.undefined
  var getSpy: js.UndefOr[js.Function0[_]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object AnonFn {
  @scala.inline
  def apply(fn: js.Function = null, getSpy: js.UndefOr[CallbackTo[js.Any]] = js.undefined, name: String = null): AnonFn = {
    val __obj = js.Dynamic.literal()
    if (fn != null) __obj.updateDynamic("fn")(fn.asInstanceOf[js.Any])
    getSpy.foreach(p => __obj.updateDynamic("getSpy")(p.toJsFn))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFn]
  }
}

