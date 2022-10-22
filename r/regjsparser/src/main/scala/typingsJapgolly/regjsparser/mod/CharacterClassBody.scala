package typingsJapgolly.regjsparser.mod

import typingsJapgolly.regjsparser.regjsparserStrings.`null`
import typingsJapgolly.regjsparser.regjsparserStrings.controlLetter
import typingsJapgolly.regjsparser.regjsparserStrings.hexadecimalEscape
import typingsJapgolly.regjsparser.regjsparserStrings.identifier
import typingsJapgolly.regjsparser.regjsparserStrings.octal
import typingsJapgolly.regjsparser.regjsparserStrings.singleEscape
import typingsJapgolly.regjsparser.regjsparserStrings.symbol
import typingsJapgolly.regjsparser.regjsparserStrings.unicodeCodePointEscape
import typingsJapgolly.regjsparser.regjsparserStrings.unicodeEscape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.regjsparser.mod.CharacterClassEscape
  - typingsJapgolly.regjsparser.mod.CharacterClassRange
  - typingsJapgolly.regjsparser.mod.UnicodePropertyEscape
  - typingsJapgolly.regjsparser.mod.Value
*/
trait CharacterClassBody extends StObject
object CharacterClassBody {
  
  inline def CharacterClassEscape(range: js.Tuple2[Double, Double], raw: String, value: String): typingsJapgolly.regjsparser.mod.CharacterClassEscape = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClassEscape")
    __obj.asInstanceOf[typingsJapgolly.regjsparser.mod.CharacterClassEscape]
  }
  
  inline def CharacterClassRange(max: Value, min: Value, range: js.Tuple2[Double, Double], raw: String): typingsJapgolly.regjsparser.mod.CharacterClassRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClassRange")
    __obj.asInstanceOf[typingsJapgolly.regjsparser.mod.CharacterClassRange]
  }
  
  inline def UnicodePropertyEscape(negative: Boolean, range: js.Tuple2[Double, Double], raw: String, value: String): typingsJapgolly.regjsparser.mod.UnicodePropertyEscape = {
    val __obj = js.Dynamic.literal(negative = negative.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unicodePropertyEscape")
    __obj.asInstanceOf[typingsJapgolly.regjsparser.mod.UnicodePropertyEscape]
  }
  
  inline def Value(
    codePoint: Double,
    kind: controlLetter | hexadecimalEscape | identifier | `null` | octal | singleEscape | symbol | unicodeCodePointEscape | unicodeEscape,
    range: js.Tuple2[Double, Double],
    raw: String
  ): typingsJapgolly.regjsparser.mod.Value = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("value")
    __obj.asInstanceOf[typingsJapgolly.regjsparser.mod.Value]
  }
}
