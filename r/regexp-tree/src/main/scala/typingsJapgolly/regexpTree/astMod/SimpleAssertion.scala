package typingsJapgolly.regexpTree.astMod

import typingsJapgolly.regexpTree.regexpTreeStrings.$
import typingsJapgolly.regexpTree.regexpTreeStrings.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleAssertion
  extends StObject
     with Base[typingsJapgolly.regexpTree.regexpTreeStrings.Assertion]
     with Assertion {
  
  var kind: ^ | $ | (/* \b */ String)
}
object SimpleAssertion {
  
  inline def apply(kind: ^ | $ | (/* \b */ String)): SimpleAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[SimpleAssertion]
  }
  
  extension [Self <: SimpleAssertion](x: Self) {
    
    inline def setKind(value: ^ | $ | (/* \b */ String)): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
