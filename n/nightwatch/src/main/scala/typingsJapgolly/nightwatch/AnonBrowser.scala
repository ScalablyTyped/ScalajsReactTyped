package typingsJapgolly.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrowser extends js.Object {
  var browser: js.UndefOr[String] = js.undefined
  var driver: js.UndefOr[String] = js.undefined
  var server: js.UndefOr[String] = js.undefined
}

object AnonBrowser {
  @scala.inline
  def apply(browser: String = null, driver: String = null, server: String = null): AnonBrowser = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (driver != null) __obj.updateDynamic("driver")(driver.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrowser]
  }
}

