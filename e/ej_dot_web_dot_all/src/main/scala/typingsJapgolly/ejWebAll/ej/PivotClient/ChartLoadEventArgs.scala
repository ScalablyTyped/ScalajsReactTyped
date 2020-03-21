package typingsJapgolly.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLoadEventArgs extends js.Object {
  /** returns the current action of PivotChart control.
    */
  var action: js.UndefOr[String] = js.undefined
  /** returns the custom object bound with PivotChart control.
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotChart control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object ChartLoadEventArgs {
  @scala.inline
  def apply(action: String = null, customObject: js.Any = null, element: js.Any = null): ChartLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (customObject != null) __obj.updateDynamic("customObject")(customObject.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLoadEventArgs]
  }
}

