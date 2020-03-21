package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  /** Key or name for this parameter. */
  var key: js.UndefOr[String] = js.undefined
  /** Value for this parameter. */
  var value: js.UndefOr[js.Any] = js.undefined
}

object Parameter {
  @scala.inline
  def apply(key: String = null, value: js.Any = null): Parameter = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
}

