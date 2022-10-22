package typingsJapgolly.levelTranscoder

import typingsJapgolly.std.TextEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TextDecoder extends StObject {
    
    var textDecoder: typingsJapgolly.std.TextDecoder
    
    var textEncoder: TextEncoder
  }
  object TextDecoder {
    
    inline def apply(textDecoder: typingsJapgolly.std.TextDecoder, textEncoder: TextEncoder): TextDecoder = {
      val __obj = js.Dynamic.literal(textDecoder = textDecoder.asInstanceOf[js.Any], textEncoder = textEncoder.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDecoder]
    }
    
    extension [Self <: TextDecoder](x: Self) {
      
      inline def setTextDecoder(value: typingsJapgolly.std.TextDecoder): Self = StObject.set(x, "textDecoder", value.asInstanceOf[js.Any])
      
      inline def setTextEncoder(value: TextEncoder): Self = StObject.set(x, "textEncoder", value.asInstanceOf[js.Any])
    }
  }
}
