package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import org.scalajs.dom.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "BrowserWebSocketTransport")
@js.native
open class BrowserWebSocketTransport protected ()
  extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonBrowserWebSocketTransportMod.BrowserWebSocketTransport {
  def this(ws: WebSocket) = this()
}
/* static members */
object BrowserWebSocketTransport {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "BrowserWebSocketTransport")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(url: String): js.Promise[
    typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonBrowserWebSocketTransportMod.BrowserWebSocketTransport
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonBrowserWebSocketTransportMod.BrowserWebSocketTransport
  ]]
}
