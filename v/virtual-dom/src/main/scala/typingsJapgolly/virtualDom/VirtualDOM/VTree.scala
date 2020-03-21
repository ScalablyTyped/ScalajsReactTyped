package typingsJapgolly.virtualDom.VirtualDOM

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.virtualDom.VirtualDOM.VText
  - typingsJapgolly.virtualDom.VirtualDOM.VNode
  - typingsJapgolly.virtualDom.VirtualDOM.Widget
  - typingsJapgolly.virtualDom.VirtualDOM.Thunk
*/
trait VTree extends js.Object

object VTree {
  @scala.inline
  def VText(text: String, `type`: String, version: String): VTree = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTree]
  }
  @scala.inline
  def VNode(
    children: js.Array[VTree],
    count: Double,
    descendantHooks: js.Array[_],
    hasThunks: Boolean,
    hasWidgets: Boolean,
    hooks: js.Array[_],
    properties: VProperties,
    tagName: String,
    `type`: String,
    version: String,
    key: String = null,
    namespace: String = null
  ): VTree = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], descendantHooks = descendantHooks.asInstanceOf[js.Any], hasThunks = hasThunks.asInstanceOf[js.Any], hasWidgets = hasWidgets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTree]
  }
  @scala.inline
  def Widget(
    destroy: Element => Callback,
    init: CallbackTo[Element],
    `type`: String,
    update: (typingsJapgolly.virtualDom.VirtualDOM.Widget, Element) => Callback
  ): VTree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => destroy(t0).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.virtualDom.VirtualDOM.Widget, t1: org.scalajs.dom.raw.Element) => update(t0, t1).runNow()))
    __obj.asInstanceOf[VTree]
  }
  @scala.inline
  def Thunk(render: VTree => CallbackTo[VTree], `type`: String, vnode: VTree): VTree = {
    val __obj = js.Dynamic.literal(vnode = vnode.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.virtualDom.VirtualDOM.VTree) => render(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTree]
  }
}

