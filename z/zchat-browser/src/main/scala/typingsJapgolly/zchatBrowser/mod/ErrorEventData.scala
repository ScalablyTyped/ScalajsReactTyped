package typingsJapgolly.zchatBrowser.mod

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorEventData
  extends StObject
     with Error {
  
  var context: String
  
  var extra: js.UndefOr[Any] = js.undefined
}
object ErrorEventData {
  
  inline def apply(context: String, message: String, name: String): ErrorEventData = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventData]
  }
  
  extension [Self <: ErrorEventData](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
  }
}
