package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MovingDialogClosedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the ColumnMoving widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object MovingDialogClosedEventUIParam {
  
  inline def apply(): MovingDialogClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovingDialogClosedEventUIParam]
  }
  
  extension [Self <: MovingDialogClosedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
