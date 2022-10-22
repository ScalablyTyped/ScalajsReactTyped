package typingsJapgolly.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCollection
  extends StObject
     with Overlay {
  
  def clear(): Unit
  
  def onclick(event: typingsJapgolly.baidumapWebSdk.anon.Point): Unit
  
  def onmouseout(event: typingsJapgolly.baidumapWebSdk.anon.Point): Unit
  
  def onmouseover(event: typingsJapgolly.baidumapWebSdk.anon.Point): Unit
  
  def setPoints(points: js.Array[Point]): Unit
  
  def setStyles(styles: PointCollectionOption): Unit
}
object PointCollection {
  
  inline def apply(
    clear: japgolly.scalajs.react.Callback,
    onclick: typingsJapgolly.baidumapWebSdk.anon.Point => japgolly.scalajs.react.Callback,
    onmouseout: typingsJapgolly.baidumapWebSdk.anon.Point => japgolly.scalajs.react.Callback,
    onmouseover: typingsJapgolly.baidumapWebSdk.anon.Point => japgolly.scalajs.react.Callback,
    setPoints: js.Array[Point] => japgolly.scalajs.react.Callback,
    setStyles: PointCollectionOption => japgolly.scalajs.react.Callback
  ): PointCollection = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, onclick = js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Point) => onclick(t0).runNow()), onmouseout = js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Point) => onmouseout(t0).runNow()), onmouseover = js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Point) => onmouseover(t0).runNow()), setPoints = js.Any.fromFunction1((t0: js.Array[Point]) => setPoints(t0).runNow()), setStyles = js.Any.fromFunction1((t0: PointCollectionOption) => setStyles(t0).runNow()))
    __obj.asInstanceOf[PointCollection]
  }
  
  extension [Self <: PointCollection](x: Self) {
    
    inline def setClear(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setOnclick(value: typingsJapgolly.baidumapWebSdk.anon.Point => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onclick", js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Point) => value(t0).runNow()))
    
    inline def setOnmouseout(value: typingsJapgolly.baidumapWebSdk.anon.Point => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Point) => value(t0).runNow()))
    
    inline def setOnmouseover(value: typingsJapgolly.baidumapWebSdk.anon.Point => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Point) => value(t0).runNow()))
    
    inline def setSetPoints(value: js.Array[Point] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setPoints", js.Any.fromFunction1((t0: js.Array[Point]) => value(t0).runNow()))
    
    inline def setSetStyles(value: PointCollectionOption => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setStyles", js.Any.fromFunction1((t0: PointCollectionOption) => value(t0).runNow()))
  }
}
