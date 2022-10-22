package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.IdentityArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrString extends StObject {
  
  var array: IdentityArray
  
  var str: String
}
object StrString {
  
  inline def apply(array: IdentityArray, str: String): StrString = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrString]
  }
  
  extension [Self <: StrString](x: Self) {
    
    inline def setArray(value: IdentityArray): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: js.Array[Ds]*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
