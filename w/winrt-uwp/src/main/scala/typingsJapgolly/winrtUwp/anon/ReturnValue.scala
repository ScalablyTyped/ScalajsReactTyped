package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.Foundation.IWwwFormUrlDecoderEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnValue extends StObject {
  
  /** The name-value pairs. */ var items: IWwwFormUrlDecoderEntry
  
  /** The number of name-value pairs in items. */ var returnValue: Double
}
object ReturnValue {
  
  inline def apply(items: IWwwFormUrlDecoderEntry, returnValue: Double): ReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue]
  }
  
  extension [Self <: ReturnValue](x: Self) {
    
    inline def setItems(value: IWwwFormUrlDecoderEntry): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
