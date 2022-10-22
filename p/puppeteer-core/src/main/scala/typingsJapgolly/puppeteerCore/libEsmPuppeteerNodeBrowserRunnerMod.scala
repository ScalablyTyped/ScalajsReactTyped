package typingsJapgolly.puppeteerCore

import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.puppeteerCore.anon.PreferredRevision
import typingsJapgolly.puppeteerCore.anon.SlowMo
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonProductMod.Product
import typingsJapgolly.puppeteerCore.libEsmPuppeteerNodeLaunchOptionsMod.LaunchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerNodeBrowserRunnerMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/node/BrowserRunner", "BrowserRunner")
  @js.native
  open class BrowserRunner protected () extends StObject {
    def this(product: Product, executablePath: String, processArguments: js.Array[String], userDataDir: String) = this()
    def this(
      product: Product,
      executablePath: String,
      processArguments: js.Array[String],
      userDataDir: String,
      isTempUserDataDir: Boolean
    ) = this()
    
    def close(): js.Promise[Unit] = js.native
    
    var connection: js.UndefOr[Connection] = js.native
    
    def kill(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    var proc: js.UndefOr[ChildProcess] = js.native
    
    def setupConnection(options: SlowMo): js.Promise[Connection] = js.native
    
    def setupWebDriverBiDiConnection(options: PreferredRevision): js.Promise[typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonBidiConnectionMod.Connection] = js.native
    
    def start(options: LaunchOptions): Unit = js.native
  }
}
