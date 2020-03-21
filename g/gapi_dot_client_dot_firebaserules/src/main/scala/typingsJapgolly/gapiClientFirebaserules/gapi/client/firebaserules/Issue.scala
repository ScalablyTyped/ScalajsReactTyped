package typingsJapgolly.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  /** Short error description. */
  var description: js.UndefOr[String] = js.undefined
  /** The severity of the issue. */
  var severity: js.UndefOr[String] = js.undefined
  /** Position of the issue in the `Source`. */
  var sourcePosition: js.UndefOr[SourcePosition] = js.undefined
}

object Issue {
  @scala.inline
  def apply(description: String = null, severity: String = null, sourcePosition: SourcePosition = null): Issue = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (sourcePosition != null) __obj.updateDynamic("sourcePosition")(sourcePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
}

