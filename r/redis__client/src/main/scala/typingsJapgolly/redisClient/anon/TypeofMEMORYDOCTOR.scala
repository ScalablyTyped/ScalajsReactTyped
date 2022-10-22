package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMEMORYDOCTOR extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): String
}
object TypeofMEMORYDOCTOR {
  
  inline def apply(transformArguments: CallbackTo[js.Array[String]], transformReply: CallbackTo[String]): TypeofMEMORYDOCTOR = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofMEMORYDOCTOR]
  }
  
  extension [Self <: TypeofMEMORYDOCTOR](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: CallbackTo[String]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
