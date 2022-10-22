package typingsJapgolly.rcFieldForm.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rcFieldForm.esInterfaceMod.ValidateMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: js.UndefOr[ValidateMessage] = js.undefined
  
  var invalid: js.UndefOr[ValidateMessage] = js.undefined
  
  var parse: js.UndefOr[ValidateMessage] = js.undefined
}
object Format {
  
  inline def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setFormat(value: ValidateMessage): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "format", value.toJsFn)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInvalid(value: ValidateMessage): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "invalid", value.toJsFn)
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setParse(value: ValidateMessage): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "parse", value.toJsFn)
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
  }
}
