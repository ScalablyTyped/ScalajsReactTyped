package typingsJapgolly.qrcode.mod

import typingsJapgolly.qrcode.qrcodeStrings.imageSlashjpeg
import typingsJapgolly.qrcode.qrcodeStrings.imageSlashwebp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qrcode.mod.QRCodeToDataURLOptionsJpegWebp
  - typingsJapgolly.qrcode.mod.QRCodeToDataURLOptionsOther
*/
trait QRCodeToDataURLOptions extends StObject
object QRCodeToDataURLOptions {
  
  inline def QRCodeToDataURLOptionsJpegWebp(`type`: imageSlashjpeg | imageSlashwebp): typingsJapgolly.qrcode.mod.QRCodeToDataURLOptionsJpegWebp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.QRCodeToDataURLOptionsJpegWebp]
  }
  
  inline def QRCodeToDataURLOptionsOther(): typingsJapgolly.qrcode.mod.QRCodeToDataURLOptionsOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.qrcode.mod.QRCodeToDataURLOptionsOther]
  }
}
