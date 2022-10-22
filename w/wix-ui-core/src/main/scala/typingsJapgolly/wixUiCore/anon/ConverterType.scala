package typingsJapgolly.wixUiCore.anon

import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.Handler
import typingsJapgolly.wixUiCore.distEsSrcComponentsAddressInputAddressInputMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConverterType extends StObject {
  
  var converterType: Converter
  
  var handler: Handler
  
  var lang: String
  
  var locale: String
  
  var required: Boolean
  
  var throttleInterval: Double
}
object ConverterType {
  
  inline def apply(
    converterType: Converter,
    handler: Handler,
    lang: String,
    locale: String,
    required: Boolean,
    throttleInterval: Double
  ): ConverterType = {
    val __obj = js.Dynamic.literal(converterType = converterType.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], throttleInterval = throttleInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterType]
  }
  
  extension [Self <: ConverterType](x: Self) {
    
    inline def setConverterType(value: Converter): Self = StObject.set(x, "converterType", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setThrottleInterval(value: Double): Self = StObject.set(x, "throttleInterval", value.asInstanceOf[js.Any])
  }
}
