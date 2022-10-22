package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaTileLevel extends StObject {
  
  def getImageSize(): js.Array[Double]
  
  def getTileUrl(x: Double, y: Double): String
}
object IPanoramaTileLevel {
  
  inline def apply(getImageSize: CallbackTo[js.Array[Double]], getTileUrl: (Double, Double) => String): IPanoramaTileLevel = {
    val __obj = js.Dynamic.literal(getImageSize = getImageSize.toJsFn, getTileUrl = js.Any.fromFunction2(getTileUrl))
    __obj.asInstanceOf[IPanoramaTileLevel]
  }
  
  extension [Self <: IPanoramaTileLevel](x: Self) {
    
    inline def setGetImageSize(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getImageSize", value.toJsFn)
    
    inline def setGetTileUrl(value: (Double, Double) => String): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction2(value))
  }
}
