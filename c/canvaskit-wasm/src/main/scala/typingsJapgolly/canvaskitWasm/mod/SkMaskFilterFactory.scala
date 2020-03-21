package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkMaskFilterFactory extends js.Object {
  def MakeBlur(blurStyle: SkBlurStyle, radius: Double, b: Boolean): SkMaskFilter
}

object SkMaskFilterFactory {
  @scala.inline
  def apply(MakeBlur: (SkBlurStyle, Double, Boolean) => CallbackTo[SkMaskFilter]): SkMaskFilterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MakeBlur")(js.Any.fromFunction3((t0: typingsJapgolly.canvaskitWasm.mod.SkBlurStyle, t1: scala.Double, t2: scala.Boolean) => MakeBlur(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SkMaskFilterFactory]
  }
}

