package typingsJapgolly.qrcode.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSegment extends StObject {
  
  def getBitsLength(): Double
  
  def getLength(): Double
}
object DataSegment {
  
  inline def apply(getBitsLength: CallbackTo[Double], getLength: CallbackTo[Double]): DataSegment = {
    val __obj = js.Dynamic.literal(getBitsLength = getBitsLength.toJsFn, getLength = getLength.toJsFn)
    __obj.asInstanceOf[DataSegment]
  }
  
  extension [Self <: DataSegment](x: Self) {
    
    inline def setGetBitsLength(value: CallbackTo[Double]): Self = StObject.set(x, "getBitsLength", value.toJsFn)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
  }
}
