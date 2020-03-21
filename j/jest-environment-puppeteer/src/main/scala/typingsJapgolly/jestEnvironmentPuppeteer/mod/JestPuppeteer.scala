package typingsJapgolly.jestEnvironmentPuppeteer.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestPuppeteer extends js.Object {
  /**
    * Suspends test execution and gives you opportunity to see what's going on in the browser
    * - Jest is suspended (no timeout)
    * - A debugger instruction to Chromium, if Puppeteer has been launched with { devtools: true } it will stop
    *
    * ```ts
    * it('should put test in debug mode', async () => {
    *   await jestPuppeteer.debug()
    * })
    * ```
    */
  def debug(): js.Promise[Unit]
  /**
    * Reset global.browser
    *
    * ```ts
    * beforeEach(async () => {
    *   await jestPuppeteer.resetBrowser()
    * })
    * ```
    */
  def resetBrowser(): js.Promise[Unit]
  /**
    * Reset global.page
    *
    * ```ts
    * beforeEach(async () => {
    *   await jestPuppeteer.resetPage()
    * })
    * ```
    */
  def resetPage(): js.Promise[Unit]
}

object JestPuppeteer {
  @scala.inline
  def apply(
    debug: CallbackTo[js.Promise[Unit]],
    resetBrowser: CallbackTo[js.Promise[Unit]],
    resetPage: CallbackTo[js.Promise[Unit]]
  ): JestPuppeteer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug.toJsFn)
    __obj.updateDynamic("resetBrowser")(resetBrowser.toJsFn)
    __obj.updateDynamic("resetPage")(resetPage.toJsFn)
    __obj.asInstanceOf[JestPuppeteer]
  }
}

