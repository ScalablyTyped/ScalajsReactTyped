package typingsJapgolly.puppeteerCore

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Browser.PermissionType
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.puppeteerCore.anon.Timeout
import typingsJapgolly.puppeteerCore.libEsmPuppeteerApiPageMod.Page
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonEventEmitterMod.EventEmitter
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTargetMod.Target
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.camera_
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.disconnected
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetchanged_
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetcreated
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetdestroyed
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerApiBrowserMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/api/Browser", "Browser")
  @js.native
  /**
    * @internal
    */
  open class Browser () extends EventEmitter {
    
    /**
      * @internal
      */
    def _attach(): js.Promise[Unit] = js.native
    
    /**
      * @internal
      */
    def _createPageInContext(): js.Promise[Page] = js.native
    def _createPageInContext(contextId: String): js.Promise[Page] = js.native
    
    /**
      * @internal
      */
    def _detach(): Unit = js.native
    
    /**
      * @internal
      */
    def _disposeContext(): js.Promise[Unit] = js.native
    def _disposeContext(contextId: String): js.Promise[Unit] = js.native
    
    /**
      * @internal
      */
    def _getIsPageTargetCallback(): js.UndefOr[IsPageTargetCallback] = js.native
    
    /**
      * @internal
      */
    def _targets: Map[String, Target] = js.native
    
    /**
      * Returns an array of all open browser contexts. In a newly created browser, this will
      * return a single instance of {@link BrowserContext}.
      */
    def browserContexts(): js.Array[BrowserContext] = js.native
    
    /**
      * Closes Chromium and all of its pages (if any were opened). The {@link Browser} object
      * itself is considered to be disposed and cannot be used anymore.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Creates a new incognito browser context. This won't share cookies/cache with other
      * browser contexts.
      *
      * @example
      *
      * ```ts
      * (async () => {
      *   const browser = await puppeteer.launch();
      *   // Create a new incognito browser context.
      *   const context = await browser.createIncognitoBrowserContext();
      *   // Create a new page in a pristine context.
      *   const page = await context.newPage();
      *   // Do stuff
      *   await page.goto('https://example.com');
      * })();
      * ```
      */
    def createIncognitoBrowserContext(): js.Promise[BrowserContext] = js.native
    def createIncognitoBrowserContext(options: BrowserContextOptions): js.Promise[BrowserContext] = js.native
    
    /**
      * Returns the default browser context. The default browser context cannot be closed.
      */
    def defaultBrowserContext(): BrowserContext = js.native
    
    /**
      * Disconnects Puppeteer from the browser, but leaves the Chromium process running.
      * After calling `disconnect`, the {@link Browser} object is considered disposed and
      * cannot be used anymore.
      */
    def disconnect(): Unit = js.native
    
    /**
      * Indicates that the browser is connected.
      */
    def isConnected(): Boolean = js.native
    
    /**
      * Promise which resolves to a new {@link Page} object. The Page is created in
      * a default browser context.
      */
    def newPage(): js.Promise[Page] = js.native
    
    /**
      * An array of all open pages inside the Browser.
      *
      * @remarks
      *
      * In case of multiple browser contexts, returns an array with all the pages in all
      * browser contexts. Non-visible pages, such as `"background_page"`, will not be listed
      * here. You can find them using {@link Target.page}.
      */
    def pages(): js.Promise[js.Array[Page]] = js.native
    
    /**
      * The spawned browser process. Returns `null` if the browser instance was created with
      * {@link Puppeteer.connect}.
      */
    def process(): ChildProcess | Null = js.native
    
    /**
      * The target associated with the browser.
      */
    def target(): Target = js.native
    
    /**
      * All active targets inside the Browser. In case of multiple browser contexts, returns
      * an array with all the targets in all browser contexts.
      */
    def targets(): js.Array[Target] = js.native
    
    /**
      * The browser's original user agent. Pages can override the browser user agent with
      * {@link Page.setUserAgent}.
      */
    def userAgent(): js.Promise[String] = js.native
    
    /**
      * A string representing the browser name and version.
      *
      * @remarks
      *
      * For headless Chromium, this is similar to `HeadlessChrome/61.0.3153.0`. For
      * non-headless, this is similar to `Chrome/61.0.3153.0`.
      *
      * The format of browser.version() might change with future releases of Chromium.
      */
    def version(): js.Promise[String] = js.native
    
    /**
      * Searches for a target in all browser contexts.
      *
      * @param predicate - A function to be run for every target.
      * @returns The first target found that matches the `predicate` function.
      *
      * @example
      *
      * An example of finding a target for a page opened via `window.open`:
      *
      * ```ts
      * await page.evaluate(() => window.open('https://www.example.com/'));
      * const newWindowTarget = await browser.waitForTarget(
      *   target => target.url() === 'https://www.example.com/'
      * );
      * ```
      */
    def waitForTarget(predicate: js.Function1[/* x */ Target, Boolean | js.Promise[Boolean]]): js.Promise[Target] = js.native
    def waitForTarget(
      predicate: js.Function1[/* x */ Target, Boolean | js.Promise[Boolean]],
      options: WaitForTargetOptions
    ): js.Promise[Target] = js.native
    
    /**
      * The browser websocket endpoint which can be used as an argument to
      * {@link Puppeteer.connect}.
      *
      * @returns The Browser websocket url.
      *
      * @remarks
      *
      * The format is `ws://${host}:${port}/devtools/browser/<id>`.
      *
      * You can find the `webSocketDebuggerUrl` from `http://${host}:${port}/json/version`.
      * Learn more about the
      * {@link https://chromedevtools.github.io/devtools-protocol | devtools protocol} and
      * the {@link
      * https://chromedevtools.github.io/devtools-protocol/#how-do-i-access-the-browser-target
      * | browser endpoint}.
      */
    def wsEndpoint(): String = js.native
  }
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/api/Browser", "BrowserContext")
  @js.native
  /**
    * @internal
    */
  open class BrowserContext () extends EventEmitter {
    
    /**
      * The browser this browser context belongs to.
      */
    def browser(): Browser = js.native
    
    /**
      * Clears all permission overrides for the browser context.
      *
      * @example
      *
      * ```ts
      * const context = browser.defaultBrowserContext();
      * context.overridePermissions('https://example.com', ['clipboard-read']);
      * // do stuff ..
      * context.clearPermissionOverrides();
      * ```
      */
    def clearPermissionOverrides(): js.Promise[Unit] = js.native
    
    /**
      * Closes the browser context. All the targets that belong to the browser context
      * will be closed.
      *
      * @remarks
      * Only incognito browser contexts can be closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Returns whether BrowserContext is incognito.
      * The default browser context is the only non-incognito browser context.
      *
      * @remarks
      * The default browser context cannot be closed.
      */
    def isIncognito(): Boolean = js.native
    
    /**
      * Creates a new page in the browser context.
      */
    def newPage(): js.Promise[Page] = js.native
    
    /**
      * @example
      *
      * ```ts
      * const context = browser.defaultBrowserContext();
      * await context.overridePermissions('https://html5demos.com', [
      *   'geolocation',
      * ]);
      * ```
      *
      * @param origin - The origin to grant permissions to, e.g. "https://example.com".
      * @param permissions - An array of permissions to grant.
      * All permissions that are not listed here will be automatically denied.
      */
    def overridePermissions(origin: String, permissions: js.Array[Permission]): js.Promise[Unit] = js.native
    
    /**
      * An array of all pages inside the browser context.
      *
      * @returns Promise which resolves to an array of all open pages.
      * Non visible pages, such as `"background_page"`, will not be listed here.
      * You can find them using {@link Target.page | the target page}.
      */
    def pages(): js.Promise[js.Array[Page]] = js.native
    
    /**
      * An array of all active targets inside the browser context.
      */
    def targets(): js.Array[Target] = js.native
    
    /**
      * This searches for a target in this specific browser context.
      *
      * @example
      * An example of finding a target for a page opened via `window.open`:
      *
      * ```ts
      * await page.evaluate(() => window.open('https://www.example.com/'));
      * const newWindowTarget = await browserContext.waitForTarget(
      *   target => target.url() === 'https://www.example.com/'
      * );
      * ```
      *
      * @param predicate - A function to be run for every target
      * @param options - An object of options. Accepts a timout,
      * which is the maximum wait time in milliseconds.
      * Pass `0` to disable the timeout. Defaults to 30 seconds.
      * @returns Promise which resolves to the first target found
      * that matches the `predicate` function.
      */
    def waitForTarget(predicate: js.Function1[/* x */ Target, Boolean | js.Promise[Boolean]]): js.Promise[Target] = js.native
    def waitForTarget(predicate: js.Function1[/* x */ Target, Boolean | js.Promise[Boolean]], options: Timeout): js.Promise[Target] = js.native
  }
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/api/Browser", "WEB_PERMISSION_TO_PROTOCOL_PERMISSION")
  @js.native
  val WEB_PERMISSION_TO_PROTOCOL_PERMISSION: Map[Permission, PermissionType] = js.native
  
  type BrowserCloseCallback = js.Function0[js.Promise[Unit] | Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetchanged_
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetcreated
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetdestroyed
  */
  trait BrowserContextEmittedEvents extends StObject
  object BrowserContextEmittedEvents {
    
    /**
      * Emitted when the url of a target inside the browser context changes.
      * Contains a {@link Target} instance.
      */
    inline def TargetChanged: targetchanged_ = "targetchanged".asInstanceOf[targetchanged_]
    
    /**
      * Emitted when a target is created within the browser context, for example
      * when a new page is opened by
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/Window/open | window.open}
      * or by {@link BrowserContext.newPage | browserContext.newPage}
      *
      * Contains a {@link Target} instance.
      */
    inline def TargetCreated: targetcreated = "targetcreated".asInstanceOf[targetcreated]
    
    /**
      * Emitted when a target is destroyed within the browser context, for example
      * when a page is closed. Contains a {@link Target} instance.
      */
    inline def TargetDestroyed: targetdestroyed = "targetdestroyed".asInstanceOf[targetdestroyed]
  }
  
  trait BrowserContextOptions extends StObject {
    
    /**
      * Bypass the proxy for the given list of hosts.
      */
    var proxyBypassList: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Proxy server with optional port to use for all requests.
      * Username and password can be set in `Page.authenticate`.
      */
    var proxyServer: js.UndefOr[String] = js.undefined
  }
  object BrowserContextOptions {
    
    inline def apply(): BrowserContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserContextOptions]
    }
    
    extension [Self <: BrowserContextOptions](x: Self) {
      
      inline def setProxyBypassList(value: js.Array[String]): Self = StObject.set(x, "proxyBypassList", value.asInstanceOf[js.Any])
      
      inline def setProxyBypassListUndefined: Self = StObject.set(x, "proxyBypassList", js.undefined)
      
      inline def setProxyBypassListVarargs(value: String*): Self = StObject.set(x, "proxyBypassList", js.Array(value*))
      
      inline def setProxyServer(value: String): Self = StObject.set(x, "proxyServer", value.asInstanceOf[js.Any])
      
      inline def setProxyServerUndefined: Self = StObject.set(x, "proxyServer", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.disconnected
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetchanged_
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetcreated
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetdestroyed
  */
  trait BrowserEmittedEvents extends StObject
  object BrowserEmittedEvents {
    
    /**
      * Emitted when Puppeteer gets disconnected from the Chromium instance. This
      * might happen because of one of the following:
      *
      * - Chromium is closed or crashed
      *
      * - The {@link Browser.disconnect | browser.disconnect } method was called.
      */
    inline def Disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
    
    /**
      * Emitted when the url of a target changes. Contains a {@link Target} instance.
      *
      * @remarks
      *
      * Note that this includes target changes in incognito browser contexts.
      */
    inline def TargetChanged: targetchanged_ = "targetchanged".asInstanceOf[targetchanged_]
    
    /**
      * Emitted when a target is created, for example when a new page is opened by
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/Window/open | window.open}
      * or by {@link Browser.newPage | browser.newPage}
      *
      * Contains a {@link Target} instance.
      *
      * @remarks
      *
      * Note that this includes target creations in incognito browser contexts.
      */
    inline def TargetCreated: targetcreated = "targetcreated".asInstanceOf[targetcreated]
    
    /**
      * Emitted when a target is destroyed, for example when a page is closed.
      * Contains a {@link Target} instance.
      *
      * @remarks
      *
      * Note that this includes target destructions in incognito browser contexts.
      */
    inline def TargetDestroyed: targetdestroyed = "targetdestroyed".asInstanceOf[targetdestroyed]
  }
  
  type IsPageTargetCallback = js.Function1[/* target */ TargetInfo, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.geolocation
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.midi
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.notifications
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.camera_
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.microphone
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`background-sync`
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`ambient-light-sensor`
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.accelerometer
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.gyroscope
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.magnetometer
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`accessibility-events`
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`clipboard-read`
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`clipboard-write`
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`payment-handler`
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`persistent-storage`
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`idle-detection`
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`midi-sysex`
  */
  trait Permission extends StObject
  object Permission {
    
    inline def accelerometer: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.accelerometer = "accelerometer".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.accelerometer]
    
    inline def `accessibility-events`: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`accessibility-events` = "accessibility-events".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`accessibility-events`]
    
    inline def `ambient-light-sensor`: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`ambient-light-sensor` = "ambient-light-sensor".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`ambient-light-sensor`]
    
    inline def `background-sync`: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`background-sync` = "background-sync".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`background-sync`]
    
    inline def camera: camera_ = "camera".asInstanceOf[camera_]
    
    inline def `clipboard-read`: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`clipboard-read` = "clipboard-read".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`clipboard-read`]
    
    inline def `clipboard-write`: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`clipboard-write` = "clipboard-write".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`clipboard-write`]
    
    inline def geolocation: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.geolocation = "geolocation".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.geolocation]
    
    inline def gyroscope: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.gyroscope = "gyroscope".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.gyroscope]
    
    inline def `idle-detection`: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`idle-detection` = "idle-detection".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`idle-detection`]
    
    inline def magnetometer: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.magnetometer = "magnetometer".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.magnetometer]
    
    inline def microphone: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.microphone = "microphone".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.microphone]
    
    inline def midi: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.midi = "midi".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.midi]
    
    inline def `midi-sysex`: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`midi-sysex` = "midi-sysex".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`midi-sysex`]
    
    inline def notifications: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.notifications = "notifications".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.notifications]
    
    inline def `payment-handler`: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`payment-handler` = "payment-handler".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`payment-handler`]
    
    inline def `persistent-storage`: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`persistent-storage` = "persistent-storage".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`persistent-storage`]
  }
  
  type TargetFilterCallback = js.Function1[/* target */ TargetInfo, Boolean]
  
  trait WaitForTargetOptions extends StObject {
    
    /**
      * Maximum wait time in milliseconds. Pass `0` to disable the timeout.
      * @defaultValue 30 seconds.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object WaitForTargetOptions {
    
    inline def apply(): WaitForTargetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitForTargetOptions]
    }
    
    extension [Self <: WaitForTargetOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
