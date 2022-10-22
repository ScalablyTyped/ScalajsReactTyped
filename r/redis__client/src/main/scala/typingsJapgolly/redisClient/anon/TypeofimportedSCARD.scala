package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedSCARD extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: String): js.Array[String]
  
  def transformReply(): Double
}
object TypeofimportedSCARD {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: String => js.Array[String],
    transformReply: CallbackTo[Double]
  ): TypeofimportedSCARD = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofimportedSCARD]
  }
  
  extension [Self <: TypeofimportedSCARD](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[Double]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
