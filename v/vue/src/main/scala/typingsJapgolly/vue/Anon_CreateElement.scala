package typingsJapgolly.vue

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vue.typesVnodeMod.VNode
import typingsJapgolly.vue.typesVueMod.CreateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateElement extends js.Object {
  var staticRenderFns: js.Array[js.Function0[VNode]]
  def render(createElement: CreateElement): VNode
}

object Anon_CreateElement {
  @scala.inline
  def apply(render: CreateElement => CallbackTo[VNode], staticRenderFns: js.Array[js.Function0[VNode]]): Anon_CreateElement = {
    val __obj = js.Dynamic.literal(staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.vue.typesVueMod.CreateElement) => render(t0).runNow()))
    __obj.asInstanceOf[Anon_CreateElement]
  }
}

