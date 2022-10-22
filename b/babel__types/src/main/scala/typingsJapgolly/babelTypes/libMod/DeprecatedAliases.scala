package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.NumberLiteral1
  - typingsJapgolly.babelTypes.libMod.RegexLiteral1
  - typingsJapgolly.babelTypes.libMod.RestProperty1
  - typingsJapgolly.babelTypes.libMod.SpreadProperty1
*/
trait DeprecatedAliases extends StObject
object DeprecatedAliases {
  
  inline def NumberLiteral1(value: Double): typingsJapgolly.babelTypes.libMod.NumberLiteral1 = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.NumberLiteral1]
  }
  
  inline def RegexLiteral1(flags: String, pattern: String): typingsJapgolly.babelTypes.libMod.RegexLiteral1 = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegexLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.RegexLiteral1]
  }
  
  inline def RestProperty1(argument: LVal): typingsJapgolly.babelTypes.libMod.RestProperty1 = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.RestProperty1]
  }
  
  inline def SpreadProperty1(argument: Expression): typingsJapgolly.babelTypes.libMod.SpreadProperty1 = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.SpreadProperty1]
  }
}
