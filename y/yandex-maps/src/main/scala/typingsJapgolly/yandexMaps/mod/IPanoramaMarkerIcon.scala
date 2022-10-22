package typingsJapgolly.yandexMaps.mod

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaMarkerIcon extends StObject {
  
  var image: HTMLCanvasElement | HTMLImageElement
  
  var offset: js.Array[Double]
}
object IPanoramaMarkerIcon {
  
  inline def apply(image: HTMLCanvasElement | HTMLImageElement, offset: js.Array[Double]): IPanoramaMarkerIcon = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaMarkerIcon]
  }
  
  extension [Self <: IPanoramaMarkerIcon](x: Self) {
    
    inline def setImage(value: HTMLCanvasElement | HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
  }
}
