package typingsJapgolly.blockingProxy

import typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.WebDriverCommand
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibWebdriverProxyMod {
  
  @JSImport("blocking-proxy/built/lib/webdriver_proxy", "WebDriverProxy")
  @js.native
  open class WebDriverProxy protected () extends StObject {
    def this(seleniumAddress: String) = this()
    
    def addBarrier(barrier: WebDriverBarrier): Unit = js.native
    
    var barriers: js.Array[WebDriverBarrier] = js.native
    
    def handleRequest(originalRequest: IncomingMessage, response: ServerResponse[IncomingMessage]): js.Promise[Unit] = js.native
    
    var seleniumAddress: String = js.native
  }
  
  trait WebDriverBarrier extends StObject {
    
    def onCommand(command: WebDriverCommand): js.Promise[Unit]
  }
  object WebDriverBarrier {
    
    inline def apply(onCommand: WebDriverCommand => js.Promise[Unit]): WebDriverBarrier = {
      val __obj = js.Dynamic.literal(onCommand = js.Any.fromFunction1(onCommand))
      __obj.asInstanceOf[WebDriverBarrier]
    }
    
    extension [Self <: WebDriverBarrier](x: Self) {
      
      inline def setOnCommand(value: WebDriverCommand => js.Promise[Unit]): Self = StObject.set(x, "onCommand", js.Any.fromFunction1(value))
    }
  }
}
