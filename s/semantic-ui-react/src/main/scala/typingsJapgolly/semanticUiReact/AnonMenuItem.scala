package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.tabPaneMod.TabPaneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMenuItem extends js.Object {
  var menuItem: js.UndefOr[js.Any] = js.undefined
  var pane: js.UndefOr[SemanticShorthandItem[TabPaneProps]] = js.undefined
  var render: js.UndefOr[js.Function0[Node]] = js.undefined
}

object AnonMenuItem {
  @scala.inline
  def apply(
    menuItem: js.Any = null,
    pane: SemanticShorthandItem[TabPaneProps] = null,
    render: js.UndefOr[CallbackTo[Node]] = js.undefined
  ): AnonMenuItem = {
    val __obj = js.Dynamic.literal()
    if (menuItem != null) __obj.updateDynamic("menuItem")(menuItem.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    __obj.asInstanceOf[AnonMenuItem]
  }
}

