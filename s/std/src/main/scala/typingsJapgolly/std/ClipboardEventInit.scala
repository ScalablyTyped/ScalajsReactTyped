package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipboardEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var clipboardData: js.UndefOr[org.scalajs.dom.DataTransfer | Null] = js.undefined
}
object ClipboardEventInit {
  
  inline def apply(): ClipboardEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipboardEventInit]
  }
  
  extension [Self <: ClipboardEventInit](x: Self) {
    
    inline def setClipboardData(value: org.scalajs.dom.DataTransfer): Self = StObject.set(x, "clipboardData", value.asInstanceOf[js.Any])
    
    inline def setClipboardDataNull: Self = StObject.set(x, "clipboardData", null)
    
    inline def setClipboardDataUndefined: Self = StObject.set(x, "clipboardData", js.undefined)
  }
}
