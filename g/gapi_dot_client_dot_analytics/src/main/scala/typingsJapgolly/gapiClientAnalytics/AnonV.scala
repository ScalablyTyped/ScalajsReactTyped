package typingsJapgolly.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonV extends js.Object {
  var v: js.UndefOr[String] = js.undefined
}

object AnonV {
  @scala.inline
  def apply(v: String = null): AnonV = {
    val __obj = js.Dynamic.literal()
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonV]
  }
}

