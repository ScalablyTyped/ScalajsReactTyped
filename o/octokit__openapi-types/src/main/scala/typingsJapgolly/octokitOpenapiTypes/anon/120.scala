package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Changetype]
}
object `120` {
  
  inline def apply(applicationSlashjson: js.Array[Changetype]): `120` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`120`]
  }
  
  extension [Self <: `120`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Changetype]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Changetype*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
