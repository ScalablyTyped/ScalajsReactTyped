package typingsJapgolly.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  /** The short description of the step. */
  var description: js.UndefOr[String] = js.undefined
  /** The status code. */
  var status: js.UndefOr[String] = js.undefined
}

object Step {
  @scala.inline
  def apply(description: String = null, status: String = null): Step = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

