package typingsJapgolly.blueprintjsCore.menuDividerMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuDividerProps extends IProps {
  /** Optional header title. */
  var title: js.UndefOr[Node] = js.undefined
}

object IMenuDividerProps {
  @scala.inline
  def apply(className: String = null, title: VdomNode = null): IMenuDividerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuDividerProps]
  }
}

