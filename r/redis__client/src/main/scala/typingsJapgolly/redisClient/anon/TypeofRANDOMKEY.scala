package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRANDOMKEY extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument | Null
}
object TypeofRANDOMKEY {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: CallbackTo[RedisCommandArguments],
    transformReply: CallbackTo[RedisCommandArgument | Null]
  ): TypeofRANDOMKEY = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = transformArguments.toJsFn, transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofRANDOMKEY]
  }
  
  extension [Self <: TypeofRANDOMKEY](x: Self) {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: CallbackTo[RedisCommandArguments]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: CallbackTo[RedisCommandArgument | Null]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
