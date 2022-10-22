package typingsJapgolly.puppeteerCore.mod

import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.close
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.console
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.dialog
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.error
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.frameattached
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.framedetached
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.framenavigated
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.load
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.metrics
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.pageerror
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.popup
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.request
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.requestfailed
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.requestfinished
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.requestservedfromcache
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.response
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.workercreated
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.workerdestroyed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.close
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.console
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.dialog
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.error
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.frameattached
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.framedetached
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.framenavigated
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.load
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.metrics
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.pageerror
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.popup
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.request
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.requestservedfromcache
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.requestfailed
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.requestfinished
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.response
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.workercreated
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.workerdestroyed
*/
trait PageEmittedEvents extends StObject
object PageEmittedEvents {
  
  /**
    * Emitted when the page closes.
    * @eventProperty
    */
  inline def Close: close = "close".asInstanceOf[close]
  
  /**
    * Emitted when JavaScript within the page calls one of console API methods,
    * e.g. `console.log` or `console.dir`. Also emitted if the page throws an
    * error or a warning.
    *
    * @remarks
    * A `console` event provides a {@link ConsoleMessage} representing the
    * console message that was logged.
    *
    * @example
    * An example of handling `console` event:
    *
    * ```ts
    * page.on('console', msg => {
    *   for (let i = 0; i < msg.args().length; ++i)
    *     console.log(`${i}: ${msg.args()[i]}`);
    * });
    * page.evaluate(() => console.log('hello', 5, {foo: 'bar'}));
    * ```
    */
  inline def Console: console = "console".asInstanceOf[console]
  
  /**
    * Emitted when the JavaScript
    * {@link https://developer.mozilla.org/en-US/docs/Web/Events/DOMContentLoaded | DOMContentLoaded }
    * event is dispatched.
    */
  inline def DOMContentLoaded: domcontentloaded_ = "domcontentloaded".asInstanceOf[domcontentloaded_]
  
  /**
    * Emitted when a JavaScript dialog appears, such as `alert`, `prompt`,
    * `confirm` or `beforeunload`. Puppeteer can respond to the dialog via
    * {@link Dialog.accept} or {@link Dialog.dismiss}.
    */
  inline def Dialog: dialog = "dialog".asInstanceOf[dialog]
  
  /**
    * Emitted when the page crashes. Will contain an `Error`.
    */
  inline def Error: error = "error".asInstanceOf[error]
  
  /** Emitted when a frame is attached. Will contain a {@link Frame}. */
  inline def FrameAttached: frameattached = "frameattached".asInstanceOf[frameattached]
  
  /** Emitted when a frame is detached. Will contain a {@link Frame}. */
  inline def FrameDetached: framedetached = "framedetached".asInstanceOf[framedetached]
  
  /**
    * Emitted when a frame is navigated to a new URL. Will contain a
    * {@link Frame}.
    */
  inline def FrameNavigated: framenavigated = "framenavigated".asInstanceOf[framenavigated]
  
  /**
    * Emitted when the JavaScript
    * {@link https://developer.mozilla.org/en-US/docs/Web/Events/load | load}
    * event is dispatched.
    */
  inline def Load: load = "load".asInstanceOf[load]
  
  /**
    * Emitted when the JavaScript code makes a call to `console.timeStamp`. For
    * the list of metrics see {@link Page.metrics | page.metrics}.
    *
    * @remarks
    * Contains an object with two properties:
    *
    * - `title`: the title passed to `console.timeStamp`
    * - `metrics`: objec containing metrics as key/value pairs. The values will
    *   be `number`s.
    */
  inline def Metrics: metrics = "metrics".asInstanceOf[metrics]
  
  /**
    * Emitted when an uncaught exception happens within the page. Contains an
    * `Error`.
    */
  inline def PageError: pageerror = "pageerror".asInstanceOf[pageerror]
  
  /**
    * Emitted when the page opens a new tab or window.
    *
    * Contains a {@link Page} corresponding to the popup window.
    *
    * @example
    *
    * ```ts
    * const [popup] = await Promise.all([
    *   new Promise(resolve => page.once('popup', resolve)),
    *   page.click('a[target=_blank]'),
    * ]);
    * ```
    *
    * ```ts
    * const [popup] = await Promise.all([
    *   new Promise(resolve => page.once('popup', resolve)),
    *   page.evaluate(() => window.open('https://example.com')),
    * ]);
    * ```
    */
  inline def Popup: popup = "popup".asInstanceOf[popup]
  
  /**
    * Emitted when a page issues a request and contains a {@link HTTPRequest}.
    *
    * @remarks
    * The object is readonly. See {@link Page.setRequestInterception} for
    * intercepting and mutating requests.
    */
  inline def Request: request = "request".asInstanceOf[request]
  
  /**
    * Emitted when a request fails, for example by timing out.
    *
    * Contains a {@link HTTPRequest}.
    *
    * @remarks
    * HTTP Error responses, such as 404 or 503, are still successful responses
    * from HTTP standpoint, so request will complete with `requestfinished` event
    * and not with `requestfailed`.
    */
  inline def RequestFailed: requestfailed = "requestfailed".asInstanceOf[requestfailed]
  
  /**
    * Emitted when a request finishes successfully. Contains a
    * {@link HTTPRequest}.
    */
  inline def RequestFinished: requestfinished = "requestfinished".asInstanceOf[requestfinished]
  
  /**
    * Emitted when a request ended up loading from cache. Contains a
    * {@link HTTPRequest}.
    *
    * @remarks
    * For certain requests, might contain undefined.
    * {@link https://crbug.com/750469}
    */
  inline def RequestServedFromCache: requestservedfromcache = "requestservedfromcache".asInstanceOf[requestservedfromcache]
  
  /**
    * Emitted when a response is received. Contains a {@link HTTPResponse}.
    */
  inline def Response: response = "response".asInstanceOf[response]
  
  /**
    * Emitted when a dedicated
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API | WebWorker}
    * is spawned by the page.
    */
  inline def WorkerCreated: workercreated = "workercreated".asInstanceOf[workercreated]
  
  /**
    * Emitted when a dedicated
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API | WebWorker}
    * is destroyed by the page.
    */
  inline def WorkerDestroyed: workerdestroyed = "workerdestroyed".asInstanceOf[workerdestroyed]
}
