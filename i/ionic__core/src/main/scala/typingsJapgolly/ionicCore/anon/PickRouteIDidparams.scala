package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ionic/core.@ionic/core/dist/types/components/router/utils/interface.RouteID, 'id' | 'params'> */
trait PickRouteIDidparams extends StObject {
  
  var id: String
  
  var params: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object PickRouteIDidparams {
  
  inline def apply(id: String): PickRouteIDidparams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRouteIDidparams]
  }
  
  extension [Self <: PickRouteIDidparams](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
