package typingsJapgolly.puppeteerCore

import typingsJapgolly.puppeteerCore.libCjsPuppeteerApiPageMod.Page
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonEventEmitterMod.EventEmitter
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonExecutionContextMod.ExecutionContext
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonFrameTreeMod.FrameTree
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonNetworkManagerMod.NetworkManager
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTargetMod.Target
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTimeoutSettingsMod.TimeoutSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonFrameManagerMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FrameManager", "FrameManager")
  @js.native
  open class FrameManager protected () extends EventEmitter {
    def this(client: CDPSession, page: Page, ignoreHTTPSErrors: Boolean, timeoutSettings: TimeoutSettings) = this()
    
    /**
      * @internal
      */
    var _frameTree: FrameTree = js.native
    
    def client: CDPSession = js.native
    
    def executionContextById(contextId: Double): ExecutionContext = js.native
    def executionContextById(contextId: Double, session: CDPSession): ExecutionContext = js.native
    
    def frame(frameId: String): Frame | Null = js.native
    
    def frames(): js.Array[Frame] = js.native
    
    def initialize(): js.Promise[Unit] = js.native
    def initialize(client: CDPSession): js.Promise[Unit] = js.native
    
    def mainFrame(): Frame = js.native
    
    def networkManager: NetworkManager = js.native
    
    def onAttachedToTarget(target: Target): Unit = js.native
    
    def onDetachedFromTarget(target: Target): Unit = js.native
    
    def page(): Page = js.native
    
    /* private */ var `private`: Any = js.native
    
    /* private */ var setupEventListeners: Any = js.native
    
    def timeoutSettings: TimeoutSettings = js.native
  }
  
  object FrameManagerEmittedEvents {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FrameManager", "FrameManagerEmittedEvents")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.ExecutionContextCreated")
    @js.native
    def ExecutionContextCreated: js.Symbol = js.native
    inline def ExecutionContextCreated_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExecutionContextCreated")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.ExecutionContextDestroyed")
    @js.native
    def ExecutionContextDestroyed: js.Symbol = js.native
    inline def ExecutionContextDestroyed_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExecutionContextDestroyed")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.FrameAttached")
    @js.native
    def FrameAttached: js.Symbol = js.native
    inline def FrameAttached_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameAttached")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.FrameDetached")
    @js.native
    def FrameDetached: js.Symbol = js.native
    inline def FrameDetached_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameDetached")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.FrameNavigated")
    @js.native
    def FrameNavigated: js.Symbol = js.native
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.FrameNavigatedWithinDocument")
    @js.native
    def FrameNavigatedWithinDocument: js.Symbol = js.native
    inline def FrameNavigatedWithinDocument_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameNavigatedWithinDocument")(x.asInstanceOf[js.Any])
    
    inline def FrameNavigated_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameNavigated")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.FrameSwapped")
    @js.native
    def FrameSwapped: js.Symbol = js.native
    inline def FrameSwapped_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameSwapped")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FrameManager", "FrameManagerEmittedEvents.LifecycleEvent")
    @js.native
    def LifecycleEvent: js.Symbol = js.native
    inline def LifecycleEvent_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LifecycleEvent")(x.asInstanceOf[js.Any])
  }
}
