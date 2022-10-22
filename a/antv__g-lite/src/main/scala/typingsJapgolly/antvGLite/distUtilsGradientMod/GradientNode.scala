package typingsJapgolly.antvGLite.distUtilsGradientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.antvGLite.distUtilsGradientMod.LinearGradientNode
  - typingsJapgolly.antvGLite.distUtilsGradientMod.RepeatingLinearGradientNode
  - typingsJapgolly.antvGLite.distUtilsGradientMod.RadialGradientNode
  - typingsJapgolly.antvGLite.distUtilsGradientMod.RepeatingRadialGradientNode
*/
trait GradientNode extends StObject
object GradientNode {
  
  inline def LinearGradientNode(colorStops: js.Array[ColorStop]): typingsJapgolly.antvGLite.distUtilsGradientMod.LinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linear-gradient")
    __obj.asInstanceOf[typingsJapgolly.antvGLite.distUtilsGradientMod.LinearGradientNode]
  }
  
  inline def RadialGradientNode(colorStops: js.Array[ColorStop]): typingsJapgolly.antvGLite.distUtilsGradientMod.RadialGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("radial-gradient")
    __obj.asInstanceOf[typingsJapgolly.antvGLite.distUtilsGradientMod.RadialGradientNode]
  }
  
  inline def RepeatingLinearGradientNode(colorStops: js.Array[ColorStop]): typingsJapgolly.antvGLite.distUtilsGradientMod.RepeatingLinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-linear-gradient")
    __obj.asInstanceOf[typingsJapgolly.antvGLite.distUtilsGradientMod.RepeatingLinearGradientNode]
  }
  
  inline def RepeatingRadialGradientNode(colorStops: js.Array[ColorStop]): typingsJapgolly.antvGLite.distUtilsGradientMod.RepeatingRadialGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-radial-gradient")
    __obj.asInstanceOf[typingsJapgolly.antvGLite.distUtilsGradientMod.RepeatingRadialGradientNode]
  }
}
