package typingsJapgolly.blueprintjsTable.contextMenuTargetWrapperMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextMenuTargetWrapper extends IProps {
  var style: CSSProperties
  def renderContextMenu(e: ReactMouseEventFrom[HTMLElement]): Element
}

object IContextMenuTargetWrapper {
  @scala.inline
  def apply(
    renderContextMenu: ReactMouseEventFrom[HTMLElement] => CallbackTo[Element],
    style: CSSProperties,
    className: String = null
  ): IContextMenuTargetWrapper = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("renderContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => renderContextMenu(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextMenuTargetWrapper]
  }
}

