package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Stats]
}
object `111` {
  
  inline def apply(applicationSlashjson: js.Array[Stats]): `111` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`111`]
  }
  
  extension [Self <: `111`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Stats]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Stats*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
