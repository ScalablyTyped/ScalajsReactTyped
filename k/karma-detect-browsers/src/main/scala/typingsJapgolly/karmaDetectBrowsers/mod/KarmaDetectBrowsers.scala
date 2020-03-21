package typingsJapgolly.karmaDetectBrowsers.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KarmaDetectBrowsers extends js.Object {
  /** enable/disable, default is true */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** use headless mode, for browsers that support it, default is false */
  var preferHeadless: js.UndefOr[Boolean] = js.undefined
  /** enable/disable phantomjs support, default is true */
  var usePhantomJS: js.UndefOr[Boolean] = js.undefined
  /**
    * post processing of browsers list
    * here you can edit the list of browsers used by karma
    */
  def postDetection(availableBrowsers: js.Array[String]): js.Array[String]
}

object KarmaDetectBrowsers {
  @scala.inline
  def apply(
    postDetection: js.Array[String] => CallbackTo[js.Array[String]],
    enabled: js.UndefOr[Boolean] = js.undefined,
    preferHeadless: js.UndefOr[Boolean] = js.undefined,
    usePhantomJS: js.UndefOr[Boolean] = js.undefined
  ): KarmaDetectBrowsers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postDetection")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => postDetection(t0).runNow()))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(preferHeadless)) __obj.updateDynamic("preferHeadless")(preferHeadless.asInstanceOf[js.Any])
    if (!js.isUndefined(usePhantomJS)) __obj.updateDynamic("usePhantomJS")(usePhantomJS.asInstanceOf[js.Any])
    __obj.asInstanceOf[KarmaDetectBrowsers]
  }
}

