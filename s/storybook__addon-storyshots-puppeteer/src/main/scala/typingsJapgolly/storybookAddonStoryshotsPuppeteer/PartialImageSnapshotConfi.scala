package typingsJapgolly.storybookAddonStoryshotsPuppeteer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestImageSnapshot.mod.MatchImageSnapshotOptions
import typingsJapgolly.puppeteer.mod.Base64ScreenShotOptions
import typingsJapgolly.puppeteer.mod.Browser
import typingsJapgolly.puppeteer.mod.DirectNavigationOptions
import typingsJapgolly.puppeteer.mod.Page
import typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-storyshots-puppeteer.@storybook/addon-storyshots-puppeteer/dist/config.ImageSnapshotConfig> */
trait PartialImageSnapshotConfi extends js.Object {
  var afterScreenshot: js.UndefOr[js.Function1[/* options */ AnonContext, Unit]] = js.undefined
  var beforeScreenshot: js.UndefOr[js.Function2[/* page */ Page, /* options */ Options, Unit]] = js.undefined
  var chromeExecutablePath: js.UndefOr[String] = js.undefined
  var customizePage: js.UndefOr[js.Function1[/* page */ Page, js.Promise[Unit]]] = js.undefined
  var getCustomBrowser: js.UndefOr[js.Function0[js.Promise[Browser]]] = js.undefined
  var getGotoOptions: js.UndefOr[js.Function1[/* options */ Options, DirectNavigationOptions]] = js.undefined
  var getMatchOptions: js.UndefOr[js.Function1[/* options */ Options, MatchImageSnapshotOptions]] = js.undefined
  var getScreenshotOptions: js.UndefOr[js.Function1[/* options */ Options, Base64ScreenShotOptions]] = js.undefined
  var setupTimeout: js.UndefOr[Double] = js.undefined
  var storybookUrl: js.UndefOr[String] = js.undefined
  var testTimeout: js.UndefOr[Double] = js.undefined
}

object PartialImageSnapshotConfi {
  @scala.inline
  def apply(
    afterScreenshot: /* options */ AnonContext => Callback = null,
    beforeScreenshot: (/* page */ Page, /* options */ Options) => Callback = null,
    chromeExecutablePath: String = null,
    customizePage: /* page */ Page => CallbackTo[js.Promise[Unit]] = null,
    getCustomBrowser: js.UndefOr[CallbackTo[js.Promise[Browser]]] = js.undefined,
    getGotoOptions: /* options */ Options => CallbackTo[DirectNavigationOptions] = null,
    getMatchOptions: /* options */ Options => CallbackTo[MatchImageSnapshotOptions] = null,
    getScreenshotOptions: /* options */ Options => CallbackTo[Base64ScreenShotOptions] = null,
    setupTimeout: Int | Double = null,
    storybookUrl: String = null,
    testTimeout: Int | Double = null
  ): PartialImageSnapshotConfi = {
    val __obj = js.Dynamic.literal()
    if (afterScreenshot != null) __obj.updateDynamic("afterScreenshot")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.storybookAddonStoryshotsPuppeteer.AnonContext) => afterScreenshot(t0).runNow()))
    if (beforeScreenshot != null) __obj.updateDynamic("beforeScreenshot")(js.Any.fromFunction2((t0: /* page */ typingsJapgolly.puppeteer.mod.Page, t1: /* options */ typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options) => beforeScreenshot(t0, t1).runNow()))
    if (chromeExecutablePath != null) __obj.updateDynamic("chromeExecutablePath")(chromeExecutablePath.asInstanceOf[js.Any])
    if (customizePage != null) __obj.updateDynamic("customizePage")(js.Any.fromFunction1((t0: /* page */ typingsJapgolly.puppeteer.mod.Page) => customizePage(t0).runNow()))
    getCustomBrowser.foreach(p => __obj.updateDynamic("getCustomBrowser")(p.toJsFn))
    if (getGotoOptions != null) __obj.updateDynamic("getGotoOptions")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options) => getGotoOptions(t0).runNow()))
    if (getMatchOptions != null) __obj.updateDynamic("getMatchOptions")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options) => getMatchOptions(t0).runNow()))
    if (getScreenshotOptions != null) __obj.updateDynamic("getScreenshotOptions")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options) => getScreenshotOptions(t0).runNow()))
    if (setupTimeout != null) __obj.updateDynamic("setupTimeout")(setupTimeout.asInstanceOf[js.Any])
    if (storybookUrl != null) __obj.updateDynamic("storybookUrl")(storybookUrl.asInstanceOf[js.Any])
    if (testTimeout != null) __obj.updateDynamic("testTimeout")(testTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialImageSnapshotConfi]
  }
}

