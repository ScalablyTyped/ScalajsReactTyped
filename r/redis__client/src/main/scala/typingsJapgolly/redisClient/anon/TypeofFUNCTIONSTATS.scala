package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsFunctionSTATSMod.FunctionStatsRawReply
import typingsJapgolly.redisClient.distLibCommandsFunctionSTATSMod.FunctionStatsReply
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFUNCTIONSTATS extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(reply: FunctionStatsRawReply): FunctionStatsReply
}
object TypeofFUNCTIONSTATS {
  
  inline def apply(
    transformArguments: CallbackTo[RedisCommandArguments],
    transformReply: FunctionStatsRawReply => FunctionStatsReply
  ): TypeofFUNCTIONSTATS = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofFUNCTIONSTATS]
  }
  
  extension [Self <: TypeofFUNCTIONSTATS](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[RedisCommandArguments]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: FunctionStatsRawReply => FunctionStatsReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
