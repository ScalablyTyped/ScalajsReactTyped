package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditModeExitingEventUIParam extends StObject {
  
  /**
    * Get or set a boolean indicating whether the changes will be made to the cell's value when edit mode ends.
    */
  var acceptChanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Get a boolean indicating if the edit mode is being forced to exit edit mode in which case it cannot be cancelled.
    */
  var canCancel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the cell for which the control is exiting edit mode.
    */
  var cell: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the edit text that will be used to update the cell(s).
    */
  var editText: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object EditModeExitingEventUIParam {
  
  inline def apply(): EditModeExitingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditModeExitingEventUIParam]
  }
  
  extension [Self <: EditModeExitingEventUIParam](x: Self) {
    
    inline def setAcceptChanges(value: Boolean): Self = StObject.set(x, "acceptChanges", value.asInstanceOf[js.Any])
    
    inline def setAcceptChangesUndefined: Self = StObject.set(x, "acceptChanges", js.undefined)
    
    inline def setCanCancel(value: Boolean): Self = StObject.set(x, "canCancel", value.asInstanceOf[js.Any])
    
    inline def setCanCancelUndefined: Self = StObject.set(x, "canCancel", js.undefined)
    
    inline def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    inline def setEditText(value: String): Self = StObject.set(x, "editText", value.asInstanceOf[js.Any])
    
    inline def setEditTextUndefined: Self = StObject.set(x, "editText", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
