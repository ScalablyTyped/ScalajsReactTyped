package typingsJapgolly.esbuildWasm.libBrowserMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeResult extends StObject {
  
  var host: String
  
  var port: Double
  
  def stop(): Unit
  
  @JSName("wait")
  var wait_FServeResult: js.Promise[Unit]
}
object ServeResult {
  
  inline def apply(host: String, port: Double, stop: Callback, wait_ : js.Promise[Unit]): ServeResult = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], stop = stop.toJsFn)
    __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeResult]
  }
  
  extension [Self <: ServeResult](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setWait_(value: js.Promise[Unit]): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
  }
}
