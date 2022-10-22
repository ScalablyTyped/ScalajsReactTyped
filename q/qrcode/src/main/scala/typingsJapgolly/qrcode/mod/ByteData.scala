package typingsJapgolly.qrcode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qrcode.qrcodeStrings.Byte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteData
  extends StObject
     with DataSegment
     with GeneratedQRCodeSegment {
  
  var data: js.typedarray.Uint8Array
  
  var mode: Mode[Byte]
}
object ByteData {
  
  inline def apply(
    data: js.typedarray.Uint8Array,
    getBitsLength: CallbackTo[Double],
    getLength: CallbackTo[Double],
    mode: Mode[Byte]
  ): ByteData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = getBitsLength.toJsFn, getLength = getLength.toJsFn, mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteData]
  }
  
  extension [Self <: ByteData](x: Self) {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Mode[Byte]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
