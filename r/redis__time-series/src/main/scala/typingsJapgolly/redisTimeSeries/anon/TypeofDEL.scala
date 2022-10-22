package typingsJapgolly.redisTimeSeries.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisTimeSeries.distCommandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDEL extends StObject {
  
  val FIRTS_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: String, fromTimestamp: Timestamp, toTimestamp: Timestamp): RedisCommandArguments
  
  def transformReply(): Double
}
object TypeofDEL {
  
  inline def apply(
    FIRTS_KEY_INDEX: /* 1 */ Double,
    transformArguments: (String, Timestamp, Timestamp) => RedisCommandArguments,
    transformReply: CallbackTo[Double]
  ): TypeofDEL = {
    val __obj = js.Dynamic.literal(FIRTS_KEY_INDEX = FIRTS_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofDEL]
  }
  
  extension [Self <: TypeofDEL](x: Self) {
    
    inline def setFIRTS_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRTS_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (String, Timestamp, Timestamp) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
    
    inline def setTransformReply(value: CallbackTo[Double]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
