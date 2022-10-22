package typingsJapgolly.mangopay2NodejsSdk.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToJSON extends StObject {
  
  def toJSON(): Any
}
object ToJSON {
  
  inline def apply(toJSON: CallbackTo[Any]): ToJSON = {
    val __obj = js.Dynamic.literal(toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[ToJSON]
  }
  
  extension [Self <: ToJSON](x: Self) {
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
