package typingsJapgolly.angularClipboard

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait ClipboardService extends StObject {
    
    /**
      * copies text to a clipboard
      * @param text the text to be copied to the clipboard
      */
    def copyText(text: String): Unit
    
    /**
      * tells us whether or not angular-clipboard is supported
      */
    var supported: Boolean
  }
  object ClipboardService {
    
    inline def apply(copyText: String => Callback, supported: Boolean): ClipboardService = {
      val __obj = js.Dynamic.literal(copyText = js.Any.fromFunction1((t0: String) => copyText(t0).runNow()), supported = supported.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipboardService]
    }
    
    extension [Self <: ClipboardService](x: Self) {
      
      inline def setCopyText(value: String => Callback): Self = StObject.set(x, "copyText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    }
  }
}
