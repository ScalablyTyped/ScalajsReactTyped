package typingsJapgolly.magicmirrorModule

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.magicmirrorModule.anon.ThisTypeNonNullableNodeHe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:disable:no-single-declare-module */
object nodeHelperMod {
  
  @JSImport("node_helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(`object`: ThisTypeNonNullableNodeHe): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait NodeHelperModule
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    val expressApp: Any
    
    // Subclassable methods
    def init(): Unit
    
    val io: Any
    
    val name: String
    
    val path: String
    
    val requiresVersion: String
    
    def sendSocketNotification(notification: String, payload: Any): Unit
    
    def socketNotificationReceived(notification: String, payload: Any): Unit
    
    def start(): Unit
    
    def stop(): Unit
  }
  object NodeHelperModule {
    
    inline def apply(
      expressApp: Any,
      init: Callback,
      io: Any,
      name: String,
      path: String,
      requiresVersion: String,
      sendSocketNotification: (String, Any) => Callback,
      socketNotificationReceived: (String, Any) => Callback,
      start: Callback,
      stop: Callback
    ): NodeHelperModule = {
      val __obj = js.Dynamic.literal(expressApp = expressApp.asInstanceOf[js.Any], init = init.toJsFn, io = io.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requiresVersion = requiresVersion.asInstanceOf[js.Any], sendSocketNotification = js.Any.fromFunction2((t0: String, t1: Any) => (sendSocketNotification(t0, t1)).runNow()), socketNotificationReceived = js.Any.fromFunction2((t0: String, t1: Any) => (socketNotificationReceived(t0, t1)).runNow()), start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[NodeHelperModule]
    }
    
    extension [Self <: NodeHelperModule](x: Self) {
      
      inline def setExpressApp(value: Any): Self = StObject.set(x, "expressApp", value.asInstanceOf[js.Any])
      
      inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setIo(value: Any): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRequiresVersion(value: String): Self = StObject.set(x, "requiresVersion", value.asInstanceOf[js.Any])
      
      inline def setSendSocketNotification(value: (String, Any) => Callback): Self = StObject.set(x, "sendSocketNotification", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSocketNotificationReceived(value: (String, Any) => Callback): Self = StObject.set(x, "socketNotificationReceived", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
