package typingsJapgolly.gradientParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gradientParser.mod.LinearGradientNode
  - typingsJapgolly.gradientParser.mod.RepeatingLinearGradientNode
  - typingsJapgolly.gradientParser.mod.RadialGradientNode
  - typingsJapgolly.gradientParser.mod.RepeatingRadialGradientNode
*/
trait GradientNode extends StObject
object GradientNode {
  
  inline def LinearGradientNode(colorStops: js.Array[ColorStop]): typingsJapgolly.gradientParser.mod.LinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linear-gradient")
    __obj.asInstanceOf[typingsJapgolly.gradientParser.mod.LinearGradientNode]
  }
  
  inline def RadialGradientNode(colorStops: js.Array[ColorStop]): typingsJapgolly.gradientParser.mod.RadialGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("radial-gradient")
    __obj.asInstanceOf[typingsJapgolly.gradientParser.mod.RadialGradientNode]
  }
  
  inline def RepeatingLinearGradientNode(colorStops: js.Array[ColorStop]): typingsJapgolly.gradientParser.mod.RepeatingLinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-linear-gradient")
    __obj.asInstanceOf[typingsJapgolly.gradientParser.mod.RepeatingLinearGradientNode]
  }
  
  inline def RepeatingRadialGradientNode(colorStops: js.Array[ColorStop]): typingsJapgolly.gradientParser.mod.RepeatingRadialGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-radial-gradient")
    __obj.asInstanceOf[typingsJapgolly.gradientParser.mod.RepeatingRadialGradientNode]
  }
}
