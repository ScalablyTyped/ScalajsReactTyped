package typingsJapgolly.redisSearch.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLIST extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): js.Array[String]
}
object TypeofLIST {
  
  inline def apply(transformArguments: CallbackTo[js.Array[String]], transformReply: CallbackTo[js.Array[String]]): TypeofLIST = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofLIST]
  }
  
  extension [Self <: TypeofLIST](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
