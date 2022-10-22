package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProjection extends StObject {
  
  def fromGlobalPixels(globalPixelPoint: js.Array[Double], zoom: Double): js.Array[Double]
  
  def getCoordSystem(): ICoordSystem
  
  def isCycled(): js.Array[Boolean]
  
  def toGlobalPixels(coordPoint: js.Array[Double], zoom: Double): js.Array[Double]
}
object IProjection {
  
  inline def apply(
    fromGlobalPixels: (js.Array[Double], Double) => js.Array[Double],
    getCoordSystem: CallbackTo[ICoordSystem],
    isCycled: CallbackTo[js.Array[Boolean]],
    toGlobalPixels: (js.Array[Double], Double) => js.Array[Double]
  ): IProjection = {
    val __obj = js.Dynamic.literal(fromGlobalPixels = js.Any.fromFunction2(fromGlobalPixels), getCoordSystem = getCoordSystem.toJsFn, isCycled = isCycled.toJsFn, toGlobalPixels = js.Any.fromFunction2(toGlobalPixels))
    __obj.asInstanceOf[IProjection]
  }
  
  extension [Self <: IProjection](x: Self) {
    
    inline def setFromGlobalPixels(value: (js.Array[Double], Double) => js.Array[Double]): Self = StObject.set(x, "fromGlobalPixels", js.Any.fromFunction2(value))
    
    inline def setGetCoordSystem(value: CallbackTo[ICoordSystem]): Self = StObject.set(x, "getCoordSystem", value.toJsFn)
    
    inline def setIsCycled(value: CallbackTo[js.Array[Boolean]]): Self = StObject.set(x, "isCycled", value.toJsFn)
    
    inline def setToGlobalPixels(value: (js.Array[Double], Double) => js.Array[Double]): Self = StObject.set(x, "toGlobalPixels", js.Any.fromFunction2(value))
  }
}
