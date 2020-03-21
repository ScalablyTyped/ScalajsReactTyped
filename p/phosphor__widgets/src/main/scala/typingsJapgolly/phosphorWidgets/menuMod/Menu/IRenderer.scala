package typingsJapgolly.phosphorWidgets.menuMod.Menu

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phosphorVirtualdom.mod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a menu.
  */
trait IRenderer extends js.Object {
  /**
    * Render the virtual element for a menu item.
    *
    * @param data - The data to use for rendering the item.
    *
    * @returns A virtual element representing the item.
    */
  def renderItem(data: IRenderData): VirtualElement
}

object IRenderer {
  @scala.inline
  def apply(renderItem: IRenderData => CallbackTo[VirtualElement]): IRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderItem")(js.Any.fromFunction1((t0: typingsJapgolly.phosphorWidgets.menuMod.Menu.IRenderData) => renderItem(t0).runNow()))
    __obj.asInstanceOf[IRenderer]
  }
}

