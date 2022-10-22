package typingsJapgolly.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait v2ObjectParam[Custom /* <: ObjectCustom */] extends StObject {
  
  var custom: js.UndefOr[Custom] = js.undefined
}
object v2ObjectParam {
  
  inline def apply[Custom /* <: ObjectCustom */](): v2ObjectParam[Custom] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[v2ObjectParam[Custom]]
  }
  
  extension [Self <: v2ObjectParam[?], Custom /* <: ObjectCustom */](x: Self & v2ObjectParam[Custom]) {
    
    inline def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
  }
}
