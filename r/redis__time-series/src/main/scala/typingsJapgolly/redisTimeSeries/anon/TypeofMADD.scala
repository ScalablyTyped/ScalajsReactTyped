package typingsJapgolly.redisTimeSeries.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisTimeSeries.distCommandsMaddMod.MAddSample
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMADD extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(toAdd: js.Array[MAddSample]): js.Array[String]
  
  def transformReply(): js.Array[Double]
}
object TypeofMADD {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: js.Array[MAddSample] => js.Array[String],
    transformReply: CallbackTo[js.Array[Double]]
  ): TypeofMADD = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofMADD]
  }
  
  extension [Self <: TypeofMADD](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: js.Array[MAddSample] => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
