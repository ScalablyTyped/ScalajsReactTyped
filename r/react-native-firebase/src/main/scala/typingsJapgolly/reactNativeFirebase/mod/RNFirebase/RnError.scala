package typingsJapgolly.reactNativeFirebase.mod.RNFirebase

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RnError
  extends StObject
     with Error {
  
  var code: js.UndefOr[String] = js.undefined
}
object RnError {
  
  inline def apply(message: String, name: String): RnError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RnError]
  }
  
  extension [Self <: RnError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
