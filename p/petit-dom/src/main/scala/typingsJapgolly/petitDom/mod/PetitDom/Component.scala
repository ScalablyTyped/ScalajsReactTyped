package typingsJapgolly.petitDom.mod.PetitDom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component[P /* <: ComponentProps */] extends js.Object {
  def mount(props: P, content: js.Array[VNode]): Element
  def patch(
    element: Element,
    newProps: P,
    oldProps: P,
    newContent: js.Array[VNode],
    oldContent: js.Array[VNode]
  ): Element
  def unmount(element: Element): Unit
}

object Component {
  @scala.inline
  def apply[P /* <: ComponentProps */](
    mount: (P, js.Array[VNode]) => CallbackTo[Element],
    patch: (Element, P, P, js.Array[VNode], js.Array[VNode]) => CallbackTo[Element],
    unmount: Element => Callback
  ): Component[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mount")(js.Any.fromFunction2((t0: P, t1: js.Array[typingsJapgolly.petitDom.mod.PetitDom.VNode]) => mount(t0, t1).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction5((t0: org.scalajs.dom.raw.Element, t1: P, t2: P, t3: js.Array[typingsJapgolly.petitDom.mod.PetitDom.VNode], t4: js.Array[typingsJapgolly.petitDom.mod.PetitDom.VNode]) => patch(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("unmount")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => unmount(t0).runNow()))
    __obj.asInstanceOf[Component[P]]
  }
}

