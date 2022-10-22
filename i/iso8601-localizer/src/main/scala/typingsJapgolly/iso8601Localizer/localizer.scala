package typingsJapgolly.iso8601Localizer

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait localizer extends StObject {
  
  def localize(): String
  
  def returnAs(as: String): localizer
  
  def to(offset: Double): localizer
}
object localizer {
  
  inline def apply(localize: CallbackTo[String], returnAs: String => localizer, to: Double => localizer): localizer = {
    val __obj = js.Dynamic.literal(localize = localize.toJsFn, returnAs = js.Any.fromFunction1(returnAs), to = js.Any.fromFunction1(to))
    __obj.asInstanceOf[localizer]
  }
  
  extension [Self <: localizer](x: Self) {
    
    inline def setLocalize(value: CallbackTo[String]): Self = StObject.set(x, "localize", value.toJsFn)
    
    inline def setReturnAs(value: String => localizer): Self = StObject.set(x, "returnAs", js.Any.fromFunction1(value))
    
    inline def setTo(value: Double => localizer): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
  }
}
