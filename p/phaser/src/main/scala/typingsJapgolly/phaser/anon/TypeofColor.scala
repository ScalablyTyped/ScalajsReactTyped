package typingsJapgolly.phaser.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.spine.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofColor extends StObject {
  
  /* static member */
  var BLUE: Color
  
  /* static member */
  var GREEN: Color
  
  /* static member */
  var MAGENTA: Color
  
  /* static member */
  var RED: Color
  
  /* static member */
  var WHITE: Color
  
  /* static member */
  def rgb888ToColor(color: Color, value: Double): Unit
  
  /* static member */
  def rgba8888ToColor(color: Color, value: Double): Unit
}
object TypeofColor {
  
  inline def apply(
    BLUE: Color,
    GREEN: Color,
    MAGENTA: Color,
    RED: Color,
    WHITE: Color,
    rgb888ToColor: (Color, Double) => Callback,
    rgba8888ToColor: (Color, Double) => Callback
  ): TypeofColor = {
    val __obj = js.Dynamic.literal(BLUE = BLUE.asInstanceOf[js.Any], GREEN = GREEN.asInstanceOf[js.Any], MAGENTA = MAGENTA.asInstanceOf[js.Any], RED = RED.asInstanceOf[js.Any], WHITE = WHITE.asInstanceOf[js.Any], rgb888ToColor = js.Any.fromFunction2((t0: Color, t1: Double) => (rgb888ToColor(t0, t1)).runNow()), rgba8888ToColor = js.Any.fromFunction2((t0: Color, t1: Double) => (rgba8888ToColor(t0, t1)).runNow()))
    __obj.asInstanceOf[TypeofColor]
  }
  
  extension [Self <: TypeofColor](x: Self) {
    
    inline def setBLUE(value: Color): Self = StObject.set(x, "BLUE", value.asInstanceOf[js.Any])
    
    inline def setGREEN(value: Color): Self = StObject.set(x, "GREEN", value.asInstanceOf[js.Any])
    
    inline def setMAGENTA(value: Color): Self = StObject.set(x, "MAGENTA", value.asInstanceOf[js.Any])
    
    inline def setRED(value: Color): Self = StObject.set(x, "RED", value.asInstanceOf[js.Any])
    
    inline def setRgb888ToColor(value: (Color, Double) => Callback): Self = StObject.set(x, "rgb888ToColor", js.Any.fromFunction2((t0: Color, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setRgba8888ToColor(value: (Color, Double) => Callback): Self = StObject.set(x, "rgba8888ToColor", js.Any.fromFunction2((t0: Color, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setWHITE(value: Color): Self = StObject.set(x, "WHITE", value.asInstanceOf[js.Any])
  }
}
