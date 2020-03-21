package typingsJapgolly.maquette.interfacesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  def renderMaquette(): js.UndefOr[VNode | Null]
}

object Component {
  @scala.inline
  def apply(renderMaquette: CallbackTo[js.UndefOr[VNode | Null]]): Component = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderMaquette")(renderMaquette.toJsFn)
    __obj.asInstanceOf[Component]
  }
}

