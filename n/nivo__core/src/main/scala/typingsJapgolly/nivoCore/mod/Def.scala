package typingsJapgolly.nivoCore.mod

import typingsJapgolly.nivoCore.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nivoCore.mod.LinearGradientDef_
  - typingsJapgolly.nivoCore.mod.PatternDotsDef_
  - typingsJapgolly.nivoCore.mod.PatternSquaresDef_
  - typingsJapgolly.nivoCore.mod.PatternLinesDef_
*/
trait Def extends StObject
object Def {
  
  inline def LinearGradientDef_(colors: js.Array[Color], id: String): typingsJapgolly.nivoCore.mod.LinearGradientDef_ = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linearGradient")
    __obj.asInstanceOf[typingsJapgolly.nivoCore.mod.LinearGradientDef_]
  }
  
  inline def PatternDotsDef_(id: String): typingsJapgolly.nivoCore.mod.PatternDotsDef_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("patternDots")
    __obj.asInstanceOf[typingsJapgolly.nivoCore.mod.PatternDotsDef_]
  }
  
  inline def PatternLinesDef_(id: String): typingsJapgolly.nivoCore.mod.PatternLinesDef_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("patternLines")
    __obj.asInstanceOf[typingsJapgolly.nivoCore.mod.PatternLinesDef_]
  }
  
  inline def PatternSquaresDef_(id: String): typingsJapgolly.nivoCore.mod.PatternSquaresDef_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("patternSquares")
    __obj.asInstanceOf[typingsJapgolly.nivoCore.mod.PatternSquaresDef_]
  }
}
