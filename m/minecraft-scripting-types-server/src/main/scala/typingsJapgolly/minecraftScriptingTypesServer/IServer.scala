package typingsJapgolly.minecraftScriptingTypesServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServer extends StObject {
  
  def log(message: String): Unit
  
  def registerSystem[TSystem /* <: IServerSystem[TSystem] */](majorVersion: Double, minorVersion: Double): TSystem
}
object IServer {
  
  inline def apply(log: String => Callback, registerSystem: (Double, Double) => Any): IServer = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1((t0: String) => log(t0).runNow()), registerSystem = js.Any.fromFunction2(registerSystem))
    __obj.asInstanceOf[IServer]
  }
  
  extension [Self <: IServer](x: Self) {
    
    inline def setLog(value: String => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRegisterSystem(value: (Double, Double) => Any): Self = StObject.set(x, "registerSystem", js.Any.fromFunction2(value))
  }
}
