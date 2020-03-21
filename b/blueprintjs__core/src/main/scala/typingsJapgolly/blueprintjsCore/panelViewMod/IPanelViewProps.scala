package typingsJapgolly.blueprintjsCore.panelViewMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelViewProps extends js.Object {
  /** The panel to be displayed. */
  var panel: IPanel[js.Object]
  /** The previous panel in the stack, for rendering the "back" button. */
  var previousPanel: js.UndefOr[IPanel[js.Object]] = js.undefined
  /** Whether to show the header with the "back" button. */
  var showHeader: Boolean
  /**
    * Callback invoked when the user presses the back button or a panel invokes
    * the `closePanel()` injected prop method.
    */
  def onClose(removedPanel: IPanel[js.Object]): Unit
  /**
    * Callback invoked when a panel invokes the `openPanel(panel)` injected
    * prop method.
    */
  def onOpen(addedPanel: IPanel[js.Object]): Unit
}

object IPanelViewProps {
  @scala.inline
  def apply(
    onClose: IPanel[js.Object] => Callback,
    onOpen: IPanel[js.Object] => Callback,
    panel: IPanel[js.Object],
    showHeader: Boolean,
    previousPanel: IPanel[js.Object] = null
  ): IPanelViewProps = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
    __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel[js.Object]) => onClose(t0).runNow()))
    __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel[js.Object]) => onOpen(t0).runNow()))
    if (previousPanel != null) __obj.updateDynamic("previousPanel")(previousPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelViewProps]
  }
}

