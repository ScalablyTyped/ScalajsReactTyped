package typingsJapgolly.detox.anon

import typingsJapgolly.detox.mod.global.Detox.IosElementAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elements extends StObject {
  
  var elements: js.Array[IosElementAttributes]
}
object Elements {
  
  inline def apply(elements: js.Array[IosElementAttributes]): Elements = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  
  extension [Self <: Elements](x: Self) {
    
    inline def setElements(value: js.Array[IosElementAttributes]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: IosElementAttributes*): Self = StObject.set(x, "elements", js.Array(value*))
  }
}
