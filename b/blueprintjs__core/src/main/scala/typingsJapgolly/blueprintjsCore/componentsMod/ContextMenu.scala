package typingsJapgolly.blueprintjsCore.componentsMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.blueprintjsCore.contextMenuMod.IOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components", "ContextMenu")
@js.native
object ContextMenu extends js.Object {
  def hide(): Unit = js.native
  def isOpen(): Boolean = js.native
  def show(menu: Element, offset: IOffset): Unit = js.native
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit]): Unit = js.native
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit], isDarkTheme: Boolean): Unit = js.native
}

