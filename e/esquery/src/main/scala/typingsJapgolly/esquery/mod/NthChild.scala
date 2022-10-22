package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.`nth-child`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NthChild
  extends StObject
     with NthSelectorAtom
     with NthSelector
     with Selector {
  
  @JSName("type")
  var type_NthChild: `nth-child`
}
object NthChild {
  
  inline def apply(index: NumericLiteral): NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-child")
    __obj.asInstanceOf[NthChild]
  }
  
  extension [Self <: NthChild](x: Self) {
    
    inline def setType(value: `nth-child`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
