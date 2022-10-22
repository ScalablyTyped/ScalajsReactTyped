package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofACLDRYRUN extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(username: RedisCommandArgument, command: js.Array[RedisCommandArgument]): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument
}
object TypeofACLDRYRUN {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: (RedisCommandArgument, js.Array[RedisCommandArgument]) => RedisCommandArguments,
    transformReply: CallbackTo[RedisCommandArgument]
  ): TypeofACLDRYRUN = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofACLDRYRUN]
  }
  
  extension [Self <: TypeofACLDRYRUN](x: Self) {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, js.Array[RedisCommandArgument]) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: CallbackTo[RedisCommandArgument]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
