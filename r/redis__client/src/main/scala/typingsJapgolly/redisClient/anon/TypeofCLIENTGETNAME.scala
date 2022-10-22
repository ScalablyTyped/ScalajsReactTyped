package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLIENTGETNAME extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(): String | Null
}
object TypeofCLIENTGETNAME {
  
  inline def apply(transformArguments: CallbackTo[RedisCommandArguments], transformReply: CallbackTo[String | Null]): TypeofCLIENTGETNAME = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofCLIENTGETNAME]
  }
  
  extension [Self <: TypeofCLIENTGETNAME](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[RedisCommandArguments]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: CallbackTo[String | Null]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
