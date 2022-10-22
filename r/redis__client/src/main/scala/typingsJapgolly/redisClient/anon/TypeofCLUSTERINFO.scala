package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsClusterINFOMod.ClusterInfoReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERINFO extends StObject {
  
  def extractLineValue(line: String): String
  
  def transformArguments(): js.Array[String]
  
  def transformReply(reply: String): ClusterInfoReply
}
object TypeofCLUSTERINFO {
  
  inline def apply(
    extractLineValue: String => String,
    transformArguments: CallbackTo[js.Array[String]],
    transformReply: String => ClusterInfoReply
  ): TypeofCLUSTERINFO = {
    val __obj = js.Dynamic.literal(extractLineValue = js.Any.fromFunction1(extractLineValue), transformArguments = transformArguments.toJsFn, transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERINFO]
  }
  
  extension [Self <: TypeofCLUSTERINFO](x: Self) {
    
    inline def setExtractLineValue(value: String => String): Self = StObject.set(x, "extractLineValue", js.Any.fromFunction1(value))
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: String => ClusterInfoReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
