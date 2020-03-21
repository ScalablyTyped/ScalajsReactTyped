package typingsJapgolly.puppeteer.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  /** Get the browser the target belongs to. */
  def browser(): Browser
  /** The browser context the target belongs to. */
  def browserContext(): BrowserContext
  /** Creates a Chrome Devtools Protocol session attached to the target. */
  def createCDPSession(): js.Promise[CDPSession]
  /** Get the target that opened this target. Top-level targets return `null`. */
  def opener(): Target | Null
  /** Returns the target `Page` or a `null` if the type of the page is not "page". */
  def page(): js.Promise[Page]
  /** Identifies what kind of target this is.  */
  def `type`(): TargetType
  /** Returns the target URL. */
  def url(): String
  /** If the target is not of type `service_worker` or `shared_worker`, resolves `null`. */
  def worker(): js.Promise[Worker | Null]
}

object Target {
  @scala.inline
  def apply(
    browser: CallbackTo[Browser],
    browserContext: CallbackTo[BrowserContext],
    createCDPSession: CallbackTo[js.Promise[CDPSession]],
    opener: CallbackTo[Target | Null],
    page: CallbackTo[js.Promise[Page]],
    `type`: CallbackTo[TargetType],
    url: CallbackTo[String],
    worker: CallbackTo[js.Promise[Worker | Null]]
  ): Target = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browser")(browser.toJsFn)
    __obj.updateDynamic("browserContext")(browserContext.toJsFn)
    __obj.updateDynamic("createCDPSession")(createCDPSession.toJsFn)
    __obj.updateDynamic("opener")(opener.toJsFn)
    __obj.updateDynamic("page")(page.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.updateDynamic("url")(url.toJsFn)
    __obj.updateDynamic("worker")(worker.toJsFn)
    __obj.asInstanceOf[Target]
  }
}

