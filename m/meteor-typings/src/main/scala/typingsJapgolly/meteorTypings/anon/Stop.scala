package typingsJapgolly.meteorTypings.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stop extends StObject {
  
  def stop(): Unit
}
object Stop {
  
  inline def apply(stop: Callback): Stop = {
    val __obj = js.Dynamic.literal(stop = stop.toJsFn)
    __obj.asInstanceOf[Stop]
  }
  
  extension [Self <: Stop](x: Self) {
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
