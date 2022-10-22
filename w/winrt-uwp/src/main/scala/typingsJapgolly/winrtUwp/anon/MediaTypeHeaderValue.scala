package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTypeHeaderValue extends StObject {
  
  /** The HttpMediaTypeHeaderValue version of the string. */ var mediaTypeHeaderValue: HttpMediaTypeHeaderValue
  
  /** true if input is valid HttpMediaTypeHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object MediaTypeHeaderValue {
  
  inline def apply(mediaTypeHeaderValue: HttpMediaTypeHeaderValue, returnValue: Boolean): MediaTypeHeaderValue = {
    val __obj = js.Dynamic.literal(mediaTypeHeaderValue = mediaTypeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTypeHeaderValue]
  }
  
  extension [Self <: MediaTypeHeaderValue](x: Self) {
    
    inline def setMediaTypeHeaderValue(value: HttpMediaTypeHeaderValue): Self = StObject.set(x, "mediaTypeHeaderValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
