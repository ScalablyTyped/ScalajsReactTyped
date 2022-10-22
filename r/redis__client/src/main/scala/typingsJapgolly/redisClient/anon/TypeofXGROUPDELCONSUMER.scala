package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofXGROUPDELCONSUMER extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double
  
  def transformArguments(key: RedisCommandArgument, group: RedisCommandArgument, consumer: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(): Double
}
object TypeofXGROUPDELCONSUMER {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 2 */ Double,
    transformArguments: (RedisCommandArgument, RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments,
    transformReply: CallbackTo[Double]
  ): TypeofXGROUPDELCONSUMER = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofXGROUPDELCONSUMER]
  }
  
  extension [Self <: TypeofXGROUPDELCONSUMER](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 2 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
    
    inline def setTransformReply(value: CallbackTo[Double]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
