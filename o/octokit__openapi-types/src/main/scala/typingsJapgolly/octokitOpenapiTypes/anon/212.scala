package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `212` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Organizationurl]
}
object `212` {
  
  inline def apply(applicationSlashjson: js.Array[Organizationurl]): `212` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`212`]
  }
  
  extension [Self <: `212`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Organizationurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Organizationurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
