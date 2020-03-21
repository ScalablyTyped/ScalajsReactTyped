package typingsJapgolly.actionsOnGoogle.v2Mod

import typingsJapgolly.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsHtmlResponse extends js.Object {
  /**
    * Provide an option so that mic won't be opened after this immersive
    * response.
    */
  var suppressMic: js.UndefOr[Boolean] = js.undefined
  /**
    * Communicate the following JSON object to the app.
    */
  var updatedState: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * The url of the application.
    */
  var url: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsHtmlResponse {
  @scala.inline
  def apply(
    suppressMic: js.UndefOr[Boolean] = js.undefined,
    updatedState: ApiClientObjectMap[_] = null,
    url: String = null
  ): GoogleActionsV2UiElementsHtmlResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(suppressMic)) __obj.updateDynamic("suppressMic")(suppressMic.asInstanceOf[js.Any])
    if (updatedState != null) __obj.updateDynamic("updatedState")(updatedState.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsHtmlResponse]
  }
}

