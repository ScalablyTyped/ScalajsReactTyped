package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPUBSUBNUMPAT extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): String
}
object TypeofPUBSUBNUMPAT {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: CallbackTo[js.Array[String]],
    transformReply: CallbackTo[String]
  ): TypeofPUBSUBNUMPAT = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = transformArguments.toJsFn, transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofPUBSUBNUMPAT]
  }
  
  extension [Self <: TypeofPUBSUBNUMPAT](x: Self) {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: CallbackTo[String]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
