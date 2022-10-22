package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobPropertyBag extends StObject {
  
  /* standard dom */
  var endings: js.UndefOr[EndingType] = js.undefined
  
  /* standard dom */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
object BlobPropertyBag {
  
  inline def apply(): BlobPropertyBag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobPropertyBag]
  }
  
  extension [Self <: BlobPropertyBag](x: Self) {
    
    inline def setEndings(value: EndingType): Self = StObject.set(x, "endings", value.asInstanceOf[js.Any])
    
    inline def setEndingsUndefined: Self = StObject.set(x, "endings", js.undefined)
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
