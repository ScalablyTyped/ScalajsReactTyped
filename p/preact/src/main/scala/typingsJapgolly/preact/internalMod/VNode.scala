package typingsJapgolly.preact.internalMod

import org.scalajs.dom.raw.Text
import typingsJapgolly.preact.AnonChildren
import typingsJapgolly.preact.mod.ComponentType
import typingsJapgolly.preact.mod.Key
import typingsJapgolly.preact.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode[P]
  extends typingsJapgolly.preact.mod.VNode[P] {
  var _children: js.Array[VNode[_]] | Null
  var _component: (Component[js.Object, js.Object]) | Null
  var _depth: Double | Null
  /**
  	 * The [first (for Fragments)] DOM child of a VNode
  	 */
  var _dom: PreactElement | Text | Null
  /**
  	 * The last dom child of a Fragment, or components that return a Fragment
  	 */
  var _nextDom: PreactElement | Text | Null
  var _parent: VNode[js.Object] | Null
  var constructor: js.UndefOr[scala.Nothing] = js.undefined
}

object VNode {
  @scala.inline
  def apply[P](
    key: Key,
    props: P with AnonChildren,
    `type`: ComponentType[P] | String,
    _children: js.Array[VNode[_]] = null,
    _component: Component[js.Object, js.Object] = null,
    _depth: Int | Double = null,
    _dom: PreactElement | Text = null,
    _nextDom: PreactElement | Text = null,
    _parent: VNode[js.Object] = null,
    constructor: js.UndefOr[scala.Nothing] = js.undefined,
    endTime: Int | Double = null,
    ref: Ref[_] = null,
    startTime: Int | Double = null
  ): VNode[P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_children != null) __obj.updateDynamic("_children")(_children.asInstanceOf[js.Any])
    if (_component != null) __obj.updateDynamic("_component")(_component.asInstanceOf[js.Any])
    if (_depth != null) __obj.updateDynamic("_depth")(_depth.asInstanceOf[js.Any])
    if (_dom != null) __obj.updateDynamic("_dom")(_dom.asInstanceOf[js.Any])
    if (_nextDom != null) __obj.updateDynamic("_nextDom")(_nextDom.asInstanceOf[js.Any])
    if (_parent != null) __obj.updateDynamic("_parent")(_parent.asInstanceOf[js.Any])
    if (!js.isUndefined(constructor)) __obj.updateDynamic("constructor")(constructor.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[P]]
  }
}

