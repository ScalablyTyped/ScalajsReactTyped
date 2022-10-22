package typingsJapgolly.jexl.anon

import typingsJapgolly.jexl.grammarMod.Element
import typingsJapgolly.jexl.jexlStrings.closeBracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with Element {
  
  var `type`: closeBracket
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("closeBracket")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setType(value: closeBracket): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
