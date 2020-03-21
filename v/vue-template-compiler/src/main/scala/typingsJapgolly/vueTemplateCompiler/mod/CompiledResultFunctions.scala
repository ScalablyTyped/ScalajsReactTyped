package typingsJapgolly.vueTemplateCompiler.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vue.vnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompiledResultFunctions extends js.Object {
  var staticRenderFns: js.Array[js.Function0[VNode]]
  def render(): VNode
}

object CompiledResultFunctions {
  @scala.inline
  def apply(render: CallbackTo[VNode], staticRenderFns: js.Array[js.Function0[VNode]]): CompiledResultFunctions = {
    val __obj = js.Dynamic.literal(staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(render.toJsFn)
    __obj.asInstanceOf[CompiledResultFunctions]
  }
}

