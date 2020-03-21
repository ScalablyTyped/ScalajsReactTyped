package typingsJapgolly.virtualDom.VirtualDOM

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thunk extends VTree {
  var `type`: String
   // 'Thunk'
  var vnode: VTree
  def render(previous: VTree): VTree
}

object Thunk {
  @scala.inline
  def apply(render: VTree => CallbackTo[VTree], `type`: String, vnode: VTree): Thunk = {
    val __obj = js.Dynamic.literal(vnode = vnode.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.virtualDom.VirtualDOM.VTree) => render(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thunk]
  }
}

