package typingsJapgolly.googleLibphonenumber.libphonenumber

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsYouTypeFormatter extends StObject {
  
  def clear(): Unit
  
  def inputDigit(digit: String): String
}
object AsYouTypeFormatter {
  
  inline def apply(clear: Callback, inputDigit: String => String): AsYouTypeFormatter = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, inputDigit = js.Any.fromFunction1(inputDigit))
    __obj.asInstanceOf[AsYouTypeFormatter]
  }
  
  extension [Self <: AsYouTypeFormatter](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setInputDigit(value: String => String): Self = StObject.set(x, "inputDigit", js.Any.fromFunction1(value))
  }
}
