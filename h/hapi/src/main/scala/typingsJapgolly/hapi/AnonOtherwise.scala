package typingsJapgolly.hapi

import typingsJapgolly.hapi.hapiStrings.`private`
import typingsJapgolly.hapi.hapiStrings.default
import typingsJapgolly.hapi.hapiStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOtherwise extends js.Object {
  var otherwise: js.UndefOr[String] = js.undefined
  var privacy: js.UndefOr[default | public | `private`] = js.undefined
  var statuses: js.UndefOr[js.Array[Double]] = js.undefined
}

object AnonOtherwise {
  @scala.inline
  def apply(
    otherwise: String = null,
    privacy: default | public | `private` = null,
    statuses: js.Array[Double] = null
  ): AnonOtherwise = {
    val __obj = js.Dynamic.literal()
    if (otherwise != null) __obj.updateDynamic("otherwise")(otherwise.asInstanceOf[js.Any])
    if (privacy != null) __obj.updateDynamic("privacy")(privacy.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOtherwise]
  }
}

