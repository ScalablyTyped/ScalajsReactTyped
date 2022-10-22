package typingsJapgolly.qrcode.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.qrcode.qrcodeStrings.byte_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeByteSegment
  extends StObject
     with QRCodeSegment {
  
  var data: Buffer | js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array
  
  var mode: byte_
}
object QRCodeByteSegment {
  
  inline def apply(data: Buffer | js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array): QRCodeByteSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "byte")
    __obj.asInstanceOf[QRCodeByteSegment]
  }
  
  extension [Self <: QRCodeByteSegment](x: Self) {
    
    inline def setData(value: Buffer | js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMode(value: byte_): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
