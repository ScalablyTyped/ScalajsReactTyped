package typingsJapgolly.jexl.anon

import typingsJapgolly.jexl.grammarMod.Element
import typingsJapgolly.jexl.jexlStrings.dot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with Element {
  
  var `type`: dot
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dot")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setType(value: dot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
