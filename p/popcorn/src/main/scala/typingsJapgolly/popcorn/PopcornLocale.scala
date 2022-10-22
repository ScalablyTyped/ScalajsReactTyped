package typingsJapgolly.popcorn

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopcornLocale extends StObject {
  
  def get(): String
  
  def set(langRegion: String): Any
}
object PopcornLocale {
  
  inline def apply(get: CallbackTo[String], set: String => Any): PopcornLocale = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[PopcornLocale]
  }
  
  extension [Self <: PopcornLocale](x: Self) {
    
    inline def setGet(value: CallbackTo[String]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setSet(value: String => Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
