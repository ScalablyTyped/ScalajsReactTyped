package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsMemorySTATSMod.MemoryStatsReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMEMORYSTATS extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(rawReply: js.Array[String | Double | (js.Array[String | Double])]): MemoryStatsReply
}
object TypeofMEMORYSTATS {
  
  inline def apply(
    transformArguments: CallbackTo[js.Array[String]],
    transformReply: js.Array[String | Double | (js.Array[String | Double])] => MemoryStatsReply
  ): TypeofMEMORYSTATS = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofMEMORYSTATS]
  }
  
  extension [Self <: TypeofMEMORYSTATS](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: js.Array[String | Double | (js.Array[String | Double])] => MemoryStatsReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
