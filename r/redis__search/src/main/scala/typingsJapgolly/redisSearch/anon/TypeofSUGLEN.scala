package typingsJapgolly.redisSearch.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSUGLEN extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(key: String): js.Array[String]
  
  def transformReply(): Double
}
object TypeofSUGLEN {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: String => js.Array[String],
    transformReply: CallbackTo[Double]
  ): TypeofSUGLEN = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofSUGLEN]
  }
  
  extension [Self <: TypeofSUGLEN](x: Self) {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[Double]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
