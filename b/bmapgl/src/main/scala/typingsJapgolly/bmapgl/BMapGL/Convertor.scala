package typingsJapgolly.bmapgl.BMapGL

import typingsJapgolly.bmapgl.anon.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Convertor extends StObject {
  
  def translate(
    points: js.Array[Point],
    from: Double,
    to: Double,
    callback: js.Function1[/* result */ Points, Unit]
  ): Unit
}
object Convertor {
  
  inline def apply(
    translate: (js.Array[Point], Double, Double, js.Function1[/* result */ Points, Unit]) => japgolly.scalajs.react.Callback
  ): Convertor = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction4((t0: js.Array[Point], t1: Double, t2: Double, t3: js.Function1[/* result */ Points, Unit]) => (translate(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[Convertor]
  }
  
  extension [Self <: Convertor](x: Self) {
    
    inline def setTranslate(
      value: (js.Array[Point], Double, Double, js.Function1[/* result */ Points, Unit]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "translate", js.Any.fromFunction4((t0: js.Array[Point], t1: Double, t2: Double, t3: js.Function1[/* result */ Points, Unit]) => (value(t0, t1, t2, t3)).runNow()))
  }
}
