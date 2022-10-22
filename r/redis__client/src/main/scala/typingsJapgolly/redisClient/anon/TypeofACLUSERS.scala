package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofACLUSERS extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(): js.Array[RedisCommandArgument]
}
object TypeofACLUSERS {
  
  inline def apply(
    transformArguments: CallbackTo[RedisCommandArguments],
    transformReply: CallbackTo[js.Array[RedisCommandArgument]]
  ): TypeofACLUSERS = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofACLUSERS]
  }
  
  extension [Self <: TypeofACLUSERS](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[RedisCommandArguments]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: CallbackTo[js.Array[RedisCommandArgument]]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
