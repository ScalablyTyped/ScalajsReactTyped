package typingsJapgolly.storybookAddonStoryshotsPuppeteer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.puppeteer.mod.Browser
import typingsJapgolly.puppeteer.mod.DirectNavigationOptions
import typingsJapgolly.puppeteer.mod.Page
import typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-storyshots-puppeteer.@storybook/addon-storyshots-puppeteer/dist/config.PuppeteerTestConfig> */
trait PartialPuppeteerTestConfi extends js.Object {
  var chromeExecutablePath: js.UndefOr[String] = js.undefined
  var customizePage: js.UndefOr[js.Function1[/* page */ Page, js.Promise[Unit]]] = js.undefined
  var getCustomBrowser: js.UndefOr[js.Function0[js.Promise[Browser]]] = js.undefined
  var getGotoOptions: js.UndefOr[js.Function1[/* options */ Options, DirectNavigationOptions]] = js.undefined
  var setupTimeout: js.UndefOr[Double] = js.undefined
  var storybookUrl: js.UndefOr[String] = js.undefined
  var testBody: js.UndefOr[
    (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with AnonFilter
  ] = js.undefined
  var testTimeout: js.UndefOr[Double] = js.undefined
}

object PartialPuppeteerTestConfi {
  @scala.inline
  def apply(
    chromeExecutablePath: String = null,
    customizePage: /* page */ Page => CallbackTo[js.Promise[Unit]] = null,
    getCustomBrowser: js.UndefOr[CallbackTo[js.Promise[Browser]]] = js.undefined,
    getGotoOptions: /* options */ Options => CallbackTo[DirectNavigationOptions] = null,
    setupTimeout: Int | Double = null,
    storybookUrl: String = null,
    testBody: (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with AnonFilter = null,
    testTimeout: Int | Double = null
  ): PartialPuppeteerTestConfi = {
    val __obj = js.Dynamic.literal()
    if (chromeExecutablePath != null) __obj.updateDynamic("chromeExecutablePath")(chromeExecutablePath.asInstanceOf[js.Any])
    if (customizePage != null) __obj.updateDynamic("customizePage")(js.Any.fromFunction1((t0: /* page */ typingsJapgolly.puppeteer.mod.Page) => customizePage(t0).runNow()))
    getCustomBrowser.foreach(p => __obj.updateDynamic("getCustomBrowser")(p.toJsFn))
    if (getGotoOptions != null) __obj.updateDynamic("getGotoOptions")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.Options) => getGotoOptions(t0).runNow()))
    if (setupTimeout != null) __obj.updateDynamic("setupTimeout")(setupTimeout.asInstanceOf[js.Any])
    if (storybookUrl != null) __obj.updateDynamic("storybookUrl")(storybookUrl.asInstanceOf[js.Any])
    if (testBody != null) __obj.updateDynamic("testBody")(testBody.asInstanceOf[js.Any])
    if (testTimeout != null) __obj.updateDynamic("testTimeout")(testTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPuppeteerTestConfi]
  }
}

