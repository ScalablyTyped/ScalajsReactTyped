package typingsJapgolly.antvGLite.distUtilsGradientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.antvGLite.distUtilsGradientMod.LiteralNode
  - typingsJapgolly.antvGLite.distUtilsGradientMod.HexNode
  - typingsJapgolly.antvGLite.distUtilsGradientMod.RgbNode
  - typingsJapgolly.antvGLite.distUtilsGradientMod.RgbaNode
*/
trait ColorStop extends StObject
object ColorStop {
  
  inline def HexNode(value: String): typingsJapgolly.antvGLite.distUtilsGradientMod.HexNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hex")
    __obj.asInstanceOf[typingsJapgolly.antvGLite.distUtilsGradientMod.HexNode]
  }
  
  inline def LiteralNode(value: String): typingsJapgolly.antvGLite.distUtilsGradientMod.LiteralNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[typingsJapgolly.antvGLite.distUtilsGradientMod.LiteralNode]
  }
  
  inline def RgbNode(value: js.Tuple3[String, String, String]): typingsJapgolly.antvGLite.distUtilsGradientMod.RgbNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgb")
    __obj.asInstanceOf[typingsJapgolly.antvGLite.distUtilsGradientMod.RgbNode]
  }
  
  inline def RgbaNode(value: js.Tuple4[String, String, String, js.UndefOr[String]]): typingsJapgolly.antvGLite.distUtilsGradientMod.RgbaNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgba")
    __obj.asInstanceOf[typingsJapgolly.antvGLite.distUtilsGradientMod.RgbaNode]
  }
}
