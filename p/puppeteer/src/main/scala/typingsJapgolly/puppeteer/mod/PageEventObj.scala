package typingsJapgolly.puppeteer.mod

import typingsJapgolly.puppeteer.AnonMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageEventObj extends js.Object {
  /** Emitted when the page closes. */
  var close: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Emitted when JavaScript within the page calls one of console API methods, e.g. console.log or console.dir.
    * Also emitted if the page throws an error or a warning.
    */
  var console: ConsoleMessage
  /**
    * Emitted when a JavaScript dialog appears, such as alert, prompt, confirm or beforeunload.
    * Puppeteer can respond to the dialog via Dialog's accept or dismiss methods.
    */
  var dialog: Dialog
  /** Emitted when the page crashes. */
  var error: js.Error
  /** Emitted when a frame is attached. */
  var frameattached: Frame
  /** Emitted when a frame is detached. */
  var framedetached: Frame
  /** Emitted when a frame is navigated to a new url. */
  var framenavigated: Frame
  /** Emitted when the JavaScript load event is dispatched. */
  var load: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Emitted when the JavaScript code makes a call to `console.timeStamp`.
    * For the list of metrics see `page.metrics`.
    */
  var metrics: AnonMetrics
  /** Emitted when an uncaught exception happens within the page. */
  var pageerror: js.Error
  /** Emitted when the page opens a new tab or window. */
  var popup: Page
  /**
    * Emitted when a page issues a request. The request object is read-only.
    * In order to intercept and mutate requests, see page.setRequestInterceptionEnabled.
    */
  var request: Request
  /** Emitted when a request fails, for example by timing out. */
  var requestfailed: Request
  /** Emitted when a request finishes successfully. */
  var requestfinished: Request
  /** Emitted when a response is received. */
  var response: Response
  /** Emitted when a dedicated WebWorker is spawned by the page. */
  var workercreated: Worker
  /** Emitted when a dedicated WebWorker is terminated. */
  var workerdestroyed: Worker
}

object PageEventObj {
  @scala.inline
  def apply(
    console: ConsoleMessage,
    dialog: Dialog,
    error: js.Error,
    frameattached: Frame,
    framedetached: Frame,
    framenavigated: Frame,
    metrics: AnonMetrics,
    pageerror: js.Error,
    popup: Page,
    request: Request,
    requestfailed: Request,
    requestfinished: Request,
    response: Response,
    workercreated: Worker,
    workerdestroyed: Worker,
    close: js.UndefOr[scala.Nothing] = js.undefined,
    load: js.UndefOr[scala.Nothing] = js.undefined
  ): PageEventObj = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], frameattached = frameattached.asInstanceOf[js.Any], framedetached = framedetached.asInstanceOf[js.Any], framenavigated = framenavigated.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], pageerror = pageerror.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestfailed = requestfailed.asInstanceOf[js.Any], requestfinished = requestfinished.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], workercreated = workercreated.asInstanceOf[js.Any], workerdestroyed = workerdestroyed.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (!js.isUndefined(load)) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageEventObj]
  }
}

