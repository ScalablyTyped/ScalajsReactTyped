package typingsJapgolly.plottable.renderPolicyMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderPolicy extends js.Object {
  def render(): js.Any
}

object IRenderPolicy {
  @scala.inline
  def apply(render: CallbackTo[js.Any]): IRenderPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(render.toJsFn)
    __obj.asInstanceOf[IRenderPolicy]
  }
}

