package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Excludeattachments]
}
object `49` {
  
  inline def apply(applicationSlashjson: js.Array[Excludeattachments]): `49` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`49`]
  }
  
  extension [Self <: `49`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Excludeattachments]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Excludeattachments*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
