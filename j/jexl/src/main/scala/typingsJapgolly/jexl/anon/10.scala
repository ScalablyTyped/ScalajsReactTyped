package typingsJapgolly.jexl.anon

import typingsJapgolly.jexl.grammarMod.Element
import typingsJapgolly.jexl.jexlStrings.question
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10`
  extends StObject
     with Element {
  
  var `type`: question
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("question")
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setType(value: question): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
