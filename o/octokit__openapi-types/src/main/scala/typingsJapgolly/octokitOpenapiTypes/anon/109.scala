package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Followingurl]
}
object `109` {
  
  inline def apply(applicationSlashjson: js.Array[Followingurl]): `109` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`109`]
  }
  
  extension [Self <: `109`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Followingurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Followingurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
