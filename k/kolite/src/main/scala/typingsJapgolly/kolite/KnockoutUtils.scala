package typingsJapgolly.kolite

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutUtils extends js.Object {
  def wrapAccessor(accessor: js.Any): js.Function
}

object KnockoutUtils {
  @scala.inline
  def apply(wrapAccessor: js.Any => CallbackTo[js.Function]): KnockoutUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("wrapAccessor")(js.Any.fromFunction1((t0: js.Any) => wrapAccessor(t0).runNow()))
    __obj.asInstanceOf[KnockoutUtils]
  }
}

