package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueuingStrategyInit extends StObject {
  
  /**
    * Creates a new ByteLengthQueuingStrategy with the provided high water mark.
    *
    * Note that the provided high water mark will not be validated ahead of time. Instead, if it is negative, NaN, or not a number, the resulting ByteLengthQueuingStrategy will cause the corresponding stream constructor to throw.
    */
  /* standard dom */
  var highWaterMark: Double
}
object QueuingStrategyInit {
  
  inline def apply(highWaterMark: Double): QueuingStrategyInit = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueuingStrategyInit]
  }
  
  extension [Self <: QueuingStrategyInit](x: Self) {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
  }
}
