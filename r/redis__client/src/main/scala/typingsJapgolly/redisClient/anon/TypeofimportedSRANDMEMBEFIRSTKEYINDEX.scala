package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedSRANDMEMBEFIRSTKEYINDEX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument | Null
}
object TypeofimportedSRANDMEMBEFIRSTKEYINDEX {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: RedisCommandArgument => RedisCommandArguments,
    transformReply: CallbackTo[RedisCommandArgument | Null]
  ): TypeofimportedSRANDMEMBEFIRSTKEYINDEX = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofimportedSRANDMEMBEFIRSTKEYINDEX]
  }
  
  extension [Self <: TypeofimportedSRANDMEMBEFIRSTKEYINDEX](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: RedisCommandArgument => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[RedisCommandArgument | Null]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
