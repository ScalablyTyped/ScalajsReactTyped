package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Parent]
}
object `47` {
  
  inline def apply(applicationSlashjson: js.Array[Parent]): `47` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Parent]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Parent*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
