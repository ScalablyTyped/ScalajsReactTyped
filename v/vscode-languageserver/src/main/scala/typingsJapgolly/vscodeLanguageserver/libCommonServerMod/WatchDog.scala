package typingsJapgolly.vscodeLanguageserver.libCommonServerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchDog extends StObject {
  
  def exit(code: Double): Unit
  
  def initialize(params: InitializeParams): Unit
  
  var shutdownReceived: Boolean
}
object WatchDog {
  
  inline def apply(exit: Double => Callback, initialize: InitializeParams => Callback, shutdownReceived: Boolean): WatchDog = {
    val __obj = js.Dynamic.literal(exit = js.Any.fromFunction1((t0: Double) => exit(t0).runNow()), initialize = js.Any.fromFunction1((t0: InitializeParams) => initialize(t0).runNow()), shutdownReceived = shutdownReceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchDog]
  }
  
  extension [Self <: WatchDog](x: Self) {
    
    inline def setExit(value: Double => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setInitialize(value: InitializeParams => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction1((t0: InitializeParams) => value(t0).runNow()))
    
    inline def setShutdownReceived(value: Boolean): Self = StObject.set(x, "shutdownReceived", value.asInstanceOf[js.Any])
  }
}
