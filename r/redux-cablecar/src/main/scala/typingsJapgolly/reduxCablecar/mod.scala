package typingsJapgolly.reduxCablecar

import japgolly.scalajs.react.Callback
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.reduxCablecar.anon.Connect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-cablecar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-cablecar", JSImport.Default)
  @js.native
  def default: (Middleware[js.Object, Any, Dispatch[AnyAction]]) & Connect = js.native
  inline def default_=(x: (Middleware[js.Object, Any, Dispatch[AnyAction]]) & Connect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait CableCar extends StObject {
    
    def changeChannel(channel: String): Unit = js.native
    def changeChannel(channel: String, options: Options): Unit = js.native
    
    def getChannel(): String = js.native
    
    def getParams(): js.Object = js.native
    
    def perform(method: String): Unit = js.native
    def perform(method: String, payload: Any): Unit = js.native
    
    def send(action: String): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var connected: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disconnected: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var optimisticOnFail: js.UndefOr[Boolean] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConnected(value: Callback): Self = StObject.set(x, "connected", value.toJsFn)
      
      inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
      
      inline def setDisconnected(value: Callback): Self = StObject.set(x, "disconnected", value.toJsFn)
      
      inline def setDisconnectedUndefined: Self = StObject.set(x, "disconnected", js.undefined)
      
      inline def setOptimisticOnFail(value: Boolean): Self = StObject.set(x, "optimisticOnFail", value.asInstanceOf[js.Any])
      
      inline def setOptimisticOnFailUndefined: Self = StObject.set(x, "optimisticOnFail", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
