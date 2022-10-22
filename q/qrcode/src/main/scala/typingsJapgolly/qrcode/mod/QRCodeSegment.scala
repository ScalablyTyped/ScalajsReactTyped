package typingsJapgolly.qrcode.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qrcode.mod.QRCodeNumericSegment
  - typingsJapgolly.qrcode.mod.QRCodeAlphanumericSegment
  - typingsJapgolly.qrcode.mod.QRCodeByteSegment
  - typingsJapgolly.qrcode.mod.QRCodeKanjiSegment
  - typingsJapgolly.qrcode.anon.Data
*/
trait QRCodeSegment extends StObject
object QRCodeSegment {
  
  inline def Data(data: String | Buffer | js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array): typingsJapgolly.qrcode.anon.Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.qrcode.anon.Data]
  }
  
  inline def QRCodeAlphanumericSegment(data: String): typingsJapgolly.qrcode.mod.QRCodeAlphanumericSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "alphanumeric")
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.QRCodeAlphanumericSegment]
  }
  
  inline def QRCodeByteSegment(data: Buffer | js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array): typingsJapgolly.qrcode.mod.QRCodeByteSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "byte")
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.QRCodeByteSegment]
  }
  
  inline def QRCodeKanjiSegment(data: String): typingsJapgolly.qrcode.mod.QRCodeKanjiSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "kanji")
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.QRCodeKanjiSegment]
  }
  
  inline def QRCodeNumericSegment(data: String | Double): typingsJapgolly.qrcode.mod.QRCodeNumericSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "numeric")
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.QRCodeNumericSegment]
  }
}
