package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Uploader]
}
object `105` {
  
  inline def apply(applicationSlashjson: js.Array[Uploader]): `105` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`105`]
  }
  
  extension [Self <: `105`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Uploader]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Uploader*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
