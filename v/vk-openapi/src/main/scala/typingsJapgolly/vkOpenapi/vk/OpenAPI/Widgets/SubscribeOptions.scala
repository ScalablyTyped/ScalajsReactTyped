package typingsJapgolly.vkOpenapi.vk.OpenAPI.Widgets

import typingsJapgolly.vkOpenapi.vk.OpenAPI.NumericBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeOptions extends StObject {
  
  var mode: js.UndefOr[NumericBoolean] = js.undefined
  
  var soft: js.UndefOr[NumericBoolean] = js.undefined
}
object SubscribeOptions {
  
  inline def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  
  extension [Self <: SubscribeOptions](x: Self) {
    
    inline def setMode(value: NumericBoolean): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSoft(value: NumericBoolean): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
    
    inline def setSoftUndefined: Self = StObject.set(x, "soft", js.undefined)
  }
}
