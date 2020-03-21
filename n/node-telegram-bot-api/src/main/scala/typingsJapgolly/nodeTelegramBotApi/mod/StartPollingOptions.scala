package typingsJapgolly.nodeTelegramBotApi.mod

import typingsJapgolly.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPollingOptions extends ConstructorOptions {
  var restart: js.UndefOr[Boolean] = js.undefined
}

object StartPollingOptions {
  @scala.inline
  def apply(
    baseApiUrl: String = null,
    filepath: js.UndefOr[Boolean] = js.undefined,
    onlyFirstMatch: js.UndefOr[Boolean] = js.undefined,
    polling: Boolean | PollingOptions = null,
    request: Options = null,
    restart: js.UndefOr[Boolean] = js.undefined,
    webHook: Boolean | WebHookOptions = null
  ): StartPollingOptions = {
    val __obj = js.Dynamic.literal()
    if (baseApiUrl != null) __obj.updateDynamic("baseApiUrl")(baseApiUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(filepath)) __obj.updateDynamic("filepath")(filepath.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyFirstMatch)) __obj.updateDynamic("onlyFirstMatch")(onlyFirstMatch.asInstanceOf[js.Any])
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(restart)) __obj.updateDynamic("restart")(restart.asInstanceOf[js.Any])
    if (webHook != null) __obj.updateDynamic("webHook")(webHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPollingOptions]
  }
}

