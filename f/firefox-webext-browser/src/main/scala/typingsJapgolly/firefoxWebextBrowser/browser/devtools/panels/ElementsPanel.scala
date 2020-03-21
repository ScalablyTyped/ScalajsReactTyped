package typingsJapgolly.firefoxWebextBrowser.browser.devtools.panels

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.panels types */
/** Represents the Elements panel. */
trait ElementsPanel extends js.Object {
  /** Fired when an object is selected in the panel. */
  var onSelectionChanged: WebExtEvent[js.Function0[Unit]]
  /**
    * Creates a pane within panel's sidebar.
    * @param title Text that is displayed in sidebar caption.
    */
  def createSidebarPane(title: String): js.Promise[ExtensionSidebarPane]
}

object ElementsPanel {
  @scala.inline
  def apply(
    createSidebarPane: String => CallbackTo[js.Promise[ExtensionSidebarPane]],
    onSelectionChanged: WebExtEvent[js.Function0[Unit]]
  ): ElementsPanel = {
    val __obj = js.Dynamic.literal(onSelectionChanged = onSelectionChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("createSidebarPane")(js.Any.fromFunction1((t0: java.lang.String) => createSidebarPane(t0).runNow()))
    __obj.asInstanceOf[ElementsPanel]
  }
}

