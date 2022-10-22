package typingsJapgolly.qrcode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qrcode.mod.QRCodeToStringOptionsTerminal
  - typingsJapgolly.qrcode.mod.QRCodeToStringOptionsOther
*/
trait QRCodeToStringOptions extends StObject
object QRCodeToStringOptions {
  
  inline def QRCodeToStringOptionsOther(): typingsJapgolly.qrcode.mod.QRCodeToStringOptionsOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.QRCodeToStringOptionsOther]
  }
  
  inline def QRCodeToStringOptionsTerminal(): typingsJapgolly.qrcode.mod.QRCodeToStringOptionsTerminal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("terminal")
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.QRCodeToStringOptionsTerminal]
  }
}
