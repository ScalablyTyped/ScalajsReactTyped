package typingsJapgolly.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentDisposition extends StObject {
  
  var contentDisposition: js.UndefOr[String] = js.undefined
  
  var ifMatch: js.UndefOr[String] = js.undefined
}
object ContentDisposition {
  
  inline def apply(): ContentDisposition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentDisposition]
  }
  
  extension [Self <: ContentDisposition](x: Self) {
    
    inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
  }
}
