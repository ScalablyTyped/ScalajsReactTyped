package typingsJapgolly.bmapgl.BMapGL

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayer extends StObject {
  
  def getCopyright(): Copyright
  
  def getTilesUrl(tileCoord: Pixel, zoom: Double): String
  
  def isTransparentPng(): Boolean
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object TileLayer {
  
  inline def apply(
    getCopyright: CallbackTo[Copyright],
    getTilesUrl: (Pixel, Double) => String,
    isTransparentPng: CallbackTo[Boolean]
  ): TileLayer = {
    val __obj = js.Dynamic.literal(getCopyright = getCopyright.toJsFn, getTilesUrl = js.Any.fromFunction2(getTilesUrl), isTransparentPng = isTransparentPng.toJsFn)
    __obj.asInstanceOf[TileLayer]
  }
  
  extension [Self <: TileLayer](x: Self) {
    
    inline def setGetCopyright(value: CallbackTo[Copyright]): Self = StObject.set(x, "getCopyright", value.toJsFn)
    
    inline def setGetTilesUrl(value: (Pixel, Double) => String): Self = StObject.set(x, "getTilesUrl", js.Any.fromFunction2(value))
    
    inline def setIsTransparentPng(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTransparentPng", value.toJsFn)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
