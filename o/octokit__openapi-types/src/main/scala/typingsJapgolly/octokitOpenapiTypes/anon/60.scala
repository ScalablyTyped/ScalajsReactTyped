package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Discussionurl]
}
object `60` {
  
  inline def apply(applicationSlashjson: js.Array[Discussionurl]): `60` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`60`]
  }
  
  extension [Self <: `60`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Discussionurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Discussionurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
