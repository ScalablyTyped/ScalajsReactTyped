package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFUNCTIONDELETE extends StObject {
  
  def transformArguments(library: String): RedisCommandArguments
  
  def transformReply(): OK
}
object TypeofFUNCTIONDELETE {
  
  inline def apply(transformArguments: String => RedisCommandArguments, transformReply: CallbackTo[OK]): TypeofFUNCTIONDELETE = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofFUNCTIONDELETE]
  }
  
  extension [Self <: TypeofFUNCTIONDELETE](x: Self) {
    
    inline def setTransformArguments(value: String => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[OK]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
