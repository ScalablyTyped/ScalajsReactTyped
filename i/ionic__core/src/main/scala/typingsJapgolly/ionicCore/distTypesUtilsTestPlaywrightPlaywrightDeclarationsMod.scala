package typingsJapgolly.ionicCore

import org.scalajs.dom.Response
import typingsJapgolly.ionicCore.anon.Referer
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageUtilsLocatorMod.E2ELocator
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageUtilsLocatorMod.LocatorOptions
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightPlaywrightDeclarationsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.chromium
    - typingsJapgolly.ionicCore.ionicCoreStrings.firefox
    - typingsJapgolly.ionicCore.ionicCoreStrings.webkit
  */
  trait BrowserName extends StObject
  object BrowserName {
    
    inline def chromium: typingsJapgolly.ionicCore.ionicCoreStrings.chromium = "chromium".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.chromium]
    
    inline def firefox: typingsJapgolly.ionicCore.ionicCoreStrings.firefox = "firefox".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.firefox]
    
    inline def webkit: typingsJapgolly.ionicCore.ionicCoreStrings.webkit = "webkit".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.webkit]
  }
  
  type BrowserNameOrCallback = BrowserName | (js.Function1[/* browserName */ BrowserName, Boolean])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page * / any */ @js.native
  trait E2EPage extends StObject {
    
    var _e2eEvents: Map[Double, Any] = js.native
    
    var _e2eEventsIds: Double = js.native
    
    /**
      * This provides metadata that can be used to create a unique screenshot URL.
      * For example, we need to be able to differentiate between iOS in LTR mode and iOS in RTL mode.
      */
    def getSnapshotSettings(): String = js.native
    
    /**
      * Returns the main resource response. In case of multiple redirects, the navigation will resolve with the response of the
      * last redirect.
      *
      * The method will throw an error if:
      * - there's an SSL error (e.g. in case of self-signed certificates).
      * - target URL is invalid.
      * - the `timeout` is exceeded during navigation.
      * - the remote server does not respond or is unreachable.
      * - the main resource failed to load.
      *
      * The method will not throw an error when any valid HTTP status code is returned by the remote server, including 404 "Not
      * Found" and 500 "Internal Server Error".  The status code for such responses can be retrieved by calling
      * [response.status()](https://playwright.dev/docs/api/class-response#response-status).
      *
      * > NOTE: The method either throws an error or returns a main resource response. The only exceptions are navigation to
      * `about:blank` or navigation to the same URL with a different hash, which would succeed and return `null`.
      * > NOTE: Headless mode doesn't support navigation to a PDF document. See the
      * [upstream issue](https://bugs.chromium.org/p/chromium/issues/detail?id=761295).
      *
      * Shortcut for main frame's [frame.goto(url[, options])](https://playwright.dev/docs/api/class-frame#frame-goto)
      * @param url URL to navigate page to. The url should include scheme, e.g. `https://`. When a `baseURL` via the context options was provided and the passed URL is a path, it gets merged via the
      * [`new URL()`](https://developer.mozilla.org/en-US/docs/Web/API/URL/URL) constructor.
      */
    def goto(url: String): js.Promise[Null | Response] = js.native
    def goto(url: String, options: Referer): js.Promise[Null | Response] = js.native
    
    /**
      * Find an element by selector.
      * See https://playwright.dev/docs/locators for more information.
      */
    def locator(selector: String): E2ELocator = js.native
    def locator(selector: String, options: LocatorOptions): E2ELocator = js.native
    
    /**
      * Increases the size of the page viewport to match the `ion-content` contents.
      * Use this method when taking full-screen screenshots.
      */
    def setIonViewport(): js.Promise[Unit] = js.native
    def setIonViewport(options: SetIonViewportOptions): js.Promise[Unit] = js.native
    
    /**
      * Creates a new EventSpy and listens
      * on the window for an event.
      * The test will timeout if the event
      * never fires.
      *
      * Usage:
      * ```ts
      * const ionChange = await page.spyOnEvent('ionChange');
      * ...
      * await ionChange.next();
      * ```
      */
    def spyOnEvent(eventName: String): js.Promise[EventSpy] = js.native
    
    /**
      * After changes have been made to a component, such as an update to a property or attribute,
      * we need to wait until the changes have been applied to the DOM.
      */
    def waitForChanges(): js.Promise[Unit] = js.native
    def waitForChanges(timeoutMs: Double): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait E2ESkip extends StObject {
    
    def browser(browserNameOrCallback: BrowserNameOrCallback): Unit = js.native
    def browser(browserNameOrCallback: BrowserNameOrCallback, reason: String): Unit = js.native
    
    def mode(mode: md | ios): Unit = js.native
    def mode(mode: md | ios, reason: String): Unit = js.native
    
    def rtl(): Unit = js.native
    def rtl(reason: String): Unit = js.native
  }
  
  trait SetIonViewportOptions extends StObject {
    
    /**
      * `true` if the viewport should be scaled to match the `ion-content`
      * scrollable width. Defaults to `false`.
      */
    var resizeViewportWidth: js.UndefOr[Boolean] = js.undefined
  }
  object SetIonViewportOptions {
    
    inline def apply(): SetIonViewportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetIonViewportOptions]
    }
    
    extension [Self <: SetIonViewportOptions](x: Self) {
      
      inline def setResizeViewportWidth(value: Boolean): Self = StObject.set(x, "resizeViewportWidth", value.asInstanceOf[js.Any])
      
      inline def setResizeViewportWidthUndefined: Self = StObject.set(x, "resizeViewportWidth", js.undefined)
    }
  }
}
