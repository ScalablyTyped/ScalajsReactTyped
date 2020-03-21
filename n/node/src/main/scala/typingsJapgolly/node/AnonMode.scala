package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var encoding: js.UndefOr[java.lang.String | Null] = js.undefined
  var flag: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[Double | java.lang.String] = js.undefined
}

object AnonMode {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    flag: java.lang.String = null,
    mode: Double | java.lang.String = null
  ): AnonMode = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMode]
  }
}

