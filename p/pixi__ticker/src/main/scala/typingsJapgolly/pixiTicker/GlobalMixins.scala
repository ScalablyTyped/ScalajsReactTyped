package typingsJapgolly.pixiTicker

import japgolly.scalajs.react.Callback
import typingsJapgolly.pixiTicker.mod.Ticker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalMixins {
  
  trait Application extends StObject {
    
    def start(): Unit
    
    def stop(): Unit
    
    var ticker: Ticker
  }
  object Application {
    
    inline def apply(start: Callback, stop: Callback, ticker: Ticker): Application = {
      val __obj = js.Dynamic.literal(start = start.toJsFn, stop = stop.toJsFn, ticker = ticker.asInstanceOf[js.Any])
      __obj.asInstanceOf[Application]
    }
    
    extension [Self <: Application](x: Self) {
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setTicker(value: Ticker): Self = StObject.set(x, "ticker", value.asInstanceOf[js.Any])
    }
  }
  
  trait IApplicationOptions extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var sharedTicker: js.UndefOr[Boolean] = js.undefined
  }
  object IApplicationOptions {
    
    inline def apply(): IApplicationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IApplicationOptions]
    }
    
    extension [Self <: IApplicationOptions](x: Self) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setSharedTicker(value: Boolean): Self = StObject.set(x, "sharedTicker", value.asInstanceOf[js.Any])
      
      inline def setSharedTickerUndefined: Self = StObject.set(x, "sharedTicker", js.undefined)
    }
  }
}
