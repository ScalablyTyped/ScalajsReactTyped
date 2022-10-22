package typingsJapgolly.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxImageCacheCount extends StObject {
  
  var maxImageCacheCount: js.UndefOr[Double] = js.undefined
}
object MaxImageCacheCount {
  
  inline def apply(): MaxImageCacheCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxImageCacheCount]
  }
  
  extension [Self <: MaxImageCacheCount](x: Self) {
    
    inline def setMaxImageCacheCount(value: Double): Self = StObject.set(x, "maxImageCacheCount", value.asInstanceOf[js.Any])
    
    inline def setMaxImageCacheCountUndefined: Self = StObject.set(x, "maxImageCacheCount", js.undefined)
  }
}
