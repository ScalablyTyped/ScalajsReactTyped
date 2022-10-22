package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofACLLOGRESET extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument
}
object TypeofACLLOGRESET {
  
  inline def apply(
    transformArguments: CallbackTo[RedisCommandArguments],
    transformReply: CallbackTo[RedisCommandArgument]
  ): TypeofACLLOGRESET = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofACLLOGRESET]
  }
  
  extension [Self <: TypeofACLLOGRESET](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[RedisCommandArguments]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: CallbackTo[RedisCommandArgument]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
