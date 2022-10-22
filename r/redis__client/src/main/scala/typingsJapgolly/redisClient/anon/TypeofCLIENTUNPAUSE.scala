package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLIENTUNPAUSE extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(): OK | Buffer
}
object TypeofCLIENTUNPAUSE {
  
  inline def apply(transformArguments: CallbackTo[RedisCommandArguments], transformReply: CallbackTo[OK | Buffer]): TypeofCLIENTUNPAUSE = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofCLIENTUNPAUSE]
  }
  
  extension [Self <: TypeofCLIENTUNPAUSE](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[RedisCommandArguments]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: CallbackTo[OK | Buffer]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
