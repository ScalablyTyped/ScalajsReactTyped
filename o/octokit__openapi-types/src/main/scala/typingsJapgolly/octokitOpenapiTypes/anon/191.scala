package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Referrer]
}
object `191` {
  
  inline def apply(applicationSlashjson: js.Array[Referrer]): `191` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`191`]
  }
  
  extension [Self <: `191`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Referrer]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Referrer*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
