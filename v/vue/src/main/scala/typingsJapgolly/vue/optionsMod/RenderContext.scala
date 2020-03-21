package typingsJapgolly.vue.optionsMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vue.vnodeMod.NormalizedScopedSlot
import typingsJapgolly.vue.vnodeMod.VNode
import typingsJapgolly.vue.vnodeMod.VNodeData
import typingsJapgolly.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext[Props] extends js.Object {
  var children: js.Array[VNode]
  var data: VNodeData
  var injections: js.Any
  var listeners: StringDictionary[js.Function | js.Array[js.Function]]
  var parent: Vue
  var props: Props
  var scopedSlots: StringDictionary[NormalizedScopedSlot]
  def slots(): js.Any
}

object RenderContext {
  @scala.inline
  def apply[Props](
    children: js.Array[VNode],
    data: VNodeData,
    injections: js.Any,
    listeners: StringDictionary[js.Function | js.Array[js.Function]],
    parent: Vue,
    props: Props,
    scopedSlots: StringDictionary[NormalizedScopedSlot],
    slots: CallbackTo[js.Any]
  ): RenderContext[Props] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], injections = injections.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], scopedSlots = scopedSlots.asInstanceOf[js.Any])
    __obj.updateDynamic("slots")(slots.toJsFn)
    __obj.asInstanceOf[RenderContext[Props]]
  }
}

