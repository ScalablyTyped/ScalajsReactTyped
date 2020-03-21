package typingsJapgolly.asymmetrikLeafletD3.mod.HexbinHoverHandler

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  def tooltipContent(d: js.Any): String
}

object TooltipOptions {
  @scala.inline
  def apply(tooltipContent: js.Any => CallbackTo[String]): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tooltipContent")(js.Any.fromFunction1((t0: js.Any) => tooltipContent(t0).runNow()))
    __obj.asInstanceOf[TooltipOptions]
  }
}

