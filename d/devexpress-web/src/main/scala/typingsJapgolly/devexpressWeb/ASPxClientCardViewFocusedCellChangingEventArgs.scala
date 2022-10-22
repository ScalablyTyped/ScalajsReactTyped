package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.FocusedCellChanging event.
  */
trait ASPxClientCardViewFocusedCellChangingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Provides information of a card's cell currently being focused.
    */
  var cellInfo: ASPxClientCardViewCellInfo
}
object ASPxClientCardViewFocusedCellChangingEventArgs {
  
  inline def apply(cancel: Boolean, cellInfo: ASPxClientCardViewCellInfo): ASPxClientCardViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewFocusedCellChangingEventArgs]
  }
  
  extension [Self <: ASPxClientCardViewFocusedCellChangingEventArgs](x: Self) {
    
    inline def setCellInfo(value: ASPxClientCardViewCellInfo): Self = StObject.set(x, "cellInfo", value.asInstanceOf[js.Any])
  }
}
