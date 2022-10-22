package typingsJapgolly.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTransfer extends StObject {
  
  /**
    * The `drop` event operation data.
    */
  var dataTransfer: js.UndefOr[org.scalajs.dom.DataTransfer] = js.undefined
}
object DataTransfer {
  
  inline def apply(): DataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransfer]
  }
  
  extension [Self <: DataTransfer](x: Self) {
    
    inline def setDataTransfer(value: org.scalajs.dom.DataTransfer): Self = StObject.set(x, "dataTransfer", value.asInstanceOf[js.Any])
    
    inline def setDataTransferUndefined: Self = StObject.set(x, "dataTransfer", js.undefined)
  }
}
