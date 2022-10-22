package typingsJapgolly.parseDataUrl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.parseDataUrl.parseDataUrlBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(s: String): `false` | DataUrl = ^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any]).asInstanceOf[`false` | DataUrl]
  
  @JSImport("parse-data-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataUrl extends StObject {
    
    var base64: Boolean
    
    var charset: String
    
    var contentType: String
    
    var data: String
    
    var mediaType: String
    
    def toBuffer(): Buffer
  }
  object DataUrl {
    
    inline def apply(
      base64: Boolean,
      charset: String,
      contentType: String,
      data: String,
      mediaType: String,
      toBuffer: CallbackTo[Buffer]
    ): DataUrl = {
      val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], toBuffer = toBuffer.toJsFn)
      __obj.asInstanceOf[DataUrl]
    }
    
    extension [Self <: DataUrl](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setToBuffer(value: CallbackTo[Buffer]): Self = StObject.set(x, "toBuffer", value.toJsFn)
    }
  }
}
