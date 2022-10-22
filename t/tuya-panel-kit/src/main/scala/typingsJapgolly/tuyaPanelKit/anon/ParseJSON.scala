package typingsJapgolly.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseJSON extends StObject {
  
  def parseJSON(value: String): js.Object
}
object ParseJSON {
  
  inline def apply(parseJSON: String => js.Object): ParseJSON = {
    val __obj = js.Dynamic.literal(parseJSON = js.Any.fromFunction1(parseJSON))
    __obj.asInstanceOf[ParseJSON]
  }
  
  extension [Self <: ParseJSON](x: Self) {
    
    inline def setParseJSON(value: String => js.Object): Self = StObject.set(x, "parseJSON", js.Any.fromFunction1(value))
  }
}
