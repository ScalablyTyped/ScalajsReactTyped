package typingsJapgolly.httpGracefulShutdown

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(server: Any): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
  inline def apply(server: Any, options: Options): js.Function0[js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Promise[Unit]]]
  
  @JSImport("http-graceful-shutdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var development: js.UndefOr[Boolean] = js.undefined
    
    var `finally`: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var forceExit: js.UndefOr[Boolean] = js.undefined
    
    var onShutdown: js.UndefOr[js.Function1[/* signal */ js.UndefOr[String], js.Promise[Unit]]] = js.undefined
    
    var preShutdown: js.UndefOr[js.Function1[/* signal */ js.UndefOr[String], js.Promise[Unit]]] = js.undefined
    
    var signals: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDevelopment(value: Boolean): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
      
      inline def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
      
      inline def setFinally(value: Callback): Self = StObject.set(x, "finally", value.toJsFn)
      
      inline def setFinallyUndefined: Self = StObject.set(x, "finally", js.undefined)
      
      inline def setForceExit(value: Boolean): Self = StObject.set(x, "forceExit", value.asInstanceOf[js.Any])
      
      inline def setForceExitUndefined: Self = StObject.set(x, "forceExit", js.undefined)
      
      inline def setOnShutdown(value: /* signal */ js.UndefOr[String] => js.Promise[Unit]): Self = StObject.set(x, "onShutdown", js.Any.fromFunction1(value))
      
      inline def setOnShutdownUndefined: Self = StObject.set(x, "onShutdown", js.undefined)
      
      inline def setPreShutdown(value: /* signal */ js.UndefOr[String] => js.Promise[Unit]): Self = StObject.set(x, "preShutdown", js.Any.fromFunction1(value))
      
      inline def setPreShutdownUndefined: Self = StObject.set(x, "preShutdown", js.undefined)
      
      inline def setSignals(value: String): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
