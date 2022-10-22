package typingsJapgolly.toTitleCaseGouch

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String extends StObject {
  
  def toTitleCase(): java.lang.String
}
object String {
  
  inline def apply(toTitleCase: CallbackTo[java.lang.String]): String = {
    val __obj = js.Dynamic.literal(toTitleCase = toTitleCase.toJsFn)
    __obj.asInstanceOf[String]
  }
  
  extension [Self <: String](x: Self) {
    
    inline def setToTitleCase(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "toTitleCase", value.toJsFn)
  }
}
