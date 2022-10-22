package typingsJapgolly.playable.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEstimatedTime extends StObject {
  
  def getEstimatedTime(): Double
}
object GetEstimatedTime {
  
  inline def apply(getEstimatedTime: CallbackTo[Double]): GetEstimatedTime = {
    val __obj = js.Dynamic.literal(getEstimatedTime = getEstimatedTime.toJsFn)
    __obj.asInstanceOf[GetEstimatedTime]
  }
  
  extension [Self <: GetEstimatedTime](x: Self) {
    
    inline def setGetEstimatedTime(value: CallbackTo[Double]): Self = StObject.set(x, "getEstimatedTime", value.toJsFn)
  }
}
