package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLATENCYDOCTOR extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): String
}
object TypeofLATENCYDOCTOR {
  
  inline def apply(transformArguments: CallbackTo[js.Array[String]], transformReply: CallbackTo[String]): TypeofLATENCYDOCTOR = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofLATENCYDOCTOR]
  }
  
  extension [Self <: TypeofLATENCYDOCTOR](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: CallbackTo[String]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
