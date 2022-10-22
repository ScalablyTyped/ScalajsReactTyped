package typingsJapgolly.gradientParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gradientParser.mod.LiteralNode
  - typingsJapgolly.gradientParser.mod.HexNode
  - typingsJapgolly.gradientParser.mod.RgbNode
  - typingsJapgolly.gradientParser.mod.RgbaNode
*/
trait ColorStop extends StObject
object ColorStop {
  
  inline def HexNode(value: String): typingsJapgolly.gradientParser.mod.HexNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hex")
    __obj.asInstanceOf[typingsJapgolly.gradientParser.mod.HexNode]
  }
  
  inline def LiteralNode(value: String): typingsJapgolly.gradientParser.mod.LiteralNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[typingsJapgolly.gradientParser.mod.LiteralNode]
  }
  
  inline def RgbNode(value: js.Tuple3[String, String, String]): typingsJapgolly.gradientParser.mod.RgbNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgb")
    __obj.asInstanceOf[typingsJapgolly.gradientParser.mod.RgbNode]
  }
  
  inline def RgbaNode(value: js.Tuple4[String, String, String, js.UndefOr[String]]): typingsJapgolly.gradientParser.mod.RgbaNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgba")
    __obj.asInstanceOf[typingsJapgolly.gradientParser.mod.RgbaNode]
  }
}
