package typingsJapgolly.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverOptions extends js.Object {
  var clientOffset: js.UndefOr[XYCoord] = js.undefined
}

object HoverOptions {
  @scala.inline
  def apply(clientOffset: XYCoord = null): HoverOptions = {
    val __obj = js.Dynamic.literal()
    if (clientOffset != null) __obj.updateDynamic("clientOffset")(clientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverOptions]
  }
}

