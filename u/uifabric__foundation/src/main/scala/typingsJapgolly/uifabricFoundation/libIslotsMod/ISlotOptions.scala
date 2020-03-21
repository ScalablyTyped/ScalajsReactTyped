package typingsJapgolly.uifabricFoundation.libIslotsMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ElementType
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlotOptions[TProps] extends js.Object {
  var component: js.UndefOr[ElementType] = js.undefined
  var render: js.UndefOr[ISlotRender[TProps]] = js.undefined
}

object ISlotOptions {
  @scala.inline
  def apply[TProps](
    component: ElementType = null,
    render: (/* props */ PropsWithChildren[TProps], /* defaultComponent */ ComponentType[TProps]) => CallbackTo[ReturnType[FunctionComponent[TProps]]] = null
  ): ISlotOptions[TProps] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2((t0: /* props */ typingsJapgolly.react.mod.PropsWithChildren[TProps], t1: /* defaultComponent */ typingsJapgolly.react.mod.ComponentType[TProps]) => render(t0, t1).runNow()))
    __obj.asInstanceOf[ISlotOptions[TProps]]
  }
}

