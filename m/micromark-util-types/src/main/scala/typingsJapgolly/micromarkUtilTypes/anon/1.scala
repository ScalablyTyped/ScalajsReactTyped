package typingsJapgolly.micromarkUtilTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var `null`: js.UndefOr[js.Array[PickConstructresolveAll]] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setNull(value: js.Array[PickConstructresolveAll]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
    
    inline def setNullVarargs(value: PickConstructresolveAll*): Self = StObject.set(x, "null", js.Array(value*))
  }
}
