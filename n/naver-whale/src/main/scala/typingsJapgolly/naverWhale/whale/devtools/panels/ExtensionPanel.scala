package typingsJapgolly.naverWhale.whale.devtools.panels

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionPanel extends js.Object {
  /** Fired when the user switches away from the panel. */
  var onHidden: typingsJapgolly.chrome.chrome.devtools.panels.PanelHiddenEvent
  /** Fired upon a search action (start of a new search, search result navigation, or search being canceled). */
  var onSearch: typingsJapgolly.chrome.chrome.devtools.panels.PanelSearchEvent
  /** Fired when the user switches to the panel. */
  var onShown: typingsJapgolly.chrome.chrome.devtools.panels.PanelShownEvent
  /**
    * Appends a button to the status bar of the panel.
    * @param iconPath Path to the icon of the button. The file should contain a 64x24-pixel image composed of two 32x24 icons. The left icon is used when the button is inactive; the right icon is displayed when the button is pressed.
    * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
    * @param disabled Whether the button is disabled.
    */
  def createStatusBarButton(iconPath: String, tooltipText: String, disabled: Boolean): typingsJapgolly.chrome.chrome.devtools.panels.Button
}

object ExtensionPanel {
  @scala.inline
  def apply(
    createStatusBarButton: (String, String, Boolean) => CallbackTo[typingsJapgolly.chrome.chrome.devtools.panels.Button],
    onHidden: typingsJapgolly.chrome.chrome.devtools.panels.PanelHiddenEvent,
    onSearch: typingsJapgolly.chrome.chrome.devtools.panels.PanelSearchEvent,
    onShown: typingsJapgolly.chrome.chrome.devtools.panels.PanelShownEvent
  ): ExtensionPanel = {
    val __obj = js.Dynamic.literal(onHidden = onHidden.asInstanceOf[js.Any], onSearch = onSearch.asInstanceOf[js.Any], onShown = onShown.asInstanceOf[js.Any])
    __obj.updateDynamic("createStatusBarButton")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Boolean) => createStatusBarButton(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ExtensionPanel]
  }
}

