package typingsJapgolly.aframe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse extends StObject {
  
  def parse(value: String): js.Object
  
  def stringify(data: js.Object): String
}
object Parse {
  
  inline def apply(parse: String => js.Object, stringify: js.Object => String): Parse = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[Parse]
  }
  
  extension [Self <: Parse](x: Self) {
    
    inline def setParse(value: String => js.Object): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setStringify(value: js.Object => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
  }
}
