package typingsJapgolly.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUniformParser extends StObject {
  
  def code(name: String, uniform: Any): String
  
  var codeUbo: js.UndefOr[js.Function2[/* name */ String, /* uniform */ Any, String]] = js.undefined
  
  def test(data: Any, uniform: Any): Boolean
}
object IUniformParser {
  
  inline def apply(code: (String, Any) => String, test: (Any, Any) => Boolean): IUniformParser = {
    val __obj = js.Dynamic.literal(code = js.Any.fromFunction2(code), test = js.Any.fromFunction2(test))
    __obj.asInstanceOf[IUniformParser]
  }
  
  extension [Self <: IUniformParser](x: Self) {
    
    inline def setCode(value: (String, Any) => String): Self = StObject.set(x, "code", js.Any.fromFunction2(value))
    
    inline def setCodeUbo(value: (/* name */ String, /* uniform */ Any) => String): Self = StObject.set(x, "codeUbo", js.Any.fromFunction2(value))
    
    inline def setCodeUboUndefined: Self = StObject.set(x, "codeUbo", js.undefined)
    
    inline def setTest(value: (Any, Any) => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction2(value))
  }
}
