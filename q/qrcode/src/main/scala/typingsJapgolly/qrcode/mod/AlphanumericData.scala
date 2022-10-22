package typingsJapgolly.qrcode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qrcode.qrcodeStrings.Alphanumeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlphanumericData
  extends StObject
     with DataSegment
     with GeneratedQRCodeSegment {
  
  var data: String
  
  var mode: Mode[Alphanumeric]
}
object AlphanumericData {
  
  inline def apply(
    data: String,
    getBitsLength: CallbackTo[Double],
    getLength: CallbackTo[Double],
    mode: Mode[Alphanumeric]
  ): AlphanumericData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = getBitsLength.toJsFn, getLength = getLength.toJsFn, mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphanumericData]
  }
  
  extension [Self <: AlphanumericData](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Mode[Alphanumeric]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
