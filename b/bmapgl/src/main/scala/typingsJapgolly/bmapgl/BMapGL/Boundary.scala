package typingsJapgolly.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boundary extends StObject {
  
  def get(name: String, callback: js.Function1[/* result */ js.Array[String], Unit]): Unit
}
object Boundary {
  
  inline def apply(
    get: (String, js.Function1[/* result */ js.Array[String], Unit]) => japgolly.scalajs.react.Callback
  ): Boundary = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2((t0: String, t1: js.Function1[/* result */ js.Array[String], Unit]) => (get(t0, t1)).runNow()))
    __obj.asInstanceOf[Boundary]
  }
  
  extension [Self <: Boundary](x: Self) {
    
    inline def setGet(
      value: (String, js.Function1[/* result */ js.Array[String], Unit]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: js.Function1[/* result */ js.Array[String], Unit]) => (value(t0, t1)).runNow()))
  }
}
