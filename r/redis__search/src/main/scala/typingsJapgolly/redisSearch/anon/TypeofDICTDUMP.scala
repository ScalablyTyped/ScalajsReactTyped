package typingsJapgolly.redisSearch.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDICTDUMP extends StObject {
  
  def transformArguments(dictionary: String): js.Array[String]
  
  def transformReply(): js.Array[String]
}
object TypeofDICTDUMP {
  
  inline def apply(transformArguments: String => js.Array[String], transformReply: CallbackTo[js.Array[String]]): TypeofDICTDUMP = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofDICTDUMP]
  }
  
  extension [Self <: TypeofDICTDUMP](x: Self) {
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
