package typingsJapgolly.redisSearch.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofEXPLAINCLI extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(index: String, query: String): js.Array[String]
  
  def transformReply(): js.Array[String]
}
object TypeofEXPLAINCLI {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: (String, String) => js.Array[String],
    transformReply: CallbackTo[js.Array[String]]
  ): TypeofEXPLAINCLI = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofEXPLAINCLI]
  }
  
  extension [Self <: TypeofEXPLAINCLI](x: Self) {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (String, String) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
