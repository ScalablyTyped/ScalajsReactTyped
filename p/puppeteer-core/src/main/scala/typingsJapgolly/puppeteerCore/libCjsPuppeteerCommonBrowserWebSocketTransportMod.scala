package typingsJapgolly.puppeteerCore

import org.scalajs.dom.WebSocket
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonConnectionTransportMod.ConnectionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonBrowserWebSocketTransportMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/BrowserWebSocketTransport", "BrowserWebSocketTransport")
  @js.native
  open class BrowserWebSocketTransport protected ()
    extends StObject
       with ConnectionTransport {
    def this(ws: WebSocket) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def send(message: String): Unit = js.native
  }
  /* static members */
  object BrowserWebSocketTransport {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/BrowserWebSocketTransport", "BrowserWebSocketTransport")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(url: String): js.Promise[BrowserWebSocketTransport] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BrowserWebSocketTransport]]
  }
}
