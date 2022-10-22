package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofREPLICAOF extends StObject {
  
  def transformArguments(host: String, port: Double): js.Array[String]
  
  def transformReply(): String
}
object TypeofREPLICAOF {
  
  inline def apply(transformArguments: (String, Double) => js.Array[String], transformReply: CallbackTo[String]): TypeofREPLICAOF = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofREPLICAOF]
  }
  
  extension [Self <: TypeofREPLICAOF](x: Self) {
    
    inline def setTransformArguments(value: (String, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: CallbackTo[String]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
