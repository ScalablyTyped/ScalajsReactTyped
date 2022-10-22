package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorWithCode
  extends StObject
     with Error {
  
  val code: js.UndefOr[String] = js.undefined
}
object ErrorWithCode {
  
  inline def apply(message: String, name: String): ErrorWithCode = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorWithCode]
  }
  
  extension [Self <: ErrorWithCode](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
