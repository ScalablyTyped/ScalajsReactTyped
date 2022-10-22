package typingsJapgolly.puppeteerCore

import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonPuppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonEmulationManagerMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/EmulationManager", "EmulationManager")
  @js.native
  open class EmulationManager protected () extends StObject {
    def this(client: CDPSession) = this()
    
    def emulateViewport(viewport: Viewport): js.Promise[Boolean] = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
