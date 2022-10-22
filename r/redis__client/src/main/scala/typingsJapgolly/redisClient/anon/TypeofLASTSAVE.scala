package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLASTSAVE extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(): js.Array[String]
  
  def transformReply(reply: Double): js.Date
}
object TypeofLASTSAVE {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: CallbackTo[js.Array[String]],
    transformReply: Double => js.Date
  ): TypeofLASTSAVE = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = transformArguments.toJsFn, transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofLASTSAVE]
  }
  
  extension [Self <: TypeofLASTSAVE](x: Self) {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: Double => js.Date): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
