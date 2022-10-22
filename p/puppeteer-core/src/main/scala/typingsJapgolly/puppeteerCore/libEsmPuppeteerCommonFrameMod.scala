package typingsJapgolly.puppeteerCore

import org.scalajs.dom.HTMLLinkElement
import org.scalajs.dom.HTMLScriptElement
import org.scalajs.dom.HTMLStyleElement
import org.scalajs.dom.Node
import typingsJapgolly.puppeteerCore.anon.ClickCount
import typingsJapgolly.puppeteerCore.anon.Delay
import typingsJapgolly.puppeteerCore.anon.OmitFrameAddStyleTagOptio
import typingsJapgolly.puppeteerCore.anon.RefererTimeout
import typingsJapgolly.puppeteerCore.anon.TimeoutWaitUntil
import typingsJapgolly.puppeteerCore.libEsmPuppeteerApiPageMod.Page
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonElementHandleMod.ElementHandle
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonExecutionContextMod.ExecutionContext
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFrameManagerMod.FrameManager
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonHttpresponseMod.HTTPResponse
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonIsolatedWorldMod.IsolatedWorldChart
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonIsolatedWorldMod.WaitForSelectorOptions
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTypesMod.EvaluateFunc
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTypesMod.HandleFor
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTypesMod.NodeFor
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.mutation
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.raf
import typingsJapgolly.std.Awaited
import typingsJapgolly.std.ReturnType
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonFrameMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Frame", "Frame")
  @js.native
  open class Frame protected () extends StObject {
    /**
      * @internal
      */
    def this(frameManager: FrameManager, frameId: String, parentFrameId: String, client: CDPSession) = this()
    def this(frameManager: FrameManager, frameId: String, parentFrameId: Unit, client: CDPSession) = this()
    
    /**
      * Queries the frame for an element matching the given selector.
      *
      * @param selector - The selector to query for.
      * @returns A {@link ElementHandle | element handle} to the first element
      * matching the given selector. Otherwise, `null`.
      */
    @JSName("$")
    def $[Selector /* <: String */](selector: Selector): js.Promise[ElementHandle[NodeFor[Selector]] | Null] = js.native
    
    /**
      * Runs the given function on the first element matching the given selector in
      * the frame.
      *
      * If the given function returns a promise, then this method will wait till
      * the promise resolves.
      *
      * @example
      *
      * ```ts
      * const searchValue = await frame.$eval('#search', el => el.value);
      * ```
      *
      * @param selector - The selector to query for.
      * @param pageFunction - The function to be evaluated in the frame's context.
      * The first element matching the selector will be passed to the function as
      * its first argument.
      * @param args - Additional arguments to pass to `pageFunction`.
      * @returns A promise to the result of the function.
      */
    @JSName("$eval")
    def $eval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    @JSName("$eval")
    def $eval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    
    /**
      * @deprecated Use {@link Frame.$$} with the `xpath` prefix.
      *
      * Example: `await frame.$$('xpath/' + xpathExpression)`
      *
      * This method evaluates the given XPath expression and returns the results.
      * If `xpath` starts with `//` instead of `.//`, the dot will be appended
      * automatically.
      * @param expression - the XPath expression to evaluate.
      */
    @JSName("$x")
    def $x(expression: String): js.Promise[js.Array[ElementHandle[Node]]] = js.native
    
    /**
      * Queries the frame for all elements matching the given selector.
      *
      * @param selector - The selector to query for.
      * @returns An array of {@link ElementHandle | element handles} that point to
      * elements matching the given selector.
      */
    @JSName("$$")
    def DollarDollar[Selector /* <: String */](selector: Selector): js.Promise[js.Array[ElementHandle[NodeFor[Selector]]]] = js.native
    
    /**
      * Runs the given function on an array of elements matching the given selector
      * in the frame.
      *
      * If the given function returns a promise, then this method will wait till
      * the promise resolves.
      *
      * @example
      *
      * ```js
      * const divsCounts = await frame.$$eval('div', divs => divs.length);
      * ```
      *
      * @param selector - The selector to query for.
      * @param pageFunction - The function to be evaluated in the frame's context.
      * An array of elements matching the given selector will be passed to the
      * function as its first argument.
      * @param args - Additional arguments to pass to `pageFunction`.
      * @returns A promise to the result of the function.
      */
    @JSName("$$eval")
    def DollarDollareval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    @JSName("$$eval")
    def DollarDollareval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    
    /**
      * @internal
      */
    def _client(): CDPSession = js.native
    
    /**
      * @internal
      */
    def _detach(): Unit = js.native
    
    /**
      * @internal
      */
    var _frameManager: FrameManager = js.native
    
    /**
      * @internal
      */
    var _hasStartedLoading: Boolean = js.native
    
    /**
      * @internal
      */
    var _id: String = js.native
    
    /**
      * @internal
      */
    var _lifecycleEvents: Set[String] = js.native
    
    /**
      * @internal
      */
    var _loaderId: String = js.native
    
    /**
      * @internal
      */
    var _name: js.UndefOr[String] = js.native
    
    /**
      * @internal
      */
    def _navigated(framePayload: typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.Frame): Unit = js.native
    
    /**
      * @internal
      */
    def _navigatedWithinDocument(url: String): Unit = js.native
    
    /**
      * @internal
      */
    def _onLifecycleEvent(loaderId: String, name: String): Unit = js.native
    
    /**
      * @internal
      */
    def _onLoadingStarted(): Unit = js.native
    
    /**
      * @internal
      */
    def _onLoadingStopped(): Unit = js.native
    
    /**
      * @internal
      */
    var _parentId: js.UndefOr[String] = js.native
    
    /**
      * Adds a `<script>` tag into the page with the desired url or content.
      *
      * @param options - Options for the script.
      * @returns An {@link ElementHandle | element handle} to the injected
      * `<script>` element.
      */
    def addScriptTag(options: FrameAddScriptTagOptions): js.Promise[ElementHandle[HTMLScriptElement]] = js.native
    
    /**
      * Adds a `<link rel="stylesheet">` tag into the page with the desired URL or
      * a `<style type="text/css">` tag with the content.
      *
      * @returns An {@link ElementHandle | element handle} to the loaded `<link>`
      * or `<style>` element.
      */
    def addStyleTag(options: OmitFrameAddStyleTagOptio): js.Promise[ElementHandle[HTMLStyleElement]] = js.native
    def addStyleTag(options: FrameAddStyleTagOptions): js.Promise[ElementHandle[HTMLLinkElement]] = js.native
    
    /**
      * @returns An array of child frames.
      */
    def childFrames(): js.Array[Frame] = js.native
    
    /**
      * Clicks the first element found that matches `selector`.
      *
      * @remarks
      * If `click()` triggers a navigation event and there's a separate
      * `page.waitForNavigation()` promise to be resolved, you may end up with a
      * race condition that yields unexpected results. The correct pattern for
      * click and wait for navigation is the following:
      *
      * ```ts
      * const [response] = await Promise.all([
      *   page.waitForNavigation(waitOptions),
      *   frame.click(selector, clickOptions),
      * ]);
      * ```
      *
      * @param selector - The selector to query for.
      */
    def click(selector: String): js.Promise[Unit] = js.native
    def click(selector: String, options: ClickCount): js.Promise[Unit] = js.native
    
    /**
      * @returns The full HTML contents of the frame, including the DOCTYPE.
      */
    def content(): js.Promise[String] = js.native
    
    /**
      * Behaves identically to {@link Page.evaluate} except it's run within the
      * the context of this frame.
      *
      * @see {@link Page.evaluate} for details.
      */
    def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    
    /**
      * Behaves identically to {@link Page.evaluateHandle} except it's run within
      * the context of this frame.
      *
      * @see {@link Page.evaluateHandle} for details.
      */
    def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    
    /**
      * @internal
      */
    def executionContext(): js.Promise[ExecutionContext] = js.native
    
    /**
      * Focuses the first element that matches the `selector`.
      *
      * @param selector - The selector to query for.
      * @throws Throws if there's no element matching `selector`.
      */
    def focus(selector: String): js.Promise[Unit] = js.native
    
    /**
      * Navigates a frame to the given url.
      *
      * @remarks
      * Navigation to `about:blank` or navigation to the same URL with a different
      * hash will succeed and return `null`.
      *
      * :::warning
      *
      * Headless mode doesn't support navigation to a PDF document. See the {@link
      * https://bugs.chromium.org/p/chromium/issues/detail?id=761295 | upstream
      * issue}.
      *
      * :::
      *
      * @param url - the URL to navigate the frame to. This should include the
      * scheme, e.g. `https://`.
      * @param options - navigation options. `waitUntil` is useful to define when
      * the navigation should be considered successful - see the docs for
      * {@link PuppeteerLifeCycleEvent} for more details.
      *
      * @returns A promise which resolves to the main resource response. In case of
      * multiple redirects, the navigation will resolve with the response of the
      * last redirect.
      * @throws This method will throw an error if:
      *
      * - there's an SSL error (e.g. in case of self-signed certificates).
      * - target URL is invalid.
      * - the `timeout` is exceeded during navigation.
      * - the remote server does not respond or is unreachable.
      * - the main resource failed to load.
      *
      * This method will not throw an error when any valid HTTP status code is
      * returned by the remote server, including 404 "Not Found" and 500 "Internal
      * Server Error". The status code for such responses can be retrieved by
      * calling {@link HTTPResponse.status}.
      */
    def goto(url: String): js.Promise[HTTPResponse | Null] = js.native
    def goto(url: String, options: RefererTimeout): js.Promise[HTTPResponse | Null] = js.native
    
    /**
      * Hovers the pointer over the center of the first element that matches the
      * `selector`.
      *
      * @param selector - The selector to query for.
      * @throws Throws if there's no element matching `selector`.
      */
    def hover(selector: String): js.Promise[Unit] = js.native
    
    /**
      * @returns `true` if the frame has been detached. Otherwise, `false`.
      */
    def isDetached(): Boolean = js.native
    
    /**
      * @returns `true` if the frame is an out-of-process (OOP) frame. Otherwise,
      * `false`.
      */
    def isOOPFrame(): Boolean = js.native
    
    /**
      * @returns The frame's `name` attribute as specified in the tag.
      *
      * @remarks
      * If the name is empty, it returns the `id` attribute instead.
      *
      * @remarks
      * This value is calculated once when the frame is created, and will not
      * update if the attribute is changed later.
      */
    def name(): String = js.native
    
    /**
      * @returns The page associated with the frame.
      */
    def page(): Page = js.native
    
    /**
      * @returns The parent frame, if any. Detached and main frames return `null`.
      */
    def parentFrame(): Frame | Null = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Selects a set of value on the first `<select>` element that matches the
      * `selector`.
      *
      * @example
      *
      * ```ts
      * frame.select('select#colors', 'blue'); // single selection
      * frame.select('select#colors', 'red', 'green', 'blue'); // multiple selections
      * ```
      *
      * @param selector - The selector to query for.
      * @param values - The array of values to select. If the `<select>` has the
      * `multiple` attribute, all values are considered, otherwise only the first
      * one is taken into account.
      * @returns the list of values that were successfully selected.
      * @throws Throws if there's no `<select>` matching `selector`.
      */
    def select(selector: String, values: String*): js.Promise[js.Array[String]] = js.native
    
    /**
      * Set the content of the frame.
      *
      * @param html - HTML markup to assign to the page.
      * @param options - Options to configure how long before timing out and at
      * what point to consider the content setting successful.
      */
    def setContent(html: String): js.Promise[Unit] = js.native
    def setContent(html: String, options: TimeoutWaitUntil): js.Promise[Unit] = js.native
    
    /**
      * Taps the first element that matches the `selector`.
      *
      * @param selector - The selector to query for.
      * @throws Throws if there's no element matching `selector`.
      */
    def tap(selector: String): js.Promise[Unit] = js.native
    
    /**
      * @returns the frame's title.
      */
    def title(): js.Promise[String] = js.native
    
    /**
      * Sends a `keydown`, `keypress`/`input`, and `keyup` event for each character
      * in the text.
      *
      * @remarks
      * To press a special key, like `Control` or `ArrowDown`, use
      * {@link Keyboard.press}.
      *
      * @example
      *
      * ```ts
      * await frame.type('#mytextarea', 'Hello'); // Types instantly
      * await frame.type('#mytextarea', 'World', {delay: 100}); // Types slower, like a user
      * ```
      *
      * @param selector - the selector for the element to type into. If there are
      * multiple the first will be used.
      * @param text - text to type into the element
      * @param options - takes one option, `delay`, which sets the time to wait
      * between key presses in milliseconds. Defaults to `0`.
      */
    def `type`(selector: String, text: String): js.Promise[Unit] = js.native
    def `type`(selector: String, text: String, options: Delay): js.Promise[Unit] = js.native
    
    /**
      * @internal
      */
    def updateClient(client: CDPSession): Unit = js.native
    
    /**
      * @returns The frame's URL.
      */
    def url(): String = js.native
    
    def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: Func,
      options: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    /**
      * @example
      * The `waitForFunction` can be used to observe viewport size change:
      *
      * ```ts
      * const puppeteer = require('puppeteer');
      *
      * (async () => {
      * .  const browser = await puppeteer.launch();
      * .  const page = await browser.newPage();
      * .  const watchDog = page.mainFrame().waitForFunction('window.innerWidth < 100');
      * .  page.setViewport({width: 50, height: 50});
      * .  await watchDog;
      * .  await browser.close();
      * })();
      * ```
      *
      * To pass arguments from Node.js to the predicate of `page.waitForFunction` function:
      *
      * ```ts
      * const selector = '.foo';
      * await frame.waitForFunction(
      *   selector => !!document.querySelector(selector),
      *   {}, // empty options object
      *   selector
      * );
      * ```
      *
      * @param pageFunction - the function to evaluate in the frame context.
      * @param options - options to configure the polling method and timeout.
      * @param args - arguments to pass to the `pageFunction`.
      * @returns the promise which resolve when the `pageFunction` returns a truthy value.
      */
    def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: Func,
      options: FrameWaitForFunctionOptions,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: String,
      options: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: String,
      options: FrameWaitForFunctionOptions,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    
    /**
      * Waits for the frame to navigate. It is useful for when you run code which
      * will indirectly cause the frame to navigate.
      *
      * Usage of the
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/History_API | History API}
      * to change the URL is considered a navigation.
      *
      * @example
      *
      * ```ts
      * const [response] = await Promise.all([
      *   // The navigation promise resolves after navigation has finished
      *   frame.waitForNavigation(),
      *   // Clicking the link will indirectly cause a navigation
      *   frame.click('a.my-link'),
      * ]);
      * ```
      *
      * @param options - options to configure when the navigation is consided
      * finished.
      * @returns a promise that resolves when the frame navigates to a new URL.
      */
    def waitForNavigation(): js.Promise[HTTPResponse | Null] = js.native
    def waitForNavigation(options: TimeoutWaitUntil): js.Promise[HTTPResponse | Null] = js.native
    
    /**
      * Waits for an element matching the given selector to appear in the frame.
      *
      * This method works across navigations.
      *
      * @example
      *
      * ```ts
      * const puppeteer = require('puppeteer');
      *
      * (async () => {
      *   const browser = await puppeteer.launch();
      *   const page = await browser.newPage();
      *   let currentURL;
      *   page
      *     .mainFrame()
      *     .waitForSelector('img')
      *     .then(() => console.log('First URL with image: ' + currentURL));
      *
      *   for (currentURL of [
      *     'https://example.com',
      *     'https://google.com',
      *     'https://bbc.com',
      *   ]) {
      *     await page.goto(currentURL);
      *   }
      *   await browser.close();
      * })();
      * ```
      *
      * @param selector - The selector to query and wait for.
      * @param options - Options for customizing waiting behavior.
      * @returns An element matching the given selector.
      * @throws Throws if an element matching the given selector doesn't appear.
      */
    def waitForSelector[Selector /* <: String */](selector: Selector): js.Promise[ElementHandle[NodeFor[Selector]] | Null] = js.native
    def waitForSelector[Selector /* <: String */](selector: Selector, options: WaitForSelectorOptions): js.Promise[ElementHandle[NodeFor[Selector]] | Null] = js.native
    
    /**
      * @deprecated Replace with `new Promise(r => setTimeout(r, milliseconds));`.
      *
      * Causes your script to wait for the given number of milliseconds.
      *
      * @remarks
      * It's generally recommended to not wait for a number of seconds, but instead
      * use {@link Frame.waitForSelector}, {@link Frame.waitForXPath} or
      * {@link Frame.waitForFunction} to wait for exactly the conditions you want.
      *
      * @example
      *
      * Wait for 1 second:
      *
      * ```ts
      * await frame.waitForTimeout(1000);
      * ```
      *
      * @param milliseconds - the number of milliseconds to wait.
      */
    def waitForTimeout(milliseconds: Double): js.Promise[Unit] = js.native
    
    /**
      * @deprecated Use {@link Frame.waitForSelector} with the `xpath` prefix.
      *
      * Example: `await frame.waitForSelector('xpath/' + xpathExpression)`
      *
      * The method evaluates the XPath expression relative to the Frame.
      * If `xpath` starts with `//` instead of `.//`, the dot will be appended
      * automatically.
      *
      * Wait for the `xpath` to appear in page. If at the moment of calling the
      * method the `xpath` already exists, the method will return immediately. If
      * the xpath doesn't appear after the `timeout` milliseconds of waiting, the
      * function will throw.
      *
      * For a code example, see the example for {@link Frame.waitForSelector}. That
      * function behaves identically other than taking a CSS selector rather than
      * an XPath.
      *
      * @param xpath - the XPath expression to wait for.
      * @param options - options to configure the visiblity of the element and how
      * long to wait before timing out.
      */
    def waitForXPath(xpath: String): js.Promise[ElementHandle[Node] | Null] = js.native
    def waitForXPath(xpath: String, options: WaitForSelectorOptions): js.Promise[ElementHandle[Node] | Null] = js.native
    
    /**
      * @internal
      */
    var worlds: IsolatedWorldChart = js.native
  }
  
  trait FrameAddScriptTagOptions extends StObject {
    
    /**
      * JavaScript to be injected into the frame.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the `id` of the script.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Path to a JavaScript file to be injected into the frame.
      *
      * @remarks
      * If `path` is a relative path, it is resolved relative to the current
      * working directory (`process.cwd()` in Node.js).
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the `type` of the script. Use `module` in order to load an ES2015 module.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * URL of the script to be added.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object FrameAddScriptTagOptions {
    
    inline def apply(): FrameAddScriptTagOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameAddScriptTagOptions]
    }
    
    extension [Self <: FrameAddScriptTagOptions](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait FrameAddStyleTagOptions extends StObject {
    
    /**
      * Raw CSS content to be injected into the frame.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      * The path to a CSS file to be injected into the frame.
      * @remarks
      * If `path` is a relative path, it is resolved relative to the current
      * working directory (`process.cwd()` in Node.js).
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * the URL of the CSS file to be added.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object FrameAddStyleTagOptions {
    
    inline def apply(): FrameAddStyleTagOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameAddStyleTagOptions]
    }
    
    extension [Self <: FrameAddStyleTagOptions](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait FrameWaitForFunctionOptions extends StObject {
    
    /**
      * An interval at which the `pageFunction` is executed, defaults to `raf`. If
      * `polling` is a number, then it is treated as an interval in milliseconds at
      * which the function would be executed. If `polling` is a string, then it can
      * be one of the following values:
      *
      * - `raf` - to constantly execute `pageFunction` in `requestAnimationFrame`
      *   callback. This is the tightest polling mode which is suitable to observe
      *   styling changes.
      *
      * - `mutation` - to execute `pageFunction` on every DOM mutation.
      */
    var polling: js.UndefOr[raf | mutation | Double] = js.undefined
    
    /**
      * Maximum time to wait in milliseconds. Defaults to `30000` (30 seconds).
      * Pass `0` to disable the timeout. Puppeteer's default timeout can be changed
      * using {@link Page.setDefaultTimeout}.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object FrameWaitForFunctionOptions {
    
    inline def apply(): FrameWaitForFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameWaitForFunctionOptions]
    }
    
    extension [Self <: FrameWaitForFunctionOptions](x: Self) {
      
      inline def setPolling(value: raf | mutation | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
      
      inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
