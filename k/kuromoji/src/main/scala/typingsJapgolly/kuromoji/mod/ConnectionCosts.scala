package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionCosts extends StObject {
  
  var buffer: js.typedarray.Int16Array
  
  def get(forward_id: Double, backward_id: Double): Double
  
  def loadConnectionCosts(connection_costs_buffer: js.typedarray.Int16Array): Unit
  
  def put(forward_id: Double, backward_id: Double, cost: Double): Unit
}
object ConnectionCosts {
  
  inline def apply(
    buffer: js.typedarray.Int16Array,
    get: (Double, Double) => Double,
    loadConnectionCosts: js.typedarray.Int16Array => Callback,
    put: (Double, Double, Double) => Callback
  ): ConnectionCosts = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), loadConnectionCosts = js.Any.fromFunction1((t0: js.typedarray.Int16Array) => loadConnectionCosts(t0).runNow()), put = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (put(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ConnectionCosts]
  }
  
  extension [Self <: ConnectionCosts](x: Self) {
    
    inline def setBuffer(value: js.typedarray.Int16Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setGet(value: (Double, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setLoadConnectionCosts(value: js.typedarray.Int16Array => Callback): Self = StObject.set(x, "loadConnectionCosts", js.Any.fromFunction1((t0: js.typedarray.Int16Array) => value(t0).runNow()))
    
    inline def setPut(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "put", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
