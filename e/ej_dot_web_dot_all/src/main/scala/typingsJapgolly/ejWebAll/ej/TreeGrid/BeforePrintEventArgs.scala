package typingsJapgolly.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforePrintEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the TreeGrid element which is going to be print
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
}

object BeforePrintEventArgs {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, element: js.Any = null, requestType: String = null): BeforePrintEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforePrintEventArgs]
  }
}

