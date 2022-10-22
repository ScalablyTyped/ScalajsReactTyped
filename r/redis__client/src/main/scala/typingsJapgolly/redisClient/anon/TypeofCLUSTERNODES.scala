package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsClusterNODESMod.RedisClusterMasterNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERNODES extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(reply: String): js.Array[RedisClusterMasterNode]
}
object TypeofCLUSTERNODES {
  
  inline def apply(
    transformArguments: CallbackTo[js.Array[String]],
    transformReply: String => js.Array[RedisClusterMasterNode]
  ): TypeofCLUSTERNODES = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERNODES]
  }
  
  extension [Self <: TypeofCLUSTERNODES](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: String => js.Array[RedisClusterMasterNode]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
