package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiasettingsListPosDataProvidersResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var posDataProviders: js.UndefOr[js.Array[PosDataProviders]] = js.undefined
}

object LiasettingsListPosDataProvidersResponse {
  @scala.inline
  def apply(kind: String = null, posDataProviders: js.Array[PosDataProviders] = null): LiasettingsListPosDataProvidersResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (posDataProviders != null) __obj.updateDynamic("posDataProviders")(posDataProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiasettingsListPosDataProvidersResponse]
  }
}

