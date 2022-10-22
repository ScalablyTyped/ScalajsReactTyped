package typingsJapgolly.next.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnsurePage extends StObject {
  
  def ensurePage(hasPageClientOnlyAppPaths: ClientOnly): js.Promise[Unit]
  
  def onHMR(client: WebSocket): Unit
}
object EnsurePage {
  
  inline def apply(ensurePage: ClientOnly => js.Promise[Unit], onHMR: WebSocket => Callback): EnsurePage = {
    val __obj = js.Dynamic.literal(ensurePage = js.Any.fromFunction1(ensurePage), onHMR = js.Any.fromFunction1((t0: WebSocket) => onHMR(t0).runNow()))
    __obj.asInstanceOf[EnsurePage]
  }
  
  extension [Self <: EnsurePage](x: Self) {
    
    inline def setEnsurePage(value: ClientOnly => js.Promise[Unit]): Self = StObject.set(x, "ensurePage", js.Any.fromFunction1(value))
    
    inline def setOnHMR(value: WebSocket => Callback): Self = StObject.set(x, "onHMR", js.Any.fromFunction1((t0: WebSocket) => value(t0).runNow()))
  }
}
