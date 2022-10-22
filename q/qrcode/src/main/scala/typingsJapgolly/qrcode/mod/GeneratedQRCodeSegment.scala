package typingsJapgolly.qrcode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qrcode.qrcodeStrings.Alphanumeric
import typingsJapgolly.qrcode.qrcodeStrings.Byte
import typingsJapgolly.qrcode.qrcodeStrings.Kanji
import typingsJapgolly.qrcode.qrcodeStrings.Numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qrcode.mod.NumericData
  - typingsJapgolly.qrcode.mod.AlphanumericData
  - typingsJapgolly.qrcode.mod.ByteData
  - typingsJapgolly.qrcode.mod.KanjiData
*/
trait GeneratedQRCodeSegment extends StObject
object GeneratedQRCodeSegment {
  
  inline def AlphanumericData(
    data: String,
    getBitsLength: CallbackTo[Double],
    getLength: CallbackTo[Double],
    mode: Mode[Alphanumeric]
  ): typingsJapgolly.qrcode.mod.AlphanumericData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = getBitsLength.toJsFn, getLength = getLength.toJsFn, mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.AlphanumericData]
  }
  
  inline def ByteData(
    data: js.typedarray.Uint8Array,
    getBitsLength: CallbackTo[Double],
    getLength: CallbackTo[Double],
    mode: Mode[Byte]
  ): typingsJapgolly.qrcode.mod.ByteData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = getBitsLength.toJsFn, getLength = getLength.toJsFn, mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.ByteData]
  }
  
  inline def KanjiData(data: String, getBitsLength: CallbackTo[Double], getLength: CallbackTo[Double], mode: Mode[Kanji]): typingsJapgolly.qrcode.mod.KanjiData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = getBitsLength.toJsFn, getLength = getLength.toJsFn, mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.KanjiData]
  }
  
  inline def NumericData(
    data: String,
    getBitsLength: CallbackTo[Double],
    getLength: CallbackTo[Double],
    mode: Mode[Numeric]
  ): typingsJapgolly.qrcode.mod.NumericData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = getBitsLength.toJsFn, getLength = getLength.toJsFn, mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.NumericData]
  }
}
