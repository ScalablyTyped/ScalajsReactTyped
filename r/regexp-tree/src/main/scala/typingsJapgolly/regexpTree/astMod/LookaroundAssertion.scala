package typingsJapgolly.regexpTree.astMod

import typingsJapgolly.regexpTree.regexpTreeBooleans.`true`
import typingsJapgolly.regexpTree.regexpTreeStrings.Lookahead
import typingsJapgolly.regexpTree.regexpTreeStrings.Lookbehind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookaroundAssertion
  extends StObject
     with Base[typingsJapgolly.regexpTree.regexpTreeStrings.Assertion]
     with Assertion {
  
  var assertion: Expression | Null
  
  var kind: Lookahead | Lookbehind
  
  var negative: js.UndefOr[`true`] = js.undefined
}
object LookaroundAssertion {
  
  inline def apply(kind: Lookahead | Lookbehind): LookaroundAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], assertion = null)
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[LookaroundAssertion]
  }
  
  extension [Self <: LookaroundAssertion](x: Self) {
    
    inline def setAssertion(value: Expression): Self = StObject.set(x, "assertion", value.asInstanceOf[js.Any])
    
    inline def setAssertionNull: Self = StObject.set(x, "assertion", null)
    
    inline def setKind(value: Lookahead | Lookbehind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNegative(value: `true`): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
  }
}
