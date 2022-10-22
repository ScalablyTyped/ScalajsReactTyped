package typingsJapgolly.sockjsClient

import org.scalajs.dom.WebSocket
import typingsJapgolly.sockjsClient.mod.CLOSED
import typingsJapgolly.sockjsClient.mod.CLOSING
import typingsJapgolly.sockjsClient.mod.CONNECTING
import typingsJapgolly.sockjsClient.mod.OPEN
import typingsJapgolly.sockjsClient.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object SockJS {
    
    inline def apply(url: String): WebSocket = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[WebSocket]
    inline def apply(url: String, _reserved: Any): WebSocket = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], _reserved.asInstanceOf[js.Any])).asInstanceOf[WebSocket]
    inline def apply(url: String, _reserved: Any, options: Options): WebSocket = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], _reserved.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocket]
    inline def apply(url: String, _reserved: Unit, options: Options): WebSocket = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], _reserved.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocket]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("SockJS")
    @js.native
    open class ^ protected ()
      extends StObject
         with typingsJapgolly.std.WebSocket {
      def this(url: String) = this()
      def this(url: String, _reserved: Any) = this()
      def this(url: String, _reserved: Any, options: Options) = this()
      def this(url: String, _reserved: Unit, options: Options) = this()
    }
    
    @JSGlobal("SockJS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("SockJS.CLOSED")
    @js.native
    def CLOSED: typingsJapgolly.sockjsClient.mod.CLOSED = js.native
    inline def CLOSED_=(x: CLOSED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SockJS.CLOSING")
    @js.native
    def CLOSING: typingsJapgolly.sockjsClient.mod.CLOSING = js.native
    inline def CLOSING_=(x: CLOSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SockJS.CONNECTING")
    @js.native
    def CONNECTING: typingsJapgolly.sockjsClient.mod.CONNECTING = js.native
    inline def CONNECTING_=(x: CONNECTING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SockJS.OPEN")
    @js.native
    def OPEN: typingsJapgolly.sockjsClient.mod.OPEN = js.native
    inline def OPEN_=(x: OPEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  }
}
