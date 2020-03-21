package typingsJapgolly.webdriver

import typingsJapgolly.webdriver.WebDriver.LoggingPreferences
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrowser extends js.Object {
  var browser: js.UndefOr[LoggingPreferences] = js.undefined
  var client: js.UndefOr[LoggingPreferences] = js.undefined
  var driver: js.UndefOr[LoggingPreferences] = js.undefined
  var server: js.UndefOr[LoggingPreferences] = js.undefined
}

object AnonBrowser {
  @scala.inline
  def apply(
    browser: LoggingPreferences = null,
    client: LoggingPreferences = null,
    driver: LoggingPreferences = null,
    server: LoggingPreferences = null
  ): AnonBrowser = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (driver != null) __obj.updateDynamic("driver")(driver.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrowser]
  }
}

