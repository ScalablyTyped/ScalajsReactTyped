package typingsJapgolly.nodeSass.mod.types

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map
  extends StObject
     with Enumerable
     with Value {
  
  def getKey(index: Double): Value
  
  def setKey(index: Double, key: Value): Unit
}
object Map {
  
  @JSImport("node-sass", "types.Map")
  @js.native
  val ^ : MapConstructor = js.native
  
  extension [Self <: Map](x: Self) {
    
    inline def setGetKey(value: Double => Value): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    inline def setSetKey(value: (Double, Value) => Callback): Self = StObject.set(x, "setKey", js.Any.fromFunction2((t0: Double, t1: Value) => (value(t0, t1)).runNow()))
  }
}
