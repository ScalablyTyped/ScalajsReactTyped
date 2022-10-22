package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvents extends StObject {
  
  // tslint:disable-next-line ban-types
  def Register(eventToListen: Event, eventSink: js.Function): Double
  
  def Unregister(sinkHandle: Double): Unit
}
object IEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Callback): IEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1((t0: Double) => Unregister(t0).runNow()))
    __obj.asInstanceOf[IEvents]
  }
  
  extension [Self <: IEvents](x: Self) {
    
    inline def setRegister(value: (Event, js.Function) => Double): Self = StObject.set(x, "Register", js.Any.fromFunction2(value))
    
    inline def setUnregister(value: Double => Callback): Self = StObject.set(x, "Unregister", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
