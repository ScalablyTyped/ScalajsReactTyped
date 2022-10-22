package typingsJapgolly.puppeteerCore

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typingsJapgolly.puppeteerCore.libCjsPuppeteerApiBrowserMod.Browser
import typingsJapgolly.puppeteerCore.libCjsPuppeteerApiBrowserMod.BrowserContext
import typingsJapgolly.puppeteerCore.libCjsPuppeteerApiBrowserMod.IsPageTargetCallback
import typingsJapgolly.puppeteerCore.libCjsPuppeteerApiPageMod.Page
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonPuppeteerViewportMod.Viewport
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTargetManagerMod.TargetManager
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonWebWorkerMod.WebWorker
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.background_page
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.browser
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.other
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.page
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.service_worker
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.shared_worker
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.webview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonTargetMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Target", "Target")
  @js.native
  open class Target protected () extends StObject {
    def this(
      targetInfo: TargetInfo,
      session: Unit,
      browserContext: BrowserContext,
      targetManager: TargetManager,
      sessionFactory: js.Function1[/* isAutoAttachEmulated */ Boolean, js.Promise[CDPSession]],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Null,
      screenshotTaskQueue: TaskQueue,
      isPageTargetCallback: IsPageTargetCallback
    ) = this()
    def this(
      targetInfo: TargetInfo,
      session: Unit,
      browserContext: BrowserContext,
      targetManager: TargetManager,
      sessionFactory: js.Function1[/* isAutoAttachEmulated */ Boolean, js.Promise[CDPSession]],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport,
      screenshotTaskQueue: TaskQueue,
      isPageTargetCallback: IsPageTargetCallback
    ) = this()
    def this(
      targetInfo: TargetInfo,
      session: CDPSession,
      browserContext: BrowserContext,
      targetManager: TargetManager,
      sessionFactory: js.Function1[/* isAutoAttachEmulated */ Boolean, js.Promise[CDPSession]],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Null,
      screenshotTaskQueue: TaskQueue,
      isPageTargetCallback: IsPageTargetCallback
    ) = this()
    /**
      * @internal
      */
    def this(
      targetInfo: TargetInfo,
      session: CDPSession,
      browserContext: BrowserContext,
      targetManager: TargetManager,
      sessionFactory: js.Function1[/* isAutoAttachEmulated */ Boolean, js.Promise[CDPSession]],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport,
      screenshotTaskQueue: TaskQueue,
      isPageTargetCallback: IsPageTargetCallback
    ) = this()
    
    /**
      * @internal
      */
    def _closedCallback(): Unit = js.native
    
    /**
      * @internal
      */
    def _getTargetInfo(): TargetInfo = js.native
    
    /**
      * @internal
      */
    def _initializedCallback(x: Boolean): Unit = js.native
    
    /**
      * @internal
      */
    var _initializedPromise: js.Promise[Boolean] = js.native
    
    /**
      * @internal
      */
    var _isClosedPromise: js.Promise[Unit] = js.native
    
    /**
      * @internal
      */
    var _isInitialized: Boolean = js.native
    
    /**
      * @internal
      */
    def _isPageTargetCallback(target: TargetInfo): Boolean = js.native
    /**
      * @internal
      */
    @JSName("_isPageTargetCallback")
    var _isPageTargetCallback_Original: IsPageTargetCallback = js.native
    
    /**
      * @internal
      */
    def _session(): js.UndefOr[CDPSession] = js.native
    
    /**
      * @internal
      */
    var _targetId: String = js.native
    
    /**
      * @internal
      */
    def _targetInfoChanged(targetInfo: TargetInfo): Unit = js.native
    
    /**
      * @internal
      */
    def _targetManager(): TargetManager = js.native
    
    /**
      * Get the browser the target belongs to.
      */
    def browser(): Browser = js.native
    
    /**
      * Get the browser context the target belongs to.
      */
    def browserContext(): BrowserContext = js.native
    
    /**
      * Creates a Chrome Devtools Protocol session attached to the target.
      */
    def createCDPSession(): js.Promise[CDPSession] = js.native
    
    /**
      * Get the target that opened this target. Top-level targets return `null`.
      */
    def opener(): js.UndefOr[Target] = js.native
    
    /**
      * If the target is not of type `"page"` or `"background_page"`, returns `null`.
      */
    def page(): js.Promise[Page | Null] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Identifies what kind of target this is.
      *
      * @remarks
      *
      * See {@link https://developer.chrome.com/extensions/background_pages | docs} for more info about background pages.
      */
    def `type`(): page | background_page | service_worker | shared_worker | other | browser | webview = js.native
    
    def url(): String = js.native
    
    /**
      * If the target is not of type `"service_worker"` or `"shared_worker"`, returns `null`.
      */
    def worker(): js.Promise[WebWorker | Null] = js.native
  }
}
