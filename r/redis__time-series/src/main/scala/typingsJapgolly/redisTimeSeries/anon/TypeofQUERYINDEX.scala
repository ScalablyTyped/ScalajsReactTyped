package typingsJapgolly.redisTimeSeries.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisTimeSeries.distCommandsMod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofQUERYINDEX extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(filter: Filter): RedisCommandArguments
  
  def transformReply(): js.Array[String]
}
object TypeofQUERYINDEX {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: Filter => RedisCommandArguments,
    transformReply: CallbackTo[js.Array[String]]
  ): TypeofQUERYINDEX = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofQUERYINDEX]
  }
  
  extension [Self <: TypeofQUERYINDEX](x: Self) {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: Filter => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
