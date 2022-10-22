package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsClientINFOMod.ClientInfoReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLIENTINFO extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(reply: String): ClientInfoReply
}
object TypeofCLIENTINFO {
  
  inline def apply(transformArguments: CallbackTo[js.Array[String]], transformReply: String => ClientInfoReply): TypeofCLIENTINFO = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLIENTINFO]
  }
  
  extension [Self <: TypeofCLIENTINFO](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: String => ClientInfoReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
