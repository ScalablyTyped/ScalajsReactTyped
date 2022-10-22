package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSCRIPTLOAD extends StObject {
  
  def transformArguments(script: String): js.Array[String]
  
  def transformReply(): String
}
object TypeofSCRIPTLOAD {
  
  inline def apply(transformArguments: String => js.Array[String], transformReply: CallbackTo[String]): TypeofSCRIPTLOAD = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofSCRIPTLOAD]
  }
  
  extension [Self <: TypeofSCRIPTLOAD](x: Self) {
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[String]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
