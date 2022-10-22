package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsClientTRACKINGINFOMod.RawReply
import typingsJapgolly.redisClient.distLibCommandsClientTRACKINGINFOMod.Reply
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLIENTTRACKINGINFO extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(reply: RawReply): Reply
}
object TypeofCLIENTTRACKINGINFO {
  
  inline def apply(transformArguments: CallbackTo[RedisCommandArguments], transformReply: RawReply => Reply): TypeofCLIENTTRACKINGINFO = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLIENTTRACKINGINFO]
  }
  
  extension [Self <: TypeofCLIENTTRACKINGINFO](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[RedisCommandArguments]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: RawReply => Reply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
