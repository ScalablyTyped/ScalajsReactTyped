package typingsJapgolly.regexpTree.astMod

import typingsJapgolly.regexpTree.regexpTreeStrings.$
import typingsJapgolly.regexpTree.regexpTreeStrings.Lookahead
import typingsJapgolly.regexpTree.regexpTreeStrings.Lookbehind
import typingsJapgolly.regexpTree.regexpTreeStrings.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.regexpTree.astMod.SimpleAssertion
  - typingsJapgolly.regexpTree.astMod.LookaroundAssertion
*/
trait Assertion
  extends StObject
     with Expression
object Assertion {
  
  inline def LookaroundAssertion(kind: Lookahead | Lookbehind): typingsJapgolly.regexpTree.astMod.LookaroundAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], assertion = null)
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.LookaroundAssertion]
  }
  
  inline def SimpleAssertion(kind: ^ | $ | (/* \b */ String)): typingsJapgolly.regexpTree.astMod.SimpleAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.SimpleAssertion]
  }
}
