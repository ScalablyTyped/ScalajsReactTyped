package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkComponentAPI
  extends StObject
     with ComponentAPI {
  
  def startLoad(startPosition: Double): Unit
  
  def stopLoad(): Unit
}
object NetworkComponentAPI {
  
  inline def apply(destroy: Callback, startLoad: Double => Callback, stopLoad: Callback): NetworkComponentAPI = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, startLoad = js.Any.fromFunction1((t0: Double) => startLoad(t0).runNow()), stopLoad = stopLoad.toJsFn)
    __obj.asInstanceOf[NetworkComponentAPI]
  }
  
  extension [Self <: NetworkComponentAPI](x: Self) {
    
    inline def setStartLoad(value: Double => Callback): Self = StObject.set(x, "startLoad", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStopLoad(value: Callback): Self = StObject.set(x, "stopLoad", value.toJsFn)
  }
}
