package typingsJapgolly.puppeteerCore

import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonErrorsMod.TimeoutError
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonFrameManagerMod.FrameManager
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonHttpresponseMod.HTTPResponse
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonLifecycleWatcherMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/LifecycleWatcher", "LifecycleWatcher")
  @js.native
  open class LifecycleWatcher protected () extends StObject {
    def this(
      frameManager: FrameManager,
      frame: Frame,
      waitUntil: js.Array[PuppeteerLifeCycleEvent],
      timeout: Double
    ) = this()
    def this(frameManager: FrameManager, frame: Frame, waitUntil: PuppeteerLifeCycleEvent, timeout: Double) = this()
    
    def dispose(): Unit = js.native
    
    def lifecyclePromise(): js.Promise[Unit] = js.native
    
    def navigationResponse(): js.Promise[HTTPResponse | Null] = js.native
    
    def newDocumentNavigationPromise(): js.Promise[js.UndefOr[js.Error]] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def sameDocumentNavigationPromise(): js.Promise[js.UndefOr[js.Error]] = js.native
    
    def timeoutOrTerminationPromise(): js.Promise[js.UndefOr[js.Error | TimeoutError]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.load
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.DOMContentLoaded
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkIdle
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkAlmostIdle
  */
  trait ProtocolLifeCycleEvent extends StObject
  object ProtocolLifeCycleEvent {
    
    inline def DOMContentLoaded: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.DOMContentLoaded = "DOMContentLoaded".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.DOMContentLoaded]
    
    inline def load: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.load = "load".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.load]
    
    inline def networkAlmostIdle: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkAlmostIdle = "networkAlmostIdle".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkAlmostIdle]
    
    inline def networkIdle: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkIdle = "networkIdle".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkIdle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.load
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkidle0
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkidle2
  */
  trait PuppeteerLifeCycleEvent extends StObject
  object PuppeteerLifeCycleEvent {
    
    inline def domcontentloaded: domcontentloaded_ = "domcontentloaded".asInstanceOf[domcontentloaded_]
    
    inline def load: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.load = "load".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.load]
    
    inline def networkidle0: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkidle0 = "networkidle0".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkidle0]
    
    inline def networkidle2: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkidle2 = "networkidle2".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.networkidle2]
  }
}
