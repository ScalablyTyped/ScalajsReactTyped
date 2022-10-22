package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsAuthMod.AuthOptions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAUTH extends StObject {
  
  def transformArguments(hasUsernamePassword: AuthOptions): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument
}
object TypeofAUTH {
  
  inline def apply(
    transformArguments: AuthOptions => RedisCommandArguments,
    transformReply: CallbackTo[RedisCommandArgument]
  ): TypeofAUTH = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofAUTH]
  }
  
  extension [Self <: TypeofAUTH](x: Self) {
    
    inline def setTransformArguments(value: AuthOptions => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[RedisCommandArgument]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
