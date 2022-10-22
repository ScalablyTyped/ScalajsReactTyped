package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsStrings.dashed
import typingsJapgolly.screeps.screepsStrings.dotted
import typingsJapgolly.screeps.screepsStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLineStyle extends StObject {
  
  /**
    * Line color in the following format: #ffffff (hex triplet). Default is #ffffff.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Either undefined (solid line), dashed, or dotted. Default is undefined.
    */
  var lineStyle: js.UndefOr[dashed | dotted | solid] = js.undefined
  
  /**
    * Opacity value, default is 0.5.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Line width, default is 0.1.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object MapLineStyle {
  
  inline def apply(): MapLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLineStyle]
  }
  
  extension [Self <: MapLineStyle](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLineStyle(value: dashed | dotted | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
