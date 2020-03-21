package typingsJapgolly.jestJasmine2

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNow extends js.Object {
  var now: js.UndefOr[js.Function0[Double]] = js.undefined
}

object AnonNow {
  @scala.inline
  def apply(now: js.UndefOr[CallbackTo[Double]] = js.undefined): AnonNow = {
    val __obj = js.Dynamic.literal()
    now.foreach(p => __obj.updateDynamic("now")(p.toJsFn))
    __obj.asInstanceOf[AnonNow]
  }
}

