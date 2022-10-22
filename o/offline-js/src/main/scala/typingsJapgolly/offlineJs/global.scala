package typingsJapgolly.offlineJs

import org.scalajs.dom.Event
import typingsJapgolly.offlineJs.offlineJsStrings.`confirmed-down`
import typingsJapgolly.offlineJs.offlineJsStrings.`confirmed-up`
import typingsJapgolly.offlineJs.offlineJsStrings.checking
import typingsJapgolly.offlineJs.offlineJsStrings.down
import typingsJapgolly.offlineJs.offlineJsStrings.reconnectColonconnecting
import typingsJapgolly.offlineJs.offlineJsStrings.reconnectColonfailure
import typingsJapgolly.offlineJs.offlineJsStrings.reconnectColonstarted
import typingsJapgolly.offlineJs.offlineJsStrings.reconnectColonstopped
import typingsJapgolly.offlineJs.offlineJsStrings.reconnectColontick
import typingsJapgolly.offlineJs.offlineJsStrings.requestsColonflush
import typingsJapgolly.offlineJs.offlineJsStrings.requestsColonhold
import typingsJapgolly.offlineJs.offlineJsStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Offline {
    
    @JSGlobal("Offline")
    @js.native
    val ^ : js.Any = js.native
    
    inline def check(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("check")().asInstanceOf[Unit]
    
    inline def off(event: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off(event: String, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_checking(event: checking): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_checking(event: checking, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_confirmeddown(event: `confirmed-down`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_confirmedup(event: `confirmed-up`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_down(event: down): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_down(event: down, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_reconnectconnecting(event: reconnectColonconnecting): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_reconnectconnecting(event: reconnectColonconnecting, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_reconnectfailure(event: reconnectColonfailure): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_reconnectfailure(event: reconnectColonfailure, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_reconnectstarted(event: reconnectColonstarted): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_reconnectstarted(event: reconnectColonstarted, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_reconnectstopped(event: reconnectColonstopped): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_reconnectstopped(event: reconnectColonstopped, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_reconnecttick(event: reconnectColontick): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_reconnecttick(event: reconnectColontick, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_requestsflush(event: requestsColonflush): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_requestsflush(event: requestsColonflush, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_requestshold(event: requestsColonhold): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_requestshold(event: requestsColonhold, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_up(event: up): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off_up(event: up, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on(event: String, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(event: String, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_checking(event: checking, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_checking(event: checking, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_down(event: down, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_down(event: down, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_reconnectconnecting(event: reconnectColonconnecting, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_reconnectconnecting(event: reconnectColonconnecting, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_reconnectfailure(event: reconnectColonfailure, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_reconnectfailure(event: reconnectColonfailure, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_reconnectstarted(event: reconnectColonstarted, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_reconnectstarted(event: reconnectColonstarted, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_reconnectstopped(event: reconnectColonstopped, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_reconnectstopped(event: reconnectColonstopped, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_reconnecttick(event: reconnectColontick, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_reconnecttick(event: reconnectColontick, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_requestsflush(event: requestsColonflush, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_requestsflush(event: requestsColonflush, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_requestshold(event: requestsColonhold, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_requestshold(event: requestsColonhold, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_up(event: up, handler: js.Function1[/* e */ Event, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on_up(event: up, handler: js.Function1[/* e */ Event, Any], context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("Offline.options")
    @js.native
    def options: OfflineOptions = js.native
    inline def options_=(x: OfflineOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Offline.state")
    @js.native
    def state: String = js.native
    inline def state_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
  }
}
