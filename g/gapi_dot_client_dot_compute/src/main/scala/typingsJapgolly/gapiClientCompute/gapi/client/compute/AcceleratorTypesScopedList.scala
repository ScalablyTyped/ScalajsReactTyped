package typingsJapgolly.gapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorTypesScopedList extends js.Object {
  /** [Output Only] List of accelerator types contained in this scope. */
  var acceleratorTypes: js.UndefOr[js.Array[AcceleratorType]] = js.undefined
  /** [Output Only] An informational warning that appears when the accelerator types list is empty. */
  var warning: js.UndefOr[AnonCode] = js.undefined
}

object AcceleratorTypesScopedList {
  @scala.inline
  def apply(acceleratorTypes: js.Array[AcceleratorType] = null, warning: AnonCode = null): AcceleratorTypesScopedList = {
    val __obj = js.Dynamic.literal()
    if (acceleratorTypes != null) __obj.updateDynamic("acceleratorTypes")(acceleratorTypes.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorTypesScopedList]
  }
}

