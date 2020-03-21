package typingsJapgolly.vue

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vue.vnodeMod.VNode
import typingsJapgolly.vue.vueMod.CreateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStaticRenderFns extends js.Object {
  var staticRenderFns: js.Array[js.Function0[VNode]]
  def render(createElement: CreateElement): VNode
}

object AnonStaticRenderFns {
  @scala.inline
  def apply(render: CreateElement => CallbackTo[VNode], staticRenderFns: js.Array[js.Function0[VNode]]): AnonStaticRenderFns = {
    val __obj = js.Dynamic.literal(staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.vue.vueMod.CreateElement) => render(t0).runNow()))
    __obj.asInstanceOf[AnonStaticRenderFns]
  }
}

