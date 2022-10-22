package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientVerticalGridFocusedCellChangingEventArgs")
@js.native
open class ASPxClientVerticalGridFocusedCellChangingEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientVerticalGridFocusedCellChangingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridFocusedCellChangingEventArgs class with specified settings.
    * @param cellInfo A ASPxClientVerticalGridCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: typingsJapgolly.devexpressWeb.ASPxClientVerticalGridCellInfo) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides information on a cell currently being focused.
    */
  /* CompleteClass */
  var cellInfo: typingsJapgolly.devexpressWeb.ASPxClientVerticalGridCellInfo = js.native
}
