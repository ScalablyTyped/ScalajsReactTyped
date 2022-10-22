package typingsJapgolly.recoil.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasToJSON extends StObject {
  
  def toJSON(): SerializableParam
}
object HasToJSON {
  
  inline def apply(toJSON: CallbackTo[SerializableParam]): HasToJSON = {
    val __obj = js.Dynamic.literal(toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[HasToJSON]
  }
  
  extension [Self <: HasToJSON](x: Self) {
    
    inline def setToJSON(value: CallbackTo[SerializableParam]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
