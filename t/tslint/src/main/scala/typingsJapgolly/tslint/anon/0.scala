package typingsJapgolly.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var options: js.Array[Callsignature]
}
object `0` {
  
  inline def apply(options: js.Array[Callsignature]): `0` = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setOptions(value: js.Array[Callsignature]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Callsignature*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
