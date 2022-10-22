package typingsJapgolly.node.http2Mod

import typingsJapgolly.node.nodeStrings.continue
import typingsJapgolly.node.nodeStrings.headers
import typingsJapgolly.node.nodeStrings.push
import typingsJapgolly.node.nodeStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientHttp2Stream extends StObject {
  
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_continue(event: continue, listener: js.Function0[js.Object]): this.type = js.native
  @JSName("addListener")
  def addListener_headers(
    event: headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_push(event: push, listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_response(
    event: response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  @JSName("emit")
  def emit_continue(event: continue): Boolean = js.native
  @JSName("emit")
  def emit_headers(event: headers, headers: IncomingHttpHeaders & IncomingHttpStatusHeader, flags: Double): Boolean = js.native
  @JSName("emit")
  def emit_push(event: push, headers: IncomingHttpHeaders, flags: Double): Boolean = js.native
  @JSName("emit")
  def emit_response(event: response, headers: IncomingHttpHeaders & IncomingHttpStatusHeader, flags: Double): Boolean = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_continue(event: continue, listener: js.Function0[js.Object]): this.type = js.native
  @JSName("on")
  def on_headers(
    event: headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_push(event: push, listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_response(
    event: response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_continue(event: continue, listener: js.Function0[js.Object]): this.type = js.native
  @JSName("once")
  def once_headers(
    event: headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_push(event: push, listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_response(
    event: response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_continue(event: continue, listener: js.Function0[js.Object]): this.type = js.native
  @JSName("prependListener")
  def prependListener_headers(
    event: headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_push(event: push, listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_response(
    event: response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_continue(event: continue, listener: js.Function0[js.Object]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_headers(
    event: headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_push(event: push, listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_response(
    event: response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
}
