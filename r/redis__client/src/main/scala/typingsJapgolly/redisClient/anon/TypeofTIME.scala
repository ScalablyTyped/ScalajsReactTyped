package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsTimeMod.TimeReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTIME extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(reply: js.Tuple2[String, String]): TimeReply
}
object TypeofTIME {
  
  inline def apply(
    transformArguments: CallbackTo[js.Array[String]],
    transformReply: js.Tuple2[String, String] => TimeReply
  ): TypeofTIME = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofTIME]
  }
  
  extension [Self <: TypeofTIME](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: js.Tuple2[String, String] => TimeReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
