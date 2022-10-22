package typingsJapgolly.puppeteerCore

import typingsJapgolly.puppeteerCore.anon.ExecutablePath
import typingsJapgolly.puppeteerCore.libEsmPuppeteerApiBrowserMod.Browser
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonProductMod.Product
import typingsJapgolly.puppeteerCore.libEsmPuppeteerNodeChromeLauncherMod.ChromeLauncher
import typingsJapgolly.puppeteerCore.libEsmPuppeteerNodeFirefoxLauncherMod.FirefoxLauncher
import typingsJapgolly.puppeteerCore.libEsmPuppeteerNodeLaunchOptionsMod.BrowserLaunchArgumentOptions
import typingsJapgolly.puppeteerCore.libEsmPuppeteerNodeLaunchOptionsMod.ChromeReleaseChannel
import typingsJapgolly.puppeteerCore.libEsmPuppeteerNodeLaunchOptionsMod.PuppeteerNodeLaunchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerNodeProductLauncherMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/node/ProductLauncher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLauncher(preferredRevision: String, isPuppeteerCore: Boolean): ProductLauncher = (^.asInstanceOf[js.Dynamic].applyDynamic("createLauncher")(preferredRevision.asInstanceOf[js.Any], isPuppeteerCore.asInstanceOf[js.Any])).asInstanceOf[ProductLauncher]
  inline def createLauncher(preferredRevision: String, isPuppeteerCore: Boolean, product: Product): ProductLauncher = (^.asInstanceOf[js.Dynamic].applyDynamic("createLauncher")(preferredRevision.asInstanceOf[js.Any], isPuppeteerCore.asInstanceOf[js.Any], product.asInstanceOf[js.Any])).asInstanceOf[ProductLauncher]
  
  inline def executablePathForChannel(channel: ChromeReleaseChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("executablePathForChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolveExecutablePath(launcher: ChromeLauncher): ExecutablePath = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveExecutablePath")(launcher.asInstanceOf[js.Any]).asInstanceOf[ExecutablePath]
  inline def resolveExecutablePath(launcher: FirefoxLauncher): ExecutablePath = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveExecutablePath")(launcher.asInstanceOf[js.Any]).asInstanceOf[ExecutablePath]
  
  @js.native
  trait ProductLauncher extends StObject {
    
    def defaultArgs(`object`: BrowserLaunchArgumentOptions): js.Array[String] = js.native
    
    def executablePath(): String = js.native
    def executablePath(path: Any): String = js.native
    
    def launch(`object`: PuppeteerNodeLaunchOptions): js.Promise[Browser] = js.native
    
    var product: Product = js.native
  }
}
