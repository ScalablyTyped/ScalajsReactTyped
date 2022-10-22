package typingsJapgolly.nivoTooltip

import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCrosshairLineMod {
  
  @JSImport("@nivo/tooltip/dist/types/CrosshairLine", "CrosshairLine")
  @js.native
  val CrosshairLine: MemoExoticComponent[js.Function1[/* hasX0X1Y0Y1 */ CrosshairLineProps, Element]] = js.native
  
  trait CrosshairLineProps extends StObject {
    
    var x0: Double
    
    var x1: Double
    
    var y0: Double
    
    var y1: Double
  }
  object CrosshairLineProps {
    
    inline def apply(x0: Double, x1: Double, y0: Double, y1: Double): CrosshairLineProps = {
      val __obj = js.Dynamic.literal(x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrosshairLineProps]
    }
    
    extension [Self <: CrosshairLineProps](x: Self) {
      
      inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    }
  }
}
