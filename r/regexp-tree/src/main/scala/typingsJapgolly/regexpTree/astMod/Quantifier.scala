package typingsJapgolly.regexpTree.astMod

import typingsJapgolly.regexpTree.regexpTreeStrings.Asterisk
import typingsJapgolly.regexpTree.regexpTreeStrings.Plussign
import typingsJapgolly.regexpTree.regexpTreeStrings.Questionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.regexpTree.astMod.SimpleQuantifier
  - typingsJapgolly.regexpTree.astMod.RangeQuantifier
*/
trait Quantifier extends StObject
object Quantifier {
  
  inline def RangeQuantifier(from: Double, greedy: Boolean): typingsJapgolly.regexpTree.astMod.RangeQuantifier = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], kind = "Range")
    __obj.updateDynamic("type")("Quantifier")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.RangeQuantifier]
  }
  
  inline def SimpleQuantifier(greedy: Boolean, kind: Plussign | Asterisk | Questionmark): typingsJapgolly.regexpTree.astMod.SimpleQuantifier = {
    val __obj = js.Dynamic.literal(greedy = greedy.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Quantifier")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.SimpleQuantifier]
  }
}
