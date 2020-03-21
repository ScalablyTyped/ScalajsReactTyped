package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages an app navigation operation. */
@JSGlobal("Windows.UI.WebUI.WebUINavigatedOperation")
@js.native
abstract class WebUINavigatedOperation () extends js.Object {
  /**
    * Requests that the completion of app navigation be delayed.
    * @return The navigated deferral object.
    */
  def getDeferral(): WebUINavigatedDeferral = js.native
}

