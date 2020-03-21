package typingsJapgolly.phosphorWidgets.docklayoutMod.DockLayout

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.phosphorWidgets.tabbarMod.TabBar
import typingsJapgolly.phosphorWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a dock layout.
  */
trait IRenderer extends js.Object {
  /**
    * Create a new handle node for use with a dock layout.
    *
    * @returns A new handle node for a dock layout.
    */
  def createHandle(): HTMLDivElement
  /**
    * Create a new tab bar for use with a dock layout.
    *
    * @returns A new tab bar for a dock layout.
    */
  def createTabBar(): TabBar[Widget]
}

object IRenderer {
  @scala.inline
  def apply(createHandle: CallbackTo[HTMLDivElement], createTabBar: CallbackTo[TabBar[Widget]]): IRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createHandle")(createHandle.toJsFn)
    __obj.updateDynamic("createTabBar")(createTabBar.toJsFn)
    __obj.asInstanceOf[IRenderer]
  }
}

