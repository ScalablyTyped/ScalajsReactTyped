package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowEditDialogAfterOpenEventUIParam extends StObject {
  
  /**
    * Gets a reference to row edit dialog DOM element.
    */
  var dialogElement: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object RowEditDialogAfterOpenEventUIParam {
  
  inline def apply(): RowEditDialogAfterOpenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEditDialogAfterOpenEventUIParam]
  }
  
  extension [Self <: RowEditDialogAfterOpenEventUIParam](x: Self) {
    
    inline def setDialogElement(value: Any): Self = StObject.set(x, "dialogElement", value.asInstanceOf[js.Any])
    
    inline def setDialogElementUndefined: Self = StObject.set(x, "dialogElement", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
