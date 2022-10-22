package typingsJapgolly.wechatMiniprogram.ICloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === end ===
// === API: CDN ===
trait CDN extends StObject {
  
  var target: String | js.typedarray.ArrayBuffer | ICDNFilePathSpec
}
object CDN {
  
  inline def apply(target: String | js.typedarray.ArrayBuffer | ICDNFilePathSpec): CDN = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDN]
  }
  
  extension [Self <: CDN](x: Self) {
    
    inline def setTarget(value: String | js.typedarray.ArrayBuffer | ICDNFilePathSpec): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
