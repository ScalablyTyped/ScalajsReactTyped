package typingsJapgolly.regexpTree.astMod

import typingsJapgolly.regexpTree.regexpTreeStrings.Asterisk
import typingsJapgolly.regexpTree.regexpTreeStrings.Plussign
import typingsJapgolly.regexpTree.regexpTreeStrings.Questionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleQuantifier
  extends StObject
     with Base[typingsJapgolly.regexpTree.regexpTreeStrings.Quantifier]
     with Quantifier {
  
  var greedy: Boolean
  
  var kind: Plussign | Asterisk | Questionmark
}
object SimpleQuantifier {
  
  inline def apply(greedy: Boolean, kind: Plussign | Asterisk | Questionmark): SimpleQuantifier = {
    val __obj = js.Dynamic.literal(greedy = greedy.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Quantifier")
    __obj.asInstanceOf[SimpleQuantifier]
  }
  
  extension [Self <: SimpleQuantifier](x: Self) {
    
    inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Plussign | Asterisk | Questionmark): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
