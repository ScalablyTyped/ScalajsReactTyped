package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSWAPDB extends StObject {
  
  def transformArguments(index1: Double, index2: Double): js.Array[String]
  
  def transformReply(): String
}
object TypeofSWAPDB {
  
  inline def apply(transformArguments: (Double, Double) => js.Array[String], transformReply: CallbackTo[String]): TypeofSWAPDB = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofSWAPDB]
  }
  
  extension [Self <: TypeofSWAPDB](x: Self) {
    
    inline def setTransformArguments(value: (Double, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: CallbackTo[String]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
