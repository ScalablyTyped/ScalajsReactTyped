package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsClusterLINKSMod.ClusterLinksRawReply
import typingsJapgolly.redisClient.distLibCommandsClusterLINKSMod.ClusterLinksReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERLINKS extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(reply: ClusterLinksRawReply): ClusterLinksReply
}
object TypeofCLUSTERLINKS {
  
  inline def apply(
    transformArguments: CallbackTo[js.Array[String]],
    transformReply: ClusterLinksRawReply => ClusterLinksReply
  ): TypeofCLUSTERLINKS = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERLINKS]
  }
  
  extension [Self <: TypeofCLUSTERLINKS](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: ClusterLinksRawReply => ClusterLinksReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
