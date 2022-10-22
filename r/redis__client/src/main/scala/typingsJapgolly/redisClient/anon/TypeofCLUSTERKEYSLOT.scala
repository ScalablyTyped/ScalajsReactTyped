package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERKEYSLOT extends StObject {
  
  def transformArguments(key: String): js.Array[String]
  
  def transformReply(): Double
}
object TypeofCLUSTERKEYSLOT {
  
  inline def apply(transformArguments: String => js.Array[String], transformReply: CallbackTo[Double]): TypeofCLUSTERKEYSLOT = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofCLUSTERKEYSLOT]
  }
  
  extension [Self <: TypeofCLUSTERKEYSLOT](x: Self) {
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[Double]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
