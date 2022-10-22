package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEventInit
  extends StObject
     with MouseEventInit {
  
  /* standard dom */
  var dataTransfer: js.UndefOr[org.scalajs.dom.DataTransfer | Null] = js.undefined
}
object DragEventInit {
  
  inline def apply(): DragEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragEventInit]
  }
  
  extension [Self <: DragEventInit](x: Self) {
    
    inline def setDataTransfer(value: org.scalajs.dom.DataTransfer): Self = StObject.set(x, "dataTransfer", value.asInstanceOf[js.Any])
    
    inline def setDataTransferNull: Self = StObject.set(x, "dataTransfer", null)
    
    inline def setDataTransferUndefined: Self = StObject.set(x, "dataTransfer", js.undefined)
  }
}
