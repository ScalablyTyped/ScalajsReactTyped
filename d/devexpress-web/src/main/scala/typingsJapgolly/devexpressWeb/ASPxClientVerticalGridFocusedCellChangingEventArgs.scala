package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.FocusedCellChanging event.
  */
trait ASPxClientVerticalGridFocusedCellChangingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Provides information on a cell currently being focused.
    */
  var cellInfo: ASPxClientVerticalGridCellInfo
}
object ASPxClientVerticalGridFocusedCellChangingEventArgs {
  
  inline def apply(cancel: Boolean, cellInfo: ASPxClientVerticalGridCellInfo): ASPxClientVerticalGridFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridFocusedCellChangingEventArgs]
  }
  
  extension [Self <: ASPxClientVerticalGridFocusedCellChangingEventArgs](x: Self) {
    
    inline def setCellInfo(value: ASPxClientVerticalGridCellInfo): Self = StObject.set(x, "cellInfo", value.asInstanceOf[js.Any])
  }
}
