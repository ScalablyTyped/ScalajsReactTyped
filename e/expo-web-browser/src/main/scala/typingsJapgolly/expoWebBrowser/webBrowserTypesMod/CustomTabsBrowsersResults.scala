package typingsJapgolly.expoWebBrowser.webBrowserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTabsBrowsersResults extends js.Object {
  var browserPackages: js.Array[String]
  var defaultBrowserPackage: js.UndefOr[String] = js.undefined
  var preferredBrowserPackage: js.UndefOr[String] = js.undefined
  var servicePackages: js.Array[String]
}

object CustomTabsBrowsersResults {
  @scala.inline
  def apply(
    browserPackages: js.Array[String],
    servicePackages: js.Array[String],
    defaultBrowserPackage: String = null,
    preferredBrowserPackage: String = null
  ): CustomTabsBrowsersResults = {
    val __obj = js.Dynamic.literal(browserPackages = browserPackages.asInstanceOf[js.Any], servicePackages = servicePackages.asInstanceOf[js.Any])
    if (defaultBrowserPackage != null) __obj.updateDynamic("defaultBrowserPackage")(defaultBrowserPackage.asInstanceOf[js.Any])
    if (preferredBrowserPackage != null) __obj.updateDynamic("preferredBrowserPackage")(preferredBrowserPackage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTabsBrowsersResults]
  }
}

