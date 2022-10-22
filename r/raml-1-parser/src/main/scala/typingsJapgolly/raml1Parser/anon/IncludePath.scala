package typingsJapgolly.raml1Parser.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludePath extends StObject {
  
  def includePath(): java.lang.String
}
object IncludePath {
  
  inline def apply(includePath: CallbackTo[java.lang.String]): IncludePath = {
    val __obj = js.Dynamic.literal(includePath = includePath.toJsFn)
    __obj.asInstanceOf[IncludePath]
  }
  
  extension [Self <: IncludePath](x: Self) {
    
    inline def setIncludePath(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "includePath", value.toJsFn)
  }
}
