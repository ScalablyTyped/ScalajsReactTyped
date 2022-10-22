package typingsJapgolly.gradientParser.mod

import typingsJapgolly.gradientParser.gradientParserStrings.`repeating-linear-gradient`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatingLinearGradientNode
  extends StObject
     with GradientNode {
  
  var colorStops: js.Array[ColorStop]
  
  var orientation: js.UndefOr[DirectionalNode | AngularNode] = js.undefined
  
  var `type`: `repeating-linear-gradient`
}
object RepeatingLinearGradientNode {
  
  inline def apply(colorStops: js.Array[ColorStop]): RepeatingLinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-linear-gradient")
    __obj.asInstanceOf[RepeatingLinearGradientNode]
  }
  
  extension [Self <: RepeatingLinearGradientNode](x: Self) {
    
    inline def setColorStops(value: js.Array[ColorStop]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    inline def setColorStopsVarargs(value: ColorStop*): Self = StObject.set(x, "colorStops", js.Array(value*))
    
    inline def setOrientation(value: DirectionalNode | AngularNode): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setType(value: `repeating-linear-gradient`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
