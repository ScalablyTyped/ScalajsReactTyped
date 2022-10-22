package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERREPLICATE extends StObject {
  
  def transformArguments(nodeId: String): js.Array[String]
  
  def transformReply(): OK
}
object TypeofCLUSTERREPLICATE {
  
  inline def apply(transformArguments: String => js.Array[String], transformReply: CallbackTo[OK]): TypeofCLUSTERREPLICATE = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofCLUSTERREPLICATE]
  }
  
  extension [Self <: TypeofCLUSTERREPLICATE](x: Self) {
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[OK]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
