package typingsJapgolly.blueprintjsCore.panelStackMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelStackProps extends IProps {
  /**
    * The initial panel to show on mount. This panel cannot be removed from the
    * stack and will appear when the stack is empty.
    * This prop is only used in uncontrolled mode and is thus mutually
    * exclusive with the `stack` prop.
    */
  var initialPanel: js.UndefOr[IPanel[_]] = js.undefined
  /**
    * Callback invoked when the user presses the back button or a panel invokes
    * the `closePanel()` injected prop method.
    */
  var onClose: js.UndefOr[js.Function1[/* removedPanel */ IPanel[js.Object], Unit]] = js.undefined
  /**
    * Callback invoked when a panel invokes the `openPanel(panel)` injected
    * prop method.
    */
  var onOpen: js.UndefOr[js.Function1[/* addedPanel */ IPanel[js.Object], Unit]] = js.undefined
  /**
    * Whether to show the header with the "back" button in each panel.
    * @default true
    */
  var showPanelHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * The full stack of panels in controlled mode. The last panel in the stack
    * will be displayed.
    */
  var stack: js.UndefOr[js.Array[IPanel[_]]] = js.undefined
}

object IPanelStackProps {
  @scala.inline
  def apply(
    className: String = null,
    initialPanel: IPanel[_] = null,
    onClose: /* removedPanel */ IPanel[js.Object] => Callback = null,
    onOpen: /* addedPanel */ IPanel[js.Object] => Callback = null,
    showPanelHeader: js.UndefOr[Boolean] = js.undefined,
    stack: js.Array[IPanel[_]] = null
  ): IPanelStackProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (initialPanel != null) __obj.updateDynamic("initialPanel")(initialPanel.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* removedPanel */ typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel[js.Object]) => onClose(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* addedPanel */ typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel[js.Object]) => onOpen(t0).runNow()))
    if (!js.isUndefined(showPanelHeader)) __obj.updateDynamic("showPanelHeader")(showPanelHeader.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelStackProps]
  }
}

