package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `102` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Fixedat]
}
object `102` {
  
  inline def apply(applicationSlashjson: js.Array[Fixedat]): `102` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`102`]
  }
  
  extension [Self <: `102`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Fixedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Fixedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
