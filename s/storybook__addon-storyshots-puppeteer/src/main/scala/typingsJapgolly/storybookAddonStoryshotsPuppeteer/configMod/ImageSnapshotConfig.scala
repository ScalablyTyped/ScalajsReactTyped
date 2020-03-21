package typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestImageSnapshot.mod.MatchImageSnapshotOptions
import typingsJapgolly.puppeteer.mod.Base64ScreenShotOptions
import typingsJapgolly.puppeteer.mod.Browser
import typingsJapgolly.puppeteer.mod.DirectNavigationOptions
import typingsJapgolly.puppeteer.mod.Page
import typingsJapgolly.storybookAddonStoryshotsPuppeteer.AnonContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSnapshotConfig extends CommonConfig {
  def afterScreenshot(options: AnonContext): Unit
  def beforeScreenshot(page: Page, options: Options): Unit
  def getMatchOptions(options: Options): MatchImageSnapshotOptions
  def getScreenshotOptions(options: Options): Base64ScreenShotOptions
}

object ImageSnapshotConfig {
  @scala.inline
  def apply(
    afterScreenshot: AnonContext => Callback,
    beforeScreenshot: (Page, Options) => Callback,
    chromeExecutablePath: String,
    customizePage: Page => CallbackTo[js.Promise[Unit]],
    getCustomBrowser: CallbackTo[js.Promise[Browser]],
    getGotoOptions: Options => CallbackTo[DirectNavigationOptions],
    getMatchOptions: Options => CallbackTo[MatchImageSnapshotOptions],
    getScreenshotOptions: Options => CallbackTo[Base64ScreenShotOptions],
    setupTimeout: Double,
    storybookUrl: String,
    testTimeout: Double
  ): ImageSnapshotConfig = {
    val __obj = js.Dynamic.literal(chromeExecutablePath = chromeExecutablePath.asInstanceOf[js.Any], setupTimeout = setupTimeout.asInstanceOf[js.Any], storybookUrl = storybookUrl.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any])
    __obj.updateDynamic("afterScreenshot")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonStoryshotsPuppeteer.AnonContext) => afterScreenshot(t0).runNow()))
    __obj.updateDynamic("beforeScreenshot")(js.Any.fromFunction2((t0: typingsJapgolly.puppeteer.mod.Page, t1: typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options) => beforeScreenshot(t0, t1).runNow()))
    __obj.updateDynamic("customizePage")(js.Any.fromFunction1((t0: typingsJapgolly.puppeteer.mod.Page) => customizePage(t0).runNow()))
    __obj.updateDynamic("getCustomBrowser")(getCustomBrowser.toJsFn)
    __obj.updateDynamic("getGotoOptions")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options) => getGotoOptions(t0).runNow()))
    __obj.updateDynamic("getMatchOptions")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options) => getMatchOptions(t0).runNow()))
    __obj.updateDynamic("getScreenshotOptions")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options) => getScreenshotOptions(t0).runNow()))
    __obj.asInstanceOf[ImageSnapshotConfig]
  }
}

