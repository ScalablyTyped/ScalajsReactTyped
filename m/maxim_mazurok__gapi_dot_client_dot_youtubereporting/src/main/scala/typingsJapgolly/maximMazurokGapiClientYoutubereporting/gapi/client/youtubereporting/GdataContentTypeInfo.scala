package typingsJapgolly.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GdataContentTypeInfo extends StObject {
  
  /** gdata */
  var bestGuess: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var fromBytes: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var fromFileName: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var fromHeader: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var fromUrlPath: js.UndefOr[String] = js.undefined
}
object GdataContentTypeInfo {
  
  inline def apply(): GdataContentTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataContentTypeInfo]
  }
  
  extension [Self <: GdataContentTypeInfo](x: Self) {
    
    inline def setBestGuess(value: String): Self = StObject.set(x, "bestGuess", value.asInstanceOf[js.Any])
    
    inline def setBestGuessUndefined: Self = StObject.set(x, "bestGuess", js.undefined)
    
    inline def setFromBytes(value: String): Self = StObject.set(x, "fromBytes", value.asInstanceOf[js.Any])
    
    inline def setFromBytesUndefined: Self = StObject.set(x, "fromBytes", js.undefined)
    
    inline def setFromFileName(value: String): Self = StObject.set(x, "fromFileName", value.asInstanceOf[js.Any])
    
    inline def setFromFileNameUndefined: Self = StObject.set(x, "fromFileName", js.undefined)
    
    inline def setFromHeader(value: String): Self = StObject.set(x, "fromHeader", value.asInstanceOf[js.Any])
    
    inline def setFromHeaderUndefined: Self = StObject.set(x, "fromHeader", js.undefined)
    
    inline def setFromUrlPath(value: String): Self = StObject.set(x, "fromUrlPath", value.asInstanceOf[js.Any])
    
    inline def setFromUrlPathUndefined: Self = StObject.set(x, "fromUrlPath", js.undefined)
  }
}
