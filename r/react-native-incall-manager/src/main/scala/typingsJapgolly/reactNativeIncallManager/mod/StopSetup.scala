package typingsJapgolly.reactNativeIncallManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopSetup extends js.Object {
  var busytone: js.UndefOr[String] = js.undefined
}

object StopSetup {
  @scala.inline
  def apply(busytone: String = null): StopSetup = {
    val __obj = js.Dynamic.literal()
    if (busytone != null) __obj.updateDynamic("busytone")(busytone.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSetup]
  }
}

