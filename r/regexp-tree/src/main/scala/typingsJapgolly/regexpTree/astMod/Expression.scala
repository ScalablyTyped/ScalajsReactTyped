package typingsJapgolly.regexpTree.astMod

import typingsJapgolly.regexpTree.regexpTreeStrings.$
import typingsJapgolly.regexpTree.regexpTreeStrings.Lookahead
import typingsJapgolly.regexpTree.regexpTreeStrings.Lookbehind
import typingsJapgolly.regexpTree.regexpTreeStrings.^
import typingsJapgolly.regexpTree.regexpTreeStrings.control
import typingsJapgolly.regexpTree.regexpTreeStrings.decimal
import typingsJapgolly.regexpTree.regexpTreeStrings.hex
import typingsJapgolly.regexpTree.regexpTreeStrings.meta
import typingsJapgolly.regexpTree.regexpTreeStrings.oct
import typingsJapgolly.regexpTree.regexpTreeStrings.unicode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.regexpTree.astMod.Char
  - typingsJapgolly.regexpTree.astMod.CharacterClass
  - typingsJapgolly.regexpTree.astMod.Alternative
  - typingsJapgolly.regexpTree.astMod.Disjunction
  - typingsJapgolly.regexpTree.astMod.Group
  - typingsJapgolly.regexpTree.astMod.Backreference
  - typingsJapgolly.regexpTree.astMod.Repetition
  - typingsJapgolly.regexpTree.astMod.Assertion
*/
trait Expression extends StObject
object Expression {
  
  inline def Alternative(expressions: js.Array[Expression]): typingsJapgolly.regexpTree.astMod.Alternative = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Alternative")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.Alternative]
  }
  
  inline def CapturingGroup(number: Double): typingsJapgolly.regexpTree.astMod.CapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = true, number = number.asInstanceOf[js.Any], expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.CapturingGroup]
  }
  
  inline def CharacterClass(expressions: js.Array[Char | ClassRange]): typingsJapgolly.regexpTree.astMod.CharacterClass = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterClass")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.CharacterClass]
  }
  
  inline def Disjunction(): typingsJapgolly.regexpTree.astMod.Disjunction = {
    val __obj = js.Dynamic.literal(left = null, right = null)
    __obj.updateDynamic("type")("Disjunction")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.Disjunction]
  }
  
  inline def LookaroundAssertion(kind: Lookahead | Lookbehind): typingsJapgolly.regexpTree.astMod.LookaroundAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], assertion = null)
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.LookaroundAssertion]
  }
  
  inline def NamedBackreference(number: Double, reference: String, referenceRaw: String): typingsJapgolly.regexpTree.astMod.NamedBackreference = {
    val __obj = js.Dynamic.literal(kind = "name", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], referenceRaw = referenceRaw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.NamedBackreference]
  }
  
  inline def NoncapturingGroup(): typingsJapgolly.regexpTree.astMod.NoncapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = false, expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.NoncapturingGroup]
  }
  
  inline def NumericBackreference(number: Double, reference: Double): typingsJapgolly.regexpTree.astMod.NumericBackreference = {
    val __obj = js.Dynamic.literal(kind = "number", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.NumericBackreference]
  }
  
  inline def Repetition(expression: Expression, quantifier: Quantifier): typingsJapgolly.regexpTree.astMod.Repetition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Repetition")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.Repetition]
  }
  
  inline def SimpleAssertion(kind: ^ | $ | (/* \b */ String)): typingsJapgolly.regexpTree.astMod.SimpleAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.SimpleAssertion]
  }
  
  inline def SimpleChar(codePoint: Double, value: String): typingsJapgolly.regexpTree.astMod.SimpleChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = "simple", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.SimpleChar]
  }
  
  inline def SpecialChar(codePoint: Double, kind: meta | control | hex | decimal | oct | unicode, value: String): typingsJapgolly.regexpTree.astMod.SpecialChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.SpecialChar]
  }
}
