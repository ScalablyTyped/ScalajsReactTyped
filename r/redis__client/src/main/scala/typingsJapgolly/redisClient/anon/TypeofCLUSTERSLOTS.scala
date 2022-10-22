package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsClusterSLOTSMod.ClusterSlotsRawReply
import typingsJapgolly.redisClient.distLibCommandsClusterSLOTSMod.ClusterSlotsReply
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERSLOTS extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(reply: ClusterSlotsRawReply): ClusterSlotsReply
}
object TypeofCLUSTERSLOTS {
  
  inline def apply(
    transformArguments: CallbackTo[RedisCommandArguments],
    transformReply: ClusterSlotsRawReply => ClusterSlotsReply
  ): TypeofCLUSTERSLOTS = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERSLOTS]
  }
  
  extension [Self <: TypeofCLUSTERSLOTS](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[RedisCommandArguments]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: ClusterSlotsRawReply => ClusterSlotsReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
