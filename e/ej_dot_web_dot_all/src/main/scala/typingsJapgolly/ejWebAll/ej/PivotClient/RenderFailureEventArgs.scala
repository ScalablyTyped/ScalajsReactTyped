package typingsJapgolly.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderFailureEventArgs extends js.Object {
  /** returns the custom object bound with the control.
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotClient control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the error message with error code.
    */
  var message: js.UndefOr[String] = js.undefined
}

object RenderFailureEventArgs {
  @scala.inline
  def apply(customObject: js.Any = null, element: js.Any = null, message: String = null): RenderFailureEventArgs = {
    val __obj = js.Dynamic.literal()
    if (customObject != null) __obj.updateDynamic("customObject")(customObject.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderFailureEventArgs]
  }
}

