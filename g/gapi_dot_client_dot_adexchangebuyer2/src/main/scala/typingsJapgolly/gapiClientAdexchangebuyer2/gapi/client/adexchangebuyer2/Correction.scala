package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Correction extends js.Object {
  /** The contexts for the correction. */
  var contexts: js.UndefOr[js.Array[ServingContext]] = js.undefined
  /** Additional details about what was corrected. */
  var details: js.UndefOr[js.Array[String]] = js.undefined
  /** The type of correction that was applied to the creative. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Correction {
  @scala.inline
  def apply(contexts: js.Array[ServingContext] = null, details: js.Array[String] = null, `type`: String = null): Correction = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Correction]
  }
}

