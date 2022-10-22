package typingsJapgolly.qrcode.mod

import typingsJapgolly.qrcode.anon.DeflateLevel
import typingsJapgolly.qrcode.qrcodeStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeToFileOptionsPng
  extends StObject
     with QRCodeRenderersOptions
     with QRCodeToFileOptions {
  
  var rendererOpts: js.UndefOr[DeflateLevel] = js.undefined
  
  /**
    * Output format.
    * @default 'png'
    */
  var `type`: js.UndefOr[png] = js.undefined
}
object QRCodeToFileOptionsPng {
  
  inline def apply(): QRCodeToFileOptionsPng = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToFileOptionsPng]
  }
  
  extension [Self <: QRCodeToFileOptionsPng](x: Self) {
    
    inline def setRendererOpts(value: DeflateLevel): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
    
    inline def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
    
    inline def setType(value: png): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
