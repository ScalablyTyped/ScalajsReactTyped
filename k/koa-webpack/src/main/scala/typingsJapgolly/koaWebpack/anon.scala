package typingsJapgolly.koaWebpack

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpackHotClient.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    def close(): Unit
    
    var options: Options
    
    var server: Any
  }
  object Close {
    
    inline def apply(close: Callback, options: Options, server: Any): Close = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, options = options.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setServer(value: Any): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
