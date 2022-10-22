package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.distLibCommandsXinfoSTREAMMod.XInfoStreamReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofXINFOSTREAM extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(key: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(rawReply: js.Array[Any]): XInfoStreamReply
}
object TypeofXINFOSTREAM {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 2 */ Double,
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: RedisCommandArgument => RedisCommandArguments,
    transformReply: js.Array[Any] => XInfoStreamReply
  ): TypeofXINFOSTREAM = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofXINFOSTREAM]
  }
  
  extension [Self <: TypeofXINFOSTREAM](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 2 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: RedisCommandArgument => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: js.Array[Any] => XInfoStreamReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
