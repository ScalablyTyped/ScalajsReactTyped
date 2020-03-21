package typingsJapgolly.preact.mod

import typingsJapgolly.preact.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Preact Virtual DOM
// -----------------------------------
trait VNode[P] extends js.Object {
  /**
  		 * The time that the rendering of this `vnode` was completed. Will only be
  		 * set when the devtools are attached.
  		 * Default value: `-1`
  		 */
  var endTime: js.UndefOr[Double] = js.undefined
  var key: Key
  var props: P with AnonChildren
  /**
  		 * ref is not guaranteed by React.ReactElement, for compatiblity reasons
  		 * with popular react libs we define it as optional too
  		*/
  var ref: js.UndefOr[Ref[_] | Null] = js.undefined
  /**
  		 * The time this `vnode` started rendering. Will only be set when
  		 * the devtools are attached.
  		 * Default value: `0`
  		 */
  var startTime: js.UndefOr[Double] = js.undefined
  var `type`: ComponentType[P] | String
}

object VNode {
  @scala.inline
  def apply[P](
    key: Key,
    props: P with AnonChildren,
    `type`: ComponentType[P] | String,
    endTime: Int | Double = null,
    ref: Ref[_] = null,
    startTime: Int | Double = null
  ): VNode[P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[P]]
  }
}

