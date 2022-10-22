package typingsJapgolly.bson.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdLike extends StObject {
  
  var __id: js.UndefOr[String] = js.undefined
  
  var id: String | Buffer
  
  def toHexString(): String
}
object ObjectIdLike {
  
  inline def apply(id: String | Buffer, toHexString: CallbackTo[String]): ObjectIdLike = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], toHexString = toHexString.toJsFn)
    __obj.asInstanceOf[ObjectIdLike]
  }
  
  extension [Self <: ObjectIdLike](x: Self) {
    
    inline def setId(value: String | Buffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setToHexString(value: CallbackTo[String]): Self = StObject.set(x, "toHexString", value.toJsFn)
    
    inline def set__id(value: String): Self = StObject.set(x, "__id", value.asInstanceOf[js.Any])
    
    inline def set__idUndefined: Self = StObject.set(x, "__id", js.undefined)
  }
}
