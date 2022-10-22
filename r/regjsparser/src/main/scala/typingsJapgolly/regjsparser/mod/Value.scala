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
import typingsJapgolly.regjsparser.regjsparserStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with Base[value]
     with CharacterClassBody
     with _AstNode[Any] {
  
  var codePoint: Double
  
  var kind: controlLetter | hexadecimalEscape | identifier | `null` | octal | singleEscape | symbol | unicodeCodePointEscape | unicodeEscape
}
object Value {
  
  inline def apply(
    codePoint: Double,
    kind: controlLetter | hexadecimalEscape | identifier | `null` | octal | singleEscape | symbol | unicodeCodePointEscape | unicodeEscape,
    range: js.Tuple2[Double, Double],
    raw: String
  ): Value = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("value")
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setCodePoint(value: Double): Self = StObject.set(x, "codePoint", value.asInstanceOf[js.Any])
    
    inline def setKind(
      value: controlLetter | hexadecimalEscape | identifier | `null` | octal | singleEscape | symbol | unicodeCodePointEscape | unicodeEscape
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
