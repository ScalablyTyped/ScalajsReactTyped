package typingsJapgolly.jqueryUrlparam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def urlParam(variable: String): String
}
object JQueryStatic {
  
  inline def apply(urlParam: String => String): JQueryStatic = {
    val __obj = js.Dynamic.literal(urlParam = js.Any.fromFunction1(urlParam))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setUrlParam(value: String => String): Self = StObject.set(x, "urlParam", js.Any.fromFunction1(value))
  }
}
