package typingsJapgolly.playable

import typingsJapgolly.eventemitter3.mod.ListenerFn
import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesEventEmitterTypesMod {
  
  @js.native
  trait IEventEmitter extends StObject {
    
    def bindEvents(eventsMap: js.Array[IEventMap]): js.Function0[Unit] = js.native
    def bindEvents(eventsMap: js.Array[IEventMap], defaultFnContext: Any): js.Function0[Unit] = js.native
    
    def destroy(): Unit = js.native
    
    def emitAsync(event: String, args: Any*): js.Promise[Boolean] | Unit = js.native
    def emitAsync(event: js.Symbol, args: Any*): js.Promise[Boolean] | Unit = js.native
    
    def off(event: String): this.type = js.native
    def off(event: String, fn: Unit, context: Any): this.type = js.native
    def off(event: String, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off(event: String, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off(event: String, fn: ListenerFn[js.Array[Any]]): this.type = js.native
    def off(event: String, fn: ListenerFn[js.Array[Any]], context: Any): this.type = js.native
    def off(event: String, fn: ListenerFn[js.Array[Any]], context: Any, once: Boolean): this.type = js.native
    def off(event: String, fn: ListenerFn[js.Array[Any]], context: Unit, once: Boolean): this.type = js.native
    
    def on(event: String, fn: ListenerFn[js.Array[Any]]): this.type = js.native
    def on(event: String, fn: ListenerFn[js.Array[Any]], context: Any): this.type = js.native
  }
  
  trait IEventEmitterAPI extends StObject {
    
    var off: js.UndefOr[
        js.Function4[
          /* event */ String, 
          /* fn */ js.UndefOr[ListenerFn[js.Array[Any]]], 
          /* context */ js.UndefOr[Any], 
          /* once */ js.UndefOr[Boolean], 
          this.type
        ]
      ] = js.undefined
    
    var on: js.UndefOr[
        js.Function3[
          /* event */ String, 
          /* fn */ ListenerFn[js.Array[Any]], 
          /* context */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
  }
  object IEventEmitterAPI {
    
    inline def apply(): IEventEmitterAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEventEmitterAPI]
    }
    
    extension [Self <: IEventEmitterAPI](x: Self) {
      
      inline def setOff(
        value: (/* event */ String, /* fn */ js.UndefOr[ListenerFn[js.Array[Any]]], /* context */ js.UndefOr[Any], /* once */ js.UndefOr[Boolean]) => IEventEmitterAPI
      ): Self = StObject.set(x, "off", js.Any.fromFunction4(value))
      
      inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      inline def setOn(
        value: (/* event */ String, /* fn */ ListenerFn[js.Array[Any]], /* context */ js.UndefOr[Any]) => IEventEmitterAPI
      ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    }
  }
  
  @js.native
  trait IEventMap
    extends StObject
       with Array[Any]
}
