package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.pusherJs.typesSrcCoreHttpUrlLocationMod.URLLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreHttpSocketHooksMod {
  
  trait SocketHooks extends StObject {
    
    def getReceiveURL(url: URLLocation, session: String): String
    
    def onFinished(Socket: Any, Status: Any): Unit
    
    def onHeartbeat(Socket: Any): Unit
    
    def sendHeartbeat(Socket: Any): Unit
  }
  object SocketHooks {
    
    inline def apply(
      getReceiveURL: (URLLocation, String) => String,
      onFinished: (Any, Any) => Callback,
      onHeartbeat: Any => Callback,
      sendHeartbeat: Any => Callback
    ): SocketHooks = {
      val __obj = js.Dynamic.literal(getReceiveURL = js.Any.fromFunction2(getReceiveURL), onFinished = js.Any.fromFunction2((t0: Any, t1: Any) => (onFinished(t0, t1)).runNow()), onHeartbeat = js.Any.fromFunction1((t0: Any) => onHeartbeat(t0).runNow()), sendHeartbeat = js.Any.fromFunction1((t0: Any) => sendHeartbeat(t0).runNow()))
      __obj.asInstanceOf[SocketHooks]
    }
    
    extension [Self <: SocketHooks](x: Self) {
      
      inline def setGetReceiveURL(value: (URLLocation, String) => String): Self = StObject.set(x, "getReceiveURL", js.Any.fromFunction2(value))
      
      inline def setOnFinished(value: (Any, Any) => Callback): Self = StObject.set(x, "onFinished", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setOnHeartbeat(value: Any => Callback): Self = StObject.set(x, "onHeartbeat", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSendHeartbeat(value: Any => Callback): Self = StObject.set(x, "sendHeartbeat", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
