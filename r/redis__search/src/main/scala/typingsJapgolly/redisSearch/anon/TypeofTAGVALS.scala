package typingsJapgolly.redisSearch.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTAGVALS extends StObject {
  
  def transformArguments(index: String, fieldName: String): js.Array[String]
  
  def transformReply(): js.Array[String]
}
object TypeofTAGVALS {
  
  inline def apply(
    transformArguments: (String, String) => js.Array[String],
    transformReply: CallbackTo[js.Array[String]]
  ): TypeofTAGVALS = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofTAGVALS]
  }
  
  extension [Self <: TypeofTAGVALS](x: Self) {
    
    inline def setTransformArguments(value: (String, String) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
