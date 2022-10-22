package typingsJapgolly.puppeteerCore

import typingsJapgolly.puppeteerCore.libEsmPuppeteerApiBrowserMod.TargetFilterCallback
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTargetManagerMod.TargetFactory
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTargetManagerMod.TargetInterceptor
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonTargetManagerMod.TargetManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonFirefoxTargetManagerMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/FirefoxTargetManager", "FirefoxTargetManager")
  @js.native
  open class FirefoxTargetManager protected () extends TargetManager {
    def this(connection: Connection, targetFactory: TargetFactory) = this()
    def this(connection: Connection, targetFactory: TargetFactory, targetFilterCallback: TargetFilterCallback) = this()
    
    def addTargetInterceptor(client: Connection, interceptor: TargetInterceptor): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    def removeSessionListeners(session: CDPSession): Unit = js.native
    
    def removeTargetInterceptor(client: Connection, interceptor: TargetInterceptor): Unit = js.native
    
    def setupAttachmentListeners(session: CDPSession): Unit = js.native
    def setupAttachmentListeners(session: Connection): Unit = js.native
  }
}
