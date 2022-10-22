package typingsJapgolly.zrender

import japgolly.scalajs.react.Callback
import typingsJapgolly.zrender.zrender.ColorStops
import typingsJapgolly.zrender.zrender.GlobalCoords
import typingsJapgolly.zrender.zrender.X
import typingsJapgolly.zrender.zrender.X2
import typingsJapgolly.zrender.zrender.Y
import typingsJapgolly.zrender.zrender.Y2
import typingsJapgolly.zrender.zrenderStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddColorStop extends StObject {
    
    def addColorStop(offset: Double, color: String): Unit
    
    var colorStops: ColorStops
    
    var global: GlobalCoords
    
    var `type`: linear
    
    var x: X
    
    var x2: X2
    
    var y: Y
    
    var y2: Y2
  }
  object AddColorStop {
    
    inline def apply(
      addColorStop: (Double, String) => Callback,
      colorStops: ColorStops,
      global: GlobalCoords,
      x: X,
      x2: X2,
      y: Y,
      y2: Y2
    ): AddColorStop = {
      val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2((t0: Double, t1: String) => (addColorStop(t0, t1)).runNow()), colorStops = colorStops.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("linear")
      __obj.asInstanceOf[AddColorStop]
    }
    
    extension [Self <: AddColorStop](x: Self) {
      
      inline def setAddColorStop(value: (Double, String) => Callback): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setColorStops(value: ColorStops): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
      
      inline def setColorStopsVarargs(value: Color*): Self = StObject.set(x, "colorStops", js.Array(value*))
      
      inline def setGlobal(value: GlobalCoords): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setType(value: linear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: X): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX2(value: X2): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY(value: Y): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Y2): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var color: String
    
    var offset: Double
  }
  object Color {
    
    inline def apply(color: String, offset: Double): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
