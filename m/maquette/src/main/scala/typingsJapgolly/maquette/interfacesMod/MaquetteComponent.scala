package typingsJapgolly.maquette.interfacesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaquetteComponent extends js.Object {
  /**
    * A function that returns the DOM representation of the component.
    */
  def render(): js.UndefOr[VNode | Null]
}

object MaquetteComponent {
  @scala.inline
  def apply(render: CallbackTo[js.UndefOr[VNode | Null]]): MaquetteComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(render.toJsFn)
    __obj.asInstanceOf[MaquetteComponent]
  }
}

