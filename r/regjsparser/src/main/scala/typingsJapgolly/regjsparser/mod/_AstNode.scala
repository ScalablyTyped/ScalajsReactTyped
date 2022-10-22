package typingsJapgolly.regjsparser.mod

import typingsJapgolly.regjsparser.regjsparserStrings.`not-boundary`
import typingsJapgolly.regjsparser.regjsparserStrings.`null`
import typingsJapgolly.regjsparser.regjsparserStrings.boundary
import typingsJapgolly.regjsparser.regjsparserStrings.controlLetter
import typingsJapgolly.regjsparser.regjsparserStrings.end
import typingsJapgolly.regjsparser.regjsparserStrings.hexadecimalEscape
import typingsJapgolly.regjsparser.regjsparserStrings.identifier
import typingsJapgolly.regjsparser.regjsparserStrings.intersection
import typingsJapgolly.regjsparser.regjsparserStrings.octal
import typingsJapgolly.regjsparser.regjsparserStrings.singleEscape
import typingsJapgolly.regjsparser.regjsparserStrings.start
import typingsJapgolly.regjsparser.regjsparserStrings.subtraction
import typingsJapgolly.regjsparser.regjsparserStrings.symbol
import typingsJapgolly.regjsparser.regjsparserStrings.unicodeCodePointEscape
import typingsJapgolly.regjsparser.regjsparserStrings.unicodeEscape
import typingsJapgolly.regjsparser.regjsparserStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AstNode[F /* <: Features */] extends StObject
object _AstNode {
  
  inline def Alternative[F /* <: Features */](body: js.Array[RootNode[F]], range: js.Tuple2[Double, Double], raw: String): typingsJapgolly.regjsparser.mod.Alternative[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("alternative")
    __obj.asInstanceOf[typingsJapgolly.regjsparser.mod.Alternative[F]]
  }
  
  inline def Anchor(kind: boundary | end | `not-boundary` | start, range: js.Tuple2[Double, Double], raw: String): typingsJapgolly.regjsparser.mod.Anchor = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("anchor")
    __obj.asInstanceOf[typingsJapgolly.regjsparser.mod.Anchor]
  }
  
  inline def CharacterClass[F /* <: Features */](
    body: js.Array[CharacterClassBody],
    kind: union | (If[
      /* import warning: importer.ImportType#apply Failed type conversion: F['unicodeSet'] */ js.Any, 
      intersection | subtraction, 
      scala.Nothing
    ]),
    negative: Boolean,
    range: js.Tuple2[Double, Double],
    raw: String
  ): typingsJapgolly.regjsparser.mod.CharacterClass[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClass")
    __obj.asInstanceOf[typingsJapgolly.regjsparser.mod.CharacterClass[F]]
  }
  
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
  
  inline def Disjunction[F /* <: Features */](body: Array[RootNode[F]], range: js.Tuple2[Double, Double], raw: String): typingsJapgolly.regjsparser.mod.Disjunction[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("disjunction")
    __obj.asInstanceOf[typingsJapgolly.regjsparser.mod.Disjunction[F]]
  }
  
  inline def Quantifier[F /* <: Features */](
    body: js.Array[RootNode[F]],
    greedy: Boolean,
    min: Double,
    range: js.Tuple2[Double, Double],
    raw: String
  ): typingsJapgolly.regjsparser.mod.Quantifier[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("quantifier")
    __obj.asInstanceOf[typingsJapgolly.regjsparser.mod.Quantifier[F]]
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
