package typingsJapgolly.phosphorWidgets.tabbarMod.TabBar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phosphorVirtualdom.mod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a tab bar.
  */
trait IRenderer[T] extends js.Object {
  /**
    * A selector which matches the close icon node in a tab.
    */
  val closeIconSelector: String
  /**
    * Render the virtual element for a tab.
    *
    * @param data - The data to use for rendering the tab.
    *
    * @returns A virtual element representing the tab.
    */
  def renderTab(data: IRenderData[T]): VirtualElement
}

object IRenderer {
  @scala.inline
  def apply[T](closeIconSelector: String, renderTab: IRenderData[T] => CallbackTo[VirtualElement]): IRenderer[T] = {
    val __obj = js.Dynamic.literal(closeIconSelector = closeIconSelector.asInstanceOf[js.Any])
    __obj.updateDynamic("renderTab")(js.Any.fromFunction1((t0: typingsJapgolly.phosphorWidgets.tabbarMod.TabBar.IRenderData[T]) => renderTab(t0).runNow()))
    __obj.asInstanceOf[IRenderer[T]]
  }
}

