package typingsJapgolly.arcgisJsApi.anon

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var `type`: group
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
