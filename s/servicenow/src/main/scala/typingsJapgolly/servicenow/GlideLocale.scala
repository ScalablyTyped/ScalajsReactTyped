package typingsJapgolly.servicenow

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideLocale extends StObject {
  
  def getDecimalSeparator(): String
  
  def getGroupingSeparator(): String
}
object GlideLocale {
  
  inline def apply(getDecimalSeparator: CallbackTo[String], getGroupingSeparator: CallbackTo[String]): GlideLocale = {
    val __obj = js.Dynamic.literal(getDecimalSeparator = getDecimalSeparator.toJsFn, getGroupingSeparator = getGroupingSeparator.toJsFn)
    __obj.asInstanceOf[GlideLocale]
  }
  
  extension [Self <: GlideLocale](x: Self) {
    
    inline def setGetDecimalSeparator(value: CallbackTo[String]): Self = StObject.set(x, "getDecimalSeparator", value.toJsFn)
    
    inline def setGetGroupingSeparator(value: CallbackTo[String]): Self = StObject.set(x, "getGroupingSeparator", value.toJsFn)
  }
}
