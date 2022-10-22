package typingsJapgolly.qrcode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qrcode.qrcodeStrings.Kanji
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KanjiData
  extends StObject
     with DataSegment
     with GeneratedQRCodeSegment {
  
  var data: String
  
  var mode: Mode[Kanji]
}
object KanjiData {
  
  inline def apply(data: String, getBitsLength: CallbackTo[Double], getLength: CallbackTo[Double], mode: Mode[Kanji]): KanjiData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = getBitsLength.toJsFn, getLength = getLength.toJsFn, mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[KanjiData]
  }
  
  extension [Self <: KanjiData](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Mode[Kanji]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
