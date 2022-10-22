package typingsJapgolly.reactNativePaper.anon

import typingsJapgolly.reactNativePaper.reactNativePaperStrings.checked
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextValue extends StObject {
  
  var contextValue: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[checked | unchecked] = js.undefined
  
  var value: String
}
object ContextValue {
  
  inline def apply(value: String): ContextValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextValue]
  }
  
  extension [Self <: ContextValue](x: Self) {
    
    inline def setContextValue(value: String): Self = StObject.set(x, "contextValue", value.asInstanceOf[js.Any])
    
    inline def setContextValueUndefined: Self = StObject.set(x, "contextValue", js.undefined)
    
    inline def setStatus(value: checked | unchecked): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
