package typingsJapgolly.qrcode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qrcode.qrcodeStrings.Numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericData
  extends StObject
     with DataSegment
     with GeneratedQRCodeSegment {
  
  var data: String
  
  var mode: Mode[Numeric]
}
object NumericData {
  
  inline def apply(
    data: String,
    getBitsLength: CallbackTo[Double],
    getLength: CallbackTo[Double],
    mode: Mode[Numeric]
  ): NumericData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = getBitsLength.toJsFn, getLength = getLength.toJsFn, mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericData]
  }
  
  extension [Self <: NumericData](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Mode[Numeric]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
