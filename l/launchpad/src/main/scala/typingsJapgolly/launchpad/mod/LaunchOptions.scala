package typingsJapgolly.launchpad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchOptions extends js.Object {
  var browser: String
  var version: js.UndefOr[String] = js.undefined
}

object LaunchOptions {
  @scala.inline
  def apply(browser: String, version: String = null): LaunchOptions = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptions]
  }
}

