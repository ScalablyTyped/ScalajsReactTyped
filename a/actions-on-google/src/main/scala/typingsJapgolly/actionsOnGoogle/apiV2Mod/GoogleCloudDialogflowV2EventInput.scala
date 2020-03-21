package typingsJapgolly.actionsOnGoogle.apiV2Mod

import typingsJapgolly.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2EventInput extends js.Object {
  var languageCode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
}

object GoogleCloudDialogflowV2EventInput {
  @scala.inline
  def apply(languageCode: String = null, name: String = null, parameters: ApiClientObjectMap[_] = null): GoogleCloudDialogflowV2EventInput = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2EventInput]
  }
}

