package typingsJapgolly.xrm.Xrm

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the Xrm.Panel API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-panel External Link: Xrm.Panel}
  */
trait Panel extends js.Object {
  /**
    * Displays the web page represented by a URL in the static area in the side pane, which appears on all pages in the Customer Engagement web client.
    * @param url URL of the page to be loaded in the side pane static area.
    * @param title Title of the side pane static area.
    * @remarks  This method is only supported for the web client.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-panel/loadpanel External Link: loadPanel (Client-side reference)}
    */
  def loadPanel(url: String, title: String): Unit
}

object Panel {
  @scala.inline
  def apply(loadPanel: (String, String) => Callback): Panel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadPanel")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => loadPanel(t0, t1).runNow()))
    __obj.asInstanceOf[Panel]
  }
}

