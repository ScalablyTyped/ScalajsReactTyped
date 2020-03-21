package typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.puppeteer.mod.Browser
import typingsJapgolly.puppeteer.mod.DirectNavigationOptions
import typingsJapgolly.puppeteer.mod.Page
import typingsJapgolly.storybookAddonStoryshotsPuppeteer.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PuppeteerTestConfig extends CommonConfig {
  var testBody: (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with AnonFilter
}

object PuppeteerTestConfig {
  @scala.inline
  def apply(
    chromeExecutablePath: String,
    customizePage: Page => CallbackTo[js.Promise[Unit]],
    getCustomBrowser: CallbackTo[js.Promise[Browser]],
    getGotoOptions: Options => CallbackTo[DirectNavigationOptions],
    setupTimeout: Double,
    storybookUrl: String,
    testBody: (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with AnonFilter,
    testTimeout: Double
  ): PuppeteerTestConfig = {
    val __obj = js.Dynamic.literal(chromeExecutablePath = chromeExecutablePath.asInstanceOf[js.Any], setupTimeout = setupTimeout.asInstanceOf[js.Any], storybookUrl = storybookUrl.asInstanceOf[js.Any], testBody = testBody.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any])
    __obj.updateDynamic("customizePage")(js.Any.fromFunction1((t0: typingsJapgolly.puppeteer.mod.Page) => customizePage(t0).runNow()))
    __obj.updateDynamic("getCustomBrowser")(getCustomBrowser.toJsFn)
    __obj.updateDynamic("getGotoOptions")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options) => getGotoOptions(t0).runNow()))
    __obj.asInstanceOf[PuppeteerTestConfig]
  }
}

