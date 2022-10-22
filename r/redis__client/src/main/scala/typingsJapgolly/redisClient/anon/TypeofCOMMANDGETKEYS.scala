package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCOMMANDGETKEYS extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(args: js.Array[RedisCommandArgument]): RedisCommandArguments
  
  def transformReply(): js.Array[RedisCommandArgument]
}
object TypeofCOMMANDGETKEYS {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: js.Array[RedisCommandArgument] => RedisCommandArguments,
    transformReply: CallbackTo[js.Array[RedisCommandArgument]]
  ): TypeofCOMMANDGETKEYS = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofCOMMANDGETKEYS]
  }
  
  extension [Self <: TypeofCOMMANDGETKEYS](x: Self) {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: js.Array[RedisCommandArgument] => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[js.Array[RedisCommandArgument]]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
