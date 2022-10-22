package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSMISMEMBER extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: RedisCommandArgument, members: js.Array[RedisCommandArgument]): RedisCommandArguments
  
  def transformReply(reply: js.Array[Double]): js.Array[Boolean]
}
object TypeofSMISMEMBER {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, js.Array[RedisCommandArgument]) => RedisCommandArguments,
    transformReply: js.Array[Double] => js.Array[Boolean]
  ): TypeofSMISMEMBER = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofSMISMEMBER]
  }
  
  extension [Self <: TypeofSMISMEMBER](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, js.Array[RedisCommandArgument]) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: js.Array[Double] => js.Array[Boolean]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
