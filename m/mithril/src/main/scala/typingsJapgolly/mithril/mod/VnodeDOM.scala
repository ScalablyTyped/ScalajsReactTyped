package typingsJapgolly.mithril.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// In some lifecycle methods, Vnode will have a dom property
// and possibly a domSize property.
trait VnodeDOM[Attrs, State /* <: Lifecycle[Attrs, State] */] extends Vnode[Attrs, State] {
  /** Points to the element that corresponds to the vnode. */
  var dom: Element
  /** This defines the number of DOM elements that the vnode represents (starting from the element referenced by the dom property). */
  var domSize: js.UndefOr[Double] = js.undefined
}

object VnodeDOM {
  @scala.inline
  def apply[Attrs, State /* <: Lifecycle[Attrs, State] */](
    attrs: Attrs,
    dom: Element,
    state: State,
    tag: String | (ComponentTypes[Attrs, State]),
    children: ChildArrayOrPrimitive = null,
    domSize: Int | Double = null,
    key: String | Double = null,
    text: String | Double | Boolean = null
  ): VnodeDOM[Attrs, State] = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], dom = dom.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (domSize != null) __obj.updateDynamic("domSize")(domSize.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[VnodeDOM[Attrs, State]]
  }
}

